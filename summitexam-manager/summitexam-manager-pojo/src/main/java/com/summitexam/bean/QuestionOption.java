package com.summitexam.bean;

import java.io.Serializable;

public class QuestionOption implements Serializable {
    private Integer questionOptionId;

    private String questionOptionContent;

    private String questionOptionDescription;

    private static final long serialVersionUID = 1L;

    public Integer getQuestionOptionId() {
        return questionOptionId;
    }

    public void setQuestionOptionId(Integer questionOptionId) {
        this.questionOptionId = questionOptionId;
    }

    public String getQuestionOptionContent() {
        return questionOptionContent;
    }

    public void setQuestionOptionContent(String questionOptionContent) {
        this.questionOptionContent = questionOptionContent == null ? null : questionOptionContent.trim();
    }

    public String getQuestionOptionDescription() {
        return questionOptionDescription;
    }

    public void setQuestionOptionDescription(String questionOptionDescription) {
        this.questionOptionDescription = questionOptionDescription == null ? null : questionOptionDescription.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", questionOptionId=").append(questionOptionId);
        sb.append(", questionOptionContent=").append(questionOptionContent);
        sb.append(", questionOptionDescription=").append(questionOptionDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}