package com.summitexam.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class QuestionOptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionOptionExample() {
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

        public Criteria andQuestionOptionIdIsNull() {
            addCriterion("question_option_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdIsNotNull() {
            addCriterion("question_option_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdEqualTo(Integer value) {
            addCriterion("question_option_id =", value, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdNotEqualTo(Integer value) {
            addCriterion("question_option_id <>", value, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdGreaterThan(Integer value) {
            addCriterion("question_option_id >", value, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_option_id >=", value, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdLessThan(Integer value) {
            addCriterion("question_option_id <", value, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_option_id <=", value, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdIn(List<Integer> values) {
            addCriterion("question_option_id in", values, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdNotIn(List<Integer> values) {
            addCriterion("question_option_id not in", values, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdBetween(Integer value1, Integer value2) {
            addCriterion("question_option_id between", value1, value2, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_option_id not between", value1, value2, "questionOptionId");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionContentIsNull() {
            addCriterion("question_option_content is null");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionContentIsNotNull() {
            addCriterion("question_option_content is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionContentEqualTo(String value) {
            addCriterion("question_option_content =", value, "questionOptionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionContentNotEqualTo(String value) {
            addCriterion("question_option_content <>", value, "questionOptionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionContentGreaterThan(String value) {
            addCriterion("question_option_content >", value, "questionOptionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionContentGreaterThanOrEqualTo(String value) {
            addCriterion("question_option_content >=", value, "questionOptionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionContentLessThan(String value) {
            addCriterion("question_option_content <", value, "questionOptionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionContentLessThanOrEqualTo(String value) {
            addCriterion("question_option_content <=", value, "questionOptionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionContentLike(String value) {
            addCriterion("question_option_content like", value, "questionOptionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionContentNotLike(String value) {
            addCriterion("question_option_content not like", value, "questionOptionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionContentIn(List<String> values) {
            addCriterion("question_option_content in", values, "questionOptionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionContentNotIn(List<String> values) {
            addCriterion("question_option_content not in", values, "questionOptionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionContentBetween(String value1, String value2) {
            addCriterion("question_option_content between", value1, value2, "questionOptionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionContentNotBetween(String value1, String value2) {
            addCriterion("question_option_content not between", value1, value2, "questionOptionContent");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionDescriptionIsNull() {
            addCriterion("question_option_description is null");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionDescriptionIsNotNull() {
            addCriterion("question_option_description is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionDescriptionEqualTo(String value) {
            addCriterion("question_option_description =", value, "questionOptionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionDescriptionNotEqualTo(String value) {
            addCriterion("question_option_description <>", value, "questionOptionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionDescriptionGreaterThan(String value) {
            addCriterion("question_option_description >", value, "questionOptionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("question_option_description >=", value, "questionOptionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionDescriptionLessThan(String value) {
            addCriterion("question_option_description <", value, "questionOptionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionDescriptionLessThanOrEqualTo(String value) {
            addCriterion("question_option_description <=", value, "questionOptionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionDescriptionLike(String value) {
            addCriterion("question_option_description like", value, "questionOptionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionDescriptionNotLike(String value) {
            addCriterion("question_option_description not like", value, "questionOptionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionDescriptionIn(List<String> values) {
            addCriterion("question_option_description in", values, "questionOptionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionDescriptionNotIn(List<String> values) {
            addCriterion("question_option_description not in", values, "questionOptionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionDescriptionBetween(String value1, String value2) {
            addCriterion("question_option_description between", value1, value2, "questionOptionDescription");
            return (Criteria) this;
        }

        public Criteria andQuestionOptionDescriptionNotBetween(String value1, String value2) {
            addCriterion("question_option_description not between", value1, value2, "questionOptionDescription");
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