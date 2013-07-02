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
import javax.persistence.PersistenceContext;

/**
 * Created with IntelliJ IDEA.
 * User: Калько Евгений
 * Date: 7/1/13
 * Time: 12:48 AM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    @Qualifier("userDAOImpl")
    private UserDAO userDAO;

    public UserAccountServiceImpl() {
    }

    @Override
    public UserAccountEntity addUser(UserAccountEntity o) {
        return this.userDAO.create(o);
    }

    @Override
    public UserAccountEntity findUser50() {
        return this.userDAO.find(new Integer(50));
    }

    @Override
    public UserAccountEntity addUser() {
        return null;
//        return this.userDAO.create(new UserAccountEntity("test", 123, "UA"));
    }
}
