package com.yiche.psc.rpse.neo4jTools.common.domain.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModelExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("UpdateTime like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("UpdateTime not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CreateTime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CreateTime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNull() {
            addCriterion("IsEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNotNull() {
            addCriterion("IsEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsenabledEqualTo(Integer value) {
            addCriterion("IsEnabled =", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotEqualTo(Integer value) {
            addCriterion("IsEnabled <>", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThan(Integer value) {
            addCriterion("IsEnabled >", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsEnabled >=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThan(Integer value) {
            addCriterion("IsEnabled <", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThanOrEqualTo(Integer value) {
            addCriterion("IsEnabled <=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledIn(List<Integer> values) {
            addCriterion("IsEnabled in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotIn(List<Integer> values) {
            addCriterion("IsEnabled not in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledBetween(Integer value1, Integer value2) {
            addCriterion("IsEnabled between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotBetween(Integer value1, Integer value2) {
            addCriterion("IsEnabled not between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andMakeidIsNull() {
            addCriterion("MakeId is null");
            return (Criteria) this;
        }

        public Criteria andMakeidIsNotNull() {
            addCriterion("MakeId is not null");
            return (Criteria) this;
        }

        public Criteria andMakeidEqualTo(Integer value) {
            addCriterion("MakeId =", value, "makeid");
            return (Criteria) this;
        }

        public Criteria andMakeidNotEqualTo(Integer value) {
            addCriterion("MakeId <>", value, "makeid");
            return (Criteria) this;
        }

        public Criteria andMakeidGreaterThan(Integer value) {
            addCriterion("MakeId >", value, "makeid");
            return (Criteria) this;
        }

        public Criteria andMakeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MakeId >=", value, "makeid");
            return (Criteria) this;
        }

        public Criteria andMakeidLessThan(Integer value) {
            addCriterion("MakeId <", value, "makeid");
            return (Criteria) this;
        }

        public Criteria andMakeidLessThanOrEqualTo(Integer value) {
            addCriterion("MakeId <=", value, "makeid");
            return (Criteria) this;
        }

        public Criteria andMakeidIn(List<Integer> values) {
            addCriterion("MakeId in", values, "makeid");
            return (Criteria) this;
        }

        public Criteria andMakeidNotIn(List<Integer> values) {
            addCriterion("MakeId not in", values, "makeid");
            return (Criteria) this;
        }

        public Criteria andMakeidBetween(Integer value1, Integer value2) {
            addCriterion("MakeId between", value1, value2, "makeid");
            return (Criteria) this;
        }

        public Criteria andMakeidNotBetween(Integer value1, Integer value2) {
            addCriterion("MakeId not between", value1, value2, "makeid");
            return (Criteria) this;
        }

        public Criteria andOthernameIsNull() {
            addCriterion("OtherName is null");
            return (Criteria) this;
        }

        public Criteria andOthernameIsNotNull() {
            addCriterion("OtherName is not null");
            return (Criteria) this;
        }

        public Criteria andOthernameEqualTo(String value) {
            addCriterion("OtherName =", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameNotEqualTo(String value) {
            addCriterion("OtherName <>", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameGreaterThan(String value) {
            addCriterion("OtherName >", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameGreaterThanOrEqualTo(String value) {
            addCriterion("OtherName >=", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameLessThan(String value) {
            addCriterion("OtherName <", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameLessThanOrEqualTo(String value) {
            addCriterion("OtherName <=", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameLike(String value) {
            addCriterion("OtherName like", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameNotLike(String value) {
            addCriterion("OtherName not like", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameIn(List<String> values) {
            addCriterion("OtherName in", values, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameNotIn(List<String> values) {
            addCriterion("OtherName not in", values, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameBetween(String value1, String value2) {
            addCriterion("OtherName between", value1, value2, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameNotBetween(String value1, String value2) {
            addCriterion("OtherName not between", value1, value2, "othername");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIsNull() {
            addCriterion("EnglishName is null");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIsNotNull() {
            addCriterion("EnglishName is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishnameEqualTo(String value) {
            addCriterion("EnglishName =", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotEqualTo(String value) {
            addCriterion("EnglishName <>", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameGreaterThan(String value) {
            addCriterion("EnglishName >", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("EnglishName >=", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLessThan(String value) {
            addCriterion("EnglishName <", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLessThanOrEqualTo(String value) {
            addCriterion("EnglishName <=", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLike(String value) {
            addCriterion("EnglishName like", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotLike(String value) {
            addCriterion("EnglishName not like", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIn(List<String> values) {
            addCriterion("EnglishName in", values, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotIn(List<String> values) {
            addCriterion("EnglishName not in", values, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameBetween(String value1, String value2) {
            addCriterion("EnglishName between", value1, value2, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotBetween(String value1, String value2) {
            addCriterion("EnglishName not between", value1, value2, "englishname");
            return (Criteria) this;
        }

        public Criteria andCountryidIsNull() {
            addCriterion("CountryId is null");
            return (Criteria) this;
        }

        public Criteria andCountryidIsNotNull() {
            addCriterion("CountryId is not null");
            return (Criteria) this;
        }

        public Criteria andCountryidEqualTo(Integer value) {
            addCriterion("CountryId =", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotEqualTo(Integer value) {
            addCriterion("CountryId <>", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidGreaterThan(Integer value) {
            addCriterion("CountryId >", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CountryId >=", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLessThan(Integer value) {
            addCriterion("CountryId <", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLessThanOrEqualTo(Integer value) {
            addCriterion("CountryId <=", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidIn(List<Integer> values) {
            addCriterion("CountryId in", values, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotIn(List<Integer> values) {
            addCriterion("CountryId not in", values, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidBetween(Integer value1, Integer value2) {
            addCriterion("CountryId between", value1, value2, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotBetween(Integer value1, Integer value2) {
            addCriterion("CountryId not between", value1, value2, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryclassIsNull() {
            addCriterion("CountryClass is null");
            return (Criteria) this;
        }

        public Criteria andCountryclassIsNotNull() {
            addCriterion("CountryClass is not null");
            return (Criteria) this;
        }

        public Criteria andCountryclassEqualTo(Integer value) {
            addCriterion("CountryClass =", value, "countryclass");
            return (Criteria) this;
        }

        public Criteria andCountryclassNotEqualTo(Integer value) {
            addCriterion("CountryClass <>", value, "countryclass");
            return (Criteria) this;
        }

        public Criteria andCountryclassGreaterThan(Integer value) {
            addCriterion("CountryClass >", value, "countryclass");
            return (Criteria) this;
        }

        public Criteria andCountryclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("CountryClass >=", value, "countryclass");
            return (Criteria) this;
        }

        public Criteria andCountryclassLessThan(Integer value) {
            addCriterion("CountryClass <", value, "countryclass");
            return (Criteria) this;
        }

        public Criteria andCountryclassLessThanOrEqualTo(Integer value) {
            addCriterion("CountryClass <=", value, "countryclass");
            return (Criteria) this;
        }

        public Criteria andCountryclassIn(List<Integer> values) {
            addCriterion("CountryClass in", values, "countryclass");
            return (Criteria) this;
        }

        public Criteria andCountryclassNotIn(List<Integer> values) {
            addCriterion("CountryClass not in", values, "countryclass");
            return (Criteria) this;
        }

        public Criteria andCountryclassBetween(Integer value1, Integer value2) {
            addCriterion("CountryClass between", value1, value2, "countryclass");
            return (Criteria) this;
        }

        public Criteria andCountryclassNotBetween(Integer value1, Integer value2) {
            addCriterion("CountryClass not between", value1, value2, "countryclass");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("Website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("Website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("Website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("Website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("Website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("Website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("Website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("Website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("Website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("Website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("Website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("Website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("Website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("Website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("Introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("Introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("Introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("Introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("Introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("Introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("Introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("Introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("Introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("Introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("Introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("Introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("Introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("Introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("Logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("Logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("Logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("Logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("Logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("Logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("Logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("Logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("Logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("Logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("Logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("Logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("Logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("Logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andSpellIsNull() {
            addCriterion("Spell is null");
            return (Criteria) this;
        }

        public Criteria andSpellIsNotNull() {
            addCriterion("Spell is not null");
            return (Criteria) this;
        }

        public Criteria andSpellEqualTo(String value) {
            addCriterion("Spell =", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotEqualTo(String value) {
            addCriterion("Spell <>", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellGreaterThan(String value) {
            addCriterion("Spell >", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellGreaterThanOrEqualTo(String value) {
            addCriterion("Spell >=", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLessThan(String value) {
            addCriterion("Spell <", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLessThanOrEqualTo(String value) {
            addCriterion("Spell <=", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLike(String value) {
            addCriterion("Spell like", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotLike(String value) {
            addCriterion("Spell not like", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellIn(List<String> values) {
            addCriterion("Spell in", values, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotIn(List<String> values) {
            addCriterion("Spell not in", values, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellBetween(String value1, String value2) {
            addCriterion("Spell between", value1, value2, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotBetween(String value1, String value2) {
            addCriterion("Spell not between", value1, value2, "spell");
            return (Criteria) this;
        }

        public Criteria andModellevelIsNull() {
            addCriterion("ModelLevel is null");
            return (Criteria) this;
        }

        public Criteria andModellevelIsNotNull() {
            addCriterion("ModelLevel is not null");
            return (Criteria) this;
        }

        public Criteria andModellevelEqualTo(Integer value) {
            addCriterion("ModelLevel =", value, "modellevel");
            return (Criteria) this;
        }

        public Criteria andModellevelNotEqualTo(Integer value) {
            addCriterion("ModelLevel <>", value, "modellevel");
            return (Criteria) this;
        }

        public Criteria andModellevelGreaterThan(Integer value) {
            addCriterion("ModelLevel >", value, "modellevel");
            return (Criteria) this;
        }

        public Criteria andModellevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ModelLevel >=", value, "modellevel");
            return (Criteria) this;
        }

        public Criteria andModellevelLessThan(Integer value) {
            addCriterion("ModelLevel <", value, "modellevel");
            return (Criteria) this;
        }

        public Criteria andModellevelLessThanOrEqualTo(Integer value) {
            addCriterion("ModelLevel <=", value, "modellevel");
            return (Criteria) this;
        }

        public Criteria andModellevelIn(List<Integer> values) {
            addCriterion("ModelLevel in", values, "modellevel");
            return (Criteria) this;
        }

        public Criteria andModellevelNotIn(List<Integer> values) {
            addCriterion("ModelLevel not in", values, "modellevel");
            return (Criteria) this;
        }

        public Criteria andModellevelBetween(Integer value1, Integer value2) {
            addCriterion("ModelLevel between", value1, value2, "modellevel");
            return (Criteria) this;
        }

        public Criteria andModellevelNotBetween(Integer value1, Integer value2) {
            addCriterion("ModelLevel not between", value1, value2, "modellevel");
            return (Criteria) this;
        }

        public Criteria andModellevelsecondIsNull() {
            addCriterion("ModelLevelSecond is null");
            return (Criteria) this;
        }

        public Criteria andModellevelsecondIsNotNull() {
            addCriterion("ModelLevelSecond is not null");
            return (Criteria) this;
        }

        public Criteria andModellevelsecondEqualTo(Integer value) {
            addCriterion("ModelLevelSecond =", value, "modellevelsecond");
            return (Criteria) this;
        }

        public Criteria andModellevelsecondNotEqualTo(Integer value) {
            addCriterion("ModelLevelSecond <>", value, "modellevelsecond");
            return (Criteria) this;
        }

        public Criteria andModellevelsecondGreaterThan(Integer value) {
            addCriterion("ModelLevelSecond >", value, "modellevelsecond");
            return (Criteria) this;
        }

        public Criteria andModellevelsecondGreaterThanOrEqualTo(Integer value) {
            addCriterion("ModelLevelSecond >=", value, "modellevelsecond");
            return (Criteria) this;
        }

        public Criteria andModellevelsecondLessThan(Integer value) {
            addCriterion("ModelLevelSecond <", value, "modellevelsecond");
            return (Criteria) this;
        }

        public Criteria andModellevelsecondLessThanOrEqualTo(Integer value) {
            addCriterion("ModelLevelSecond <=", value, "modellevelsecond");
            return (Criteria) this;
        }

        public Criteria andModellevelsecondIn(List<Integer> values) {
            addCriterion("ModelLevelSecond in", values, "modellevelsecond");
            return (Criteria) this;
        }

        public Criteria andModellevelsecondNotIn(List<Integer> values) {
            addCriterion("ModelLevelSecond not in", values, "modellevelsecond");
            return (Criteria) this;
        }

        public Criteria andModellevelsecondBetween(Integer value1, Integer value2) {
            addCriterion("ModelLevelSecond between", value1, value2, "modellevelsecond");
            return (Criteria) this;
        }

        public Criteria andModellevelsecondNotBetween(Integer value1, Integer value2) {
            addCriterion("ModelLevelSecond not between", value1, value2, "modellevelsecond");
            return (Criteria) this;
        }

        public Criteria andSalestatusIsNull() {
            addCriterion("SaleStatus is null");
            return (Criteria) this;
        }

        public Criteria andSalestatusIsNotNull() {
            addCriterion("SaleStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSalestatusEqualTo(String value) {
            addCriterion("SaleStatus =", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotEqualTo(String value) {
            addCriterion("SaleStatus <>", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusGreaterThan(String value) {
            addCriterion("SaleStatus >", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusGreaterThanOrEqualTo(String value) {
            addCriterion("SaleStatus >=", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLessThan(String value) {
            addCriterion("SaleStatus <", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLessThanOrEqualTo(String value) {
            addCriterion("SaleStatus <=", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLike(String value) {
            addCriterion("SaleStatus like", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotLike(String value) {
            addCriterion("SaleStatus not like", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusIn(List<String> values) {
            addCriterion("SaleStatus in", values, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotIn(List<String> values) {
            addCriterion("SaleStatus not in", values, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusBetween(String value1, String value2) {
            addCriterion("SaleStatus between", value1, value2, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotBetween(String value1, String value2) {
            addCriterion("SaleStatus not between", value1, value2, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestylerowsIsNull() {
            addCriterion("SaleStyleRows is null");
            return (Criteria) this;
        }

        public Criteria andSalestylerowsIsNotNull() {
            addCriterion("SaleStyleRows is not null");
            return (Criteria) this;
        }

        public Criteria andSalestylerowsEqualTo(Integer value) {
            addCriterion("SaleStyleRows =", value, "salestylerows");
            return (Criteria) this;
        }

        public Criteria andSalestylerowsNotEqualTo(Integer value) {
            addCriterion("SaleStyleRows <>", value, "salestylerows");
            return (Criteria) this;
        }

        public Criteria andSalestylerowsGreaterThan(Integer value) {
            addCriterion("SaleStyleRows >", value, "salestylerows");
            return (Criteria) this;
        }

        public Criteria andSalestylerowsGreaterThanOrEqualTo(Integer value) {
            addCriterion("SaleStyleRows >=", value, "salestylerows");
            return (Criteria) this;
        }

        public Criteria andSalestylerowsLessThan(Integer value) {
            addCriterion("SaleStyleRows <", value, "salestylerows");
            return (Criteria) this;
        }

        public Criteria andSalestylerowsLessThanOrEqualTo(Integer value) {
            addCriterion("SaleStyleRows <=", value, "salestylerows");
            return (Criteria) this;
        }

        public Criteria andSalestylerowsIn(List<Integer> values) {
            addCriterion("SaleStyleRows in", values, "salestylerows");
            return (Criteria) this;
        }

        public Criteria andSalestylerowsNotIn(List<Integer> values) {
            addCriterion("SaleStyleRows not in", values, "salestylerows");
            return (Criteria) this;
        }

        public Criteria andSalestylerowsBetween(Integer value1, Integer value2) {
            addCriterion("SaleStyleRows between", value1, value2, "salestylerows");
            return (Criteria) this;
        }

        public Criteria andSalestylerowsNotBetween(Integer value1, Integer value2) {
            addCriterion("SaleStyleRows not between", value1, value2, "salestylerows");
            return (Criteria) this;
        }

        public Criteria andAllspellIsNull() {
            addCriterion("AllSpell is null");
            return (Criteria) this;
        }

        public Criteria andAllspellIsNotNull() {
            addCriterion("AllSpell is not null");
            return (Criteria) this;
        }

        public Criteria andAllspellEqualTo(String value) {
            addCriterion("AllSpell =", value, "allspell");
            return (Criteria) this;
        }

        public Criteria andAllspellNotEqualTo(String value) {
            addCriterion("AllSpell <>", value, "allspell");
            return (Criteria) this;
        }

        public Criteria andAllspellGreaterThan(String value) {
            addCriterion("AllSpell >", value, "allspell");
            return (Criteria) this;
        }

        public Criteria andAllspellGreaterThanOrEqualTo(String value) {
            addCriterion("AllSpell >=", value, "allspell");
            return (Criteria) this;
        }

        public Criteria andAllspellLessThan(String value) {
            addCriterion("AllSpell <", value, "allspell");
            return (Criteria) this;
        }

        public Criteria andAllspellLessThanOrEqualTo(String value) {
            addCriterion("AllSpell <=", value, "allspell");
            return (Criteria) this;
        }

        public Criteria andAllspellLike(String value) {
            addCriterion("AllSpell like", value, "allspell");
            return (Criteria) this;
        }

        public Criteria andAllspellNotLike(String value) {
            addCriterion("AllSpell not like", value, "allspell");
            return (Criteria) this;
        }

        public Criteria andAllspellIn(List<String> values) {
            addCriterion("AllSpell in", values, "allspell");
            return (Criteria) this;
        }

        public Criteria andAllspellNotIn(List<String> values) {
            addCriterion("AllSpell not in", values, "allspell");
            return (Criteria) this;
        }

        public Criteria andAllspellBetween(String value1, String value2) {
            addCriterion("AllSpell between", value1, value2, "allspell");
            return (Criteria) this;
        }

        public Criteria andAllspellNotBetween(String value1, String value2) {
            addCriterion("AllSpell not between", value1, value2, "allspell");
            return (Criteria) this;
        }

        public Criteria andNamespellIsNull() {
            addCriterion("NameSpell is null");
            return (Criteria) this;
        }

        public Criteria andNamespellIsNotNull() {
            addCriterion("NameSpell is not null");
            return (Criteria) this;
        }

        public Criteria andNamespellEqualTo(String value) {
            addCriterion("NameSpell =", value, "namespell");
            return (Criteria) this;
        }

        public Criteria andNamespellNotEqualTo(String value) {
            addCriterion("NameSpell <>", value, "namespell");
            return (Criteria) this;
        }

        public Criteria andNamespellGreaterThan(String value) {
            addCriterion("NameSpell >", value, "namespell");
            return (Criteria) this;
        }

        public Criteria andNamespellGreaterThanOrEqualTo(String value) {
            addCriterion("NameSpell >=", value, "namespell");
            return (Criteria) this;
        }

        public Criteria andNamespellLessThan(String value) {
            addCriterion("NameSpell <", value, "namespell");
            return (Criteria) this;
        }

        public Criteria andNamespellLessThanOrEqualTo(String value) {
            addCriterion("NameSpell <=", value, "namespell");
            return (Criteria) this;
        }

        public Criteria andNamespellLike(String value) {
            addCriterion("NameSpell like", value, "namespell");
            return (Criteria) this;
        }

        public Criteria andNamespellNotLike(String value) {
            addCriterion("NameSpell not like", value, "namespell");
            return (Criteria) this;
        }

        public Criteria andNamespellIn(List<String> values) {
            addCriterion("NameSpell in", values, "namespell");
            return (Criteria) this;
        }

        public Criteria andNamespellNotIn(List<String> values) {
            addCriterion("NameSpell not in", values, "namespell");
            return (Criteria) this;
        }

        public Criteria andNamespellBetween(String value1, String value2) {
            addCriterion("NameSpell between", value1, value2, "namespell");
            return (Criteria) this;
        }

        public Criteria andNamespellNotBetween(String value1, String value2) {
            addCriterion("NameSpell not between", value1, value2, "namespell");
            return (Criteria) this;
        }

        public Criteria andNameallspellIsNull() {
            addCriterion("NameAllSpell is null");
            return (Criteria) this;
        }

        public Criteria andNameallspellIsNotNull() {
            addCriterion("NameAllSpell is not null");
            return (Criteria) this;
        }

        public Criteria andNameallspellEqualTo(String value) {
            addCriterion("NameAllSpell =", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellNotEqualTo(String value) {
            addCriterion("NameAllSpell <>", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellGreaterThan(String value) {
            addCriterion("NameAllSpell >", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellGreaterThanOrEqualTo(String value) {
            addCriterion("NameAllSpell >=", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellLessThan(String value) {
            addCriterion("NameAllSpell <", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellLessThanOrEqualTo(String value) {
            addCriterion("NameAllSpell <=", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellLike(String value) {
            addCriterion("NameAllSpell like", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellNotLike(String value) {
            addCriterion("NameAllSpell not like", value, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellIn(List<String> values) {
            addCriterion("NameAllSpell in", values, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellNotIn(List<String> values) {
            addCriterion("NameAllSpell not in", values, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellBetween(String value1, String value2) {
            addCriterion("NameAllSpell between", value1, value2, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andNameallspellNotBetween(String value1, String value2) {
            addCriterion("NameAllSpell not between", value1, value2, "nameallspell");
            return (Criteria) this;
        }

        public Criteria andModelbodyformIsNull() {
            addCriterion("ModelBodyForm is null");
            return (Criteria) this;
        }

        public Criteria andModelbodyformIsNotNull() {
            addCriterion("ModelBodyForm is not null");
            return (Criteria) this;
        }

        public Criteria andModelbodyformEqualTo(String value) {
            addCriterion("ModelBodyForm =", value, "modelbodyform");
            return (Criteria) this;
        }

        public Criteria andModelbodyformNotEqualTo(String value) {
            addCriterion("ModelBodyForm <>", value, "modelbodyform");
            return (Criteria) this;
        }

        public Criteria andModelbodyformGreaterThan(String value) {
            addCriterion("ModelBodyForm >", value, "modelbodyform");
            return (Criteria) this;
        }

        public Criteria andModelbodyformGreaterThanOrEqualTo(String value) {
            addCriterion("ModelBodyForm >=", value, "modelbodyform");
            return (Criteria) this;
        }

        public Criteria andModelbodyformLessThan(String value) {
            addCriterion("ModelBodyForm <", value, "modelbodyform");
            return (Criteria) this;
        }

        public Criteria andModelbodyformLessThanOrEqualTo(String value) {
            addCriterion("ModelBodyForm <=", value, "modelbodyform");
            return (Criteria) this;
        }

        public Criteria andModelbodyformLike(String value) {
            addCriterion("ModelBodyForm like", value, "modelbodyform");
            return (Criteria) this;
        }

        public Criteria andModelbodyformNotLike(String value) {
            addCriterion("ModelBodyForm not like", value, "modelbodyform");
            return (Criteria) this;
        }

        public Criteria andModelbodyformIn(List<String> values) {
            addCriterion("ModelBodyForm in", values, "modelbodyform");
            return (Criteria) this;
        }

        public Criteria andModelbodyformNotIn(List<String> values) {
            addCriterion("ModelBodyForm not in", values, "modelbodyform");
            return (Criteria) this;
        }

        public Criteria andModelbodyformBetween(String value1, String value2) {
            addCriterion("ModelBodyForm between", value1, value2, "modelbodyform");
            return (Criteria) this;
        }

        public Criteria andModelbodyformNotBetween(String value1, String value2) {
            addCriterion("ModelBodyForm not between", value1, value2, "modelbodyform");
            return (Criteria) this;
        }

        public Criteria andPricelowIsNull() {
            addCriterion("PriceLow is null");
            return (Criteria) this;
        }

        public Criteria andPricelowIsNotNull() {
            addCriterion("PriceLow is not null");
            return (Criteria) this;
        }

        public Criteria andPricelowEqualTo(Double value) {
            addCriterion("PriceLow =", value, "pricelow");
            return (Criteria) this;
        }

        public Criteria andPricelowNotEqualTo(Double value) {
            addCriterion("PriceLow <>", value, "pricelow");
            return (Criteria) this;
        }

        public Criteria andPricelowGreaterThan(Double value) {
            addCriterion("PriceLow >", value, "pricelow");
            return (Criteria) this;
        }

        public Criteria andPricelowGreaterThanOrEqualTo(Double value) {
            addCriterion("PriceLow >=", value, "pricelow");
            return (Criteria) this;
        }

        public Criteria andPricelowLessThan(Double value) {
            addCriterion("PriceLow <", value, "pricelow");
            return (Criteria) this;
        }

        public Criteria andPricelowLessThanOrEqualTo(Double value) {
            addCriterion("PriceLow <=", value, "pricelow");
            return (Criteria) this;
        }

        public Criteria andPricelowIn(List<Double> values) {
            addCriterion("PriceLow in", values, "pricelow");
            return (Criteria) this;
        }

        public Criteria andPricelowNotIn(List<Double> values) {
            addCriterion("PriceLow not in", values, "pricelow");
            return (Criteria) this;
        }

        public Criteria andPricelowBetween(Double value1, Double value2) {
            addCriterion("PriceLow between", value1, value2, "pricelow");
            return (Criteria) this;
        }

        public Criteria andPricelowNotBetween(Double value1, Double value2) {
            addCriterion("PriceLow not between", value1, value2, "pricelow");
            return (Criteria) this;
        }

        public Criteria andPricehighIsNull() {
            addCriterion("PriceHigh is null");
            return (Criteria) this;
        }

        public Criteria andPricehighIsNotNull() {
            addCriterion("PriceHigh is not null");
            return (Criteria) this;
        }

        public Criteria andPricehighEqualTo(Double value) {
            addCriterion("PriceHigh =", value, "pricehigh");
            return (Criteria) this;
        }

        public Criteria andPricehighNotEqualTo(Double value) {
            addCriterion("PriceHigh <>", value, "pricehigh");
            return (Criteria) this;
        }

        public Criteria andPricehighGreaterThan(Double value) {
            addCriterion("PriceHigh >", value, "pricehigh");
            return (Criteria) this;
        }

        public Criteria andPricehighGreaterThanOrEqualTo(Double value) {
            addCriterion("PriceHigh >=", value, "pricehigh");
            return (Criteria) this;
        }

        public Criteria andPricehighLessThan(Double value) {
            addCriterion("PriceHigh <", value, "pricehigh");
            return (Criteria) this;
        }

        public Criteria andPricehighLessThanOrEqualTo(Double value) {
            addCriterion("PriceHigh <=", value, "pricehigh");
            return (Criteria) this;
        }

        public Criteria andPricehighIn(List<Double> values) {
            addCriterion("PriceHigh in", values, "pricehigh");
            return (Criteria) this;
        }

        public Criteria andPricehighNotIn(List<Double> values) {
            addCriterion("PriceHigh not in", values, "pricehigh");
            return (Criteria) this;
        }

        public Criteria andPricehighBetween(Double value1, Double value2) {
            addCriterion("PriceHigh between", value1, value2, "pricehigh");
            return (Criteria) this;
        }

        public Criteria andPricehighNotBetween(Double value1, Double value2) {
            addCriterion("PriceHigh not between", value1, value2, "pricehigh");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNull() {
            addCriterion("DisplayName is null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNotNull() {
            addCriterion("DisplayName is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameEqualTo(String value) {
            addCriterion("DisplayName =", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotEqualTo(String value) {
            addCriterion("DisplayName <>", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThan(String value) {
            addCriterion("DisplayName >", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThanOrEqualTo(String value) {
            addCriterion("DisplayName >=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThan(String value) {
            addCriterion("DisplayName <", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThanOrEqualTo(String value) {
            addCriterion("DisplayName <=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLike(String value) {
            addCriterion("DisplayName like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotLike(String value) {
            addCriterion("DisplayName not like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIn(List<String> values) {
            addCriterion("DisplayName in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotIn(List<String> values) {
            addCriterion("DisplayName not in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameBetween(String value1, String value2) {
            addCriterion("DisplayName between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotBetween(String value1, String value2) {
            addCriterion("DisplayName not between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynamespellIsNull() {
            addCriterion("DisplayNameSpell is null");
            return (Criteria) this;
        }

        public Criteria andDisplaynamespellIsNotNull() {
            addCriterion("DisplayNameSpell is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaynamespellEqualTo(String value) {
            addCriterion("DisplayNameSpell =", value, "displaynamespell");
            return (Criteria) this;
        }

        public Criteria andDisplaynamespellNotEqualTo(String value) {
            addCriterion("DisplayNameSpell <>", value, "displaynamespell");
            return (Criteria) this;
        }

        public Criteria andDisplaynamespellGreaterThan(String value) {
            addCriterion("DisplayNameSpell >", value, "displaynamespell");
            return (Criteria) this;
        }

        public Criteria andDisplaynamespellGreaterThanOrEqualTo(String value) {
            addCriterion("DisplayNameSpell >=", value, "displaynamespell");
            return (Criteria) this;
        }

        public Criteria andDisplaynamespellLessThan(String value) {
            addCriterion("DisplayNameSpell <", value, "displaynamespell");
            return (Criteria) this;
        }

        public Criteria andDisplaynamespellLessThanOrEqualTo(String value) {
            addCriterion("DisplayNameSpell <=", value, "displaynamespell");
            return (Criteria) this;
        }

        public Criteria andDisplaynamespellLike(String value) {
            addCriterion("DisplayNameSpell like", value, "displaynamespell");
            return (Criteria) this;
        }

        public Criteria andDisplaynamespellNotLike(String value) {
            addCriterion("DisplayNameSpell not like", value, "displaynamespell");
            return (Criteria) this;
        }

        public Criteria andDisplaynamespellIn(List<String> values) {
            addCriterion("DisplayNameSpell in", values, "displaynamespell");
            return (Criteria) this;
        }

        public Criteria andDisplaynamespellNotIn(List<String> values) {
            addCriterion("DisplayNameSpell not in", values, "displaynamespell");
            return (Criteria) this;
        }

        public Criteria andDisplaynamespellBetween(String value1, String value2) {
            addCriterion("DisplayNameSpell between", value1, value2, "displaynamespell");
            return (Criteria) this;
        }

        public Criteria andDisplaynamespellNotBetween(String value1, String value2) {
            addCriterion("DisplayNameSpell not between", value1, value2, "displaynamespell");
            return (Criteria) this;
        }

        public Criteria andDisplaynameallspellIsNull() {
            addCriterion("DisplayNameAllSpell is null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameallspellIsNotNull() {
            addCriterion("DisplayNameAllSpell is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameallspellEqualTo(String value) {
            addCriterion("DisplayNameAllSpell =", value, "displaynameallspell");
            return (Criteria) this;
        }

        public Criteria andDisplaynameallspellNotEqualTo(String value) {
            addCriterion("DisplayNameAllSpell <>", value, "displaynameallspell");
            return (Criteria) this;
        }

        public Criteria andDisplaynameallspellGreaterThan(String value) {
            addCriterion("DisplayNameAllSpell >", value, "displaynameallspell");
            return (Criteria) this;
        }

        public Criteria andDisplaynameallspellGreaterThanOrEqualTo(String value) {
            addCriterion("DisplayNameAllSpell >=", value, "displaynameallspell");
            return (Criteria) this;
        }

        public Criteria andDisplaynameallspellLessThan(String value) {
            addCriterion("DisplayNameAllSpell <", value, "displaynameallspell");
            return (Criteria) this;
        }

        public Criteria andDisplaynameallspellLessThanOrEqualTo(String value) {
            addCriterion("DisplayNameAllSpell <=", value, "displaynameallspell");
            return (Criteria) this;
        }

        public Criteria andDisplaynameallspellLike(String value) {
            addCriterion("DisplayNameAllSpell like", value, "displaynameallspell");
            return (Criteria) this;
        }

        public Criteria andDisplaynameallspellNotLike(String value) {
            addCriterion("DisplayNameAllSpell not like", value, "displaynameallspell");
            return (Criteria) this;
        }

        public Criteria andDisplaynameallspellIn(List<String> values) {
            addCriterion("DisplayNameAllSpell in", values, "displaynameallspell");
            return (Criteria) this;
        }

        public Criteria andDisplaynameallspellNotIn(List<String> values) {
            addCriterion("DisplayNameAllSpell not in", values, "displaynameallspell");
            return (Criteria) this;
        }

        public Criteria andDisplaynameallspellBetween(String value1, String value2) {
            addCriterion("DisplayNameAllSpell between", value1, value2, "displaynameallspell");
            return (Criteria) this;
        }

        public Criteria andDisplaynameallspellNotBetween(String value1, String value2) {
            addCriterion("DisplayNameAllSpell not between", value1, value2, "displaynameallspell");
            return (Criteria) this;
        }

        public Criteria andUseIsNull() {
            addCriterion("Use is null");
            return (Criteria) this;
        }

        public Criteria andUseIsNotNull() {
            addCriterion("Use is not null");
            return (Criteria) this;
        }

        public Criteria andUseEqualTo(String value) {
            addCriterion("Use =", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotEqualTo(String value) {
            addCriterion("Use <>", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseGreaterThan(String value) {
            addCriterion("Use >", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseGreaterThanOrEqualTo(String value) {
            addCriterion("Use >=", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLessThan(String value) {
            addCriterion("Use <", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLessThanOrEqualTo(String value) {
            addCriterion("Use <=", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseLike(String value) {
            addCriterion("Use like", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotLike(String value) {
            addCriterion("Use not like", value, "use");
            return (Criteria) this;
        }

        public Criteria andUseIn(List<String> values) {
            addCriterion("Use in", values, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotIn(List<String> values) {
            addCriterion("Use not in", values, "use");
            return (Criteria) this;
        }

        public Criteria andUseBetween(String value1, String value2) {
            addCriterion("Use between", value1, value2, "use");
            return (Criteria) this;
        }

        public Criteria andUseNotBetween(String value1, String value2) {
            addCriterion("Use not between", value1, value2, "use");
            return (Criteria) this;
        }

        public Criteria andAdvantageIsNull() {
            addCriterion("Advantage is null");
            return (Criteria) this;
        }

        public Criteria andAdvantageIsNotNull() {
            addCriterion("Advantage is not null");
            return (Criteria) this;
        }

        public Criteria andAdvantageEqualTo(String value) {
            addCriterion("Advantage =", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotEqualTo(String value) {
            addCriterion("Advantage <>", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageGreaterThan(String value) {
            addCriterion("Advantage >", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageGreaterThanOrEqualTo(String value) {
            addCriterion("Advantage >=", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLessThan(String value) {
            addCriterion("Advantage <", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLessThanOrEqualTo(String value) {
            addCriterion("Advantage <=", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLike(String value) {
            addCriterion("Advantage like", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotLike(String value) {
            addCriterion("Advantage not like", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageIn(List<String> values) {
            addCriterion("Advantage in", values, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotIn(List<String> values) {
            addCriterion("Advantage not in", values, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageBetween(String value1, String value2) {
            addCriterion("Advantage between", value1, value2, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotBetween(String value1, String value2) {
            addCriterion("Advantage not between", value1, value2, "advantage");
            return (Criteria) this;
        }

        public Criteria andDefectIsNull() {
            addCriterion("Defect is null");
            return (Criteria) this;
        }

        public Criteria andDefectIsNotNull() {
            addCriterion("Defect is not null");
            return (Criteria) this;
        }

        public Criteria andDefectEqualTo(String value) {
            addCriterion("Defect =", value, "defect");
            return (Criteria) this;
        }

        public Criteria andDefectNotEqualTo(String value) {
            addCriterion("Defect <>", value, "defect");
            return (Criteria) this;
        }

        public Criteria andDefectGreaterThan(String value) {
            addCriterion("Defect >", value, "defect");
            return (Criteria) this;
        }

        public Criteria andDefectGreaterThanOrEqualTo(String value) {
            addCriterion("Defect >=", value, "defect");
            return (Criteria) this;
        }

        public Criteria andDefectLessThan(String value) {
            addCriterion("Defect <", value, "defect");
            return (Criteria) this;
        }

        public Criteria andDefectLessThanOrEqualTo(String value) {
            addCriterion("Defect <=", value, "defect");
            return (Criteria) this;
        }

        public Criteria andDefectLike(String value) {
            addCriterion("Defect like", value, "defect");
            return (Criteria) this;
        }

        public Criteria andDefectNotLike(String value) {
            addCriterion("Defect not like", value, "defect");
            return (Criteria) this;
        }

        public Criteria andDefectIn(List<String> values) {
            addCriterion("Defect in", values, "defect");
            return (Criteria) this;
        }

        public Criteria andDefectNotIn(List<String> values) {
            addCriterion("Defect not in", values, "defect");
            return (Criteria) this;
        }

        public Criteria andDefectBetween(String value1, String value2) {
            addCriterion("Defect between", value1, value2, "defect");
            return (Criteria) this;
        }

        public Criteria andDefectNotBetween(String value1, String value2) {
            addCriterion("Defect not between", value1, value2, "defect");
            return (Criteria) this;
        }

        public Criteria andWarrantyIsNull() {
            addCriterion("Warranty is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyIsNotNull() {
            addCriterion("Warranty is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyEqualTo(String value) {
            addCriterion("Warranty =", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotEqualTo(String value) {
            addCriterion("Warranty <>", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyGreaterThan(String value) {
            addCriterion("Warranty >", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyGreaterThanOrEqualTo(String value) {
            addCriterion("Warranty >=", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLessThan(String value) {
            addCriterion("Warranty <", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLessThanOrEqualTo(String value) {
            addCriterion("Warranty <=", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLike(String value) {
            addCriterion("Warranty like", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotLike(String value) {
            addCriterion("Warranty not like", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyIn(List<String> values) {
            addCriterion("Warranty in", values, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotIn(List<String> values) {
            addCriterion("Warranty not in", values, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyBetween(String value1, String value2) {
            addCriterion("Warranty between", value1, value2, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotBetween(String value1, String value2) {
            addCriterion("Warranty not between", value1, value2, "warranty");
            return (Criteria) this;
        }

        public Criteria andImportantlevelIsNull() {
            addCriterion("ImportantLevel is null");
            return (Criteria) this;
        }

        public Criteria andImportantlevelIsNotNull() {
            addCriterion("ImportantLevel is not null");
            return (Criteria) this;
        }

        public Criteria andImportantlevelEqualTo(String value) {
            addCriterion("ImportantLevel =", value, "importantlevel");
            return (Criteria) this;
        }

        public Criteria andImportantlevelNotEqualTo(String value) {
            addCriterion("ImportantLevel <>", value, "importantlevel");
            return (Criteria) this;
        }

        public Criteria andImportantlevelGreaterThan(String value) {
            addCriterion("ImportantLevel >", value, "importantlevel");
            return (Criteria) this;
        }

        public Criteria andImportantlevelGreaterThanOrEqualTo(String value) {
            addCriterion("ImportantLevel >=", value, "importantlevel");
            return (Criteria) this;
        }

        public Criteria andImportantlevelLessThan(String value) {
            addCriterion("ImportantLevel <", value, "importantlevel");
            return (Criteria) this;
        }

        public Criteria andImportantlevelLessThanOrEqualTo(String value) {
            addCriterion("ImportantLevel <=", value, "importantlevel");
            return (Criteria) this;
        }

        public Criteria andImportantlevelLike(String value) {
            addCriterion("ImportantLevel like", value, "importantlevel");
            return (Criteria) this;
        }

        public Criteria andImportantlevelNotLike(String value) {
            addCriterion("ImportantLevel not like", value, "importantlevel");
            return (Criteria) this;
        }

        public Criteria andImportantlevelIn(List<String> values) {
            addCriterion("ImportantLevel in", values, "importantlevel");
            return (Criteria) this;
        }

        public Criteria andImportantlevelNotIn(List<String> values) {
            addCriterion("ImportantLevel not in", values, "importantlevel");
            return (Criteria) this;
        }

        public Criteria andImportantlevelBetween(String value1, String value2) {
            addCriterion("ImportantLevel between", value1, value2, "importantlevel");
            return (Criteria) this;
        }

        public Criteria andImportantlevelNotBetween(String value1, String value2) {
            addCriterion("ImportantLevel not between", value1, value2, "importantlevel");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("OrderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("OrderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("OrderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("OrderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("OrderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("OrderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("OrderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("OrderId like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("OrderId not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("OrderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("OrderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("OrderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("OrderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andIsremovedIsNull() {
            addCriterion("IsRemoved is null");
            return (Criteria) this;
        }

        public Criteria andIsremovedIsNotNull() {
            addCriterion("IsRemoved is not null");
            return (Criteria) this;
        }

        public Criteria andIsremovedEqualTo(Integer value) {
            addCriterion("IsRemoved =", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedNotEqualTo(Integer value) {
            addCriterion("IsRemoved <>", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedGreaterThan(Integer value) {
            addCriterion("IsRemoved >", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsRemoved >=", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedLessThan(Integer value) {
            addCriterion("IsRemoved <", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedLessThanOrEqualTo(Integer value) {
            addCriterion("IsRemoved <=", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedIn(List<Integer> values) {
            addCriterion("IsRemoved in", values, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedNotIn(List<Integer> values) {
            addCriterion("IsRemoved not in", values, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedBetween(Integer value1, Integer value2) {
            addCriterion("IsRemoved between", value1, value2, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedNotBetween(Integer value1, Integer value2) {
            addCriterion("IsRemoved not between", value1, value2, "isremoved");
            return (Criteria) this;
        }

        public Criteria andDotimeIsNull() {
            addCriterion("dotime is null");
            return (Criteria) this;
        }

        public Criteria andDotimeIsNotNull() {
            addCriterion("dotime is not null");
            return (Criteria) this;
        }

        public Criteria andDotimeEqualTo(Date value) {
            addCriterion("dotime =", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeNotEqualTo(Date value) {
            addCriterion("dotime <>", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeGreaterThan(Date value) {
            addCriterion("dotime >", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dotime >=", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeLessThan(Date value) {
            addCriterion("dotime <", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeLessThanOrEqualTo(Date value) {
            addCriterion("dotime <=", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeIn(List<Date> values) {
            addCriterion("dotime in", values, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeNotIn(List<Date> values) {
            addCriterion("dotime not in", values, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeBetween(Date value1, Date value2) {
            addCriterion("dotime between", value1, value2, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeNotBetween(Date value1, Date value2) {
            addCriterion("dotime not between", value1, value2, "dotime");
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