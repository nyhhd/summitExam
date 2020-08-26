package com.summitexam.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ExamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andExamsIdIsNull() {
            addCriterion("exams_id is null");
            return (Criteria) this;
        }

        public Criteria andExamsIdIsNotNull() {
            addCriterion("exams_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamsIdEqualTo(Integer value) {
            addCriterion("exams_id =", value, "examsId");
            return (Criteria) this;
        }

        public Criteria andExamsIdNotEqualTo(Integer value) {
            addCriterion("exams_id <>", value, "examsId");
            return (Criteria) this;
        }

        public Criteria andExamsIdGreaterThan(Integer value) {
            addCriterion("exams_id >", value, "examsId");
            return (Criteria) this;
        }

        public Criteria andExamsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exams_id >=", value, "examsId");
            return (Criteria) this;
        }

        public Criteria andExamsIdLessThan(Integer value) {
            addCriterion("exams_id <", value, "examsId");
            return (Criteria) this;
        }

        public Criteria andExamsIdLessThanOrEqualTo(Integer value) {
            addCriterion("exams_id <=", value, "examsId");
            return (Criteria) this;
        }

        public Criteria andExamsIdIn(List<Integer> values) {
            addCriterion("exams_id in", values, "examsId");
            return (Criteria) this;
        }

        public Criteria andExamsIdNotIn(List<Integer> values) {
            addCriterion("exams_id not in", values, "examsId");
            return (Criteria) this;
        }

        public Criteria andExamsIdBetween(Integer value1, Integer value2) {
            addCriterion("exams_id between", value1, value2, "examsId");
            return (Criteria) this;
        }

        public Criteria andExamsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exams_id not between", value1, value2, "examsId");
            return (Criteria) this;
        }

        public Criteria andExamsNameIsNull() {
            addCriterion("exams_name is null");
            return (Criteria) this;
        }

        public Criteria andExamsNameIsNotNull() {
            addCriterion("exams_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamsNameEqualTo(String value) {
            addCriterion("exams_name =", value, "examsName");
            return (Criteria) this;
        }

        public Criteria andExamsNameNotEqualTo(String value) {
            addCriterion("exams_name <>", value, "examsName");
            return (Criteria) this;
        }

        public Criteria andExamsNameGreaterThan(String value) {
            addCriterion("exams_name >", value, "examsName");
            return (Criteria) this;
        }

        public Criteria andExamsNameGreaterThanOrEqualTo(String value) {
            addCriterion("exams_name >=", value, "examsName");
            return (Criteria) this;
        }

        public Criteria andExamsNameLessThan(String value) {
            addCriterion("exams_name <", value, "examsName");
            return (Criteria) this;
        }

        public Criteria andExamsNameLessThanOrEqualTo(String value) {
            addCriterion("exams_name <=", value, "examsName");
            return (Criteria) this;
        }

        public Criteria andExamsNameLike(String value) {
            addCriterion("exams_name like", value, "examsName");
            return (Criteria) this;
        }

        public Criteria andExamsNameNotLike(String value) {
            addCriterion("exams_name not like", value, "examsName");
            return (Criteria) this;
        }

        public Criteria andExamsNameIn(List<String> values) {
            addCriterion("exams_name in", values, "examsName");
            return (Criteria) this;
        }

        public Criteria andExamsNameNotIn(List<String> values) {
            addCriterion("exams_name not in", values, "examsName");
            return (Criteria) this;
        }

        public Criteria andExamsNameBetween(String value1, String value2) {
            addCriterion("exams_name between", value1, value2, "examsName");
            return (Criteria) this;
        }

        public Criteria andExamsNameNotBetween(String value1, String value2) {
            addCriterion("exams_name not between", value1, value2, "examsName");
            return (Criteria) this;
        }

        public Criteria andExamsDescriptionIsNull() {
            addCriterion("exams_description is null");
            return (Criteria) this;
        }

        public Criteria andExamsDescriptionIsNotNull() {
            addCriterion("exams_description is not null");
            return (Criteria) this;
        }

        public Criteria andExamsDescriptionEqualTo(String value) {
            addCriterion("exams_description =", value, "examsDescription");
            return (Criteria) this;
        }

        public Criteria andExamsDescriptionNotEqualTo(String value) {
            addCriterion("exams_description <>", value, "examsDescription");
            return (Criteria) this;
        }

        public Criteria andExamsDescriptionGreaterThan(String value) {
            addCriterion("exams_description >", value, "examsDescription");
            return (Criteria) this;
        }

        public Criteria andExamsDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("exams_description >=", value, "examsDescription");
            return (Criteria) this;
        }

        public Criteria andExamsDescriptionLessThan(String value) {
            addCriterion("exams_description <", value, "examsDescription");
            return (Criteria) this;
        }

        public Criteria andExamsDescriptionLessThanOrEqualTo(String value) {
            addCriterion("exams_description <=", value, "examsDescription");
            return (Criteria) this;
        }

        public Criteria andExamsDescriptionLike(String value) {
            addCriterion("exams_description like", value, "examsDescription");
            return (Criteria) this;
        }

        public Criteria andExamsDescriptionNotLike(String value) {
            addCriterion("exams_description not like", value, "examsDescription");
            return (Criteria) this;
        }

        public Criteria andExamsDescriptionIn(List<String> values) {
            addCriterion("exams_description in", values, "examsDescription");
            return (Criteria) this;
        }

        public Criteria andExamsDescriptionNotIn(List<String> values) {
            addCriterion("exams_description not in", values, "examsDescription");
            return (Criteria) this;
        }

        public Criteria andExamsDescriptionBetween(String value1, String value2) {
            addCriterion("exams_description between", value1, value2, "examsDescription");
            return (Criteria) this;
        }

        public Criteria andExamsDescriptionNotBetween(String value1, String value2) {
            addCriterion("exams_description not between", value1, value2, "examsDescription");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsRadioIsNull() {
            addCriterion("exam_question_ids_radio is null");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsRadioIsNotNull() {
            addCriterion("exam_question_ids_radio is not null");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsRadioEqualTo(String value) {
            addCriterion("exam_question_ids_radio =", value, "examQuestionIdsRadio");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsRadioNotEqualTo(String value) {
            addCriterion("exam_question_ids_radio <>", value, "examQuestionIdsRadio");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsRadioGreaterThan(String value) {
            addCriterion("exam_question_ids_radio >", value, "examQuestionIdsRadio");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsRadioGreaterThanOrEqualTo(String value) {
            addCriterion("exam_question_ids_radio >=", value, "examQuestionIdsRadio");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsRadioLessThan(String value) {
            addCriterion("exam_question_ids_radio <", value, "examQuestionIdsRadio");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsRadioLessThanOrEqualTo(String value) {
            addCriterion("exam_question_ids_radio <=", value, "examQuestionIdsRadio");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsRadioLike(String value) {
            addCriterion("exam_question_ids_radio like", value, "examQuestionIdsRadio");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsRadioNotLike(String value) {
            addCriterion("exam_question_ids_radio not like", value, "examQuestionIdsRadio");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsRadioIn(List<String> values) {
            addCriterion("exam_question_ids_radio in", values, "examQuestionIdsRadio");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsRadioNotIn(List<String> values) {
            addCriterion("exam_question_ids_radio not in", values, "examQuestionIdsRadio");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsRadioBetween(String value1, String value2) {
            addCriterion("exam_question_ids_radio between", value1, value2, "examQuestionIdsRadio");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsRadioNotBetween(String value1, String value2) {
            addCriterion("exam_question_ids_radio not between", value1, value2, "examQuestionIdsRadio");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsCheckIsNull() {
            addCriterion("exam_question_ids_check is null");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsCheckIsNotNull() {
            addCriterion("exam_question_ids_check is not null");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsCheckEqualTo(String value) {
            addCriterion("exam_question_ids_check =", value, "examQuestionIdsCheck");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsCheckNotEqualTo(String value) {
            addCriterion("exam_question_ids_check <>", value, "examQuestionIdsCheck");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsCheckGreaterThan(String value) {
            addCriterion("exam_question_ids_check >", value, "examQuestionIdsCheck");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsCheckGreaterThanOrEqualTo(String value) {
            addCriterion("exam_question_ids_check >=", value, "examQuestionIdsCheck");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsCheckLessThan(String value) {
            addCriterion("exam_question_ids_check <", value, "examQuestionIdsCheck");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsCheckLessThanOrEqualTo(String value) {
            addCriterion("exam_question_ids_check <=", value, "examQuestionIdsCheck");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsCheckLike(String value) {
            addCriterion("exam_question_ids_check like", value, "examQuestionIdsCheck");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsCheckNotLike(String value) {
            addCriterion("exam_question_ids_check not like", value, "examQuestionIdsCheck");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsCheckIn(List<String> values) {
            addCriterion("exam_question_ids_check in", values, "examQuestionIdsCheck");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsCheckNotIn(List<String> values) {
            addCriterion("exam_question_ids_check not in", values, "examQuestionIdsCheck");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsCheckBetween(String value1, String value2) {
            addCriterion("exam_question_ids_check between", value1, value2, "examQuestionIdsCheck");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsCheckNotBetween(String value1, String value2) {
            addCriterion("exam_question_ids_check not between", value1, value2, "examQuestionIdsCheck");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsJudgeIsNull() {
            addCriterion("exam_question_ids_judge is null");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsJudgeIsNotNull() {
            addCriterion("exam_question_ids_judge is not null");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsJudgeEqualTo(String value) {
            addCriterion("exam_question_ids_judge =", value, "examQuestionIdsJudge");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsJudgeNotEqualTo(String value) {
            addCriterion("exam_question_ids_judge <>", value, "examQuestionIdsJudge");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsJudgeGreaterThan(String value) {
            addCriterion("exam_question_ids_judge >", value, "examQuestionIdsJudge");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsJudgeGreaterThanOrEqualTo(String value) {
            addCriterion("exam_question_ids_judge >=", value, "examQuestionIdsJudge");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsJudgeLessThan(String value) {
            addCriterion("exam_question_ids_judge <", value, "examQuestionIdsJudge");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsJudgeLessThanOrEqualTo(String value) {
            addCriterion("exam_question_ids_judge <=", value, "examQuestionIdsJudge");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsJudgeLike(String value) {
            addCriterion("exam_question_ids_judge like", value, "examQuestionIdsJudge");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsJudgeNotLike(String value) {
            addCriterion("exam_question_ids_judge not like", value, "examQuestionIdsJudge");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsJudgeIn(List<String> values) {
            addCriterion("exam_question_ids_judge in", values, "examQuestionIdsJudge");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsJudgeNotIn(List<String> values) {
            addCriterion("exam_question_ids_judge not in", values, "examQuestionIdsJudge");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsJudgeBetween(String value1, String value2) {
            addCriterion("exam_question_ids_judge between", value1, value2, "examQuestionIdsJudge");
            return (Criteria) this;
        }

        public Criteria andExamQuestionIdsJudgeNotBetween(String value1, String value2) {
            addCriterion("exam_question_ids_judge not between", value1, value2, "examQuestionIdsJudge");
            return (Criteria) this;
        }

        public Criteria andExamsScoreIsNull() {
            addCriterion("exams_score is null");
            return (Criteria) this;
        }

        public Criteria andExamsScoreIsNotNull() {
            addCriterion("exams_score is not null");
            return (Criteria) this;
        }

        public Criteria andExamsScoreEqualTo(Integer value) {
            addCriterion("exams_score =", value, "examsScore");
            return (Criteria) this;
        }

        public Criteria andExamsScoreNotEqualTo(Integer value) {
            addCriterion("exams_score <>", value, "examsScore");
            return (Criteria) this;
        }

        public Criteria andExamsScoreGreaterThan(Integer value) {
            addCriterion("exams_score >", value, "examsScore");
            return (Criteria) this;
        }

        public Criteria andExamsScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("exams_score >=", value, "examsScore");
            return (Criteria) this;
        }

        public Criteria andExamsScoreLessThan(Integer value) {
            addCriterion("exams_score <", value, "examsScore");
            return (Criteria) this;
        }

        public Criteria andExamsScoreLessThanOrEqualTo(Integer value) {
            addCriterion("exams_score <=", value, "examsScore");
            return (Criteria) this;
        }

        public Criteria andExamsScoreIn(List<Integer> values) {
            addCriterion("exams_score in", values, "examsScore");
            return (Criteria) this;
        }

        public Criteria andExamsScoreNotIn(List<Integer> values) {
            addCriterion("exams_score not in", values, "examsScore");
            return (Criteria) this;
        }

        public Criteria andExamsScoreBetween(Integer value1, Integer value2) {
            addCriterion("exams_score between", value1, value2, "examsScore");
            return (Criteria) this;
        }

        public Criteria andExamsScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("exams_score not between", value1, value2, "examsScore");
            return (Criteria) this;
        }

        public Criteria andExamsScoreRadioIsNull() {
            addCriterion("exams_score_radio is null");
            return (Criteria) this;
        }

        public Criteria andExamsScoreRadioIsNotNull() {
            addCriterion("exams_score_radio is not null");
            return (Criteria) this;
        }

        public Criteria andExamsScoreRadioEqualTo(Integer value) {
            addCriterion("exams_score_radio =", value, "examsScoreRadio");
            return (Criteria) this;
        }

        public Criteria andExamsScoreRadioNotEqualTo(Integer value) {
            addCriterion("exams_score_radio <>", value, "examsScoreRadio");
            return (Criteria) this;
        }

        public Criteria andExamsScoreRadioGreaterThan(Integer value) {
            addCriterion("exams_score_radio >", value, "examsScoreRadio");
            return (Criteria) this;
        }

        public Criteria andExamsScoreRadioGreaterThanOrEqualTo(Integer value) {
            addCriterion("exams_score_radio >=", value, "examsScoreRadio");
            return (Criteria) this;
        }

        public Criteria andExamsScoreRadioLessThan(Integer value) {
            addCriterion("exams_score_radio <", value, "examsScoreRadio");
            return (Criteria) this;
        }

        public Criteria andExamsScoreRadioLessThanOrEqualTo(Integer value) {
            addCriterion("exams_score_radio <=", value, "examsScoreRadio");
            return (Criteria) this;
        }

        public Criteria andExamsScoreRadioIn(List<Integer> values) {
            addCriterion("exams_score_radio in", values, "examsScoreRadio");
            return (Criteria) this;
        }

        public Criteria andExamsScoreRadioNotIn(List<Integer> values) {
            addCriterion("exams_score_radio not in", values, "examsScoreRadio");
            return (Criteria) this;
        }

        public Criteria andExamsScoreRadioBetween(Integer value1, Integer value2) {
            addCriterion("exams_score_radio between", value1, value2, "examsScoreRadio");
            return (Criteria) this;
        }

        public Criteria andExamsScoreRadioNotBetween(Integer value1, Integer value2) {
            addCriterion("exams_score_radio not between", value1, value2, "examsScoreRadio");
            return (Criteria) this;
        }

        public Criteria andExamsScoreCheckIsNull() {
            addCriterion("exams_score_check is null");
            return (Criteria) this;
        }

        public Criteria andExamsScoreCheckIsNotNull() {
            addCriterion("exams_score_check is not null");
            return (Criteria) this;
        }

        public Criteria andExamsScoreCheckEqualTo(Integer value) {
            addCriterion("exams_score_check =", value, "examsScoreCheck");
            return (Criteria) this;
        }

        public Criteria andExamsScoreCheckNotEqualTo(Integer value) {
            addCriterion("exams_score_check <>", value, "examsScoreCheck");
            return (Criteria) this;
        }

        public Criteria andExamsScoreCheckGreaterThan(Integer value) {
            addCriterion("exams_score_check >", value, "examsScoreCheck");
            return (Criteria) this;
        }

        public Criteria andExamsScoreCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("exams_score_check >=", value, "examsScoreCheck");
            return (Criteria) this;
        }

        public Criteria andExamsScoreCheckLessThan(Integer value) {
            addCriterion("exams_score_check <", value, "examsScoreCheck");
            return (Criteria) this;
        }

        public Criteria andExamsScoreCheckLessThanOrEqualTo(Integer value) {
            addCriterion("exams_score_check <=", value, "examsScoreCheck");
            return (Criteria) this;
        }

        public Criteria andExamsScoreCheckIn(List<Integer> values) {
            addCriterion("exams_score_check in", values, "examsScoreCheck");
            return (Criteria) this;
        }

        public Criteria andExamsScoreCheckNotIn(List<Integer> values) {
            addCriterion("exams_score_check not in", values, "examsScoreCheck");
            return (Criteria) this;
        }

        public Criteria andExamsScoreCheckBetween(Integer value1, Integer value2) {
            addCriterion("exams_score_check between", value1, value2, "examsScoreCheck");
            return (Criteria) this;
        }

        public Criteria andExamsScoreCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("exams_score_check not between", value1, value2, "examsScoreCheck");
            return (Criteria) this;
        }

        public Criteria andExamsScoreJudgeIsNull() {
            addCriterion("exams_score_judge is null");
            return (Criteria) this;
        }

        public Criteria andExamsScoreJudgeIsNotNull() {
            addCriterion("exams_score_judge is not null");
            return (Criteria) this;
        }

        public Criteria andExamsScoreJudgeEqualTo(Integer value) {
            addCriterion("exams_score_judge =", value, "examsScoreJudge");
            return (Criteria) this;
        }

        public Criteria andExamsScoreJudgeNotEqualTo(Integer value) {
            addCriterion("exams_score_judge <>", value, "examsScoreJudge");
            return (Criteria) this;
        }

        public Criteria andExamsScoreJudgeGreaterThan(Integer value) {
            addCriterion("exams_score_judge >", value, "examsScoreJudge");
            return (Criteria) this;
        }

        public Criteria andExamsScoreJudgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("exams_score_judge >=", value, "examsScoreJudge");
            return (Criteria) this;
        }

        public Criteria andExamsScoreJudgeLessThan(Integer value) {
            addCriterion("exams_score_judge <", value, "examsScoreJudge");
            return (Criteria) this;
        }

        public Criteria andExamsScoreJudgeLessThanOrEqualTo(Integer value) {
            addCriterion("exams_score_judge <=", value, "examsScoreJudge");
            return (Criteria) this;
        }

        public Criteria andExamsScoreJudgeIn(List<Integer> values) {
            addCriterion("exams_score_judge in", values, "examsScoreJudge");
            return (Criteria) this;
        }

        public Criteria andExamsScoreJudgeNotIn(List<Integer> values) {
            addCriterion("exams_score_judge not in", values, "examsScoreJudge");
            return (Criteria) this;
        }

        public Criteria andExamsScoreJudgeBetween(Integer value1, Integer value2) {
            addCriterion("exams_score_judge between", value1, value2, "examsScoreJudge");
            return (Criteria) this;
        }

        public Criteria andExamsScoreJudgeNotBetween(Integer value1, Integer value2) {
            addCriterion("exams_score_judge not between", value1, value2, "examsScoreJudge");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorIdIsNull() {
            addCriterion("exams_creator_id is null");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorIdIsNotNull() {
            addCriterion("exams_creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorIdEqualTo(Integer value) {
            addCriterion("exams_creator_id =", value, "examsCreatorId");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorIdNotEqualTo(Integer value) {
            addCriterion("exams_creator_id <>", value, "examsCreatorId");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorIdGreaterThan(Integer value) {
            addCriterion("exams_creator_id >", value, "examsCreatorId");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exams_creator_id >=", value, "examsCreatorId");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorIdLessThan(Integer value) {
            addCriterion("exams_creator_id <", value, "examsCreatorId");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("exams_creator_id <=", value, "examsCreatorId");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorIdIn(List<Integer> values) {
            addCriterion("exams_creator_id in", values, "examsCreatorId");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorIdNotIn(List<Integer> values) {
            addCriterion("exams_creator_id not in", values, "examsCreatorId");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("exams_creator_id between", value1, value2, "examsCreatorId");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exams_creator_id not between", value1, value2, "examsCreatorId");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorNicknameIsNull() {
            addCriterion("exams_creator_nickname is null");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorNicknameIsNotNull() {
            addCriterion("exams_creator_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorNicknameEqualTo(String value) {
            addCriterion("exams_creator_nickname =", value, "examsCreatorNickname");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorNicknameNotEqualTo(String value) {
            addCriterion("exams_creator_nickname <>", value, "examsCreatorNickname");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorNicknameGreaterThan(String value) {
            addCriterion("exams_creator_nickname >", value, "examsCreatorNickname");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("exams_creator_nickname >=", value, "examsCreatorNickname");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorNicknameLessThan(String value) {
            addCriterion("exams_creator_nickname <", value, "examsCreatorNickname");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorNicknameLessThanOrEqualTo(String value) {
            addCriterion("exams_creator_nickname <=", value, "examsCreatorNickname");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorNicknameLike(String value) {
            addCriterion("exams_creator_nickname like", value, "examsCreatorNickname");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorNicknameNotLike(String value) {
            addCriterion("exams_creator_nickname not like", value, "examsCreatorNickname");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorNicknameIn(List<String> values) {
            addCriterion("exams_creator_nickname in", values, "examsCreatorNickname");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorNicknameNotIn(List<String> values) {
            addCriterion("exams_creator_nickname not in", values, "examsCreatorNickname");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorNicknameBetween(String value1, String value2) {
            addCriterion("exams_creator_nickname between", value1, value2, "examsCreatorNickname");
            return (Criteria) this;
        }

        public Criteria andExamsCreatorNicknameNotBetween(String value1, String value2) {
            addCriterion("exams_creator_nickname not between", value1, value2, "examsCreatorNickname");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNull() {
            addCriterion("is_open is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNotNull() {
            addCriterion("is_open is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenEqualTo(String value) {
            addCriterion("is_open =", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotEqualTo(String value) {
            addCriterion("is_open <>", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThan(String value) {
            addCriterion("is_open >", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThanOrEqualTo(String value) {
            addCriterion("is_open >=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThan(String value) {
            addCriterion("is_open <", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThanOrEqualTo(String value) {
            addCriterion("is_open <=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLike(String value) {
            addCriterion("is_open like", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotLike(String value) {
            addCriterion("is_open not like", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenIn(List<String> values) {
            addCriterion("is_open in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotIn(List<String> values) {
            addCriterion("is_open not in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenBetween(String value1, String value2) {
            addCriterion("is_open between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotBetween(String value1, String value2) {
            addCriterion("is_open not between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andExamineeIdsIsNull() {
            addCriterion("examinee_ids is null");
            return (Criteria) this;
        }

        public Criteria andExamineeIdsIsNotNull() {
            addCriterion("examinee_ids is not null");
            return (Criteria) this;
        }

        public Criteria andExamineeIdsEqualTo(String value) {
            addCriterion("examinee_ids =", value, "examineeIds");
            return (Criteria) this;
        }

        public Criteria andExamineeIdsNotEqualTo(String value) {
            addCriterion("examinee_ids <>", value, "examineeIds");
            return (Criteria) this;
        }

        public Criteria andExamineeIdsGreaterThan(String value) {
            addCriterion("examinee_ids >", value, "examineeIds");
            return (Criteria) this;
        }

        public Criteria andExamineeIdsGreaterThanOrEqualTo(String value) {
            addCriterion("examinee_ids >=", value, "examineeIds");
            return (Criteria) this;
        }

        public Criteria andExamineeIdsLessThan(String value) {
            addCriterion("examinee_ids <", value, "examineeIds");
            return (Criteria) this;
        }

        public Criteria andExamineeIdsLessThanOrEqualTo(String value) {
            addCriterion("examinee_ids <=", value, "examineeIds");
            return (Criteria) this;
        }

        public Criteria andExamineeIdsLike(String value) {
            addCriterion("examinee_ids like", value, "examineeIds");
            return (Criteria) this;
        }

        public Criteria andExamineeIdsNotLike(String value) {
            addCriterion("examinee_ids not like", value, "examineeIds");
            return (Criteria) this;
        }

        public Criteria andExamineeIdsIn(List<String> values) {
            addCriterion("examinee_ids in", values, "examineeIds");
            return (Criteria) this;
        }

        public Criteria andExamineeIdsNotIn(List<String> values) {
            addCriterion("examinee_ids not in", values, "examineeIds");
            return (Criteria) this;
        }

        public Criteria andExamineeIdsBetween(String value1, String value2) {
            addCriterion("examinee_ids between", value1, value2, "examineeIds");
            return (Criteria) this;
        }

        public Criteria andExamineeIdsNotBetween(String value1, String value2) {
            addCriterion("examinee_ids not between", value1, value2, "examineeIds");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}