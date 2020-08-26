package com.summitexam.bean;

import java.io.Serializable;
import java.util.List;

public class Exam implements Serializable {
    private Integer examId;

    private String examName;

    private Integer examsId;

    private String examTimeLimit;

    private String examineeIds;

    private Integer examsCreatorId;

    private String examsCreatorNickname;

    private Integer referenceNumber;

    private Integer goodNumber;

    private Integer passNumber;

    private Integer failingNumber;

    private String createTime;

    private String updateTime;

    private String examStartDate;

    private String examEndDate;
    
    private Integer pageSize;
	
	private Integer pageNum;
	
	private Integer userId;
	
	private Integer userRoleId;
	
	private List<ExamRecord> examRecords;
	
	private String examDescription;
	
	private String examScore;
	
	
	
    public String getExamScore() {
		return examScore;
	}

	public void setExamScore(String examScore) {
		this.examScore = examScore;
	}

	public String getExamDescription() {
		return examDescription;
	}

	public void setExamDescription(String examDescription) {
		this.examDescription = examDescription;
	}

	public List<ExamRecord> getExamRecords() {
		return examRecords;
	}

	public void setExamRecords(List<ExamRecord> examRecords) {
		this.examRecords = examRecords;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
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

	private static final long serialVersionUID = 1L;

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName == null ? null : examName.trim();
    }

    public Integer getExamsId() {
        return examsId;
    }

    public void setExamsId(Integer examsId) {
        this.examsId = examsId;
    }

    public String getExamTimeLimit() {
        return examTimeLimit;
    }

    public void setExamTimeLimit(String examTimeLimit) {
        this.examTimeLimit = examTimeLimit == null ? null : examTimeLimit.trim();
    }

    public String getExamineeIds() {
        return examineeIds;
    }

    public void setExamineeIds(String examineeIds) {
        this.examineeIds = examineeIds == null ? null : examineeIds.trim();
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

    public Integer getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(Integer referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Integer getGoodNumber() {
        return goodNumber;
    }

    public void setGoodNumber(Integer goodNumber) {
        this.goodNumber = goodNumber;
    }

    public Integer getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(Integer passNumber) {
        this.passNumber = passNumber;
    }

    public Integer getFailingNumber() {
        return failingNumber;
    }

    public void setFailingNumber(Integer failingNumber) {
        this.failingNumber = failingNumber;
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

    public String getExamStartDate() {
        return examStartDate;
    }

    public void setExamStartDate(String examStartDate) {
        this.examStartDate = examStartDate == null ? null : examStartDate.trim();
    }

    public String getExamEndDate() {
        return examEndDate;
    }

    public void setExamEndDate(String examEndDate) {
        this.examEndDate = examEndDate == null ? null : examEndDate.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", examId=").append(examId);
        sb.append(", examName=").append(examName);
        sb.append(", examsId=").append(examsId);
        sb.append(", examTimeLimit=").append(examTimeLimit);
        sb.append(", examineeIds=").append(examineeIds);
        sb.append(", examsCreatorId=").append(examsCreatorId);
        sb.append(", examsCreatorNickname=").append(examsCreatorNickname);
        sb.append(", referenceNumber=").append(referenceNumber);
        sb.append(", goodNumber=").append(goodNumber);
        sb.append(", passNumber=").append(passNumber);
        sb.append(", failingNumber=").append(failingNumber);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", examStartDate=").append(examStartDate);
        sb.append(", examEndDate=").append(examEndDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}