package com.yiche.psc.rpse.neo4jTools.common.domain.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MakeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MakeExample() {
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

        public Criteria andMasterbrandidIsNull() {
            addCriterion("MasterBrandId is null");
            return (Criteria) this;
        }

        public Criteria andMasterbrandidIsNotNull() {
            addCriterion("MasterBrandId is not null");
            return (Criteria) this;
        }

        public Criteria andMasterbrandidEqualTo(Integer value) {
            addCriterion("MasterBrandId =", value, "masterbrandid");
            return (Criteria) this;
        }

        public Criteria andMasterbrandidNotEqualTo(Integer value) {
            addCriterion("MasterBrandId <>", value, "masterbrandid");
            return (Criteria) this;
        }

        public Criteria andMasterbrandidGreaterThan(Integer value) {
            addCriterion("MasterBrandId >", value, "masterbrandid");
            return (Criteria) this;
        }

        public Criteria andMasterbrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MasterBrandId >=", value, "masterbrandid");
            return (Criteria) this;
        }

        public Criteria andMasterbrandidLessThan(Integer value) {
            addCriterion("MasterBrandId <", value, "masterbrandid");
            return (Criteria) this;
        }

        public Criteria andMasterbrandidLessThanOrEqualTo(Integer value) {
            addCriterion("MasterBrandId <=", value, "masterbrandid");
            return (Criteria) this;
        }

        public Criteria andMasterbrandidIn(List<Integer> values) {
            addCriterion("MasterBrandId in", values, "masterbrandid");
            return (Criteria) this;
        }

        public Criteria andMasterbrandidNotIn(List<Integer> values) {
            addCriterion("MasterBrandId not in", values, "masterbrandid");
            return (Criteria) this;
        }

        public Criteria andMasterbrandidBetween(Integer value1, Integer value2) {
            addCriterion("MasterBrandId between", value1, value2, "masterbrandid");
            return (Criteria) this;
        }

        public Criteria andMasterbrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("MasterBrandId not between", value1, value2, "masterbrandid");
            return (Criteria) this;
        }

        public Criteria andManufactureridIsNull() {
            addCriterion("ManufacturerId is null");
            return (Criteria) this;
        }

        public Criteria andManufactureridIsNotNull() {
            addCriterion("ManufacturerId is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureridEqualTo(Integer value) {
            addCriterion("ManufacturerId =", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridNotEqualTo(Integer value) {
            addCriterion("ManufacturerId <>", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridGreaterThan(Integer value) {
            addCriterion("ManufacturerId >", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ManufacturerId >=", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridLessThan(Integer value) {
            addCriterion("ManufacturerId <", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridLessThanOrEqualTo(Integer value) {
            addCriterion("ManufacturerId <=", value, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridIn(List<Integer> values) {
            addCriterion("ManufacturerId in", values, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridNotIn(List<Integer> values) {
            addCriterion("ManufacturerId not in", values, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridBetween(Integer value1, Integer value2) {
            addCriterion("ManufacturerId between", value1, value2, "manufacturerid");
            return (Criteria) this;
        }

        public Criteria andManufactureridNotBetween(Integer value1, Integer value2) {
            addCriterion("ManufacturerId not between", value1, value2, "manufacturerid");
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
            addCriterion("WebSite is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("WebSite is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("WebSite =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("WebSite <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("WebSite >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("WebSite >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("WebSite <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("WebSite <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("WebSite like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("WebSite not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("WebSite in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("WebSite not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("WebSite between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("WebSite not between", value1, value2, "website");
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

        public Criteria andSalestatusIsNull() {
            addCriterion("SaleStatus is null");
            return (Criteria) this;
        }

        public Criteria andSalestatusIsNotNull() {
            addCriterion("SaleStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSalestatusEqualTo(Integer value) {
            addCriterion("SaleStatus =", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotEqualTo(Integer value) {
            addCriterion("SaleStatus <>", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusGreaterThan(Integer value) {
            addCriterion("SaleStatus >", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SaleStatus >=", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLessThan(Integer value) {
            addCriterion("SaleStatus <", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLessThanOrEqualTo(Integer value) {
            addCriterion("SaleStatus <=", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusIn(List<Integer> values) {
            addCriterion("SaleStatus in", values, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotIn(List<Integer> values) {
            addCriterion("SaleStatus not in", values, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusBetween(Integer value1, Integer value2) {
            addCriterion("SaleStatus between", value1, value2, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SaleStatus not between", value1, value2, "salestatus");
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

        public Criteria andIsenabledEqualTo(Boolean value) {
            addCriterion("IsEnabled =", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotEqualTo(Boolean value) {
            addCriterion("IsEnabled <>", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThan(Boolean value) {
            addCriterion("IsEnabled >", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsEnabled >=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThan(Boolean value) {
            addCriterion("IsEnabled <", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThanOrEqualTo(Boolean value) {
            addCriterion("IsEnabled <=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledIn(List<Boolean> values) {
            addCriterion("IsEnabled in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotIn(List<Boolean> values) {
            addCriterion("IsEnabled not in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledBetween(Boolean value1, Boolean value2) {
            addCriterion("IsEnabled between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsEnabled not between", value1, value2, "isenabled");
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

        public Criteria andIsremovedEqualTo(Boolean value) {
            addCriterion("IsRemoved =", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedNotEqualTo(Boolean value) {
            addCriterion("IsRemoved <>", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedGreaterThan(Boolean value) {
            addCriterion("IsRemoved >", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsRemoved >=", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedLessThan(Boolean value) {
            addCriterion("IsRemoved <", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsRemoved <=", value, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedIn(List<Boolean> values) {
            addCriterion("IsRemoved in", values, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedNotIn(List<Boolean> values) {
            addCriterion("IsRemoved not in", values, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsRemoved between", value1, value2, "isremoved");
            return (Criteria) this;
        }

        public Criteria andIsremovedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsRemoved not between", value1, value2, "isremoved");
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

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
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

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
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