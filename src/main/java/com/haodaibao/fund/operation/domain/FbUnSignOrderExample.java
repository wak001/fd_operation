package com.haodaibao.fund.operation.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FbUnSignOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FbUnSignOrderExample() {
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

        public Criteria andUnsignOrderNoIsNull() {
            addCriterion("UNSIGN_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUnsignOrderNoIsNotNull() {
            addCriterion("UNSIGN_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUnsignOrderNoEqualTo(String value) {
            addCriterion("UNSIGN_ORDER_NO =", value, "unsignOrderNo");
            return (Criteria) this;
        }

        public Criteria andUnsignOrderNoNotEqualTo(String value) {
            addCriterion("UNSIGN_ORDER_NO <>", value, "unsignOrderNo");
            return (Criteria) this;
        }

        public Criteria andUnsignOrderNoGreaterThan(String value) {
            addCriterion("UNSIGN_ORDER_NO >", value, "unsignOrderNo");
            return (Criteria) this;
        }

        public Criteria andUnsignOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("UNSIGN_ORDER_NO >=", value, "unsignOrderNo");
            return (Criteria) this;
        }

        public Criteria andUnsignOrderNoLessThan(String value) {
            addCriterion("UNSIGN_ORDER_NO <", value, "unsignOrderNo");
            return (Criteria) this;
        }

        public Criteria andUnsignOrderNoLessThanOrEqualTo(String value) {
            addCriterion("UNSIGN_ORDER_NO <=", value, "unsignOrderNo");
            return (Criteria) this;
        }

        public Criteria andUnsignOrderNoLike(String value) {
            addCriterion("UNSIGN_ORDER_NO like", value, "unsignOrderNo");
            return (Criteria) this;
        }

        public Criteria andUnsignOrderNoNotLike(String value) {
            addCriterion("UNSIGN_ORDER_NO not like", value, "unsignOrderNo");
            return (Criteria) this;
        }

        public Criteria andUnsignOrderNoIn(List<String> values) {
            addCriterion("UNSIGN_ORDER_NO in", values, "unsignOrderNo");
            return (Criteria) this;
        }

        public Criteria andUnsignOrderNoNotIn(List<String> values) {
            addCriterion("UNSIGN_ORDER_NO not in", values, "unsignOrderNo");
            return (Criteria) this;
        }

        public Criteria andUnsignOrderNoBetween(String value1, String value2) {
            addCriterion("UNSIGN_ORDER_NO between", value1, value2, "unsignOrderNo");
            return (Criteria) this;
        }

        public Criteria andUnsignOrderNoNotBetween(String value1, String value2) {
            addCriterion("UNSIGN_ORDER_NO not between", value1, value2, "unsignOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustAccNoIsNull() {
            addCriterion("CUST_ACC_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustAccNoIsNotNull() {
            addCriterion("CUST_ACC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustAccNoEqualTo(String value) {
            addCriterion("CUST_ACC_NO =", value, "custAccNo");
            return (Criteria) this;
        }

        public Criteria andCustAccNoNotEqualTo(String value) {
            addCriterion("CUST_ACC_NO <>", value, "custAccNo");
            return (Criteria) this;
        }

        public Criteria andCustAccNoGreaterThan(String value) {
            addCriterion("CUST_ACC_NO >", value, "custAccNo");
            return (Criteria) this;
        }

        public Criteria andCustAccNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ACC_NO >=", value, "custAccNo");
            return (Criteria) this;
        }

        public Criteria andCustAccNoLessThan(String value) {
            addCriterion("CUST_ACC_NO <", value, "custAccNo");
            return (Criteria) this;
        }

        public Criteria andCustAccNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_ACC_NO <=", value, "custAccNo");
            return (Criteria) this;
        }

        public Criteria andCustAccNoLike(String value) {
            addCriterion("CUST_ACC_NO like", value, "custAccNo");
            return (Criteria) this;
        }

        public Criteria andCustAccNoNotLike(String value) {
            addCriterion("CUST_ACC_NO not like", value, "custAccNo");
            return (Criteria) this;
        }

        public Criteria andCustAccNoIn(List<String> values) {
            addCriterion("CUST_ACC_NO in", values, "custAccNo");
            return (Criteria) this;
        }

        public Criteria andCustAccNoNotIn(List<String> values) {
            addCriterion("CUST_ACC_NO not in", values, "custAccNo");
            return (Criteria) this;
        }

        public Criteria andCustAccNoBetween(String value1, String value2) {
            addCriterion("CUST_ACC_NO between", value1, value2, "custAccNo");
            return (Criteria) this;
        }

        public Criteria andCustAccNoNotBetween(String value1, String value2) {
            addCriterion("CUST_ACC_NO not between", value1, value2, "custAccNo");
            return (Criteria) this;
        }

        public Criteria andCustSignNoIsNull() {
            addCriterion("CUST_SIGN_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustSignNoIsNotNull() {
            addCriterion("CUST_SIGN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustSignNoEqualTo(String value) {
            addCriterion("CUST_SIGN_NO =", value, "custSignNo");
            return (Criteria) this;
        }

        public Criteria andCustSignNoNotEqualTo(String value) {
            addCriterion("CUST_SIGN_NO <>", value, "custSignNo");
            return (Criteria) this;
        }

        public Criteria andCustSignNoGreaterThan(String value) {
            addCriterion("CUST_SIGN_NO >", value, "custSignNo");
            return (Criteria) this;
        }

        public Criteria andCustSignNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_SIGN_NO >=", value, "custSignNo");
            return (Criteria) this;
        }

        public Criteria andCustSignNoLessThan(String value) {
            addCriterion("CUST_SIGN_NO <", value, "custSignNo");
            return (Criteria) this;
        }

        public Criteria andCustSignNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_SIGN_NO <=", value, "custSignNo");
            return (Criteria) this;
        }

        public Criteria andCustSignNoLike(String value) {
            addCriterion("CUST_SIGN_NO like", value, "custSignNo");
            return (Criteria) this;
        }

        public Criteria andCustSignNoNotLike(String value) {
            addCriterion("CUST_SIGN_NO not like", value, "custSignNo");
            return (Criteria) this;
        }

        public Criteria andCustSignNoIn(List<String> values) {
            addCriterion("CUST_SIGN_NO in", values, "custSignNo");
            return (Criteria) this;
        }

        public Criteria andCustSignNoNotIn(List<String> values) {
            addCriterion("CUST_SIGN_NO not in", values, "custSignNo");
            return (Criteria) this;
        }

        public Criteria andCustSignNoBetween(String value1, String value2) {
            addCriterion("CUST_SIGN_NO between", value1, value2, "custSignNo");
            return (Criteria) this;
        }

        public Criteria andCustSignNoNotBetween(String value1, String value2) {
            addCriterion("CUST_SIGN_NO not between", value1, value2, "custSignNo");
            return (Criteria) this;
        }

        public Criteria andUnsignStatusIsNull() {
            addCriterion("UNSIGN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andUnsignStatusIsNotNull() {
            addCriterion("UNSIGN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andUnsignStatusEqualTo(String value) {
            addCriterion("UNSIGN_STATUS =", value, "unsignStatus");
            return (Criteria) this;
        }

        public Criteria andUnsignStatusNotEqualTo(String value) {
            addCriterion("UNSIGN_STATUS <>", value, "unsignStatus");
            return (Criteria) this;
        }

        public Criteria andUnsignStatusGreaterThan(String value) {
            addCriterion("UNSIGN_STATUS >", value, "unsignStatus");
            return (Criteria) this;
        }

        public Criteria andUnsignStatusGreaterThanOrEqualTo(String value) {
            addCriterion("UNSIGN_STATUS >=", value, "unsignStatus");
            return (Criteria) this;
        }

        public Criteria andUnsignStatusLessThan(String value) {
            addCriterion("UNSIGN_STATUS <", value, "unsignStatus");
            return (Criteria) this;
        }

        public Criteria andUnsignStatusLessThanOrEqualTo(String value) {
            addCriterion("UNSIGN_STATUS <=", value, "unsignStatus");
            return (Criteria) this;
        }

        public Criteria andUnsignStatusLike(String value) {
            addCriterion("UNSIGN_STATUS like", value, "unsignStatus");
            return (Criteria) this;
        }

        public Criteria andUnsignStatusNotLike(String value) {
            addCriterion("UNSIGN_STATUS not like", value, "unsignStatus");
            return (Criteria) this;
        }

        public Criteria andUnsignStatusIn(List<String> values) {
            addCriterion("UNSIGN_STATUS in", values, "unsignStatus");
            return (Criteria) this;
        }

        public Criteria andUnsignStatusNotIn(List<String> values) {
            addCriterion("UNSIGN_STATUS not in", values, "unsignStatus");
            return (Criteria) this;
        }

        public Criteria andUnsignStatusBetween(String value1, String value2) {
            addCriterion("UNSIGN_STATUS between", value1, value2, "unsignStatus");
            return (Criteria) this;
        }

        public Criteria andUnsignStatusNotBetween(String value1, String value2) {
            addCriterion("UNSIGN_STATUS not between", value1, value2, "unsignStatus");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("ORDER_TIME =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("ORDER_TIME <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("ORDER_TIME >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("ORDER_TIME <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_TIME <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("ORDER_TIME in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("ORDER_TIME not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_TIME not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNull() {
            addCriterion("ERROR_MSG is null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNotNull() {
            addCriterion("ERROR_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgEqualTo(String value) {
            addCriterion("ERROR_MSG =", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotEqualTo(String value) {
            addCriterion("ERROR_MSG <>", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThan(String value) {
            addCriterion("ERROR_MSG >", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_MSG >=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThan(String value) {
            addCriterion("ERROR_MSG <", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThanOrEqualTo(String value) {
            addCriterion("ERROR_MSG <=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLike(String value) {
            addCriterion("ERROR_MSG like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotLike(String value) {
            addCriterion("ERROR_MSG not like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIn(List<String> values) {
            addCriterion("ERROR_MSG in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotIn(List<String> values) {
            addCriterion("ERROR_MSG not in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgBetween(String value1, String value2) {
            addCriterion("ERROR_MSG between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotBetween(String value1, String value2) {
            addCriterion("ERROR_MSG not between", value1, value2, "errorMsg");
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