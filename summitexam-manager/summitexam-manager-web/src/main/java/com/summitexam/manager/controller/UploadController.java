package com.summitexam.manager.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;


@RequestMapping("/uploadController")
@RestController
@CrossOrigin
public class UploadController {

    /**
     * 可上传图片、视频，只需在nginx配置中配置可识别的后缀
     */
    @PostMapping("/upload")
    public String pictureUpload(@RequestParam(value = "editormd-image-file", required = true) MultipartFile uploadFile) {
        long begin = System.currentTimeMillis();
        String json = "";
        try {
            Object result = uploadPicture(uploadFile);
            json = new ObjectMapper().writeValueAsString(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        String substring = json.substring(1);
        substring =substring.substring(0, substring.length() -1);
        long end = System.currentTimeMillis();
        return substring;
    }


    public Object uploadPicture(MultipartFile uploadFile) {
        //1、给上传的图片生成新的文件名
        //1.1获取原始文件名
        String oldName = uploadFile.getOriginalFilename();
        //1.2使用IDUtils工具类生成新的文件名，新文件名 = newName + 文件后缀
        String newName = IDUtils.genImageName();
        assert oldName != null;
        newName = newName + oldName.substring(oldName.lastIndexOf("."));
        //1.3生成文件在服务器端存储的子目录
        String filePath = "/20191229/";
        //2、把图片上传到图片服务器
        //2.1获取上传的io流
        InputStream input = null;
        try {
            input = uploadFile.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.2调用FtpUtil工具类进行上传
        return FtpUtil.putImages(input, filePath, newName);
    }
}
