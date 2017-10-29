package com.yiche.psc.rpse.neo4jTools.common.domain.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StyleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StyleExample() {
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

        public Criteria andModelidIsNull() {
            addCriterion("ModelId is null");
            return (Criteria) this;
        }

        public Criteria andModelidIsNotNull() {
            addCriterion("ModelId is not null");
            return (Criteria) this;
        }

        public Criteria andModelidEqualTo(Integer value) {
            addCriterion("ModelId =", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotEqualTo(Integer value) {
            addCriterion("ModelId <>", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThan(Integer value) {
            addCriterion("ModelId >", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ModelId >=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThan(Integer value) {
            addCriterion("ModelId <", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThanOrEqualTo(Integer value) {
            addCriterion("ModelId <=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidIn(List<Integer> values) {
            addCriterion("ModelId in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotIn(List<Integer> values) {
            addCriterion("ModelId not in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidBetween(Integer value1, Integer value2) {
            addCriterion("ModelId between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotBetween(Integer value1, Integer value2) {
            addCriterion("ModelId not between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("Year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("Year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("Year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("Year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("Year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("Year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("Year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("Year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("Year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("Year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("Year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("Year not between", value1, value2, "year");
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

        public Criteria andStylebodytypeIsNull() {
            addCriterion("StyleBodyType is null");
            return (Criteria) this;
        }

        public Criteria andStylebodytypeIsNotNull() {
            addCriterion("StyleBodyType is not null");
            return (Criteria) this;
        }

        public Criteria andStylebodytypeEqualTo(Short value) {
            addCriterion("StyleBodyType =", value, "stylebodytype");
            return (Criteria) this;
        }

        public Criteria andStylebodytypeNotEqualTo(Short value) {
            addCriterion("StyleBodyType <>", value, "stylebodytype");
            return (Criteria) this;
        }

        public Criteria andStylebodytypeGreaterThan(Short value) {
            addCriterion("StyleBodyType >", value, "stylebodytype");
            return (Criteria) this;
        }

        public Criteria andStylebodytypeGreaterThanOrEqualTo(Short value) {
            addCriterion("StyleBodyType >=", value, "stylebodytype");
            return (Criteria) this;
        }

        public Criteria andStylebodytypeLessThan(Short value) {
            addCriterion("StyleBodyType <", value, "stylebodytype");
            return (Criteria) this;
        }

        public Criteria andStylebodytypeLessThanOrEqualTo(Short value) {
            addCriterion("StyleBodyType <=", value, "stylebodytype");
            return (Criteria) this;
        }

        public Criteria andStylebodytypeIn(List<Short> values) {
            addCriterion("StyleBodyType in", values, "stylebodytype");
            return (Criteria) this;
        }

        public Criteria andStylebodytypeNotIn(List<Short> values) {
            addCriterion("StyleBodyType not in", values, "stylebodytype");
            return (Criteria) this;
        }

        public Criteria andStylebodytypeBetween(Short value1, Short value2) {
            addCriterion("StyleBodyType between", value1, value2, "stylebodytype");
            return (Criteria) this;
        }

        public Criteria andStylebodytypeNotBetween(Short value1, Short value2) {
            addCriterion("StyleBodyType not between", value1, value2, "stylebodytype");
            return (Criteria) this;
        }

        public Criteria andProductionstatusIsNull() {
            addCriterion("ProductionStatus is null");
            return (Criteria) this;
        }

        public Criteria andProductionstatusIsNotNull() {
            addCriterion("ProductionStatus is not null");
            return (Criteria) this;
        }

        public Criteria andProductionstatusEqualTo(Short value) {
            addCriterion("ProductionStatus =", value, "productionstatus");
            return (Criteria) this;
        }

        public Criteria andProductionstatusNotEqualTo(Short value) {
            addCriterion("ProductionStatus <>", value, "productionstatus");
            return (Criteria) this;
        }

        public Criteria andProductionstatusGreaterThan(Short value) {
            addCriterion("ProductionStatus >", value, "productionstatus");
            return (Criteria) this;
        }

        public Criteria andProductionstatusGreaterThanOrEqualTo(Short value) {
            addCriterion("ProductionStatus >=", value, "productionstatus");
            return (Criteria) this;
        }

        public Criteria andProductionstatusLessThan(Short value) {
            addCriterion("ProductionStatus <", value, "productionstatus");
            return (Criteria) this;
        }

        public Criteria andProductionstatusLessThanOrEqualTo(Short value) {
            addCriterion("ProductionStatus <=", value, "productionstatus");
            return (Criteria) this;
        }

        public Criteria andProductionstatusIn(List<Short> values) {
            addCriterion("ProductionStatus in", values, "productionstatus");
            return (Criteria) this;
        }

        public Criteria andProductionstatusNotIn(List<Short> values) {
            addCriterion("ProductionStatus not in", values, "productionstatus");
            return (Criteria) this;
        }

        public Criteria andProductionstatusBetween(Short value1, Short value2) {
            addCriterion("ProductionStatus between", value1, value2, "productionstatus");
            return (Criteria) this;
        }

        public Criteria andProductionstatusNotBetween(Short value1, Short value2) {
            addCriterion("ProductionStatus not between", value1, value2, "productionstatus");
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

        public Criteria andSalestatusEqualTo(Short value) {
            addCriterion("SaleStatus =", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotEqualTo(Short value) {
            addCriterion("SaleStatus <>", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusGreaterThan(Short value) {
            addCriterion("SaleStatus >", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusGreaterThanOrEqualTo(Short value) {
            addCriterion("SaleStatus >=", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLessThan(Short value) {
            addCriterion("SaleStatus <", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLessThanOrEqualTo(Short value) {
            addCriterion("SaleStatus <=", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusIn(List<Short> values) {
            addCriterion("SaleStatus in", values, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotIn(List<Short> values) {
            addCriterion("SaleStatus not in", values, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusBetween(Short value1, Short value2) {
            addCriterion("SaleStatus between", value1, value2, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotBetween(Short value1, Short value2) {
            addCriterion("SaleStatus not between", value1, value2, "salestatus");
            return (Criteria) this;
        }

        public Criteria andTimetomarketIsNull() {
            addCriterion("TimeToMarket is null");
            return (Criteria) this;
        }

        public Criteria andTimetomarketIsNotNull() {
            addCriterion("TimeToMarket is not null");
            return (Criteria) this;
        }

        public Criteria andTimetomarketEqualTo(String value) {
            addCriterion("TimeToMarket =", value, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketNotEqualTo(String value) {
            addCriterion("TimeToMarket <>", value, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketGreaterThan(String value) {
            addCriterion("TimeToMarket >", value, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketGreaterThanOrEqualTo(String value) {
            addCriterion("TimeToMarket >=", value, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketLessThan(String value) {
            addCriterion("TimeToMarket <", value, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketLessThanOrEqualTo(String value) {
            addCriterion("TimeToMarket <=", value, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketLike(String value) {
            addCriterion("TimeToMarket like", value, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketNotLike(String value) {
            addCriterion("TimeToMarket not like", value, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketIn(List<String> values) {
            addCriterion("TimeToMarket in", values, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketNotIn(List<String> values) {
            addCriterion("TimeToMarket not in", values, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketBetween(String value1, String value2) {
            addCriterion("TimeToMarket between", value1, value2, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketNotBetween(String value1, String value2) {
            addCriterion("TimeToMarket not between", value1, value2, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andNowmsrpIsNull() {
            addCriterion("NowMsrp is null");
            return (Criteria) this;
        }

        public Criteria andNowmsrpIsNotNull() {
            addCriterion("NowMsrp is not null");
            return (Criteria) this;
        }

        public Criteria andNowmsrpEqualTo(BigDecimal value) {
            addCriterion("NowMsrp =", value, "nowmsrp");
            return (Criteria) this;
        }

        public Criteria andNowmsrpNotEqualTo(BigDecimal value) {
            addCriterion("NowMsrp <>", value, "nowmsrp");
            return (Criteria) this;
        }

        public Criteria andNowmsrpGreaterThan(BigDecimal value) {
            addCriterion("NowMsrp >", value, "nowmsrp");
            return (Criteria) this;
        }

        public Criteria andNowmsrpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NowMsrp >=", value, "nowmsrp");
            return (Criteria) this;
        }

        public Criteria andNowmsrpLessThan(BigDecimal value) {
            addCriterion("NowMsrp <", value, "nowmsrp");
            return (Criteria) this;
        }

        public Criteria andNowmsrpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NowMsrp <=", value, "nowmsrp");
            return (Criteria) this;
        }

        public Criteria andNowmsrpIn(List<BigDecimal> values) {
            addCriterion("NowMsrp in", values, "nowmsrp");
            return (Criteria) this;
        }

        public Criteria andNowmsrpNotIn(List<BigDecimal> values) {
            addCriterion("NowMsrp not in", values, "nowmsrp");
            return (Criteria) this;
        }

        public Criteria andNowmsrpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NowMsrp between", value1, value2, "nowmsrp");
            return (Criteria) this;
        }

        public Criteria andNowmsrpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NowMsrp not between", value1, value2, "nowmsrp");
            return (Criteria) this;
        }

        public Criteria andSpellfirstIsNull() {
            addCriterion("SpellFirst is null");
            return (Criteria) this;
        }

        public Criteria andSpellfirstIsNotNull() {
            addCriterion("SpellFirst is not null");
            return (Criteria) this;
        }

        public Criteria andSpellfirstEqualTo(String value) {
            addCriterion("SpellFirst =", value, "spellfirst");
            return (Criteria) this;
        }

        public Criteria andSpellfirstNotEqualTo(String value) {
            addCriterion("SpellFirst <>", value, "spellfirst");
            return (Criteria) this;
        }

        public Criteria andSpellfirstGreaterThan(String value) {
            addCriterion("SpellFirst >", value, "spellfirst");
            return (Criteria) this;
        }

        public Criteria andSpellfirstGreaterThanOrEqualTo(String value) {
            addCriterion("SpellFirst >=", value, "spellfirst");
            return (Criteria) this;
        }

        public Criteria andSpellfirstLessThan(String value) {
            addCriterion("SpellFirst <", value, "spellfirst");
            return (Criteria) this;
        }

        public Criteria andSpellfirstLessThanOrEqualTo(String value) {
            addCriterion("SpellFirst <=", value, "spellfirst");
            return (Criteria) this;
        }

        public Criteria andSpellfirstLike(String value) {
            addCriterion("SpellFirst like", value, "spellfirst");
            return (Criteria) this;
        }

        public Criteria andSpellfirstNotLike(String value) {
            addCriterion("SpellFirst not like", value, "spellfirst");
            return (Criteria) this;
        }

        public Criteria andSpellfirstIn(List<String> values) {
            addCriterion("SpellFirst in", values, "spellfirst");
            return (Criteria) this;
        }

        public Criteria andSpellfirstNotIn(List<String> values) {
            addCriterion("SpellFirst not in", values, "spellfirst");
            return (Criteria) this;
        }

        public Criteria andSpellfirstBetween(String value1, String value2) {
            addCriterion("SpellFirst between", value1, value2, "spellfirst");
            return (Criteria) this;
        }

        public Criteria andSpellfirstNotBetween(String value1, String value2) {
            addCriterion("SpellFirst not between", value1, value2, "spellfirst");
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

        public Criteria andUpdatetime2IsNull() {
            addCriterion("UpdateTime2 is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetime2IsNotNull() {
            addCriterion("UpdateTime2 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetime2EqualTo(Date value) {
            addCriterion("UpdateTime2 =", value, "updatetime2");
            return (Criteria) this;
        }

        public Criteria andUpdatetime2NotEqualTo(Date value) {
            addCriterion("UpdateTime2 <>", value, "updatetime2");
            return (Criteria) this;
        }

        public Criteria andUpdatetime2GreaterThan(Date value) {
            addCriterion("UpdateTime2 >", value, "updatetime2");
            return (Criteria) this;
        }

        public Criteria andUpdatetime2GreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime2 >=", value, "updatetime2");
            return (Criteria) this;
        }

        public Criteria andUpdatetime2LessThan(Date value) {
            addCriterion("UpdateTime2 <", value, "updatetime2");
            return (Criteria) this;
        }

        public Criteria andUpdatetime2LessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime2 <=", value, "updatetime2");
            return (Criteria) this;
        }

        public Criteria andUpdatetime2In(List<Date> values) {
            addCriterion("UpdateTime2 in", values, "updatetime2");
            return (Criteria) this;
        }

        public Criteria andUpdatetime2NotIn(List<Date> values) {
            addCriterion("UpdateTime2 not in", values, "updatetime2");
            return (Criteria) this;
        }

        public Criteria andUpdatetime2Between(Date value1, Date value2) {
            addCriterion("UpdateTime2 between", value1, value2, "updatetime2");
            return (Criteria) this;
        }

        public Criteria andUpdatetime2NotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime2 not between", value1, value2, "updatetime2");
            return (Criteria) this;
        }

        public Criteria andCreatetime2IsNull() {
            addCriterion("CreateTime2 is null");
            return (Criteria) this;
        }

        public Criteria andCreatetime2IsNotNull() {
            addCriterion("CreateTime2 is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetime2EqualTo(Date value) {
            addCriterion("CreateTime2 =", value, "createtime2");
            return (Criteria) this;
        }

        public Criteria andCreatetime2NotEqualTo(Date value) {
            addCriterion("CreateTime2 <>", value, "createtime2");
            return (Criteria) this;
        }

        public Criteria andCreatetime2GreaterThan(Date value) {
            addCriterion("CreateTime2 >", value, "createtime2");
            return (Criteria) this;
        }

        public Criteria andCreatetime2GreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime2 >=", value, "createtime2");
            return (Criteria) this;
        }

        public Criteria andCreatetime2LessThan(Date value) {
            addCriterion("CreateTime2 <", value, "createtime2");
            return (Criteria) this;
        }

        public Criteria andCreatetime2LessThanOrEqualTo(Date value) {
            addCriterion("CreateTime2 <=", value, "createtime2");
            return (Criteria) this;
        }

        public Criteria andCreatetime2In(List<Date> values) {
            addCriterion("CreateTime2 in", values, "createtime2");
            return (Criteria) this;
        }

        public Criteria andCreatetime2NotIn(List<Date> values) {
            addCriterion("CreateTime2 not in", values, "createtime2");
            return (Criteria) this;
        }

        public Criteria andCreatetime2Between(Date value1, Date value2) {
            addCriterion("CreateTime2 between", value1, value2, "createtime2");
            return (Criteria) this;
        }

        public Criteria andCreatetime2NotBetween(Date value1, Date value2) {
            addCriterion("CreateTime2 not between", value1, value2, "createtime2");
            return (Criteria) this;
        }

        public Criteria andIswagonIsNull() {
            addCriterion("isWagon is null");
            return (Criteria) this;
        }

        public Criteria andIswagonIsNotNull() {
            addCriterion("isWagon is not null");
            return (Criteria) this;
        }

        public Criteria andIswagonEqualTo(Boolean value) {
            addCriterion("isWagon =", value, "iswagon");
            return (Criteria) this;
        }

        public Criteria andIswagonNotEqualTo(Boolean value) {
            addCriterion("isWagon <>", value, "iswagon");
            return (Criteria) this;
        }

        public Criteria andIswagonGreaterThan(Boolean value) {
            addCriterion("isWagon >", value, "iswagon");
            return (Criteria) this;
        }

        public Criteria andIswagonGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isWagon >=", value, "iswagon");
            return (Criteria) this;
        }

        public Criteria andIswagonLessThan(Boolean value) {
            addCriterion("isWagon <", value, "iswagon");
            return (Criteria) this;
        }

        public Criteria andIswagonLessThanOrEqualTo(Boolean value) {
            addCriterion("isWagon <=", value, "iswagon");
            return (Criteria) this;
        }

        public Criteria andIswagonIn(List<Boolean> values) {
            addCriterion("isWagon in", values, "iswagon");
            return (Criteria) this;
        }

        public Criteria andIswagonNotIn(List<Boolean> values) {
            addCriterion("isWagon not in", values, "iswagon");
            return (Criteria) this;
        }

        public Criteria andIswagonBetween(Boolean value1, Boolean value2) {
            addCriterion("isWagon between", value1, value2, "iswagon");
            return (Criteria) this;
        }

        public Criteria andIswagonNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isWagon not between", value1, value2, "iswagon");
            return (Criteria) this;
        }

        public Criteria andBodycolorIsNull() {
            addCriterion("BodyColor is null");
            return (Criteria) this;
        }

        public Criteria andBodycolorIsNotNull() {
            addCriterion("BodyColor is not null");
            return (Criteria) this;
        }

        public Criteria andBodycolorEqualTo(String value) {
            addCriterion("BodyColor =", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorNotEqualTo(String value) {
            addCriterion("BodyColor <>", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorGreaterThan(String value) {
            addCriterion("BodyColor >", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorGreaterThanOrEqualTo(String value) {
            addCriterion("BodyColor >=", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorLessThan(String value) {
            addCriterion("BodyColor <", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorLessThanOrEqualTo(String value) {
            addCriterion("BodyColor <=", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorLike(String value) {
            addCriterion("BodyColor like", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorNotLike(String value) {
            addCriterion("BodyColor not like", value, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorIn(List<String> values) {
            addCriterion("BodyColor in", values, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorNotIn(List<String> values) {
            addCriterion("BodyColor not in", values, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorBetween(String value1, String value2) {
            addCriterion("BodyColor between", value1, value2, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andBodycolorNotBetween(String value1, String value2) {
            addCriterion("BodyColor not between", value1, value2, "bodycolor");
            return (Criteria) this;
        }

        public Criteria andNeishicolorIsNull() {
            addCriterion("NeishiColor is null");
            return (Criteria) this;
        }

        public Criteria andNeishicolorIsNotNull() {
            addCriterion("NeishiColor is not null");
            return (Criteria) this;
        }

        public Criteria andNeishicolorEqualTo(String value) {
            addCriterion("NeishiColor =", value, "neishicolor");
            return (Criteria) this;
        }

        public Criteria andNeishicolorNotEqualTo(String value) {
            addCriterion("NeishiColor <>", value, "neishicolor");
            return (Criteria) this;
        }

        public Criteria andNeishicolorGreaterThan(String value) {
            addCriterion("NeishiColor >", value, "neishicolor");
            return (Criteria) this;
        }

        public Criteria andNeishicolorGreaterThanOrEqualTo(String value) {
            addCriterion("NeishiColor >=", value, "neishicolor");
            return (Criteria) this;
        }

        public Criteria andNeishicolorLessThan(String value) {
            addCriterion("NeishiColor <", value, "neishicolor");
            return (Criteria) this;
        }

        public Criteria andNeishicolorLessThanOrEqualTo(String value) {
            addCriterion("NeishiColor <=", value, "neishicolor");
            return (Criteria) this;
        }

        public Criteria andNeishicolorLike(String value) {
            addCriterion("NeishiColor like", value, "neishicolor");
            return (Criteria) this;
        }

        public Criteria andNeishicolorNotLike(String value) {
            addCriterion("NeishiColor not like", value, "neishicolor");
            return (Criteria) this;
        }

        public Criteria andNeishicolorIn(List<String> values) {
            addCriterion("NeishiColor in", values, "neishicolor");
            return (Criteria) this;
        }

        public Criteria andNeishicolorNotIn(List<String> values) {
            addCriterion("NeishiColor not in", values, "neishicolor");
            return (Criteria) this;
        }

        public Criteria andNeishicolorBetween(String value1, String value2) {
            addCriterion("NeishiColor between", value1, value2, "neishicolor");
            return (Criteria) this;
        }

        public Criteria andNeishicolorNotBetween(String value1, String value2) {
            addCriterion("NeishiColor not between", value1, value2, "neishicolor");
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

        public Criteria andShougaiIsNull() {
            addCriterion("shougai is null");
            return (Criteria) this;
        }

        public Criteria andShougaiIsNotNull() {
            addCriterion("shougai is not null");
            return (Criteria) this;
        }

        public Criteria andShougaiEqualTo(Date value) {
            addCriterion("shougai =", value, "shougai");
            return (Criteria) this;
        }

        public Criteria andShougaiNotEqualTo(Date value) {
            addCriterion("shougai <>", value, "shougai");
            return (Criteria) this;
        }

        public Criteria andShougaiGreaterThan(Date value) {
            addCriterion("shougai >", value, "shougai");
            return (Criteria) this;
        }

        public Criteria andShougaiGreaterThanOrEqualTo(Date value) {
            addCriterion("shougai >=", value, "shougai");
            return (Criteria) this;
        }

        public Criteria andShougaiLessThan(Date value) {
            addCriterion("shougai <", value, "shougai");
            return (Criteria) this;
        }

        public Criteria andShougaiLessThanOrEqualTo(Date value) {
            addCriterion("shougai <=", value, "shougai");
            return (Criteria) this;
        }

        public Criteria andShougaiIn(List<Date> values) {
            addCriterion("shougai in", values, "shougai");
            return (Criteria) this;
        }

        public Criteria andShougaiNotIn(List<Date> values) {
            addCriterion("shougai not in", values, "shougai");
            return (Criteria) this;
        }

        public Criteria andShougaiBetween(Date value1, Date value2) {
            addCriterion("shougai between", value1, value2, "shougai");
            return (Criteria) this;
        }

        public Criteria andShougaiNotBetween(Date value1, Date value2) {
            addCriterion("shougai not between", value1, value2, "shougai");
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