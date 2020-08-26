package com.summitexam.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ExamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamExample() {
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

        public Criteria andExamNameIsNull() {
            addCriterion("exam_name is null");
            return (Criteria) this;
        }

        public Criteria andExamNameIsNotNull() {
            addCriterion("exam_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamNameEqualTo(String value) {
            addCriterion("exam_name =", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotEqualTo(String value) {
            addCriterion("exam_name <>", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameGreaterThan(String value) {
            addCriterion("exam_name >", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameGreaterThanOrEqualTo(String value) {
            addCriterion("exam_name >=", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLessThan(String value) {
            addCriterion("exam_name <", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLessThanOrEqualTo(String value) {
            addCriterion("exam_name <=", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLike(String value) {
            addCriterion("exam_name like", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotLike(String value) {
            addCriterion("exam_name not like", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameIn(List<String> values) {
            addCriterion("exam_name in", values, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotIn(List<String> values) {
            addCriterion("exam_name not in", values, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameBetween(String value1, String value2) {
            addCriterion("exam_name between", value1, value2, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotBetween(String value1, String value2) {
            addCriterion("exam_name not between", value1, value2, "examName");
            return (Criteria) this;
        }

        public Criteria andExamDescriptionIsNull() {
            addCriterion("exam_description is null");
            return (Criteria) this;
        }

        public Criteria andExamDescriptionIsNotNull() {
            addCriterion("exam_description is not null");
            return (Criteria) this;
        }

        public Criteria andExamDescriptionEqualTo(String value) {
            addCriterion("exam_description =", value, "examDescription");
            return (Criteria) this;
        }

        public Criteria andExamDescriptionNotEqualTo(String value) {
            addCriterion("exam_description <>", value, "examDescription");
            return (Criteria) this;
        }

        public Criteria andExamDescriptionGreaterThan(String value) {
            addCriterion("exam_description >", value, "examDescription");
            return (Criteria) this;
        }

        public Criteria andExamDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("exam_description >=", value, "examDescription");
            return (Criteria) this;
        }

        public Criteria andExamDescriptionLessThan(String value) {
            addCriterion("exam_description <", value, "examDescription");
            return (Criteria) this;
        }

        public Criteria andExamDescriptionLessThanOrEqualTo(String value) {
            addCriterion("exam_description <=", value, "examDescription");
            return (Criteria) this;
        }

        public Criteria andExamDescriptionLike(String value) {
            addCriterion("exam_description like", value, "examDescription");
            return (Criteria) this;
        }

        public Criteria andExamDescriptionNotLike(String value) {
            addCriterion("exam_description not like", value, "examDescription");
            return (Criteria) this;
        }

        public Criteria andExamDescriptionIn(List<String> values) {
            addCriterion("exam_description in", values, "examDescription");
            return (Criteria) this;
        }

        public Criteria andExamDescriptionNotIn(List<String> values) {
            addCriterion("exam_description not in", values, "examDescription");
            return (Criteria) this;
        }

        public Criteria andExamDescriptionBetween(String value1, String value2) {
            addCriterion("exam_description between", value1, value2, "examDescription");
            return (Criteria) this;
        }

        public Criteria andExamDescriptionNotBetween(String value1, String value2) {
            addCriterion("exam_description not between", value1, value2, "examDescription");
            return (Criteria) this;
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

        public Criteria andExamTimeLimitIsNull() {
            addCriterion("exam_time_limit is null");
            return (Criteria) this;
        }

        public Criteria andExamTimeLimitIsNotNull() {
            addCriterion("exam_time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andExamTimeLimitEqualTo(String value) {
            addCriterion("exam_time_limit =", value, "examTimeLimit");
            return (Criteria) this;
        }

        public Criteria andExamTimeLimitNotEqualTo(String value) {
            addCriterion("exam_time_limit <>", value, "examTimeLimit");
            return (Criteria) this;
        }

        public Criteria andExamTimeLimitGreaterThan(String value) {
            addCriterion("exam_time_limit >", value, "examTimeLimit");
            return (Criteria) this;
        }

        public Criteria andExamTimeLimitGreaterThanOrEqualTo(String value) {
            addCriterion("exam_time_limit >=", value, "examTimeLimit");
            return (Criteria) this;
        }

        public Criteria andExamTimeLimitLessThan(String value) {
            addCriterion("exam_time_limit <", value, "examTimeLimit");
            return (Criteria) this;
        }

        public Criteria andExamTimeLimitLessThanOrEqualTo(String value) {
            addCriterion("exam_time_limit <=", value, "examTimeLimit");
            return (Criteria) this;
        }

        public Criteria andExamTimeLimitLike(String value) {
            addCriterion("exam_time_limit like", value, "examTimeLimit");
            return (Criteria) this;
        }

        public Criteria andExamTimeLimitNotLike(String value) {
            addCriterion("exam_time_limit not like", value, "examTimeLimit");
            return (Criteria) this;
        }

        public Criteria andExamTimeLimitIn(List<String> values) {
            addCriterion("exam_time_limit in", values, "examTimeLimit");
            return (Criteria) this;
        }

        public Criteria andExamTimeLimitNotIn(List<String> values) {
            addCriterion("exam_time_limit not in", values, "examTimeLimit");
            return (Criteria) this;
        }

        public Criteria andExamTimeLimitBetween(String value1, String value2) {
            addCriterion("exam_time_limit between", value1, value2, "examTimeLimit");
            return (Criteria) this;
        }

        public Criteria andExamTimeLimitNotBetween(String value1, String value2) {
            addCriterion("exam_time_limit not between", value1, value2, "examTimeLimit");
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

        public Criteria andExamScoreIsNull() {
            addCriterion("exam_score is null");
            return (Criteria) this;
        }

        public Criteria andExamScoreIsNotNull() {
            addCriterion("exam_score is not null");
            return (Criteria) this;
        }

        public Criteria andExamScoreEqualTo(Integer value) {
            addCriterion("exam_score =", value, "examScore");
            return (Criteria) this;
        }

        public Criteria andExamScoreNotEqualTo(Integer value) {
            addCriterion("exam_score <>", value, "examScore");
            return (Criteria) this;
        }

        public Criteria andExamScoreGreaterThan(Integer value) {
            addCriterion("exam_score >", value, "examScore");
            return (Criteria) this;
        }

        public Criteria andExamScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_score >=", value, "examScore");
            return (Criteria) this;
        }

        public Criteria andExamScoreLessThan(Integer value) {
            addCriterion("exam_score <", value, "examScore");
            return (Criteria) this;
        }

        public Criteria andExamScoreLessThanOrEqualTo(Integer value) {
            addCriterion("exam_score <=", value, "examScore");
            return (Criteria) this;
        }

        public Criteria andExamScoreIn(List<Integer> values) {
            addCriterion("exam_score in", values, "examScore");
            return (Criteria) this;
        }

        public Criteria andExamScoreNotIn(List<Integer> values) {
            addCriterion("exam_score not in", values, "examScore");
            return (Criteria) this;
        }

        public Criteria andExamScoreBetween(Integer value1, Integer value2) {
            addCriterion("exam_score between", value1, value2, "examScore");
            return (Criteria) this;
        }

        public Criteria andExamScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_score not between", value1, value2, "examScore");
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

        public Criteria andReferenceNumberIsNull() {
            addCriterion("reference_number is null");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberIsNotNull() {
            addCriterion("reference_number is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberEqualTo(Integer value) {
            addCriterion("reference_number =", value, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberNotEqualTo(Integer value) {
            addCriterion("reference_number <>", value, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberGreaterThan(Integer value) {
            addCriterion("reference_number >", value, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("reference_number >=", value, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberLessThan(Integer value) {
            addCriterion("reference_number <", value, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberLessThanOrEqualTo(Integer value) {
            addCriterion("reference_number <=", value, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberIn(List<Integer> values) {
            addCriterion("reference_number in", values, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberNotIn(List<Integer> values) {
            addCriterion("reference_number not in", values, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberBetween(Integer value1, Integer value2) {
            addCriterion("reference_number between", value1, value2, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("reference_number not between", value1, value2, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberIsNull() {
            addCriterion("good_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodNumberIsNotNull() {
            addCriterion("good_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNumberEqualTo(Integer value) {
            addCriterion("good_number =", value, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberNotEqualTo(Integer value) {
            addCriterion("good_number <>", value, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberGreaterThan(Integer value) {
            addCriterion("good_number >", value, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_number >=", value, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberLessThan(Integer value) {
            addCriterion("good_number <", value, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberLessThanOrEqualTo(Integer value) {
            addCriterion("good_number <=", value, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberIn(List<Integer> values) {
            addCriterion("good_number in", values, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberNotIn(List<Integer> values) {
            addCriterion("good_number not in", values, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberBetween(Integer value1, Integer value2) {
            addCriterion("good_number between", value1, value2, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("good_number not between", value1, value2, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberIsNull() {
            addCriterion("pass_number is null");
            return (Criteria) this;
        }

        public Criteria andPassNumberIsNotNull() {
            addCriterion("pass_number is not null");
            return (Criteria) this;
        }

        public Criteria andPassNumberEqualTo(Integer value) {
            addCriterion("pass_number =", value, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberNotEqualTo(Integer value) {
            addCriterion("pass_number <>", value, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberGreaterThan(Integer value) {
            addCriterion("pass_number >", value, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("pass_number >=", value, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberLessThan(Integer value) {
            addCriterion("pass_number <", value, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberLessThanOrEqualTo(Integer value) {
            addCriterion("pass_number <=", value, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberIn(List<Integer> values) {
            addCriterion("pass_number in", values, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberNotIn(List<Integer> values) {
            addCriterion("pass_number not in", values, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberBetween(Integer value1, Integer value2) {
            addCriterion("pass_number between", value1, value2, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("pass_number not between", value1, value2, "passNumber");
            return (Criteria) this;
        }

        public Criteria andFailingNumberIsNull() {
            addCriterion("failing_number is null");
            return (Criteria) this;
        }

        public Criteria andFailingNumberIsNotNull() {
            addCriterion("failing_number is not null");
            return (Criteria) this;
        }

        public Criteria andFailingNumberEqualTo(Integer value) {
            addCriterion("failing_number =", value, "failingNumber");
            return (Criteria) this;
        }

        public Criteria andFailingNumberNotEqualTo(Integer value) {
            addCriterion("failing_number <>", value, "failingNumber");
            return (Criteria) this;
        }

        public Criteria andFailingNumberGreaterThan(Integer value) {
            addCriterion("failing_number >", value, "failingNumber");
            return (Criteria) this;
        }

        public Criteria andFailingNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("failing_number >=", value, "failingNumber");
            return (Criteria) this;
        }

        public Criteria andFailingNumberLessThan(Integer value) {
            addCriterion("failing_number <", value, "failingNumber");
            return (Criteria) this;
        }

        public Criteria andFailingNumberLessThanOrEqualTo(Integer value) {
            addCriterion("failing_number <=", value, "failingNumber");
            return (Criteria) this;
        }

        public Criteria andFailingNumberIn(List<Integer> values) {
            addCriterion("failing_number in", values, "failingNumber");
            return (Criteria) this;
        }

        public Criteria andFailingNumberNotIn(List<Integer> values) {
            addCriterion("failing_number not in", values, "failingNumber");
            return (Criteria) this;
        }

        public Criteria andFailingNumberBetween(Integer value1, Integer value2) {
            addCriterion("failing_number between", value1, value2, "failingNumber");
            return (Criteria) this;
        }

        public Criteria andFailingNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("failing_number not between", value1, value2, "failingNumber");
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

        public Criteria andExamStartDateIsNull() {
            addCriterion("exam_start_date is null");
            return (Criteria) this;
        }

        public Criteria andExamStartDateIsNotNull() {
            addCriterion("exam_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andExamStartDateEqualTo(String value) {
            addCriterion("exam_start_date =", value, "examStartDate");
            return (Criteria) this;
        }

        public Criteria andExamStartDateNotEqualTo(String value) {
            addCriterion("exam_start_date <>", value, "examStartDate");
            return (Criteria) this;
        }

        public Criteria andExamStartDateGreaterThan(String value) {
            addCriterion("exam_start_date >", value, "examStartDate");
            return (Criteria) this;
        }

        public Criteria andExamStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("exam_start_date >=", value, "examStartDate");
            return (Criteria) this;
        }

        public Criteria andExamStartDateLessThan(String value) {
            addCriterion("exam_start_date <", value, "examStartDate");
            return (Criteria) this;
        }

        public Criteria andExamStartDateLessThanOrEqualTo(String value) {
            addCriterion("exam_start_date <=", value, "examStartDate");
            return (Criteria) this;
        }

        public Criteria andExamStartDateLike(String value) {
            addCriterion("exam_start_date like", value, "examStartDate");
            return (Criteria) this;
        }

        public Criteria andExamStartDateNotLike(String value) {
            addCriterion("exam_start_date not like", value, "examStartDate");
            return (Criteria) this;
        }

        public Criteria andExamStartDateIn(List<String> values) {
            addCriterion("exam_start_date in", values, "examStartDate");
            return (Criteria) this;
        }

        public Criteria andExamStartDateNotIn(List<String> values) {
            addCriterion("exam_start_date not in", values, "examStartDate");
            return (Criteria) this;
        }

        public Criteria andExamStartDateBetween(String value1, String value2) {
            addCriterion("exam_start_date between", value1, value2, "examStartDate");
            return (Criteria) this;
        }

        public Criteria andExamStartDateNotBetween(String value1, String value2) {
            addCriterion("exam_start_date not between", value1, value2, "examStartDate");
            return (Criteria) this;
        }

        public Criteria andExamEndDateIsNull() {
            addCriterion("exam_end_date is null");
            return (Criteria) this;
        }

        public Criteria andExamEndDateIsNotNull() {
            addCriterion("exam_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andExamEndDateEqualTo(String value) {
            addCriterion("exam_end_date =", value, "examEndDate");
            return (Criteria) this;
        }

        public Criteria andExamEndDateNotEqualTo(String value) {
            addCriterion("exam_end_date <>", value, "examEndDate");
            return (Criteria) this;
        }

        public Criteria andExamEndDateGreaterThan(String value) {
            addCriterion("exam_end_date >", value, "examEndDate");
            return (Criteria) this;
        }

        public Criteria andExamEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("exam_end_date >=", value, "examEndDate");
            return (Criteria) this;
        }

        public Criteria andExamEndDateLessThan(String value) {
            addCriterion("exam_end_date <", value, "examEndDate");
            return (Criteria) this;
        }

        public Criteria andExamEndDateLessThanOrEqualTo(String value) {
            addCriterion("exam_end_date <=", value, "examEndDate");
            return (Criteria) this;
        }

        public Criteria andExamEndDateLike(String value) {
            addCriterion("exam_end_date like", value, "examEndDate");
            return (Criteria) this;
        }

        public Criteria andExamEndDateNotLike(String value) {
            addCriterion("exam_end_date not like", value, "examEndDate");
            return (Criteria) this;
        }

        public Criteria andExamEndDateIn(List<String> values) {
            addCriterion("exam_end_date in", values, "examEndDate");
            return (Criteria) this;
        }

        public Criteria andExamEndDateNotIn(List<String> values) {
            addCriterion("exam_end_date not in", values, "examEndDate");
            return (Criteria) this;
        }

        public Criteria andExamEndDateBetween(String value1, String value2) {
            addCriterion("exam_end_date between", value1, value2, "examEndDate");
            return (Criteria) this;
        }

        public Criteria andExamEndDateNotBetween(String value1, String value2) {
            addCriterion("exam_end_date not between", value1, value2, "examEndDate");
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