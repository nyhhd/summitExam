package com.summitexam.bean;

import java.io.Serializable;

public class Exams implements Serializable {
	//0428新增isopen和examineeIds字段
	private String isOpen;
	
	private String examineeIds;
	//前三个为新增字段
	private Integer userId;
	
	private Integer pageSize;
	
	private Integer pageNum;
	
    private Integer examsId;
    
    private Integer userRoleId;

    private String examsName;

    private String examsDescription;

    private String examQuestionIdsRadio;

    private String examQuestionIdsCheck;

    private String examQuestionIdsJudge;

    private Integer examsScore;

    private Integer examsScoreRadio;

    private Integer examsScoreCheck;

    private Integer examsScoreJudge;

    private Integer examsCreatorId;

    private String examsCreatorNickname;

    private String examsTimeLimit;

    private String examsStartDate;

    private String examsEndDate;

    private String createTime;

    private String updateTime;

    private static final long serialVersionUID = 1L;
    
    
    
    public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(String isOpen) {
		this.isOpen = isOpen;
	}

	public String getExamineeIds() {
		return examineeIds;
	}

	public void setExamineeIds(String examineeIds) {
		this.examineeIds = examineeIds;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getExamsId() {
        return examsId;
    }

    public void setExamsId(Integer examsId) {
        this.examsId = examsId;
    }

    public String getExamsName() {
        return examsName;
    }

    public void setExamsName(String examsName) {
        this.examsName = examsName == null ? null : examsName.trim();
    }

    public String getExamsDescription() {
        return examsDescription;
    }

    public void setExamsDescription(String examsDescription) {
        this.examsDescription = examsDescription == null ? null : examsDescription.trim();
    }

    public String getExamQuestionIdsRadio() {
        return examQuestionIdsRadio;
    }

    public void setExamQuestionIdsRadio(String examQuestionIdsRadio) {
        this.examQuestionIdsRadio = examQuestionIdsRadio == null ? null : examQuestionIdsRadio.trim();
    }

    public String getExamQuestionIdsCheck() {
        return examQuestionIdsCheck;
    }

    public void setExamQuestionIdsCheck(String examQuestionIdsCheck) {
        this.examQuestionIdsCheck = examQuestionIdsCheck == null ? null : examQuestionIdsCheck.trim();
    }

    public String getExamQuestionIdsJudge() {
        return examQuestionIdsJudge;
    }

    public void setExamQuestionIdsJudge(String examQuestionIdsJudge) {
        this.examQuestionIdsJudge = examQuestionIdsJudge == null ? null : examQuestionIdsJudge.trim();
    }

    public Integer getExamsScore() {
        return examsScore;
    }

    public void setExamsScore(Integer examsScore) {
        this.examsScore = examsScore;
    }

    public Integer getExamsScoreRadio() {
        return examsScoreRadio;
    }

    public void setExamsScoreRadio(Integer examsScoreRadio) {
        this.examsScoreRadio = examsScoreRadio;
    }

    public Integer getExamsScoreCheck() {
        return examsScoreCheck;
    }

    public void setExamsScoreCheck(Integer examsScoreCheck) {
        this.examsScoreCheck = examsScoreCheck;
    }

    public Integer getExamsScoreJudge() {
        return examsScoreJudge;
    }

    public void setExamsScoreJudge(Integer examsScoreJudge) {
        this.examsScoreJudge = examsScoreJudge;
    }

    public Integer getExamsCreatorId() {
        return examsCreatorId;
    }

    public void setExamsCreatorId(Integer examsCreatorId) {
        this.examsCreatorId = examsCreatorId;
    }

    public String getExamsCreatorNickname() {
        return examsCreatorNickname;
    }

    public void setExamsCreatorNickname(String examsCreatorNickname) {
        this.examsCreatorNickname = examsCreatorNickname == null ? null : examsCreatorNickname.trim();
    }

    public String getExamsTimeLimit() {
        return examsTimeLimit;
    }

    public void setExamsTimeLimit(String examsTimeLimit) {
        this.examsTimeLimit = examsTimeLimit == null ? null : examsTimeLimit.trim();
    }

    public String getExamsStartDate() {
        return examsStartDate;
    }

    public void setExamsStartDate(String examsStartDate) {
        this.examsStartDate = examsStartDate == null ? null : examsStartDate.trim();
    }

    public String getExamsEndDate() {
        return examsEndDate;
    }

    public void setExamsEndDate(String examsEndDate) {
        this.examsEndDate = examsEndDate == null ? null : examsEndDate.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", examsId=").append(examsId);
        sb.append(", examsName=").append(examsName);
        sb.append(", examsDescription=").append(examsDescription);
        sb.append(", examQuestionIdsRadio=").append(examQuestionIdsRadio);
        sb.append(", examQuestionIdsCheck=").append(examQuestionIdsCheck);
        sb.append(", examQuestionIdsJudge=").append(examQuestionIdsJudge);
        sb.append(", examsScore=").append(examsScore);
        sb.append(", examsScoreRadio=").append(examsScoreRadio);
        sb.append(", examsScoreCheck=").append(examsScoreCheck);
        sb.append(", examsScoreJudge=").append(examsScoreJudge);
        sb.append(", examsCreatorId=").append(examsCreatorId);
        sb.append(", examsCreatorNickname=").append(examsCreatorNickname);
        sb.append(", examsTimeLimit=").append(examsTimeLimit);
        sb.append(", examsStartDate=").append(examsStartDate);
        sb.append(", examsEndDate=").append(examsEndDate);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}