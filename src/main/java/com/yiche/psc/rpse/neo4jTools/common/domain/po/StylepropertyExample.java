package com.yiche.psc.rpse.neo4jTools.common.domain.po;

import java.util.ArrayList;
import java.util.List;

public class StylepropertyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StylepropertyExample() {
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

        public Criteria andStyleidIsNull() {
            addCriterion("styleID is null");
            return (Criteria) this;
        }

        public Criteria andStyleidIsNotNull() {
            addCriterion("styleID is not null");
            return (Criteria) this;
        }

        public Criteria andStyleidEqualTo(Integer value) {
            addCriterion("styleID =", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotEqualTo(Integer value) {
            addCriterion("styleID <>", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThan(Integer value) {
            addCriterion("styleID >", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("styleID >=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThan(Integer value) {
            addCriterion("styleID <", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThanOrEqualTo(Integer value) {
            addCriterion("styleID <=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidIn(List<Integer> values) {
            addCriterion("styleID in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotIn(List<Integer> values) {
            addCriterion("styleID not in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidBetween(Integer value1, Integer value2) {
            addCriterion("styleID between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotBetween(Integer value1, Integer value2) {
            addCriterion("styleID not between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andPropertyidIsNull() {
            addCriterion("propertyID is null");
            return (Criteria) this;
        }

        public Criteria andPropertyidIsNotNull() {
            addCriterion("propertyID is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyidEqualTo(Integer value) {
            addCriterion("propertyID =", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidNotEqualTo(Integer value) {
            addCriterion("propertyID <>", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidGreaterThan(Integer value) {
            addCriterion("propertyID >", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("propertyID >=", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidLessThan(Integer value) {
            addCriterion("propertyID <", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidLessThanOrEqualTo(Integer value) {
            addCriterion("propertyID <=", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidIn(List<Integer> values) {
            addCriterion("propertyID in", values, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidNotIn(List<Integer> values) {
            addCriterion("propertyID not in", values, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidBetween(Integer value1, Integer value2) {
            addCriterion("propertyID between", value1, value2, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidNotBetween(Integer value1, Integer value2) {
            addCriterion("propertyID not between", value1, value2, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertynameIsNull() {
            addCriterion("propertyName is null");
            return (Criteria) this;
        }

        public Criteria andPropertynameIsNotNull() {
            addCriterion("propertyName is not null");
            return (Criteria) this;
        }

        public Criteria andPropertynameEqualTo(String value) {
            addCriterion("propertyName =", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameNotEqualTo(String value) {
            addCriterion("propertyName <>", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameGreaterThan(String value) {
            addCriterion("propertyName >", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameGreaterThanOrEqualTo(String value) {
            addCriterion("propertyName >=", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameLessThan(String value) {
            addCriterion("propertyName <", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameLessThanOrEqualTo(String value) {
            addCriterion("propertyName <=", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameLike(String value) {
            addCriterion("propertyName like", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameNotLike(String value) {
            addCriterion("propertyName not like", value, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameIn(List<String> values) {
            addCriterion("propertyName in", values, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameNotIn(List<String> values) {
            addCriterion("propertyName not in", values, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameBetween(String value1, String value2) {
            addCriterion("propertyName between", value1, value2, "propertyname");
            return (Criteria) this;
        }

        public Criteria andPropertynameNotBetween(String value1, String value2) {
            addCriterion("propertyName not between", value1, value2, "propertyname");
            return (Criteria) this;
        }

        public Criteria andValueidIsNull() {
            addCriterion("valueID is null");
            return (Criteria) this;
        }

        public Criteria andValueidIsNotNull() {
            addCriterion("valueID is not null");
            return (Criteria) this;
        }

        public Criteria andValueidEqualTo(Integer value) {
            addCriterion("valueID =", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidNotEqualTo(Integer value) {
            addCriterion("valueID <>", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidGreaterThan(Integer value) {
            addCriterion("valueID >", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidGreaterThanOrEqualTo(Integer value) {
            addCriterion("valueID >=", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidLessThan(Integer value) {
            addCriterion("valueID <", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidLessThanOrEqualTo(Integer value) {
            addCriterion("valueID <=", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidIn(List<Integer> values) {
            addCriterion("valueID in", values, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidNotIn(List<Integer> values) {
            addCriterion("valueID not in", values, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidBetween(Integer value1, Integer value2) {
            addCriterion("valueID between", value1, value2, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidNotBetween(Integer value1, Integer value2) {
            addCriterion("valueID not between", value1, value2, "valueid");
            return (Criteria) this;
        }

        public Criteria andValuenameIsNull() {
            addCriterion("valueName is null");
            return (Criteria) this;
        }

        public Criteria andValuenameIsNotNull() {
            addCriterion("valueName is not null");
            return (Criteria) this;
        }

        public Criteria andValuenameEqualTo(String value) {
            addCriterion("valueName =", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameNotEqualTo(String value) {
            addCriterion("valueName <>", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameGreaterThan(String value) {
            addCriterion("valueName >", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameGreaterThanOrEqualTo(String value) {
            addCriterion("valueName >=", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameLessThan(String value) {
            addCriterion("valueName <", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameLessThanOrEqualTo(String value) {
            addCriterion("valueName <=", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameLike(String value) {
            addCriterion("valueName like", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameNotLike(String value) {
            addCriterion("valueName not like", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameIn(List<String> values) {
            addCriterion("valueName in", values, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameNotIn(List<String> values) {
            addCriterion("valueName not in", values, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameBetween(String value1, String value2) {
            addCriterion("valueName between", value1, value2, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameNotBetween(String value1, String value2) {
            addCriterion("valueName not between", value1, value2, "valuename");
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