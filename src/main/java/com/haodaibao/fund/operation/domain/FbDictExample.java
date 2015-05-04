package com.haodaibao.fund.operation.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FbDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FbDictExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDictTypeIsNull() {
            addCriterion("DICT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIsNotNull() {
            addCriterion("DICT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeEqualTo(String value) {
            addCriterion("DICT_TYPE =", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotEqualTo(String value) {
            addCriterion("DICT_TYPE <>", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeGreaterThan(String value) {
            addCriterion("DICT_TYPE >", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_TYPE >=", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLessThan(String value) {
            addCriterion("DICT_TYPE <", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLessThanOrEqualTo(String value) {
            addCriterion("DICT_TYPE <=", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLike(String value) {
            addCriterion("DICT_TYPE like", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotLike(String value) {
            addCriterion("DICT_TYPE not like", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeIn(List<String> values) {
            addCriterion("DICT_TYPE in", values, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotIn(List<String> values) {
            addCriterion("DICT_TYPE not in", values, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeBetween(String value1, String value2) {
            addCriterion("DICT_TYPE between", value1, value2, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotBetween(String value1, String value2) {
            addCriterion("DICT_TYPE not between", value1, value2, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictCodeIsNull() {
            addCriterion("DICT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDictCodeIsNotNull() {
            addCriterion("DICT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDictCodeEqualTo(String value) {
            addCriterion("DICT_CODE =", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotEqualTo(String value) {
            addCriterion("DICT_CODE <>", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeGreaterThan(String value) {
            addCriterion("DICT_CODE >", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_CODE >=", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLessThan(String value) {
            addCriterion("DICT_CODE <", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLessThanOrEqualTo(String value) {
            addCriterion("DICT_CODE <=", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLike(String value) {
            addCriterion("DICT_CODE like", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotLike(String value) {
            addCriterion("DICT_CODE not like", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeIn(List<String> values) {
            addCriterion("DICT_CODE in", values, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotIn(List<String> values) {
            addCriterion("DICT_CODE not in", values, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeBetween(String value1, String value2) {
            addCriterion("DICT_CODE between", value1, value2, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotBetween(String value1, String value2) {
            addCriterion("DICT_CODE not between", value1, value2, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictValue1IsNull() {
            addCriterion("DICT_VALUE1 is null");
            return (Criteria) this;
        }

        public Criteria andDictValue1IsNotNull() {
            addCriterion("DICT_VALUE1 is not null");
            return (Criteria) this;
        }

        public Criteria andDictValue1EqualTo(String value) {
            addCriterion("DICT_VALUE1 =", value, "dictValue1");
            return (Criteria) this;
        }

        public Criteria andDictValue1NotEqualTo(String value) {
            addCriterion("DICT_VALUE1 <>", value, "dictValue1");
            return (Criteria) this;
        }

        public Criteria andDictValue1GreaterThan(String value) {
            addCriterion("DICT_VALUE1 >", value, "dictValue1");
            return (Criteria) this;
        }

        public Criteria andDictValue1GreaterThanOrEqualTo(String value) {
            addCriterion("DICT_VALUE1 >=", value, "dictValue1");
            return (Criteria) this;
        }

        public Criteria andDictValue1LessThan(String value) {
            addCriterion("DICT_VALUE1 <", value, "dictValue1");
            return (Criteria) this;
        }

        public Criteria andDictValue1LessThanOrEqualTo(String value) {
            addCriterion("DICT_VALUE1 <=", value, "dictValue1");
            return (Criteria) this;
        }

        public Criteria andDictValue1Like(String value) {
            addCriterion("DICT_VALUE1 like", value, "dictValue1");
            return (Criteria) this;
        }

        public Criteria andDictValue1NotLike(String value) {
            addCriterion("DICT_VALUE1 not like", value, "dictValue1");
            return (Criteria) this;
        }

        public Criteria andDictValue1In(List<String> values) {
            addCriterion("DICT_VALUE1 in", values, "dictValue1");
            return (Criteria) this;
        }

        public Criteria andDictValue1NotIn(List<String> values) {
            addCriterion("DICT_VALUE1 not in", values, "dictValue1");
            return (Criteria) this;
        }

        public Criteria andDictValue1Between(String value1, String value2) {
            addCriterion("DICT_VALUE1 between", value1, value2, "dictValue1");
            return (Criteria) this;
        }

        public Criteria andDictValue1NotBetween(String value1, String value2) {
            addCriterion("DICT_VALUE1 not between", value1, value2, "dictValue1");
            return (Criteria) this;
        }

        public Criteria andDictValue2IsNull() {
            addCriterion("DICT_VALUE2 is null");
            return (Criteria) this;
        }

        public Criteria andDictValue2IsNotNull() {
            addCriterion("DICT_VALUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andDictValue2EqualTo(String value) {
            addCriterion("DICT_VALUE2 =", value, "dictValue2");
            return (Criteria) this;
        }

        public Criteria andDictValue2NotEqualTo(String value) {
            addCriterion("DICT_VALUE2 <>", value, "dictValue2");
            return (Criteria) this;
        }

        public Criteria andDictValue2GreaterThan(String value) {
            addCriterion("DICT_VALUE2 >", value, "dictValue2");
            return (Criteria) this;
        }

        public Criteria andDictValue2GreaterThanOrEqualTo(String value) {
            addCriterion("DICT_VALUE2 >=", value, "dictValue2");
            return (Criteria) this;
        }

        public Criteria andDictValue2LessThan(String value) {
            addCriterion("DICT_VALUE2 <", value, "dictValue2");
            return (Criteria) this;
        }

        public Criteria andDictValue2LessThanOrEqualTo(String value) {
            addCriterion("DICT_VALUE2 <=", value, "dictValue2");
            return (Criteria) this;
        }

        public Criteria andDictValue2Like(String value) {
            addCriterion("DICT_VALUE2 like", value, "dictValue2");
            return (Criteria) this;
        }

        public Criteria andDictValue2NotLike(String value) {
            addCriterion("DICT_VALUE2 not like", value, "dictValue2");
            return (Criteria) this;
        }

        public Criteria andDictValue2In(List<String> values) {
            addCriterion("DICT_VALUE2 in", values, "dictValue2");
            return (Criteria) this;
        }

        public Criteria andDictValue2NotIn(List<String> values) {
            addCriterion("DICT_VALUE2 not in", values, "dictValue2");
            return (Criteria) this;
        }

        public Criteria andDictValue2Between(String value1, String value2) {
            addCriterion("DICT_VALUE2 between", value1, value2, "dictValue2");
            return (Criteria) this;
        }

        public Criteria andDictValue2NotBetween(String value1, String value2) {
            addCriterion("DICT_VALUE2 not between", value1, value2, "dictValue2");
            return (Criteria) this;
        }

        public Criteria andDictValue3IsNull() {
            addCriterion("DICT_VALUE3 is null");
            return (Criteria) this;
        }

        public Criteria andDictValue3IsNotNull() {
            addCriterion("DICT_VALUE3 is not null");
            return (Criteria) this;
        }

        public Criteria andDictValue3EqualTo(String value) {
            addCriterion("DICT_VALUE3 =", value, "dictValue3");
            return (Criteria) this;
        }

        public Criteria andDictValue3NotEqualTo(String value) {
            addCriterion("DICT_VALUE3 <>", value, "dictValue3");
            return (Criteria) this;
        }

        public Criteria andDictValue3GreaterThan(String value) {
            addCriterion("DICT_VALUE3 >", value, "dictValue3");
            return (Criteria) this;
        }

        public Criteria andDictValue3GreaterThanOrEqualTo(String value) {
            addCriterion("DICT_VALUE3 >=", value, "dictValue3");
            return (Criteria) this;
        }

        public Criteria andDictValue3LessThan(String value) {
            addCriterion("DICT_VALUE3 <", value, "dictValue3");
            return (Criteria) this;
        }

        public Criteria andDictValue3LessThanOrEqualTo(String value) {
            addCriterion("DICT_VALUE3 <=", value, "dictValue3");
            return (Criteria) this;
        }

        public Criteria andDictValue3Like(String value) {
            addCriterion("DICT_VALUE3 like", value, "dictValue3");
            return (Criteria) this;
        }

        public Criteria andDictValue3NotLike(String value) {
            addCriterion("DICT_VALUE3 not like", value, "dictValue3");
            return (Criteria) this;
        }

        public Criteria andDictValue3In(List<String> values) {
            addCriterion("DICT_VALUE3 in", values, "dictValue3");
            return (Criteria) this;
        }

        public Criteria andDictValue3NotIn(List<String> values) {
            addCriterion("DICT_VALUE3 not in", values, "dictValue3");
            return (Criteria) this;
        }

        public Criteria andDictValue3Between(String value1, String value2) {
            addCriterion("DICT_VALUE3 between", value1, value2, "dictValue3");
            return (Criteria) this;
        }

        public Criteria andDictValue3NotBetween(String value1, String value2) {
            addCriterion("DICT_VALUE3 not between", value1, value2, "dictValue3");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("MODIFIED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("MODIFIED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("MODIFIED_TIME =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("MODIFIED_TIME <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("MODIFIED_TIME >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_TIME >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("MODIFIED_TIME <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_TIME <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("MODIFIED_TIME in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("MODIFIED_TIME not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_TIME between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_TIME not between", value1, value2, "modifiedTime");
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