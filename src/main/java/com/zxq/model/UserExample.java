package com.zxq.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIDIsNull() {
            addCriterion("FID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("FID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(Integer value) {
            addCriterion("FID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(Integer value) {
            addCriterion("FID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(Integer value) {
            addCriterion("FID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("FID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(Integer value) {
            addCriterion("FID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(Integer value) {
            addCriterion("FID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<Integer> values) {
            addCriterion("FID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<Integer> values) {
            addCriterion("FID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(Integer value1, Integer value2) {
            addCriterion("FID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(Integer value1, Integer value2) {
            addCriterion("FID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("FLoginName is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("FLoginName is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("FLoginName =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("FLoginName <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("FLoginName >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("FLoginName >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("FLoginName <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("FLoginName <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("FLoginName like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("FLoginName not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("FLoginName in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("FLoginName not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("FLoginName between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("FLoginName not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("FPassword is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("FPassword is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("FPassword =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("FPassword <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("FPassword >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("FPassword >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("FPassword <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("FPassword <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("FPassword like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("FPassword not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("FPassword in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("FPassword not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("FPassword between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("FPassword not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("FRealName is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("FRealName is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("FRealName =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("FRealName <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("FRealName >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("FRealName >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("FRealName <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("FRealName <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("FRealName like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("FRealName not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("FRealName in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("FRealName not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("FRealName between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("FRealName not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("FPhone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("FPhone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("FPhone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("FPhone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("FPhone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("FPhone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("FPhone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("FPhone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("FPhone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("FPhone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("FPhone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("FPhone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("FPhone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("FPhone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIsNull() {
            addCriterion("FLicenseNo is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIsNotNull() {
            addCriterion("FLicenseNo is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNoEqualTo(String value) {
            addCriterion("FLicenseNo =", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotEqualTo(String value) {
            addCriterion("FLicenseNo <>", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoGreaterThan(String value) {
            addCriterion("FLicenseNo >", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("FLicenseNo >=", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLessThan(String value) {
            addCriterion("FLicenseNo <", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("FLicenseNo <=", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLike(String value) {
            addCriterion("FLicenseNo like", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotLike(String value) {
            addCriterion("FLicenseNo not like", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIn(List<String> values) {
            addCriterion("FLicenseNo in", values, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotIn(List<String> values) {
            addCriterion("FLicenseNo not in", values, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoBetween(String value1, String value2) {
            addCriterion("FLicenseNo between", value1, value2, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotBetween(String value1, String value2) {
            addCriterion("FLicenseNo not between", value1, value2, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andExtensionNoIsNull() {
            addCriterion("FExtensionNo is null");
            return (Criteria) this;
        }

        public Criteria andExtensionNoIsNotNull() {
            addCriterion("FExtensionNo is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionNoEqualTo(String value) {
            addCriterion("FExtensionNo =", value, "extensionNo");
            return (Criteria) this;
        }

        public Criteria andExtensionNoNotEqualTo(String value) {
            addCriterion("FExtensionNo <>", value, "extensionNo");
            return (Criteria) this;
        }

        public Criteria andExtensionNoGreaterThan(String value) {
            addCriterion("FExtensionNo >", value, "extensionNo");
            return (Criteria) this;
        }

        public Criteria andExtensionNoGreaterThanOrEqualTo(String value) {
            addCriterion("FExtensionNo >=", value, "extensionNo");
            return (Criteria) this;
        }

        public Criteria andExtensionNoLessThan(String value) {
            addCriterion("FExtensionNo <", value, "extensionNo");
            return (Criteria) this;
        }

        public Criteria andExtensionNoLessThanOrEqualTo(String value) {
            addCriterion("FExtensionNo <=", value, "extensionNo");
            return (Criteria) this;
        }

        public Criteria andExtensionNoLike(String value) {
            addCriterion("FExtensionNo like", value, "extensionNo");
            return (Criteria) this;
        }

        public Criteria andExtensionNoNotLike(String value) {
            addCriterion("FExtensionNo not like", value, "extensionNo");
            return (Criteria) this;
        }

        public Criteria andExtensionNoIn(List<String> values) {
            addCriterion("FExtensionNo in", values, "extensionNo");
            return (Criteria) this;
        }

        public Criteria andExtensionNoNotIn(List<String> values) {
            addCriterion("FExtensionNo not in", values, "extensionNo");
            return (Criteria) this;
        }

        public Criteria andExtensionNoBetween(String value1, String value2) {
            addCriterion("FExtensionNo between", value1, value2, "extensionNo");
            return (Criteria) this;
        }

        public Criteria andExtensionNoNotBetween(String value1, String value2) {
            addCriterion("FExtensionNo not between", value1, value2, "extensionNo");
            return (Criteria) this;
        }

        public Criteria andWagesIsNull() {
            addCriterion("FWages is null");
            return (Criteria) this;
        }

        public Criteria andWagesIsNotNull() {
            addCriterion("FWages is not null");
            return (Criteria) this;
        }

        public Criteria andWagesEqualTo(BigDecimal value) {
            addCriterion("FWages =", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesNotEqualTo(BigDecimal value) {
            addCriterion("FWages <>", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesGreaterThan(BigDecimal value) {
            addCriterion("FWages >", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FWages >=", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesLessThan(BigDecimal value) {
            addCriterion("FWages <", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FWages <=", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesIn(List<BigDecimal> values) {
            addCriterion("FWages in", values, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesNotIn(List<BigDecimal> values) {
            addCriterion("FWages not in", values, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FWages between", value1, value2, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FWages not between", value1, value2, "wages");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("FEmail is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("FEmail is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("FEmail =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("FEmail <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("FEmail >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("FEmail >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("FEmail <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("FEmail <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("FEmail like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("FEmail not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("FEmail in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("FEmail not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("FEmail between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("FEmail not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNull() {
            addCriterion("FEntryTime is null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNotNull() {
            addCriterion("FEntryTime is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeEqualTo(Date value) {
            addCriterion("FEntryTime =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotEqualTo(Date value) {
            addCriterion("FEntryTime <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThan(Date value) {
            addCriterion("FEntryTime >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FEntryTime >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThan(Date value) {
            addCriterion("FEntryTime <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThanOrEqualTo(Date value) {
            addCriterion("FEntryTime <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIn(List<Date> values) {
            addCriterion("FEntryTime in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotIn(List<Date> values) {
            addCriterion("FEntryTime not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeBetween(Date value1, Date value2) {
            addCriterion("FEntryTime between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotBetween(Date value1, Date value2) {
            addCriterion("FEntryTime not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNull() {
            addCriterion("FDeptType is null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNotNull() {
            addCriterion("FDeptType is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeEqualTo(Integer value) {
            addCriterion("FDeptType =", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotEqualTo(Integer value) {
            addCriterion("FDeptType <>", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThan(Integer value) {
            addCriterion("FDeptType >", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FDeptType >=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThan(Integer value) {
            addCriterion("FDeptType <", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThanOrEqualTo(Integer value) {
            addCriterion("FDeptType <=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIn(List<Integer> values) {
            addCriterion("FDeptType in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotIn(List<Integer> values) {
            addCriterion("FDeptType not in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeBetween(Integer value1, Integer value2) {
            addCriterion("FDeptType between", value1, value2, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FDeptType not between", value1, value2, "deptType");
            return (Criteria) this;
        }

        public Criteria andLoanEmpIDIsNull() {
            addCriterion("FLoanEmpID is null");
            return (Criteria) this;
        }

        public Criteria andLoanEmpIDIsNotNull() {
            addCriterion("FLoanEmpID is not null");
            return (Criteria) this;
        }

        public Criteria andLoanEmpIDEqualTo(Integer value) {
            addCriterion("FLoanEmpID =", value, "loanEmpID");
            return (Criteria) this;
        }

        public Criteria andLoanEmpIDNotEqualTo(Integer value) {
            addCriterion("FLoanEmpID <>", value, "loanEmpID");
            return (Criteria) this;
        }

        public Criteria andLoanEmpIDGreaterThan(Integer value) {
            addCriterion("FLoanEmpID >", value, "loanEmpID");
            return (Criteria) this;
        }

        public Criteria andLoanEmpIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLoanEmpID >=", value, "loanEmpID");
            return (Criteria) this;
        }

        public Criteria andLoanEmpIDLessThan(Integer value) {
            addCriterion("FLoanEmpID <", value, "loanEmpID");
            return (Criteria) this;
        }

        public Criteria andLoanEmpIDLessThanOrEqualTo(Integer value) {
            addCriterion("FLoanEmpID <=", value, "loanEmpID");
            return (Criteria) this;
        }

        public Criteria andLoanEmpIDIn(List<Integer> values) {
            addCriterion("FLoanEmpID in", values, "loanEmpID");
            return (Criteria) this;
        }

        public Criteria andLoanEmpIDNotIn(List<Integer> values) {
            addCriterion("FLoanEmpID not in", values, "loanEmpID");
            return (Criteria) this;
        }

        public Criteria andLoanEmpIDBetween(Integer value1, Integer value2) {
            addCriterion("FLoanEmpID between", value1, value2, "loanEmpID");
            return (Criteria) this;
        }

        public Criteria andLoanEmpIDNotBetween(Integer value1, Integer value2) {
            addCriterion("FLoanEmpID not between", value1, value2, "loanEmpID");
            return (Criteria) this;
        }

        public Criteria andDeptIDIsNull() {
            addCriterion("FDeptID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIDIsNotNull() {
            addCriterion("FDeptID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIDEqualTo(Integer value) {
            addCriterion("FDeptID =", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDNotEqualTo(Integer value) {
            addCriterion("FDeptID <>", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDGreaterThan(Integer value) {
            addCriterion("FDeptID >", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("FDeptID >=", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDLessThan(Integer value) {
            addCriterion("FDeptID <", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDLessThanOrEqualTo(Integer value) {
            addCriterion("FDeptID <=", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDIn(List<Integer> values) {
            addCriterion("FDeptID in", values, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDNotIn(List<Integer> values) {
            addCriterion("FDeptID not in", values, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDBetween(Integer value1, Integer value2) {
            addCriterion("FDeptID between", value1, value2, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDNotBetween(Integer value1, Integer value2) {
            addCriterion("FDeptID not between", value1, value2, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("FDeptName is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("FDeptName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("FDeptName =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("FDeptName <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("FDeptName >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("FDeptName >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("FDeptName <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("FDeptName <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("FDeptName like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("FDeptName not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("FDeptName in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("FDeptName not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("FDeptName between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("FDeptName not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andParentIDIsNull() {
            addCriterion("FParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentIDIsNotNull() {
            addCriterion("FParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIDEqualTo(Integer value) {
            addCriterion("FParentID =", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotEqualTo(Integer value) {
            addCriterion("FParentID <>", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDGreaterThan(Integer value) {
            addCriterion("FParentID >", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("FParentID >=", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDLessThan(Integer value) {
            addCriterion("FParentID <", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDLessThanOrEqualTo(Integer value) {
            addCriterion("FParentID <=", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDIn(List<Integer> values) {
            addCriterion("FParentID in", values, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotIn(List<Integer> values) {
            addCriterion("FParentID not in", values, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDBetween(Integer value1, Integer value2) {
            addCriterion("FParentID between", value1, value2, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotBetween(Integer value1, Integer value2) {
            addCriterion("FParentID not between", value1, value2, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentNameIsNull() {
            addCriterion("FParentName is null");
            return (Criteria) this;
        }

        public Criteria andParentNameIsNotNull() {
            addCriterion("FParentName is not null");
            return (Criteria) this;
        }

        public Criteria andParentNameEqualTo(String value) {
            addCriterion("FParentName =", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotEqualTo(String value) {
            addCriterion("FParentName <>", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameGreaterThan(String value) {
            addCriterion("FParentName >", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("FParentName >=", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLessThan(String value) {
            addCriterion("FParentName <", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLessThanOrEqualTo(String value) {
            addCriterion("FParentName <=", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameLike(String value) {
            addCriterion("FParentName like", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotLike(String value) {
            addCriterion("FParentName not like", value, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameIn(List<String> values) {
            addCriterion("FParentName in", values, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotIn(List<String> values) {
            addCriterion("FParentName not in", values, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameBetween(String value1, String value2) {
            addCriterion("FParentName between", value1, value2, "parentName");
            return (Criteria) this;
        }

        public Criteria andParentNameNotBetween(String value1, String value2) {
            addCriterion("FParentName not between", value1, value2, "parentName");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("FProvinceCode is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("FProvinceCode is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(Integer value) {
            addCriterion("FProvinceCode =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(Integer value) {
            addCriterion("FProvinceCode <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(Integer value) {
            addCriterion("FProvinceCode >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FProvinceCode >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(Integer value) {
            addCriterion("FProvinceCode <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(Integer value) {
            addCriterion("FProvinceCode <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<Integer> values) {
            addCriterion("FProvinceCode in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<Integer> values) {
            addCriterion("FProvinceCode not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(Integer value1, Integer value2) {
            addCriterion("FProvinceCode between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("FProvinceCode not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("FProvinceName is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("FProvinceName is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("FProvinceName =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("FProvinceName <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("FProvinceName >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("FProvinceName >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("FProvinceName <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("FProvinceName <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("FProvinceName like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("FProvinceName not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("FProvinceName in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("FProvinceName not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("FProvinceName between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("FProvinceName not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("FCityCode is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("FCityCode is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(Integer value) {
            addCriterion("FCityCode =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(Integer value) {
            addCriterion("FCityCode <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(Integer value) {
            addCriterion("FCityCode >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FCityCode >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(Integer value) {
            addCriterion("FCityCode <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(Integer value) {
            addCriterion("FCityCode <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<Integer> values) {
            addCriterion("FCityCode in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<Integer> values) {
            addCriterion("FCityCode not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(Integer value1, Integer value2) {
            addCriterion("FCityCode between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("FCityCode not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("FCityName is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("FCityName is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("FCityName =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("FCityName <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("FCityName >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("FCityName >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("FCityName <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("FCityName <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("FCityName like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("FCityName not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("FCityName in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("FCityName not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("FCityName between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("FCityName not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("FRemark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("FRemark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("FRemark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("FRemark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("FRemark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("FRemark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("FRemark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("FRemark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("FRemark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("FRemark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("FRemark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("FRemark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("FRemark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("FRemark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNull() {
            addCriterion("FIsEnable is null");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("FIsEnable is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnableEqualTo(Boolean value) {
            addCriterion("FIsEnable =", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotEqualTo(Boolean value) {
            addCriterion("FIsEnable <>", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThan(Boolean value) {
            addCriterion("FIsEnable >", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsEnable >=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThan(Boolean value) {
            addCriterion("FIsEnable <", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsEnable <=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableIn(List<Boolean> values) {
            addCriterion("FIsEnable in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotIn(List<Boolean> values) {
            addCriterion("FIsEnable not in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsEnable between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsEnable not between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsTestIsNull() {
            addCriterion("FIsTest is null");
            return (Criteria) this;
        }

        public Criteria andIsTestIsNotNull() {
            addCriterion("FIsTest is not null");
            return (Criteria) this;
        }

        public Criteria andIsTestEqualTo(Boolean value) {
            addCriterion("FIsTest =", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotEqualTo(Boolean value) {
            addCriterion("FIsTest <>", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestGreaterThan(Boolean value) {
            addCriterion("FIsTest >", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsTest >=", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestLessThan(Boolean value) {
            addCriterion("FIsTest <", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsTest <=", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestIn(List<Boolean> values) {
            addCriterion("FIsTest in", values, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotIn(List<Boolean> values) {
            addCriterion("FIsTest not in", values, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsTest between", value1, value2, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsTest not between", value1, value2, "isTest");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("FCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("FCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("FCreateTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("FCreateTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("FCreateTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FCreateTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("FCreateTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("FCreateTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("FCreateTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("FCreateTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("FCreateTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("FCreateTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("FModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("FModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("FModifyTime =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("FModifyTime <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("FModifyTime >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FModifyTime >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("FModifyTime <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("FModifyTime <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("FModifyTime in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("FModifyTime not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("FModifyTime between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("FModifyTime not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeIsNull() {
            addCriterion("FLastAccessTime is null");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeIsNotNull() {
            addCriterion("FLastAccessTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeEqualTo(Date value) {
            addCriterion("FLastAccessTime =", value, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeNotEqualTo(Date value) {
            addCriterion("FLastAccessTime <>", value, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeGreaterThan(Date value) {
            addCriterion("FLastAccessTime >", value, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FLastAccessTime >=", value, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeLessThan(Date value) {
            addCriterion("FLastAccessTime <", value, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("FLastAccessTime <=", value, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeIn(List<Date> values) {
            addCriterion("FLastAccessTime in", values, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeNotIn(List<Date> values) {
            addCriterion("FLastAccessTime not in", values, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeBetween(Date value1, Date value2) {
            addCriterion("FLastAccessTime between", value1, value2, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andLastAccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("FLastAccessTime not between", value1, value2, "lastAccessTime");
            return (Criteria) this;
        }

        public Criteria andPortraitIsNull() {
            addCriterion("FPortrait is null");
            return (Criteria) this;
        }

        public Criteria andPortraitIsNotNull() {
            addCriterion("FPortrait is not null");
            return (Criteria) this;
        }

        public Criteria andPortraitEqualTo(String value) {
            addCriterion("FPortrait =", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotEqualTo(String value) {
            addCriterion("FPortrait <>", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitGreaterThan(String value) {
            addCriterion("FPortrait >", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitGreaterThanOrEqualTo(String value) {
            addCriterion("FPortrait >=", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitLessThan(String value) {
            addCriterion("FPortrait <", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitLessThanOrEqualTo(String value) {
            addCriterion("FPortrait <=", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitLike(String value) {
            addCriterion("FPortrait like", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotLike(String value) {
            addCriterion("FPortrait not like", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitIn(List<String> values) {
            addCriterion("FPortrait in", values, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotIn(List<String> values) {
            addCriterion("FPortrait not in", values, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitBetween(String value1, String value2) {
            addCriterion("FPortrait between", value1, value2, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotBetween(String value1, String value2) {
            addCriterion("FPortrait not between", value1, value2, "portrait");
            return (Criteria) this;
        }

        public Criteria andIsAgentIsNull() {
            addCriterion("FIsAgent is null");
            return (Criteria) this;
        }

        public Criteria andIsAgentIsNotNull() {
            addCriterion("FIsAgent is not null");
            return (Criteria) this;
        }

        public Criteria andIsAgentEqualTo(Boolean value) {
            addCriterion("FIsAgent =", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentNotEqualTo(Boolean value) {
            addCriterion("FIsAgent <>", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentGreaterThan(Boolean value) {
            addCriterion("FIsAgent >", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsAgent >=", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentLessThan(Boolean value) {
            addCriterion("FIsAgent <", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsAgent <=", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentIn(List<Boolean> values) {
            addCriterion("FIsAgent in", values, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentNotIn(List<Boolean> values) {
            addCriterion("FIsAgent not in", values, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsAgent between", value1, value2, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsAgent not between", value1, value2, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsOpenNoticeIsNull() {
            addCriterion("FIsOpenNotice is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenNoticeIsNotNull() {
            addCriterion("FIsOpenNotice is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenNoticeEqualTo(Boolean value) {
            addCriterion("FIsOpenNotice =", value, "isOpenNotice");
            return (Criteria) this;
        }

        public Criteria andIsOpenNoticeNotEqualTo(Boolean value) {
            addCriterion("FIsOpenNotice <>", value, "isOpenNotice");
            return (Criteria) this;
        }

        public Criteria andIsOpenNoticeGreaterThan(Boolean value) {
            addCriterion("FIsOpenNotice >", value, "isOpenNotice");
            return (Criteria) this;
        }

        public Criteria andIsOpenNoticeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FIsOpenNotice >=", value, "isOpenNotice");
            return (Criteria) this;
        }

        public Criteria andIsOpenNoticeLessThan(Boolean value) {
            addCriterion("FIsOpenNotice <", value, "isOpenNotice");
            return (Criteria) this;
        }

        public Criteria andIsOpenNoticeLessThanOrEqualTo(Boolean value) {
            addCriterion("FIsOpenNotice <=", value, "isOpenNotice");
            return (Criteria) this;
        }

        public Criteria andIsOpenNoticeIn(List<Boolean> values) {
            addCriterion("FIsOpenNotice in", values, "isOpenNotice");
            return (Criteria) this;
        }

        public Criteria andIsOpenNoticeNotIn(List<Boolean> values) {
            addCriterion("FIsOpenNotice not in", values, "isOpenNotice");
            return (Criteria) this;
        }

        public Criteria andIsOpenNoticeBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsOpenNotice between", value1, value2, "isOpenNotice");
            return (Criteria) this;
        }

        public Criteria andIsOpenNoticeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FIsOpenNotice not between", value1, value2, "isOpenNotice");
            return (Criteria) this;
        }

        public Criteria andLoginPortIsNull() {
            addCriterion("FLoginPort is null");
            return (Criteria) this;
        }

        public Criteria andLoginPortIsNotNull() {
            addCriterion("FLoginPort is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPortEqualTo(String value) {
            addCriterion("FLoginPort =", value, "loginPort");
            return (Criteria) this;
        }

        public Criteria andLoginPortNotEqualTo(String value) {
            addCriterion("FLoginPort <>", value, "loginPort");
            return (Criteria) this;
        }

        public Criteria andLoginPortGreaterThan(String value) {
            addCriterion("FLoginPort >", value, "loginPort");
            return (Criteria) this;
        }

        public Criteria andLoginPortGreaterThanOrEqualTo(String value) {
            addCriterion("FLoginPort >=", value, "loginPort");
            return (Criteria) this;
        }

        public Criteria andLoginPortLessThan(String value) {
            addCriterion("FLoginPort <", value, "loginPort");
            return (Criteria) this;
        }

        public Criteria andLoginPortLessThanOrEqualTo(String value) {
            addCriterion("FLoginPort <=", value, "loginPort");
            return (Criteria) this;
        }

        public Criteria andLoginPortLike(String value) {
            addCriterion("FLoginPort like", value, "loginPort");
            return (Criteria) this;
        }

        public Criteria andLoginPortNotLike(String value) {
            addCriterion("FLoginPort not like", value, "loginPort");
            return (Criteria) this;
        }

        public Criteria andLoginPortIn(List<String> values) {
            addCriterion("FLoginPort in", values, "loginPort");
            return (Criteria) this;
        }

        public Criteria andLoginPortNotIn(List<String> values) {
            addCriterion("FLoginPort not in", values, "loginPort");
            return (Criteria) this;
        }

        public Criteria andLoginPortBetween(String value1, String value2) {
            addCriterion("FLoginPort between", value1, value2, "loginPort");
            return (Criteria) this;
        }

        public Criteria andLoginPortNotBetween(String value1, String value2) {
            addCriterion("FLoginPort not between", value1, value2, "loginPort");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("FDeviceName is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("FDeviceName is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("FDeviceName =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("FDeviceName <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("FDeviceName >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("FDeviceName >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("FDeviceName <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("FDeviceName <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("FDeviceName like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("FDeviceName not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("FDeviceName in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("FDeviceName not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("FDeviceName between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("FDeviceName not between", value1, value2, "deviceName");
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