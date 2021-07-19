package com.tnt.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsTypeExample() {
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypePidIsNull() {
            addCriterion("type_pid is null");
            return (Criteria) this;
        }

        public Criteria andTypePidIsNotNull() {
            addCriterion("type_pid is not null");
            return (Criteria) this;
        }

        public Criteria andTypePidEqualTo(Integer value) {
            addCriterion("type_pid =", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidNotEqualTo(Integer value) {
            addCriterion("type_pid <>", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidGreaterThan(Integer value) {
            addCriterion("type_pid >", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_pid >=", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidLessThan(Integer value) {
            addCriterion("type_pid <", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidLessThanOrEqualTo(Integer value) {
            addCriterion("type_pid <=", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidIn(List<Integer> values) {
            addCriterion("type_pid in", values, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidNotIn(List<Integer> values) {
            addCriterion("type_pid not in", values, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidBetween(Integer value1, Integer value2) {
            addCriterion("type_pid between", value1, value2, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidNotBetween(Integer value1, Integer value2) {
            addCriterion("type_pid not between", value1, value2, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypeLevelIsNull() {
            addCriterion("type_level is null");
            return (Criteria) this;
        }

        public Criteria andTypeLevelIsNotNull() {
            addCriterion("type_level is not null");
            return (Criteria) this;
        }

        public Criteria andTypeLevelEqualTo(Integer value) {
            addCriterion("type_level =", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelNotEqualTo(Integer value) {
            addCriterion("type_level <>", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelGreaterThan(Integer value) {
            addCriterion("type_level >", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_level >=", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelLessThan(Integer value) {
            addCriterion("type_level <", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelLessThanOrEqualTo(Integer value) {
            addCriterion("type_level <=", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelIn(List<Integer> values) {
            addCriterion("type_level in", values, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelNotIn(List<Integer> values) {
            addCriterion("type_level not in", values, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelBetween(Integer value1, Integer value2) {
            addCriterion("type_level between", value1, value2, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("type_level not between", value1, value2, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypePathIsNull() {
            addCriterion("type_path is null");
            return (Criteria) this;
        }

        public Criteria andTypePathIsNotNull() {
            addCriterion("type_path is not null");
            return (Criteria) this;
        }

        public Criteria andTypePathEqualTo(String value) {
            addCriterion("type_path =", value, "typePath");
            return (Criteria) this;
        }

        public Criteria andTypePathNotEqualTo(String value) {
            addCriterion("type_path <>", value, "typePath");
            return (Criteria) this;
        }

        public Criteria andTypePathGreaterThan(String value) {
            addCriterion("type_path >", value, "typePath");
            return (Criteria) this;
        }

        public Criteria andTypePathGreaterThanOrEqualTo(String value) {
            addCriterion("type_path >=", value, "typePath");
            return (Criteria) this;
        }

        public Criteria andTypePathLessThan(String value) {
            addCriterion("type_path <", value, "typePath");
            return (Criteria) this;
        }

        public Criteria andTypePathLessThanOrEqualTo(String value) {
            addCriterion("type_path <=", value, "typePath");
            return (Criteria) this;
        }

        public Criteria andTypePathLike(String value) {
            addCriterion("type_path like", value, "typePath");
            return (Criteria) this;
        }

        public Criteria andTypePathNotLike(String value) {
            addCriterion("type_path not like", value, "typePath");
            return (Criteria) this;
        }

        public Criteria andTypePathIn(List<String> values) {
            addCriterion("type_path in", values, "typePath");
            return (Criteria) this;
        }

        public Criteria andTypePathNotIn(List<String> values) {
            addCriterion("type_path not in", values, "typePath");
            return (Criteria) this;
        }

        public Criteria andTypePathBetween(String value1, String value2) {
            addCriterion("type_path between", value1, value2, "typePath");
            return (Criteria) this;
        }

        public Criteria andTypePathNotBetween(String value1, String value2) {
            addCriterion("type_path not between", value1, value2, "typePath");
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