package com.example.herve.Study.greendao.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.herve.Study.bean.CurriculumBean;
import com.example.herve.Study.bean.ExaminationPaperBean;
import com.example.herve.Study.bean.QuestionBean;
import com.example.herve.Study.bean.User;
import com.example.herve.Study.bean.SelectBean;
import com.example.herve.Study.bean.AnswerBean;

import com.example.herve.Study.greendao.dao.CurriculumBeanDao;
import com.example.herve.Study.greendao.dao.ExaminationPaperBeanDao;
import com.example.herve.Study.greendao.dao.QuestionBeanDao;
import com.example.herve.Study.greendao.dao.UserDao;
import com.example.herve.Study.greendao.dao.SelectBeanDao;
import com.example.herve.Study.greendao.dao.AnswerBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig curriculumBeanDaoConfig;
    private final DaoConfig examinationPaperBeanDaoConfig;
    private final DaoConfig questionBeanDaoConfig;
    private final DaoConfig userDaoConfig;
    private final DaoConfig selectBeanDaoConfig;
    private final DaoConfig answerBeanDaoConfig;

    private final CurriculumBeanDao curriculumBeanDao;
    private final ExaminationPaperBeanDao examinationPaperBeanDao;
    private final QuestionBeanDao questionBeanDao;
    private final UserDao userDao;
    private final SelectBeanDao selectBeanDao;
    private final AnswerBeanDao answerBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        curriculumBeanDaoConfig = daoConfigMap.get(CurriculumBeanDao.class).clone();
        curriculumBeanDaoConfig.initIdentityScope(type);

        examinationPaperBeanDaoConfig = daoConfigMap.get(ExaminationPaperBeanDao.class).clone();
        examinationPaperBeanDaoConfig.initIdentityScope(type);

        questionBeanDaoConfig = daoConfigMap.get(QuestionBeanDao.class).clone();
        questionBeanDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        selectBeanDaoConfig = daoConfigMap.get(SelectBeanDao.class).clone();
        selectBeanDaoConfig.initIdentityScope(type);

        answerBeanDaoConfig = daoConfigMap.get(AnswerBeanDao.class).clone();
        answerBeanDaoConfig.initIdentityScope(type);

        curriculumBeanDao = new CurriculumBeanDao(curriculumBeanDaoConfig, this);
        examinationPaperBeanDao = new ExaminationPaperBeanDao(examinationPaperBeanDaoConfig, this);
        questionBeanDao = new QuestionBeanDao(questionBeanDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);
        selectBeanDao = new SelectBeanDao(selectBeanDaoConfig, this);
        answerBeanDao = new AnswerBeanDao(answerBeanDaoConfig, this);

        registerDao(CurriculumBean.class, curriculumBeanDao);
        registerDao(ExaminationPaperBean.class, examinationPaperBeanDao);
        registerDao(QuestionBean.class, questionBeanDao);
        registerDao(User.class, userDao);
        registerDao(SelectBean.class, selectBeanDao);
        registerDao(AnswerBean.class, answerBeanDao);
    }
    
    public void clear() {
        curriculumBeanDaoConfig.clearIdentityScope();
        examinationPaperBeanDaoConfig.clearIdentityScope();
        questionBeanDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
        selectBeanDaoConfig.clearIdentityScope();
        answerBeanDaoConfig.clearIdentityScope();
    }

    public CurriculumBeanDao getCurriculumBeanDao() {
        return curriculumBeanDao;
    }

    public ExaminationPaperBeanDao getExaminationPaperBeanDao() {
        return examinationPaperBeanDao;
    }

    public QuestionBeanDao getQuestionBeanDao() {
        return questionBeanDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public SelectBeanDao getSelectBeanDao() {
        return selectBeanDao;
    }

    public AnswerBeanDao getAnswerBeanDao() {
        return answerBeanDao;
    }

}
