package com.summitexam.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Integer value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Integer value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Integer value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Integer value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Integer> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Integer> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIsNull() {
            addCriterion("question_name is null");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIsNotNull() {
            addCriterion("question_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionNameEqualTo(String value) {
            addCriterion("question_name =", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotEqualTo(String value) {
            addCriterion("question_name <>", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameGreaterThan(String value) {
            addCriterion("question_name >", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameGreaterThanOrEqualTo(String value) {
            addCriterion("question_name >=", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLessThan(String value) {
            addCriterion("question_name <", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLessThanOrEqualTo(String value) {
            addCriterion("question_name <=", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLike(String value) {
            addCriterion("question_name like", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotLike(String value) {
            addCriterion("question_name not like", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIn(List<String> values) {
            addCriterion("question_name in", values, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotIn(List<String> values) {
            addCriterion("question_name not in", values, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameBetween(String value1, String value2) {
            addCriterion("question_name between", value1, value2, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotBetween(String value1, String value2) {
            addCriterion("question_name not between", value1, value2, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreIsNull() {
            addCriterion("question_score is null");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreIsNotNull() {
            addCriterion("question_score is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreEqualTo(String value) {
            addCriterion("question_score =", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreNotEqualTo(String value) {
            addCriterion("question_score <>", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreGreaterThan(String value) {
            addCriterion("question_score >", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreGreaterThanOrEqualTo(String value) {
            addCriterion("question_score >=", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreLessThan(String value) {
            addCriterion("question_score <", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreLessThanOrEqualTo(String value) {
            addCriterion("question_score <=", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreLike(String value) {
            addCriterion("question_score like", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreNotLike(String value) {
            addCriterion("question_score not like", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreIn(List<String> values) {
            addCriterion("question_score in", values, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreNotIn(List<String> values) {
            addCriterion("question_score not in", values, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreBetween(String value1, String value2) {
            addCriterion("question_score between", value1, value2, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreNotBetween(String value1, String value2) {
            addCriterion("question_score not between", value1, value2, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionCreatorIdIsNull() {
            addCriterion("question_creator_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCreatorIdIsNotNull() {
            addCriterion("question_creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCreatorIdEqualTo(Integer value) {
            addCriterion("question_creator_id =", value, "questionCreatorId");
            return (Criteria) this;
        }

        public Criteria andQuestionCreatorIdNotEqualTo(Integer value) {
            addCriterion("question_creator_id <>", value, "questionCreatorId");
            return (Criteria) this;
        }

        public Criteria andQuestionCreatorIdGreaterThan(Integer value) {
            addCriterion("question_creator_id >", value, "questionCreatorId");
            return (Criteria) this;
        }

        public Criteria andQuestionCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_creator_id >=", value, "questionCreatorId");
            return (Criteria) this;
        }

        public Criteria andQuestionCreatorIdLessThan(Integer value) {
            addCriterion("question_creator_id <", value, "questionCreatorId");
            return (Criteria) this;
        }

        public Criteria andQuestionCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_creator_id <=", value, "questionCreatorId");
            return (Criteria) this;
        }

        public Criteria andQuestionCreatorIdIn(List<Integer> values) {
            addCriterion("question_creator_id in", values, "questionCreatorId");
            return (Criteria) this;
        }

        public Criteria andQuestionCreatorIdNotIn(List<Integer> values) {
            addCriterion("question_creator_id not in", values, "questionCreatorId");
            return (Criteria) this;
        }

        public Criteria andQuestionCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("question_creator_id between", value1, value2, "questionCreatorId");
            return (Criteria) this;
        }

        public Criteria andQuestionCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_creator_id not between", value1, value2, "questionCreatorId");
            return (Criteria) this;
        }

        public Criteria andQuestionLevelIdIsNull() {
            addCriterion("question_level_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionLevelIdIsNotNull() {
            addCriterion("question_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionLevelIdEqualTo(String value) {
            addCriterion("question_level_id =", value, "questionLevelId");
            return (Criteria) this;
        }

        public Criteria andQuestionLevelIdNotEqualTo(String value) {
            addCriterion("question_level_id <>", value, "questionLevelId");
            return (Criteria) this;
        }

        public Criteria andQuestionLevelIdGreaterThan(String value) {
            addCriterion("question_level_id >", value, "questionLevelId");
            return (Criteria) this;
        }

        public Criteria andQuestionLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("question_level_id >=", value, "questionLevelId");
            return (Criteria) this;
        }

        public Criteria andQuestionLevelIdLessThan(String value) {
            addCriterion("question_level_id <", value, "questionLevelId");
            return (Criteria) this;
        }

        public Criteria andQuestionLevelIdLessThanOrEqualTo(String value) {
            addCriterion("question_level_id <=", value, "questionLevelId");
            return (Criteria) this;
        }

        public Criteria andQuestionLevelIdLike(String value) {
            addCriterion("question_level_id like", value, "questionLevelId");
            return (Criteria) this;
        }

        public Criteria andQuestionLevelIdNotLike(String value) {
            addCriterion("question_level_id not like", value, "questionLevelId");
            return (Criteria) this;
        }

        public Criteria andQuestionLevelIdIn(List<String> values) {
            addCriterion("question_level_id in", values, "questionLevelId");
            return (Criteria) this;
        }

        public Criteria andQuestionLevelIdNotIn(List<String> values) {
            addCriterion("question_level_id not in", values, "questionLevelId");
            return (Criteria) this;
        }

        public Criteria andQuestionLevelIdBetween(String value1, String value2) {
            addCriterion("question_level_id between", value1, value2, "questionLevelId");
            return (Criteria) this;
        }

        public Criteria andQuestionLevelIdNotBetween(String value1, String value2) {
            addCriterion("question_level_id not between", value1, value2, "questionLevelId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdIsNull() {
            addCriterion("question_type_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdIsNotNull() {
            addCriterion("question_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdEqualTo(String value) {
            addCriterion("question_type_id =", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdNotEqualTo(String value) {
            addCriterion("question_type_id <>", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdGreaterThan(String value) {
            addCriterion("question_type_id >", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("question_type_id >=", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdLessThan(String value) {
            addCriterion("question_type_id <", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdLessThanOrEqualTo(String value) {
            addCriterion("question_type_id <=", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdLike(String value) {
            addCriterion("question_type_id like", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdNotLike(String value) {
            addCriterion("question_type_id not like", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdIn(List<String> values) {
            addCriterion("question_type_id in", values, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdNotIn(List<String> values) {
            addCriterion("question_type_id not in", values, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdBetween(String value1, String value2) {
            addCriterion("question_type_id between", value1, value2, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdNotBetween(String value1, String value2) {
            addCriterion("question_type_id not between", value1, value2, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdIsNull() {
            addCriterion("question_category_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdIsNotNull() {
            addCriterion("question_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdEqualTo(String value) {
            addCriterion("question_category_id =", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdNotEqualTo(String value) {
            addCriterion("question_category_id <>", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdGreaterThan(String value) {
            addCriterion("question_category_id >", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("question_category_id >=", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdLessThan(String value) {
            addCriterion("question_category_id <", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("question_category_id <=", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdLike(String value) {
            addCriterion("question_category_id like", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdNotLike(String value) {
            addCriterion("question_category_id not like", value, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdIn(List<String> values) {
            addCriterion("question_category_id in", values, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdNotIn(List<String> values) {
            addCriterion("question_category_id not in", values, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdBetween(String value1, String value2) {
            addCriterion("question_category_id between", value1, value2, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionCategoryIdNotBetween(String value1, String value2) {
            addCriterion("question_category_id not between", value1, value2, "questionCategoryId");
            return (Criteria) this;
        }

        public Criteria andQuestionDescriptionIsNull() {
            addCriterion("question_description is null");
            return (Criteria) this;
        }

        public Criteria andQuestionDescriptionIsNotNull() {
            addCriterion("question_description is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionDescriptionEqualTo(String value) {
            addCriterion("question_description =", value, "questionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionDescriptionNotEqualTo(String value) {
            addCriterion("question_description <>", value, "questionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionDescriptionGreaterThan(String value) {
            addCriterion("question_description >", value, "questionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("question_description >=", value, "questionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionDescriptionLessThan(String value) {
            addCriterion("question_description <", value, "questionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionDescriptionLessThanOrEqualTo(String value) {
            addCriterion("question_description <=", value, "questionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionDescriptionLike(String value) {
            addCriterion("question_description like", value, "questionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionDescriptionNotLike(String value) {
            addCriterion("question_description not like", value, "questionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionDescriptionIn(List<String> values) {
            addCriterion("question_description in", values, "questionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionDescriptionNotIn(List<String> values) {
            addCriterion("question_description not in", values, "questionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionDescriptionBetween(String value1, String value2) {
            addCriterion("question_description between", value1, value2, "questionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionDescriptionNotBetween(String value1, String value2) {
            addCriterion("question_description not between", value1, value2, "questionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdsIsNull() {
            addCriterion("question_option_ids is null");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdsIsNotNull() {
            addCriterion("question_option_ids is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdsEqualTo(String value) {
            addCriterion("question_option_ids =", value, "questionOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdsNotEqualTo(String value) {
            addCriterion("question_option_ids <>", value, "questionOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdsGreaterThan(String value) {
            addCriterion("question_option_ids >", value, "questionOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdsGreaterThanOrEqualTo(String value) {
            addCriterion("question_option_ids >=", value, "questionOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdsLessThan(String value) {
            addCriterion("question_option_ids <", value, "questionOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdsLessThanOrEqualTo(String value) {
            addCriterion("question_option_ids <=", value, "questionOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdsLike(String value) {
            addCriterion("question_option_ids like", value, "questionOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdsNotLike(String value) {
            addCriterion("question_option_ids not like", value, "questionOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdsIn(List<String> values) {
            addCriterion("question_option_ids in", values, "questionOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdsNotIn(List<String> values) {
            addCriterion("question_option_ids not in", values, "questionOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdsBetween(String value1, String value2) {
            addCriterion("question_option_ids between", value1, value2, "questionOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdsNotBetween(String value1, String value2) {
            addCriterion("question_option_ids not between", value1, value2, "questionOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerOptionIdsIsNull() {
            addCriterion("question_answer_option_ids is null");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerOptionIdsIsNotNull() {
            addCriterion("question_answer_option_ids is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerOptionIdsEqualTo(String value) {
            addCriterion("question_answer_option_ids =", value, "questionAnswerOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerOptionIdsNotEqualTo(String value) {
            addCriterion("question_answer_option_ids <>", value, "questionAnswerOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerOptionIdsGreaterThan(String value) {
            addCriterion("question_answer_option_ids >", value, "questionAnswerOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerOptionIdsGreaterThanOrEqualTo(String value) {
            addCriterion("question_answer_option_ids >=", value, "questionAnswerOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerOptionIdsLessThan(String value) {
            addCriterion("question_answer_option_ids <", value, "questionAnswerOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerOptionIdsLessThanOrEqualTo(String value) {
            addCriterion("question_answer_option_ids <=", value, "questionAnswerOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerOptionIdsLike(String value) {
            addCriterion("question_answer_option_ids like", value, "questionAnswerOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerOptionIdsNotLike(String value) {
            addCriterion("question_answer_option_ids not like", value, "questionAnswerOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerOptionIdsIn(List<String> values) {
            addCriterion("question_answer_option_ids in", values, "questionAnswerOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerOptionIdsNotIn(List<String> values) {
            addCriterion("question_answer_option_ids not in", values, "questionAnswerOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerOptionIdsBetween(String value1, String value2) {
            addCriterion("question_answer_option_ids between", value1, value2, "questionAnswerOptionIds");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerOptionIdsNotBetween(String value1, String value2) {
            addCriterion("question_answer_option_ids not between", value1, value2, "questionAnswerOptionIds");
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

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andIsUsedIsNull() {
            addCriterion("is_used is null");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNotNull() {
            addCriterion("is_used is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsedEqualTo(String value) {
            addCriterion("is_used =", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotEqualTo(String value) {
            addCriterion("is_used <>", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThan(String value) {
            addCriterion("is_used >", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThanOrEqualTo(String value) {
            addCriterion("is_used >=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThan(String value) {
            addCriterion("is_used <", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThanOrEqualTo(String value) {
            addCriterion("is_used <=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLike(String value) {
            addCriterion("is_used like", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotLike(String value) {
            addCriterion("is_used not like", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedIn(List<String> values) {
            addCriterion("is_used in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotIn(List<String> values) {
            addCriterion("is_used not in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedBetween(String value1, String value2) {
            addCriterion("is_used between", value1, value2, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotBetween(String value1, String value2) {
            addCriterion("is_used not between", value1, value2, "isUsed");
            return (Criteria) this;
        }

        public Criteria andQuestionPictureIsNull() {
            addCriterion("question_picture is null");
            return (Criteria) this;
        }

        public Criteria andQuestionPictureIsNotNull() {
            addCriterion("question_picture is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionPictureEqualTo(String value) {
            addCriterion("question_picture =", value, "questionPicture");
            return (Criteria) this;
        }

        public Criteria andQuestionPictureNotEqualTo(String value) {
            addCriterion("question_picture <>", value, "questionPicture");
            return (Criteria) this;
        }

        public Criteria andQuestionPictureGreaterThan(String value) {
            addCriterion("question_picture >", value, "questionPicture");
            return (Criteria) this;
        }

        public Criteria andQuestionPictureGreaterThanOrEqualTo(String value) {
            addCriterion("question_picture >=", value, "questionPicture");
            return (Criteria) this;
        }

        public Criteria andQuestionPictureLessThan(String value) {
            addCriterion("question_picture <", value, "questionPicture");
            return (Criteria) this;
        }

        public Criteria andQuestionPictureLessThanOrEqualTo(String value) {
            addCriterion("question_picture <=", value, "questionPicture");
            return (Criteria) this;
        }

        public Criteria andQuestionPictureLike(String value) {
            addCriterion("question_picture like", value, "questionPicture");
            return (Criteria) this;
        }

        public Criteria andQuestionPictureNotLike(String value) {
            addCriterion("question_picture not like", value, "questionPicture");
            return (Criteria) this;
        }

        public Criteria andQuestionPictureIn(List<String> values) {
            addCriterion("question_picture in", values, "questionPicture");
            return (Criteria) this;
        }

        public Criteria andQuestionPictureNotIn(List<String> values) {
            addCriterion("question_picture not in", values, "questionPicture");
            return (Criteria) this;
        }

        public Criteria andQuestionPictureBetween(String value1, String value2) {
            addCriterion("question_picture between", value1, value2, "questionPicture");
            return (Criteria) this;
        }

        public Criteria andQuestionPictureNotBetween(String value1, String value2) {
            addCriterion("question_picture not between", value1, value2, "questionPicture");
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