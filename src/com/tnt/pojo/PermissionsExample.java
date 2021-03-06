package com.tnt.pojo;

import java.util.ArrayList;
import java.util.List;

public class PermissionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionsExample() {
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

        public Criteria andPermissionRoleIsNull() {
            addCriterion("permission_role is null");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIsNotNull() {
            addCriterion("permission_role is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleEqualTo(Integer value) {
            addCriterion("permission_role =", value, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleNotEqualTo(Integer value) {
            addCriterion("permission_role <>", value, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleGreaterThan(Integer value) {
            addCriterion("permission_role >", value, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("permission_role >=", value, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleLessThan(Integer value) {
            addCriterion("permission_role <", value, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleLessThanOrEqualTo(Integer value) {
            addCriterion("permission_role <=", value, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleIn(List<Integer> values) {
            addCriterion("permission_role in", values, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleNotIn(List<Integer> values) {
            addCriterion("permission_role not in", values, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleBetween(Integer value1, Integer value2) {
            addCriterion("permission_role between", value1, value2, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("permission_role not between", value1, value2, "permissionRole");
            return (Criteria) this;
        }

        public Criteria andPermissionFunIsNull() {
            addCriterion("permission_fun is null");
            return (Criteria) this;
        }

        public Criteria andPermissionFunIsNotNull() {
            addCriterion("permission_fun is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionFunEqualTo(Integer value) {
            addCriterion("permission_fun =", value, "permissionFun");
            return (Criteria) this;
        }

        public Criteria andPermissionFunNotEqualTo(Integer value) {
            addCriterion("permission_fun <>", value, "permissionFun");
            return (Criteria) this;
        }

        public Criteria andPermissionFunGreaterThan(Integer value) {
            addCriterion("permission_fun >", value, "permissionFun");
            return (Criteria) this;
        }

        public Criteria andPermissionFunGreaterThanOrEqualTo(Integer value) {
            addCriterion("permission_fun >=", value, "permissionFun");
            return (Criteria) this;
        }

        public Criteria andPermissionFunLessThan(Integer value) {
            addCriterion("permission_fun <", value, "permissionFun");
            return (Criteria) this;
        }

        public Criteria andPermissionFunLessThanOrEqualTo(Integer value) {
            addCriterion("permission_fun <=", value, "permissionFun");
            return (Criteria) this;
        }

        public Criteria andPermissionFunIn(List<Integer> values) {
            addCriterion("permission_fun in", values, "permissionFun");
            return (Criteria) this;
        }

        public Criteria andPermissionFunNotIn(List<Integer> values) {
            addCriterion("permission_fun not in", values, "permissionFun");
            return (Criteria) this;
        }

        public Criteria andPermissionFunBetween(Integer value1, Integer value2) {
            addCriterion("permission_fun between", value1, value2, "permissionFun");
            return (Criteria) this;
        }

        public Criteria andPermissionFunNotBetween(Integer value1, Integer value2) {
            addCriterion("permission_fun not between", value1, value2, "permissionFun");
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