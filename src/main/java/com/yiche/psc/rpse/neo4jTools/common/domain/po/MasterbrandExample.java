package com.yiche.psc.rpse.neo4jTools.common.domain.po;

import java.util.ArrayList;
import java.util.List;

public class MasterbrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MasterbrandExample() {
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

        public Criteria andLogourlIsNull() {
            addCriterion("LogoUrl is null");
            return (Criteria) this;
        }

        public Criteria andLogourlIsNotNull() {
            addCriterion("LogoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andLogourlEqualTo(String value) {
            addCriterion("LogoUrl =", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotEqualTo(String value) {
            addCriterion("LogoUrl <>", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlGreaterThan(String value) {
            addCriterion("LogoUrl >", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlGreaterThanOrEqualTo(String value) {
            addCriterion("LogoUrl >=", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLessThan(String value) {
            addCriterion("LogoUrl <", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLessThanOrEqualTo(String value) {
            addCriterion("LogoUrl <=", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlLike(String value) {
            addCriterion("LogoUrl like", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotLike(String value) {
            addCriterion("LogoUrl not like", value, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlIn(List<String> values) {
            addCriterion("LogoUrl in", values, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotIn(List<String> values) {
            addCriterion("LogoUrl not in", values, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlBetween(String value1, String value2) {
            addCriterion("LogoUrl between", value1, value2, "logourl");
            return (Criteria) this;
        }

        public Criteria andLogourlNotBetween(String value1, String value2) {
            addCriterion("LogoUrl not between", value1, value2, "logourl");
            return (Criteria) this;
        }

        public Criteria andFirstzimuIsNull() {
            addCriterion("FirstZiMu is null");
            return (Criteria) this;
        }

        public Criteria andFirstzimuIsNotNull() {
            addCriterion("FirstZiMu is not null");
            return (Criteria) this;
        }

        public Criteria andFirstzimuEqualTo(String value) {
            addCriterion("FirstZiMu =", value, "firstzimu");
            return (Criteria) this;
        }

        public Criteria andFirstzimuNotEqualTo(String value) {
            addCriterion("FirstZiMu <>", value, "firstzimu");
            return (Criteria) this;
        }

        public Criteria andFirstzimuGreaterThan(String value) {
            addCriterion("FirstZiMu >", value, "firstzimu");
            return (Criteria) this;
        }

        public Criteria andFirstzimuGreaterThanOrEqualTo(String value) {
            addCriterion("FirstZiMu >=", value, "firstzimu");
            return (Criteria) this;
        }

        public Criteria andFirstzimuLessThan(String value) {
            addCriterion("FirstZiMu <", value, "firstzimu");
            return (Criteria) this;
        }

        public Criteria andFirstzimuLessThanOrEqualTo(String value) {
            addCriterion("FirstZiMu <=", value, "firstzimu");
            return (Criteria) this;
        }

        public Criteria andFirstzimuLike(String value) {
            addCriterion("FirstZiMu like", value, "firstzimu");
            return (Criteria) this;
        }

        public Criteria andFirstzimuNotLike(String value) {
            addCriterion("FirstZiMu not like", value, "firstzimu");
            return (Criteria) this;
        }

        public Criteria andFirstzimuIn(List<String> values) {
            addCriterion("FirstZiMu in", values, "firstzimu");
            return (Criteria) this;
        }

        public Criteria andFirstzimuNotIn(List<String> values) {
            addCriterion("FirstZiMu not in", values, "firstzimu");
            return (Criteria) this;
        }

        public Criteria andFirstzimuBetween(String value1, String value2) {
            addCriterion("FirstZiMu between", value1, value2, "firstzimu");
            return (Criteria) this;
        }

        public Criteria andFirstzimuNotBetween(String value1, String value2) {
            addCriterion("FirstZiMu not between", value1, value2, "firstzimu");
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

        public Criteria andDotimeIsNull() {
            addCriterion("dotime is null");
            return (Criteria) this;
        }

        public Criteria andDotimeIsNotNull() {
            addCriterion("dotime is not null");
            return (Criteria) this;
        }

        public Criteria andDotimeEqualTo(String value) {
            addCriterion("dotime =", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeNotEqualTo(String value) {
            addCriterion("dotime <>", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeGreaterThan(String value) {
            addCriterion("dotime >", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeGreaterThanOrEqualTo(String value) {
            addCriterion("dotime >=", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeLessThan(String value) {
            addCriterion("dotime <", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeLessThanOrEqualTo(String value) {
            addCriterion("dotime <=", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeLike(String value) {
            addCriterion("dotime like", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeNotLike(String value) {
            addCriterion("dotime not like", value, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeIn(List<String> values) {
            addCriterion("dotime in", values, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeNotIn(List<String> values) {
            addCriterion("dotime not in", values, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeBetween(String value1, String value2) {
            addCriterion("dotime between", value1, value2, "dotime");
            return (Criteria) this;
        }

        public Criteria andDotimeNotBetween(String value1, String value2) {
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