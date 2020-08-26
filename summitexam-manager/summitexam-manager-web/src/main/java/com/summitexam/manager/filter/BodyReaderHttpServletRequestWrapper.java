package com.summitexam.manager.filter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.springframework.stereotype.Component;


public class BodyReaderHttpServletRequestWrapper extends HttpServletRequestWrapper{
	private final String body;
	
	public BodyReaderHttpServletRequestWrapper(HttpServletRequest request) throws IOException {
		super(request);
		InputStream is = null;
        StringBuilder sb = null;
        try {
            is = request.getInputStream();
            sb = new StringBuilder();
            byte[] b = new byte[4096];
            for (int n ; (n = is.read(b)) != -1;)
            {
                sb.append(new String(b, 0, n));
            }
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            if(is != null) {
                is.close();
            }
        }
        body = sb.toString();
	}
	
	@Override
    public ServletInputStream getInputStream() throws IOException {
        final ByteArrayInputStream bais = new ByteArrayInputStream(body.getBytes());
        return new ServletInputStream() {

            public boolean isFinished() {
                return false;
            }

            
            public boolean isReady() {
                return false;
            }

            
			@Override
            public int read() throws IOException {

                return bais.read();

            }

            @Override
            public void close() throws IOException {
                bais.close();
            }
        };
    }

    public String getBody() {
        return body;
    }

}
