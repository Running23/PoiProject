package com.poiproject.model;

import java.util.ArrayList;
import java.util.List;

public class StudentAllDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentAllDataExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDepartIsNull() {
            addCriterion("depart is null");
            return (Criteria) this;
        }

        public Criteria andDepartIsNotNull() {
            addCriterion("depart is not null");
            return (Criteria) this;
        }

        public Criteria andDepartEqualTo(String value) {
            addCriterion("depart =", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotEqualTo(String value) {
            addCriterion("depart <>", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartGreaterThan(String value) {
            addCriterion("depart >", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartGreaterThanOrEqualTo(String value) {
            addCriterion("depart >=", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLessThan(String value) {
            addCriterion("depart <", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLessThanOrEqualTo(String value) {
            addCriterion("depart <=", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartLike(String value) {
            addCriterion("depart like", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotLike(String value) {
            addCriterion("depart not like", value, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartIn(List<String> values) {
            addCriterion("depart in", values, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotIn(List<String> values) {
            addCriterion("depart not in", values, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartBetween(String value1, String value2) {
            addCriterion("depart between", value1, value2, "depart");
            return (Criteria) this;
        }

        public Criteria andDepartNotBetween(String value1, String value2) {
            addCriterion("depart not between", value1, value2, "depart");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCognizanceGradeIsNull() {
            addCriterion("cognizance_grade is null");
            return (Criteria) this;
        }

        public Criteria andCognizanceGradeIsNotNull() {
            addCriterion("cognizance_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCognizanceGradeEqualTo(String value) {
            addCriterion("cognizance_grade =", value, "cognizanceGrade");
            return (Criteria) this;
        }

        public Criteria andCognizanceGradeNotEqualTo(String value) {
            addCriterion("cognizance_grade <>", value, "cognizanceGrade");
            return (Criteria) this;
        }

        public Criteria andCognizanceGradeGreaterThan(String value) {
            addCriterion("cognizance_grade >", value, "cognizanceGrade");
            return (Criteria) this;
        }

        public Criteria andCognizanceGradeGreaterThanOrEqualTo(String value) {
            addCriterion("cognizance_grade >=", value, "cognizanceGrade");
            return (Criteria) this;
        }

        public Criteria andCognizanceGradeLessThan(String value) {
            addCriterion("cognizance_grade <", value, "cognizanceGrade");
            return (Criteria) this;
        }

        public Criteria andCognizanceGradeLessThanOrEqualTo(String value) {
            addCriterion("cognizance_grade <=", value, "cognizanceGrade");
            return (Criteria) this;
        }

        public Criteria andCognizanceGradeLike(String value) {
            addCriterion("cognizance_grade like", value, "cognizanceGrade");
            return (Criteria) this;
        }

        public Criteria andCognizanceGradeNotLike(String value) {
            addCriterion("cognizance_grade not like", value, "cognizanceGrade");
            return (Criteria) this;
        }

        public Criteria andCognizanceGradeIn(List<String> values) {
            addCriterion("cognizance_grade in", values, "cognizanceGrade");
            return (Criteria) this;
        }

        public Criteria andCognizanceGradeNotIn(List<String> values) {
            addCriterion("cognizance_grade not in", values, "cognizanceGrade");
            return (Criteria) this;
        }

        public Criteria andCognizanceGradeBetween(String value1, String value2) {
            addCriterion("cognizance_grade between", value1, value2, "cognizanceGrade");
            return (Criteria) this;
        }

        public Criteria andCognizanceGradeNotBetween(String value1, String value2) {
            addCriterion("cognizance_grade not between", value1, value2, "cognizanceGrade");
            return (Criteria) this;
        }

        public Criteria andJianXueJinIsNull() {
            addCriterion("jian_xue_jin is null");
            return (Criteria) this;
        }

        public Criteria andJianXueJinIsNotNull() {
            addCriterion("jian_xue_jin is not null");
            return (Criteria) this;
        }

        public Criteria andJianXueJinEqualTo(Integer value) {
            addCriterion("jian_xue_jin =", value, "jianXueJin");
            return (Criteria) this;
        }

        public Criteria andJianXueJinNotEqualTo(Integer value) {
            addCriterion("jian_xue_jin <>", value, "jianXueJin");
            return (Criteria) this;
        }

        public Criteria andJianXueJinGreaterThan(Integer value) {
            addCriterion("jian_xue_jin >", value, "jianXueJin");
            return (Criteria) this;
        }

        public Criteria andJianXueJinGreaterThanOrEqualTo(Integer value) {
            addCriterion("jian_xue_jin >=", value, "jianXueJin");
            return (Criteria) this;
        }

        public Criteria andJianXueJinLessThan(Integer value) {
            addCriterion("jian_xue_jin <", value, "jianXueJin");
            return (Criteria) this;
        }

        public Criteria andJianXueJinLessThanOrEqualTo(Integer value) {
            addCriterion("jian_xue_jin <=", value, "jianXueJin");
            return (Criteria) this;
        }

        public Criteria andJianXueJinIn(List<Integer> values) {
            addCriterion("jian_xue_jin in", values, "jianXueJin");
            return (Criteria) this;
        }

        public Criteria andJianXueJinNotIn(List<Integer> values) {
            addCriterion("jian_xue_jin not in", values, "jianXueJin");
            return (Criteria) this;
        }

        public Criteria andJianXueJinBetween(Integer value1, Integer value2) {
            addCriterion("jian_xue_jin between", value1, value2, "jianXueJin");
            return (Criteria) this;
        }

        public Criteria andJianXueJinNotBetween(Integer value1, Integer value2) {
            addCriterion("jian_xue_jin not between", value1, value2, "jianXueJin");
            return (Criteria) this;
        }

        public Criteria andZhuXueJinIsNull() {
            addCriterion("zhu_xue_jin is null");
            return (Criteria) this;
        }

        public Criteria andZhuXueJinIsNotNull() {
            addCriterion("zhu_xue_jin is not null");
            return (Criteria) this;
        }

        public Criteria andZhuXueJinEqualTo(Integer value) {
            addCriterion("zhu_xue_jin =", value, "zhuXueJin");
            return (Criteria) this;
        }

        public Criteria andZhuXueJinNotEqualTo(Integer value) {
            addCriterion("zhu_xue_jin <>", value, "zhuXueJin");
            return (Criteria) this;
        }

        public Criteria andZhuXueJinGreaterThan(Integer value) {
            addCriterion("zhu_xue_jin >", value, "zhuXueJin");
            return (Criteria) this;
        }

        public Criteria andZhuXueJinGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhu_xue_jin >=", value, "zhuXueJin");
            return (Criteria) this;
        }

        public Criteria andZhuXueJinLessThan(Integer value) {
            addCriterion("zhu_xue_jin <", value, "zhuXueJin");
            return (Criteria) this;
        }

        public Criteria andZhuXueJinLessThanOrEqualTo(Integer value) {
            addCriterion("zhu_xue_jin <=", value, "zhuXueJin");
            return (Criteria) this;
        }

        public Criteria andZhuXueJinIn(List<Integer> values) {
            addCriterion("zhu_xue_jin in", values, "zhuXueJin");
            return (Criteria) this;
        }

        public Criteria andZhuXueJinNotIn(List<Integer> values) {
            addCriterion("zhu_xue_jin not in", values, "zhuXueJin");
            return (Criteria) this;
        }

        public Criteria andZhuXueJinBetween(Integer value1, Integer value2) {
            addCriterion("zhu_xue_jin between", value1, value2, "zhuXueJin");
            return (Criteria) this;
        }

        public Criteria andZhuXueJinNotBetween(Integer value1, Integer value2) {
            addCriterion("zhu_xue_jin not between", value1, value2, "zhuXueJin");
            return (Criteria) this;
        }

        public Criteria andLiZhiIsNull() {
            addCriterion("li_zhi is null");
            return (Criteria) this;
        }

        public Criteria andLiZhiIsNotNull() {
            addCriterion("li_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andLiZhiEqualTo(Integer value) {
            addCriterion("li_zhi =", value, "liZhi");
            return (Criteria) this;
        }

        public Criteria andLiZhiNotEqualTo(Integer value) {
            addCriterion("li_zhi <>", value, "liZhi");
            return (Criteria) this;
        }

        public Criteria andLiZhiGreaterThan(Integer value) {
            addCriterion("li_zhi >", value, "liZhi");
            return (Criteria) this;
        }

        public Criteria andLiZhiGreaterThanOrEqualTo(Integer value) {
            addCriterion("li_zhi >=", value, "liZhi");
            return (Criteria) this;
        }

        public Criteria andLiZhiLessThan(Integer value) {
            addCriterion("li_zhi <", value, "liZhi");
            return (Criteria) this;
        }

        public Criteria andLiZhiLessThanOrEqualTo(Integer value) {
            addCriterion("li_zhi <=", value, "liZhi");
            return (Criteria) this;
        }

        public Criteria andLiZhiIn(List<Integer> values) {
            addCriterion("li_zhi in", values, "liZhi");
            return (Criteria) this;
        }

        public Criteria andLiZhiNotIn(List<Integer> values) {
            addCriterion("li_zhi not in", values, "liZhi");
            return (Criteria) this;
        }

        public Criteria andLiZhiBetween(Integer value1, Integer value2) {
            addCriterion("li_zhi between", value1, value2, "liZhi");
            return (Criteria) this;
        }

        public Criteria andLiZhiNotBetween(Integer value1, Integer value2) {
            addCriterion("li_zhi not between", value1, value2, "liZhi");
            return (Criteria) this;
        }

        public Criteria andJianBuIsNull() {
            addCriterion("jian_bu is null");
            return (Criteria) this;
        }

        public Criteria andJianBuIsNotNull() {
            addCriterion("jian_bu is not null");
            return (Criteria) this;
        }

        public Criteria andJianBuEqualTo(Integer value) {
            addCriterion("jian_bu =", value, "jianBu");
            return (Criteria) this;
        }

        public Criteria andJianBuNotEqualTo(Integer value) {
            addCriterion("jian_bu <>", value, "jianBu");
            return (Criteria) this;
        }

        public Criteria andJianBuGreaterThan(Integer value) {
            addCriterion("jian_bu >", value, "jianBu");
            return (Criteria) this;
        }

        public Criteria andJianBuGreaterThanOrEqualTo(Integer value) {
            addCriterion("jian_bu >=", value, "jianBu");
            return (Criteria) this;
        }

        public Criteria andJianBuLessThan(Integer value) {
            addCriterion("jian_bu <", value, "jianBu");
            return (Criteria) this;
        }

        public Criteria andJianBuLessThanOrEqualTo(Integer value) {
            addCriterion("jian_bu <=", value, "jianBu");
            return (Criteria) this;
        }

        public Criteria andJianBuIn(List<Integer> values) {
            addCriterion("jian_bu in", values, "jianBu");
            return (Criteria) this;
        }

        public Criteria andJianBuNotIn(List<Integer> values) {
            addCriterion("jian_bu not in", values, "jianBu");
            return (Criteria) this;
        }

        public Criteria andJianBuBetween(Integer value1, Integer value2) {
            addCriterion("jian_bu between", value1, value2, "jianBu");
            return (Criteria) this;
        }

        public Criteria andJianBuNotBetween(Integer value1, Integer value2) {
            addCriterion("jian_bu not between", value1, value2, "jianBu");
            return (Criteria) this;
        }

        public Criteria andXiaoYuanDiIsNull() {
            addCriterion("xiao_yuan_di is null");
            return (Criteria) this;
        }

        public Criteria andXiaoYuanDiIsNotNull() {
            addCriterion("xiao_yuan_di is not null");
            return (Criteria) this;
        }

        public Criteria andXiaoYuanDiEqualTo(Integer value) {
            addCriterion("xiao_yuan_di =", value, "xiaoYuanDi");
            return (Criteria) this;
        }

        public Criteria andXiaoYuanDiNotEqualTo(Integer value) {
            addCriterion("xiao_yuan_di <>", value, "xiaoYuanDi");
            return (Criteria) this;
        }

        public Criteria andXiaoYuanDiGreaterThan(Integer value) {
            addCriterion("xiao_yuan_di >", value, "xiaoYuanDi");
            return (Criteria) this;
        }

        public Criteria andXiaoYuanDiGreaterThanOrEqualTo(Integer value) {
            addCriterion("xiao_yuan_di >=", value, "xiaoYuanDi");
            return (Criteria) this;
        }

        public Criteria andXiaoYuanDiLessThan(Integer value) {
            addCriterion("xiao_yuan_di <", value, "xiaoYuanDi");
            return (Criteria) this;
        }

        public Criteria andXiaoYuanDiLessThanOrEqualTo(Integer value) {
            addCriterion("xiao_yuan_di <=", value, "xiaoYuanDi");
            return (Criteria) this;
        }

        public Criteria andXiaoYuanDiIn(List<Integer> values) {
            addCriterion("xiao_yuan_di in", values, "xiaoYuanDi");
            return (Criteria) this;
        }

        public Criteria andXiaoYuanDiNotIn(List<Integer> values) {
            addCriterion("xiao_yuan_di not in", values, "xiaoYuanDi");
            return (Criteria) this;
        }

        public Criteria andXiaoYuanDiBetween(Integer value1, Integer value2) {
            addCriterion("xiao_yuan_di between", value1, value2, "xiaoYuanDi");
            return (Criteria) this;
        }

        public Criteria andXiaoYuanDiNotBetween(Integer value1, Integer value2) {
            addCriterion("xiao_yuan_di not between", value1, value2, "xiaoYuanDi");
            return (Criteria) this;
        }

        public Criteria andShengYuanDiIsNull() {
            addCriterion("sheng_yuan_di is null");
            return (Criteria) this;
        }

        public Criteria andShengYuanDiIsNotNull() {
            addCriterion("sheng_yuan_di is not null");
            return (Criteria) this;
        }

        public Criteria andShengYuanDiEqualTo(Integer value) {
            addCriterion("sheng_yuan_di =", value, "shengYuanDi");
            return (Criteria) this;
        }

        public Criteria andShengYuanDiNotEqualTo(Integer value) {
            addCriterion("sheng_yuan_di <>", value, "shengYuanDi");
            return (Criteria) this;
        }

        public Criteria andShengYuanDiGreaterThan(Integer value) {
            addCriterion("sheng_yuan_di >", value, "shengYuanDi");
            return (Criteria) this;
        }

        public Criteria andShengYuanDiGreaterThanOrEqualTo(Integer value) {
            addCriterion("sheng_yuan_di >=", value, "shengYuanDi");
            return (Criteria) this;
        }

        public Criteria andShengYuanDiLessThan(Integer value) {
            addCriterion("sheng_yuan_di <", value, "shengYuanDi");
            return (Criteria) this;
        }

        public Criteria andShengYuanDiLessThanOrEqualTo(Integer value) {
            addCriterion("sheng_yuan_di <=", value, "shengYuanDi");
            return (Criteria) this;
        }

        public Criteria andShengYuanDiIn(List<Integer> values) {
            addCriterion("sheng_yuan_di in", values, "shengYuanDi");
            return (Criteria) this;
        }

        public Criteria andShengYuanDiNotIn(List<Integer> values) {
            addCriterion("sheng_yuan_di not in", values, "shengYuanDi");
            return (Criteria) this;
        }

        public Criteria andShengYuanDiBetween(Integer value1, Integer value2) {
            addCriterion("sheng_yuan_di between", value1, value2, "shengYuanDi");
            return (Criteria) this;
        }

        public Criteria andShengYuanDiNotBetween(Integer value1, Integer value2) {
            addCriterion("sheng_yuan_di not between", value1, value2, "shengYuanDi");
            return (Criteria) this;
        }

        public Criteria andYouXiuGanBuIsNull() {
            addCriterion("you_xiu_gan_bu is null");
            return (Criteria) this;
        }

        public Criteria andYouXiuGanBuIsNotNull() {
            addCriterion("you_xiu_gan_bu is not null");
            return (Criteria) this;
        }

        public Criteria andYouXiuGanBuEqualTo(Double value) {
            addCriterion("you_xiu_gan_bu =", value, "youXiuGanBu");
            return (Criteria) this;
        }

        public Criteria andYouXiuGanBuNotEqualTo(Double value) {
            addCriterion("you_xiu_gan_bu <>", value, "youXiuGanBu");
            return (Criteria) this;
        }

        public Criteria andYouXiuGanBuGreaterThan(Double value) {
            addCriterion("you_xiu_gan_bu >", value, "youXiuGanBu");
            return (Criteria) this;
        }

        public Criteria andYouXiuGanBuGreaterThanOrEqualTo(Double value) {
            addCriterion("you_xiu_gan_bu >=", value, "youXiuGanBu");
            return (Criteria) this;
        }

        public Criteria andYouXiuGanBuLessThan(Double value) {
            addCriterion("you_xiu_gan_bu <", value, "youXiuGanBu");
            return (Criteria) this;
        }

        public Criteria andYouXiuGanBuLessThanOrEqualTo(Double value) {
            addCriterion("you_xiu_gan_bu <=", value, "youXiuGanBu");
            return (Criteria) this;
        }

        public Criteria andYouXiuGanBuIn(List<Double> values) {
            addCriterion("you_xiu_gan_bu in", values, "youXiuGanBu");
            return (Criteria) this;
        }

        public Criteria andYouXiuGanBuNotIn(List<Double> values) {
            addCriterion("you_xiu_gan_bu not in", values, "youXiuGanBu");
            return (Criteria) this;
        }

        public Criteria andYouXiuGanBuBetween(Double value1, Double value2) {
            addCriterion("you_xiu_gan_bu between", value1, value2, "youXiuGanBu");
            return (Criteria) this;
        }

        public Criteria andYouXiuGanBuNotBetween(Double value1, Double value2) {
            addCriterion("you_xiu_gan_bu not between", value1, value2, "youXiuGanBu");
            return (Criteria) this;
        }

        public Criteria andShengHuoBuIsNull() {
            addCriterion("sheng_huo_bu is null");
            return (Criteria) this;
        }

        public Criteria andShengHuoBuIsNotNull() {
            addCriterion("sheng_huo_bu is not null");
            return (Criteria) this;
        }

        public Criteria andShengHuoBuEqualTo(Integer value) {
            addCriterion("sheng_huo_bu =", value, "shengHuoBu");
            return (Criteria) this;
        }

        public Criteria andShengHuoBuNotEqualTo(Integer value) {
            addCriterion("sheng_huo_bu <>", value, "shengHuoBu");
            return (Criteria) this;
        }

        public Criteria andShengHuoBuGreaterThan(Integer value) {
            addCriterion("sheng_huo_bu >", value, "shengHuoBu");
            return (Criteria) this;
        }

        public Criteria andShengHuoBuGreaterThanOrEqualTo(Integer value) {
            addCriterion("sheng_huo_bu >=", value, "shengHuoBu");
            return (Criteria) this;
        }

        public Criteria andShengHuoBuLessThan(Integer value) {
            addCriterion("sheng_huo_bu <", value, "shengHuoBu");
            return (Criteria) this;
        }

        public Criteria andShengHuoBuLessThanOrEqualTo(Integer value) {
            addCriterion("sheng_huo_bu <=", value, "shengHuoBu");
            return (Criteria) this;
        }

        public Criteria andShengHuoBuIn(List<Integer> values) {
            addCriterion("sheng_huo_bu in", values, "shengHuoBu");
            return (Criteria) this;
        }

        public Criteria andShengHuoBuNotIn(List<Integer> values) {
            addCriterion("sheng_huo_bu not in", values, "shengHuoBu");
            return (Criteria) this;
        }

        public Criteria andShengHuoBuBetween(Integer value1, Integer value2) {
            addCriterion("sheng_huo_bu between", value1, value2, "shengHuoBu");
            return (Criteria) this;
        }

        public Criteria andShengHuoBuNotBetween(Integer value1, Integer value2) {
            addCriterion("sheng_huo_bu not between", value1, value2, "shengHuoBu");
            return (Criteria) this;
        }

        public Criteria andGuoJiaJianIsNull() {
            addCriterion("guo_jia_jian is null");
            return (Criteria) this;
        }

        public Criteria andGuoJiaJianIsNotNull() {
            addCriterion("guo_jia_jian is not null");
            return (Criteria) this;
        }

        public Criteria andGuoJiaJianEqualTo(Integer value) {
            addCriterion("guo_jia_jian =", value, "guoJiaJian");
            return (Criteria) this;
        }

        public Criteria andGuoJiaJianNotEqualTo(Integer value) {
            addCriterion("guo_jia_jian <>", value, "guoJiaJian");
            return (Criteria) this;
        }

        public Criteria andGuoJiaJianGreaterThan(Integer value) {
            addCriterion("guo_jia_jian >", value, "guoJiaJian");
            return (Criteria) this;
        }

        public Criteria andGuoJiaJianGreaterThanOrEqualTo(Integer value) {
            addCriterion("guo_jia_jian >=", value, "guoJiaJian");
            return (Criteria) this;
        }

        public Criteria andGuoJiaJianLessThan(Integer value) {
            addCriterion("guo_jia_jian <", value, "guoJiaJian");
            return (Criteria) this;
        }

        public Criteria andGuoJiaJianLessThanOrEqualTo(Integer value) {
            addCriterion("guo_jia_jian <=", value, "guoJiaJian");
            return (Criteria) this;
        }

        public Criteria andGuoJiaJianIn(List<Integer> values) {
            addCriterion("guo_jia_jian in", values, "guoJiaJian");
            return (Criteria) this;
        }

        public Criteria andGuoJiaJianNotIn(List<Integer> values) {
            addCriterion("guo_jia_jian not in", values, "guoJiaJian");
            return (Criteria) this;
        }

        public Criteria andGuoJiaJianBetween(Integer value1, Integer value2) {
            addCriterion("guo_jia_jian between", value1, value2, "guoJiaJian");
            return (Criteria) this;
        }

        public Criteria andGuoJiaJianNotBetween(Integer value1, Integer value2) {
            addCriterion("guo_jia_jian not between", value1, value2, "guoJiaJian");
            return (Criteria) this;
        }

        public Criteria andZiQiangIsNull() {
            addCriterion("zi_qiang is null");
            return (Criteria) this;
        }

        public Criteria andZiQiangIsNotNull() {
            addCriterion("zi_qiang is not null");
            return (Criteria) this;
        }

        public Criteria andZiQiangEqualTo(Integer value) {
            addCriterion("zi_qiang =", value, "ziQiang");
            return (Criteria) this;
        }

        public Criteria andZiQiangNotEqualTo(Integer value) {
            addCriterion("zi_qiang <>", value, "ziQiang");
            return (Criteria) this;
        }

        public Criteria andZiQiangGreaterThan(Integer value) {
            addCriterion("zi_qiang >", value, "ziQiang");
            return (Criteria) this;
        }

        public Criteria andZiQiangGreaterThanOrEqualTo(Integer value) {
            addCriterion("zi_qiang >=", value, "ziQiang");
            return (Criteria) this;
        }

        public Criteria andZiQiangLessThan(Integer value) {
            addCriterion("zi_qiang <", value, "ziQiang");
            return (Criteria) this;
        }

        public Criteria andZiQiangLessThanOrEqualTo(Integer value) {
            addCriterion("zi_qiang <=", value, "ziQiang");
            return (Criteria) this;
        }

        public Criteria andZiQiangIn(List<Integer> values) {
            addCriterion("zi_qiang in", values, "ziQiang");
            return (Criteria) this;
        }

        public Criteria andZiQiangNotIn(List<Integer> values) {
            addCriterion("zi_qiang not in", values, "ziQiang");
            return (Criteria) this;
        }

        public Criteria andZiQiangBetween(Integer value1, Integer value2) {
            addCriterion("zi_qiang between", value1, value2, "ziQiang");
            return (Criteria) this;
        }

        public Criteria andZiQiangNotBetween(Integer value1, Integer value2) {
            addCriterion("zi_qiang not between", value1, value2, "ziQiang");
            return (Criteria) this;
        }

        public Criteria andGongYiIsNull() {
            addCriterion("gong_yi is null");
            return (Criteria) this;
        }

        public Criteria andGongYiIsNotNull() {
            addCriterion("gong_yi is not null");
            return (Criteria) this;
        }

        public Criteria andGongYiEqualTo(Integer value) {
            addCriterion("gong_yi =", value, "gongYi");
            return (Criteria) this;
        }

        public Criteria andGongYiNotEqualTo(Integer value) {
            addCriterion("gong_yi <>", value, "gongYi");
            return (Criteria) this;
        }

        public Criteria andGongYiGreaterThan(Integer value) {
            addCriterion("gong_yi >", value, "gongYi");
            return (Criteria) this;
        }

        public Criteria andGongYiGreaterThanOrEqualTo(Integer value) {
            addCriterion("gong_yi >=", value, "gongYi");
            return (Criteria) this;
        }

        public Criteria andGongYiLessThan(Integer value) {
            addCriterion("gong_yi <", value, "gongYi");
            return (Criteria) this;
        }

        public Criteria andGongYiLessThanOrEqualTo(Integer value) {
            addCriterion("gong_yi <=", value, "gongYi");
            return (Criteria) this;
        }

        public Criteria andGongYiIn(List<Integer> values) {
            addCriterion("gong_yi in", values, "gongYi");
            return (Criteria) this;
        }

        public Criteria andGongYiNotIn(List<Integer> values) {
            addCriterion("gong_yi not in", values, "gongYi");
            return (Criteria) this;
        }

        public Criteria andGongYiBetween(Integer value1, Integer value2) {
            addCriterion("gong_yi between", value1, value2, "gongYi");
            return (Criteria) this;
        }

        public Criteria andGongYiNotBetween(Integer value1, Integer value2) {
            addCriterion("gong_yi not between", value1, value2, "gongYi");
            return (Criteria) this;
        }

        public Criteria andWenTiIsNull() {
            addCriterion("wen_ti is null");
            return (Criteria) this;
        }

        public Criteria andWenTiIsNotNull() {
            addCriterion("wen_ti is not null");
            return (Criteria) this;
        }

        public Criteria andWenTiEqualTo(Integer value) {
            addCriterion("wen_ti =", value, "wenTi");
            return (Criteria) this;
        }

        public Criteria andWenTiNotEqualTo(Integer value) {
            addCriterion("wen_ti <>", value, "wenTi");
            return (Criteria) this;
        }

        public Criteria andWenTiGreaterThan(Integer value) {
            addCriterion("wen_ti >", value, "wenTi");
            return (Criteria) this;
        }

        public Criteria andWenTiGreaterThanOrEqualTo(Integer value) {
            addCriterion("wen_ti >=", value, "wenTi");
            return (Criteria) this;
        }

        public Criteria andWenTiLessThan(Integer value) {
            addCriterion("wen_ti <", value, "wenTi");
            return (Criteria) this;
        }

        public Criteria andWenTiLessThanOrEqualTo(Integer value) {
            addCriterion("wen_ti <=", value, "wenTi");
            return (Criteria) this;
        }

        public Criteria andWenTiIn(List<Integer> values) {
            addCriterion("wen_ti in", values, "wenTi");
            return (Criteria) this;
        }

        public Criteria andWenTiNotIn(List<Integer> values) {
            addCriterion("wen_ti not in", values, "wenTi");
            return (Criteria) this;
        }

        public Criteria andWenTiBetween(Integer value1, Integer value2) {
            addCriterion("wen_ti between", value1, value2, "wenTi");
            return (Criteria) this;
        }

        public Criteria andWenTiNotBetween(Integer value1, Integer value2) {
            addCriterion("wen_ti not between", value1, value2, "wenTi");
            return (Criteria) this;
        }

        public Criteria andChuangYeIsNull() {
            addCriterion("chuang_ye is null");
            return (Criteria) this;
        }

        public Criteria andChuangYeIsNotNull() {
            addCriterion("chuang_ye is not null");
            return (Criteria) this;
        }

        public Criteria andChuangYeEqualTo(Integer value) {
            addCriterion("chuang_ye =", value, "chuangYe");
            return (Criteria) this;
        }

        public Criteria andChuangYeNotEqualTo(Integer value) {
            addCriterion("chuang_ye <>", value, "chuangYe");
            return (Criteria) this;
        }

        public Criteria andChuangYeGreaterThan(Integer value) {
            addCriterion("chuang_ye >", value, "chuangYe");
            return (Criteria) this;
        }

        public Criteria andChuangYeGreaterThanOrEqualTo(Integer value) {
            addCriterion("chuang_ye >=", value, "chuangYe");
            return (Criteria) this;
        }

        public Criteria andChuangYeLessThan(Integer value) {
            addCriterion("chuang_ye <", value, "chuangYe");
            return (Criteria) this;
        }

        public Criteria andChuangYeLessThanOrEqualTo(Integer value) {
            addCriterion("chuang_ye <=", value, "chuangYe");
            return (Criteria) this;
        }

        public Criteria andChuangYeIn(List<Integer> values) {
            addCriterion("chuang_ye in", values, "chuangYe");
            return (Criteria) this;
        }

        public Criteria andChuangYeNotIn(List<Integer> values) {
            addCriterion("chuang_ye not in", values, "chuangYe");
            return (Criteria) this;
        }

        public Criteria andChuangYeBetween(Integer value1, Integer value2) {
            addCriterion("chuang_ye between", value1, value2, "chuangYe");
            return (Criteria) this;
        }

        public Criteria andChuangYeNotBetween(Integer value1, Integer value2) {
            addCriterion("chuang_ye not between", value1, value2, "chuangYe");
            return (Criteria) this;
        }

        public Criteria andGanBuIsNull() {
            addCriterion("gan_bu is null");
            return (Criteria) this;
        }

        public Criteria andGanBuIsNotNull() {
            addCriterion("gan_bu is not null");
            return (Criteria) this;
        }

        public Criteria andGanBuEqualTo(Integer value) {
            addCriterion("gan_bu =", value, "ganBu");
            return (Criteria) this;
        }

        public Criteria andGanBuNotEqualTo(Integer value) {
            addCriterion("gan_bu <>", value, "ganBu");
            return (Criteria) this;
        }

        public Criteria andGanBuGreaterThan(Integer value) {
            addCriterion("gan_bu >", value, "ganBu");
            return (Criteria) this;
        }

        public Criteria andGanBuGreaterThanOrEqualTo(Integer value) {
            addCriterion("gan_bu >=", value, "ganBu");
            return (Criteria) this;
        }

        public Criteria andGanBuLessThan(Integer value) {
            addCriterion("gan_bu <", value, "ganBu");
            return (Criteria) this;
        }

        public Criteria andGanBuLessThanOrEqualTo(Integer value) {
            addCriterion("gan_bu <=", value, "ganBu");
            return (Criteria) this;
        }

        public Criteria andGanBuIn(List<Integer> values) {
            addCriterion("gan_bu in", values, "ganBu");
            return (Criteria) this;
        }

        public Criteria andGanBuNotIn(List<Integer> values) {
            addCriterion("gan_bu not in", values, "ganBu");
            return (Criteria) this;
        }

        public Criteria andGanBuBetween(Integer value1, Integer value2) {
            addCriterion("gan_bu between", value1, value2, "ganBu");
            return (Criteria) this;
        }

        public Criteria andGanBuNotBetween(Integer value1, Integer value2) {
            addCriterion("gan_bu not between", value1, value2, "ganBu");
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