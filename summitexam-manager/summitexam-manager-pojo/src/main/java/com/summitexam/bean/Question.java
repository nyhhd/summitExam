package com.summitexam.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Question implements Serializable {
	private Integer pageSize;
	
	private Integer pageNum;
	
    private Integer questionId;

    private String questionName;

    private String questionScore;

    private Integer questionCreatorId;

    private String questionLevelId;
    
    private String questionLevelDesc;

    private String questionTypeId;
    
    private String questionTypeDesc;

    private String questionCategoryId;
    
    private String questionCategoryDesc;

    private String questionDescription;

    private String questionOptionIds;

    private String questionAnswerOptionIds;

    private Date updateTime;

    private Date createTime;

    private List<QuestionOption> questionOptionList;
    
    private String questionPicture;
    
    private static final long serialVersionUID = 1L;
    
    //0430新增
  	private boolean isRight;
  	
  	private String[] selectOptionIds;
  	//0428新增
  	private String isOpen;
    
  	private Integer userId;
  	
  	private Integer userRoleId;
  	
  	private Integer typeId;
  	
  	private Integer isUsed;
  	
  	private String questionCreatorNickname;
  	
  	

	public String getQuestionCreatorNickname() {
		return questionCreatorNickname;
	}

	public void setQuestionCreatorNickname(String questionCreatorNickname) {
		this.questionCreatorNickname = questionCreatorNickname;
	}

	public Integer getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(Integer isUsed) {
		this.isUsed = isUsed;
	}

	public String getQuestionPicture() {
		return questionPicture;
	}

	public void setQuestionPicture(String questionPicture) {
		this.questionPicture = questionPicture;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public boolean isRight() {
		return isRight;
	}

	public void setRight(boolean isRight) {
		this.isRight = isRight;
	}

	public String[] getSelectOptionIds() {
		return selectOptionIds;
	}

	public void setSelectOptionIds(String[] selectOptionIds) {
		this.selectOptionIds = selectOptionIds;
	}

	public String getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(String isOpen) {
		this.isOpen = isOpen;
	}

	public List<QuestionOption> getQuestionOptionList() {
		return questionOptionList;
	}

	public void setQuestionOptionList(List<QuestionOption> questionOptionList) {
		this.questionOptionList = questionOptionList;
	}

	public String getQuestionLevelDesc() {
		return questionLevelDesc;
	}

	public void setQuestionLevelDesc(String questionLevelDesc) {
		this.questionLevelDesc = questionLevelDesc;
	}

	public String getQuestionTypeDesc() {
		return questionTypeDesc;
	}

	public void setQuestionTypeDesc(String questionTypeDesc) {
		this.questionTypeDesc = questionTypeDesc;
	}

	public String getQuestionCategoryDesc() {
		return questionCategoryDesc;
	}

	public void setQuestionCategoryDesc(String questionCategoryDesc) {
		this.questionCategoryDesc = questionCategoryDesc;
	}

	public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName == null ? null : questionName.trim();
    }

    public String getQuestionScore() {
        return questionScore;
    }

    public void setQuestionScore(String questionScore) {
        this.questionScore = questionScore == null ? null : questionScore.trim();
    }

    public Integer getQuestionCreatorId() {
        return questionCreatorId;
    }

    public void setQuestionCreatorId(Integer questionCreatorId) {
        this.questionCreatorId = questionCreatorId;
    }

    public String getQuestionLevelId() {
        return questionLevelId;
    }

    public void setQuestionLevelId(String questionLevelId) {
        this.questionLevelId = questionLevelId == null ? null : questionLevelId.trim();
    }

    public String getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(String questionTypeId) {
        this.questionTypeId = questionTypeId == null ? null : questionTypeId.trim();
    }

    public String getQuestionCategoryId() {
        return questionCategoryId;
    }

    public void setQuestionCategoryId(String questionCategoryId) {
        this.questionCategoryId = questionCategoryId == null ? null : questionCategoryId.trim();
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription == null ? null : questionDescription.trim();
    }

    public String getQuestionOptionIds() {
        return questionOptionIds;
    }

    public void setQuestionOptionIds(String questionOptionIds) {
        this.questionOptionIds = questionOptionIds == null ? null : questionOptionIds.trim();
    }

    public String getQuestionAnswerOptionIds() {
        return questionAnswerOptionIds;
    }

    public void setQuestionAnswerOptionIds(String questionAnswerOptionIds) {
        this.questionAnswerOptionIds = questionAnswerOptionIds == null ? null : questionAnswerOptionIds.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", questionId=").append(questionId);
        sb.append(", questionName=").append(questionName);
        sb.append(", questionScore=").append(questionScore);
        sb.append(", questionCreatorId=").append(questionCreatorId);
        sb.append(", questionLevelId=").append(questionLevelId);
        sb.append(", questionTypeId=").append(questionTypeId);
        sb.append(", questionCategoryId=").append(questionCategoryId);
        sb.append(", questionDescription=").append(questionDescription);
        sb.append(", questionOptionIds=").append(questionOptionIds);
        sb.append(", questionAnswerOptionIds=").append(questionAnswerOptionIds);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}