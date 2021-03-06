package com.tnt.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderStatusExample() {
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

        public Criteria andOrderStatusIdIsNull() {
            addCriterion("order_status_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIdIsNotNull() {
            addCriterion("order_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIdEqualTo(Integer value) {
            addCriterion("order_status_id =", value, "orderStatusId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIdNotEqualTo(Integer value) {
            addCriterion("order_status_id <>", value, "orderStatusId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIdGreaterThan(Integer value) {
            addCriterion("order_status_id >", value, "orderStatusId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status_id >=", value, "orderStatusId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIdLessThan(Integer value) {
            addCriterion("order_status_id <", value, "orderStatusId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_status_id <=", value, "orderStatusId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIdIn(List<Integer> values) {
            addCriterion("order_status_id in", values, "orderStatusId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIdNotIn(List<Integer> values) {
            addCriterion("order_status_id not in", values, "orderStatusId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("order_status_id between", value1, value2, "orderStatusId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status_id not between", value1, value2, "orderStatusId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNameIsNull() {
            addCriterion("order_status_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNameIsNotNull() {
            addCriterion("order_status_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNameEqualTo(String value) {
            addCriterion("order_status_name =", value, "orderStatusName");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNameNotEqualTo(String value) {
            addCriterion("order_status_name <>", value, "orderStatusName");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNameGreaterThan(String value) {
            addCriterion("order_status_name >", value, "orderStatusName");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_status_name >=", value, "orderStatusName");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNameLessThan(String value) {
            addCriterion("order_status_name <", value, "orderStatusName");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNameLessThanOrEqualTo(String value) {
            addCriterion("order_status_name <=", value, "orderStatusName");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNameLike(String value) {
            addCriterion("order_status_name like", value, "orderStatusName");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNameNotLike(String value) {
            addCriterion("order_status_name not like", value, "orderStatusName");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNameIn(List<String> values) {
            addCriterion("order_status_name in", values, "orderStatusName");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNameNotIn(List<String> values) {
            addCriterion("order_status_name not in", values, "orderStatusName");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNameBetween(String value1, String value2) {
            addCriterion("order_status_name between", value1, value2, "orderStatusName");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNameNotBetween(String value1, String value2) {
            addCriterion("order_status_name not between", value1, value2, "orderStatusName");
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