package com.summitexam.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ExamRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamRecordExample() {
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

        public Criteria andExamRecordIdIsNull() {
            addCriterion("exam_record_id is null");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdIsNotNull() {
            addCriterion("exam_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdEqualTo(Integer value) {
            addCriterion("exam_record_id =", value, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdNotEqualTo(Integer value) {
            addCriterion("exam_record_id <>", value, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdGreaterThan(Integer value) {
            addCriterion("exam_record_id >", value, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_record_id >=", value, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdLessThan(Integer value) {
            addCriterion("exam_record_id <", value, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_record_id <=", value, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdIn(List<Integer> values) {
            addCriterion("exam_record_id in", values, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdNotIn(List<Integer> values) {
            addCriterion("exam_record_id not in", values, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_record_id between", value1, value2, "examRecordId");
            return (Criteria) this;
        }

        public Criteria andExamRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_record_id not between", value1, value2, "examRecordId");
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

        public Criteria andExamJoinerIdIsNull() {
            addCriterion("exam_joiner_id is null");
            return (Criteria) this;
        }

        public Criteria andExamJoinerIdIsNotNull() {
            addCriterion("exam_joiner_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamJoinerIdEqualTo(Integer value) {
            addCriterion("exam_joiner_id =", value, "examJoinerId");
            return (Criteria) this;
        }

        public Criteria andExamJoinerIdNotEqualTo(Integer value) {
            addCriterion("exam_joiner_id <>", value, "examJoinerId");
            return (Criteria) this;
        }

        public Criteria andExamJoinerIdGreaterThan(Integer value) {
            addCriterion("exam_joiner_id >", value, "examJoinerId");
            return (Criteria) this;
        }

        public Criteria andExamJoinerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_joiner_id >=", value, "examJoinerId");
            return (Criteria) this;
        }

        public Criteria andExamJoinerIdLessThan(Integer value) {
            addCriterion("exam_joiner_id <", value, "examJoinerId");
            return (Criteria) this;
        }

        public Criteria andExamJoinerIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_joiner_id <=", value, "examJoinerId");
            return (Criteria) this;
        }

        public Criteria andExamJoinerIdIn(List<Integer> values) {
            addCriterion("exam_joiner_id in", values, "examJoinerId");
            return (Criteria) this;
        }

        public Criteria andExamJoinerIdNotIn(List<Integer> values) {
            addCriterion("exam_joiner_id not in", values, "examJoinerId");
            return (Criteria) this;
        }

        public Criteria andExamJoinerIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_joiner_id between", value1, value2, "examJoinerId");
            return (Criteria) this;
        }

        public Criteria andExamJoinerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_joiner_id not between", value1, value2, "examJoinerId");
            return (Criteria) this;
        }

        public Criteria andExamJoinDateIsNull() {
            addCriterion("exam_join_date is null");
            return (Criteria) this;
        }

        public Criteria andExamJoinDateIsNotNull() {
            addCriterion("exam_join_date is not null");
            return (Criteria) this;
        }

        public Criteria andExamJoinDateEqualTo(String value) {
            addCriterion("exam_join_date =", value, "examJoinDate");
            return (Criteria) this;
        }

        public Criteria andExamJoinDateNotEqualTo(String value) {
            addCriterion("exam_join_date <>", value, "examJoinDate");
            return (Criteria) this;
        }

        public Criteria andExamJoinDateGreaterThan(String value) {
            addCriterion("exam_join_date >", value, "examJoinDate");
            return (Criteria) this;
        }

        public Criteria andExamJoinDateGreaterThanOrEqualTo(String value) {
            addCriterion("exam_join_date >=", value, "examJoinDate");
            return (Criteria) this;
        }

        public Criteria andExamJoinDateLessThan(String value) {
            addCriterion("exam_join_date <", value, "examJoinDate");
            return (Criteria) this;
        }

        public Criteria andExamJoinDateLessThanOrEqualTo(String value) {
            addCriterion("exam_join_date <=", value, "examJoinDate");
            return (Criteria) this;
        }

        public Criteria andExamJoinDateLike(String value) {
            addCriterion("exam_join_date like", value, "examJoinDate");
            return (Criteria) this;
        }

        public Criteria andExamJoinDateNotLike(String value) {
            addCriterion("exam_join_date not like", value, "examJoinDate");
            return (Criteria) this;
        }

        public Criteria andExamJoinDateIn(List<String> values) {
            addCriterion("exam_join_date in", values, "examJoinDate");
            return (Criteria) this;
        }

        public Criteria andExamJoinDateNotIn(List<String> values) {
            addCriterion("exam_join_date not in", values, "examJoinDate");
            return (Criteria) this;
        }

        public Criteria andExamJoinDateBetween(String value1, String value2) {
            addCriterion("exam_join_date between", value1, value2, "examJoinDate");
            return (Criteria) this;
        }

        public Criteria andExamJoinDateNotBetween(String value1, String value2) {
            addCriterion("exam_join_date not between", value1, value2, "examJoinDate");
            return (Criteria) this;
        }

        public Criteria andExamTimeCostIsNull() {
            addCriterion("exam_time_cost is null");
            return (Criteria) this;
        }

        public Criteria andExamTimeCostIsNotNull() {
            addCriterion("exam_time_cost is not null");
            return (Criteria) this;
        }

        public Criteria andExamTimeCostEqualTo(Integer value) {
            addCriterion("exam_time_cost =", value, "examTimeCost");
            return (Criteria) this;
        }

        public Criteria andExamTimeCostNotEqualTo(Integer value) {
            addCriterion("exam_time_cost <>", value, "examTimeCost");
            return (Criteria) this;
        }

        public Criteria andExamTimeCostGreaterThan(Integer value) {
            addCriterion("exam_time_cost >", value, "examTimeCost");
            return (Criteria) this;
        }

        public Criteria andExamTimeCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_time_cost >=", value, "examTimeCost");
            return (Criteria) this;
        }

        public Criteria andExamTimeCostLessThan(Integer value) {
            addCriterion("exam_time_cost <", value, "examTimeCost");
            return (Criteria) this;
        }

        public Criteria andExamTimeCostLessThanOrEqualTo(Integer value) {
            addCriterion("exam_time_cost <=", value, "examTimeCost");
            return (Criteria) this;
        }

        public Criteria andExamTimeCostIn(List<Integer> values) {
            addCriterion("exam_time_cost in", values, "examTimeCost");
            return (Criteria) this;
        }

        public Criteria andExamTimeCostNotIn(List<Integer> values) {
            addCriterion("exam_time_cost not in", values, "examTimeCost");
            return (Criteria) this;
        }

        public Criteria andExamTimeCostBetween(Integer value1, Integer value2) {
            addCriterion("exam_time_cost between", value1, value2, "examTimeCost");
            return (Criteria) this;
        }

        public Criteria andExamTimeCostNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_time_cost not between", value1, value2, "examTimeCost");
            return (Criteria) this;
        }

        public Criteria andExamJoinScoreIsNull() {
            addCriterion("exam_join_score is null");
            return (Criteria) this;
        }

        public Criteria andExamJoinScoreIsNotNull() {
            addCriterion("exam_join_score is not null");
            return (Criteria) this;
        }

        public Criteria andExamJoinScoreEqualTo(Integer value) {
            addCriterion("exam_join_score =", value, "examJoinScore");
            return (Criteria) this;
        }

        public Criteria andExamJoinScoreNotEqualTo(Integer value) {
            addCriterion("exam_join_score <>", value, "examJoinScore");
            return (Criteria) this;
        }

        public Criteria andExamJoinScoreGreaterThan(Integer value) {
            addCriterion("exam_join_score >", value, "examJoinScore");
            return (Criteria) this;
        }

        public Criteria andExamJoinScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_join_score >=", value, "examJoinScore");
            return (Criteria) this;
        }

        public Criteria andExamJoinScoreLessThan(Integer value) {
            addCriterion("exam_join_score <", value, "examJoinScore");
            return (Criteria) this;
        }

        public Criteria andExamJoinScoreLessThanOrEqualTo(Integer value) {
            addCriterion("exam_join_score <=", value, "examJoinScore");
            return (Criteria) this;
        }

        public Criteria andExamJoinScoreIn(List<Integer> values) {
            addCriterion("exam_join_score in", values, "examJoinScore");
            return (Criteria) this;
        }

        public Criteria andExamJoinScoreNotIn(List<Integer> values) {
            addCriterion("exam_join_score not in", values, "examJoinScore");
            return (Criteria) this;
        }

        public Criteria andExamJoinScoreBetween(Integer value1, Integer value2) {
            addCriterion("exam_join_score between", value1, value2, "examJoinScore");
            return (Criteria) this;
        }

        public Criteria andExamJoinScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_join_score not between", value1, value2, "examJoinScore");
            return (Criteria) this;
        }

        public Criteria andExamResultLevelIsNull() {
            addCriterion("exam_result_level is null");
            return (Criteria) this;
        }

        public Criteria andExamResultLevelIsNotNull() {
            addCriterion("exam_result_level is not null");
            return (Criteria) this;
        }

        public Criteria andExamResultLevelEqualTo(Integer value) {
            addCriterion("exam_result_level =", value, "examResultLevel");
            return (Criteria) this;
        }

        public Criteria andExamResultLevelNotEqualTo(Integer value) {
            addCriterion("exam_result_level <>", value, "examResultLevel");
            return (Criteria) this;
        }

        public Criteria andExamResultLevelGreaterThan(Integer value) {
            addCriterion("exam_result_level >", value, "examResultLevel");
            return (Criteria) this;
        }

        public Criteria andExamResultLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_result_level >=", value, "examResultLevel");
            return (Criteria) this;
        }

        public Criteria andExamResultLevelLessThan(Integer value) {
            addCriterion("exam_result_level <", value, "examResultLevel");
            return (Criteria) this;
        }

        public Criteria andExamResultLevelLessThanOrEqualTo(Integer value) {
            addCriterion("exam_result_level <=", value, "examResultLevel");
            return (Criteria) this;
        }

        public Criteria andExamResultLevelIn(List<Integer> values) {
            addCriterion("exam_result_level in", values, "examResultLevel");
            return (Criteria) this;
        }

        public Criteria andExamResultLevelNotIn(List<Integer> values) {
            addCriterion("exam_result_level not in", values, "examResultLevel");
            return (Criteria) this;
        }

        public Criteria andExamResultLevelBetween(Integer value1, Integer value2) {
            addCriterion("exam_result_level between", value1, value2, "examResultLevel");
            return (Criteria) this;
        }

        public Criteria andExamResultLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_result_level not between", value1, value2, "examResultLevel");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNull() {
            addCriterion("exam_id is null");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNotNull() {
            addCriterion("exam_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamIdEqualTo(Integer value) {
            addCriterion("exam_id =", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotEqualTo(Integer value) {
            addCriterion("exam_id <>", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThan(Integer value) {
            addCriterion("exam_id >", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_id >=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThan(Integer value) {
            addCriterion("exam_id <", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_id <=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdIn(List<Integer> values) {
            addCriterion("exam_id in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotIn(List<Integer> values) {
            addCriterion("exam_id not in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_id between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_id not between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIdsIsNull() {
            addCriterion("answer_option_ids is null");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIdsIsNotNull() {
            addCriterion("answer_option_ids is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIdsEqualTo(String value) {
            addCriterion("answer_option_ids =", value, "answerOptionIds");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIdsNotEqualTo(String value) {
            addCriterion("answer_option_ids <>", value, "answerOptionIds");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIdsGreaterThan(String value) {
            addCriterion("answer_option_ids >", value, "answerOptionIds");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIdsGreaterThanOrEqualTo(String value) {
            addCriterion("answer_option_ids >=", value, "answerOptionIds");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIdsLessThan(String value) {
            addCriterion("answer_option_ids <", value, "answerOptionIds");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIdsLessThanOrEqualTo(String value) {
            addCriterion("answer_option_ids <=", value, "answerOptionIds");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIdsLike(String value) {
            addCriterion("answer_option_ids like", value, "answerOptionIds");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIdsNotLike(String value) {
            addCriterion("answer_option_ids not like", value, "answerOptionIds");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIdsIn(List<String> values) {
            addCriterion("answer_option_ids in", values, "answerOptionIds");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIdsNotIn(List<String> values) {
            addCriterion("answer_option_ids not in", values, "answerOptionIds");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIdsBetween(String value1, String value2) {
            addCriterion("answer_option_ids between", value1, value2, "answerOptionIds");
            return (Criteria) this;
        }

        public Criteria andAnswerOptionIdsNotBetween(String value1, String value2) {
            addCriterion("answer_option_ids not between", value1, value2, "answerOptionIds");
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