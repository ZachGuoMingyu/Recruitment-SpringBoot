package com.briup.apps.zhaopin.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmploymentJobhunterExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
    public EmploymentJobhunterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAskTimeIsNull() {
            addCriterion("ask_time is null");
            return (Criteria) this;
        }

        public Criteria andAskTimeIsNotNull() {
            addCriterion("ask_time is not null");
            return (Criteria) this;
        }

        public Criteria andAskTimeEqualTo(Date value) {
            addCriterion("ask_time =", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeNotEqualTo(Date value) {
            addCriterion("ask_time <>", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeGreaterThan(Date value) {
            addCriterion("ask_time >", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ask_time >=", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeLessThan(Date value) {
            addCriterion("ask_time <", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeLessThanOrEqualTo(Date value) {
            addCriterion("ask_time <=", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeIn(List<Date> values) {
            addCriterion("ask_time in", values, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeNotIn(List<Date> values) {
            addCriterion("ask_time not in", values, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeBetween(Date value1, Date value2) {
            addCriterion("ask_time between", value1, value2, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeNotBetween(Date value1, Date value2) {
            addCriterion("ask_time not between", value1, value2, "askTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andEmploymentIdIsNull() {
            addCriterion("employment_id is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentIdIsNotNull() {
            addCriterion("employment_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentIdEqualTo(Long value) {
            addCriterion("employment_id =", value, "employmentId");
            return (Criteria) this;
        }

        public Criteria andEmploymentIdNotEqualTo(Long value) {
            addCriterion("employment_id <>", value, "employmentId");
            return (Criteria) this;
        }

        public Criteria andEmploymentIdGreaterThan(Long value) {
            addCriterion("employment_id >", value, "employmentId");
            return (Criteria) this;
        }

        public Criteria andEmploymentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("employment_id >=", value, "employmentId");
            return (Criteria) this;
        }

        public Criteria andEmploymentIdLessThan(Long value) {
            addCriterion("employment_id <", value, "employmentId");
            return (Criteria) this;
        }

        public Criteria andEmploymentIdLessThanOrEqualTo(Long value) {
            addCriterion("employment_id <=", value, "employmentId");
            return (Criteria) this;
        }

        public Criteria andEmploymentIdIn(List<Long> values) {
            addCriterion("employment_id in", values, "employmentId");
            return (Criteria) this;
        }

        public Criteria andEmploymentIdNotIn(List<Long> values) {
            addCriterion("employment_id not in", values, "employmentId");
            return (Criteria) this;
        }

        public Criteria andEmploymentIdBetween(Long value1, Long value2) {
            addCriterion("employment_id between", value1, value2, "employmentId");
            return (Criteria) this;
        }

        public Criteria andEmploymentIdNotBetween(Long value1, Long value2) {
            addCriterion("employment_id not between", value1, value2, "employmentId");
            return (Criteria) this;
        }

        public Criteria andJobhunterIdIsNull() {
            addCriterion("jobhunter_id is null");
            return (Criteria) this;
        }

        public Criteria andJobhunterIdIsNotNull() {
            addCriterion("jobhunter_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobhunterIdEqualTo(Long value) {
            addCriterion("jobhunter_id =", value, "jobhunterId");
            return (Criteria) this;
        }

        public Criteria andJobhunterIdNotEqualTo(Long value) {
            addCriterion("jobhunter_id <>", value, "jobhunterId");
            return (Criteria) this;
        }

        public Criteria andJobhunterIdGreaterThan(Long value) {
            addCriterion("jobhunter_id >", value, "jobhunterId");
            return (Criteria) this;
        }

        public Criteria andJobhunterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("jobhunter_id >=", value, "jobhunterId");
            return (Criteria) this;
        }

        public Criteria andJobhunterIdLessThan(Long value) {
            addCriterion("jobhunter_id <", value, "jobhunterId");
            return (Criteria) this;
        }

        public Criteria andJobhunterIdLessThanOrEqualTo(Long value) {
            addCriterion("jobhunter_id <=", value, "jobhunterId");
            return (Criteria) this;
        }

        public Criteria andJobhunterIdIn(List<Long> values) {
            addCriterion("jobhunter_id in", values, "jobhunterId");
            return (Criteria) this;
        }

        public Criteria andJobhunterIdNotIn(List<Long> values) {
            addCriterion("jobhunter_id not in", values, "jobhunterId");
            return (Criteria) this;
        }

        public Criteria andJobhunterIdBetween(Long value1, Long value2) {
            addCriterion("jobhunter_id between", value1, value2, "jobhunterId");
            return (Criteria) this;
        }

        public Criteria andJobhunterIdNotBetween(Long value1, Long value2) {
            addCriterion("jobhunter_id not between", value1, value2, "jobhunterId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated do_not_delete_during_merge Wed Dec 11 22:10:15 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zp_employment_jobhunter
     *
     * @mbg.generated Wed Dec 11 22:10:15 CST 2019
     */
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