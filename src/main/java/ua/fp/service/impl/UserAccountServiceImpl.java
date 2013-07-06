package ua.fp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.fp.dao.UserDAO;
import ua.fp.dao.impl.UserDAOImpl;
import ua.fp.domain.UserAccountEntity;
import ua.fp.service.UserAccountService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 * Created with IntelliJ IDEA.
 * User: Калько Евгений
 * Date: 7/1/13
 * Time: 12:48 AM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Inject
    @Named("userDAOImpl")
    private UserDAO userDAO;

    public UserAccountServiceImpl() {
    }

    @Override
    public UserAccountEntity addUser(UserAccountEntity o) {
        return this.userDAO.create(o);
    }

    @Transactional
    @Override
    public UserAccountEntity findUser50() {
        return this.userDAO.find(50);
    }

    @Override
    public UserAccountEntity addUser() {
        return null;
//        return this.userDAO.create(new UserAccountEntity("test", 123, "UA"));
    }
}
