package com.summitexam.bean;

import java.io.Serializable;
import java.util.List;

public class ExamRecord implements Serializable {
	private String answerOptionIds;
	
	private String examJoinerName;
	
    private Integer examRecordId;

    private String examsName;

    private Integer examJoinerId;

    private String examJoinDate;

    private Integer examTimeCost;

    private Integer examJoinScore;

    private Integer examResultLevel;
    
    private String  examResultLevelDesc;

    private Integer examId;					//这里面保存的考试Id
    
    private String examSorce;
    
    
    
    public String getExamSorce() {
		return examSorce;
	}

	public void setExamSorce(String examSorce) {
		this.examSorce = examSorce;
	}

	private static final long serialVersionUID = 1L;
    
    //0430新增
  	private List<Question> questions;
  	
  	private Exam exam;
  	
  	private Exams exams;
  	
  	

	public Exams getExams() {
		return exams;
	}

	public void setExams(Exams exams) {
		this.exams = exams;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public List<Question> getQuestions() {
  		return questions;
  	}

  	public void setQuestions(List<Question> questions) {
  		this.questions = questions;
  	}
    public String getExamJoinerName() {
		return examJoinerName;
	}

	public void setExamJoinerName(String examJoinerName) {
		this.examJoinerName = examJoinerName;
	}

	public String getAnswerOptionIds() {
		return answerOptionIds;
	}

	public void setAnswerOptionIds(String answerOptionIds) {
		this.answerOptionIds = answerOptionIds;
	}

	public String getExamResultLevelDesc() {
		return examResultLevelDesc;
	}

	public void setExamResultLevelDesc(String examResultLevelDesc) {
		this.examResultLevelDesc = examResultLevelDesc;
	}

	public Integer getExamRecordId() {
        return examRecordId;
    }

    public void setExamRecordId(Integer examRecordId) {
        this.examRecordId = examRecordId;
    }

    public String getExamsName() {
        return examsName;
    }

    public void setExamsName(String examsName) {
        this.examsName = examsName == null ? null : examsName.trim();
    }

    public Integer getExamJoinerId() {
        return examJoinerId;
    }

    public void setExamJoinerId(Integer examJoinerId) {
        this.examJoinerId = examJoinerId;
    }

    public String getExamJoinDate() {
        return examJoinDate;
    }

    public void setExamJoinDate(String examJoinDate) {
        this.examJoinDate = examJoinDate == null ? null : examJoinDate.trim();
    }

    public Integer getExamTimeCost() {
        return examTimeCost;
    }

    public void setExamTimeCost(Integer examTimeCost) {
        this.examTimeCost = examTimeCost;
    }

    public Integer getExamJoinScore() {
        return examJoinScore;
    }

    public void setExamJoinScore(Integer examJoinScore) {
        this.examJoinScore = examJoinScore;
    }

    public Integer getExamResultLevel() {
        return examResultLevel;
    }

    public void setExamResultLevel(Integer examResultLevel) {
        this.examResultLevel = examResultLevel;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", examRecordId=").append(examRecordId);
        sb.append(", examsName=").append(examsName);
        sb.append(", examJoinerId=").append(examJoinerId);
        sb.append(", examJoinDate=").append(examJoinDate);
        sb.append(", examTimeCost=").append(examTimeCost);
        sb.append(", examJoinScore=").append(examJoinScore);
        sb.append(", examResultLevel=").append(examResultLevel);
        sb.append(", examId=").append(examId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}