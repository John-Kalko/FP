package ua.fp.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    @Inject
    private UserDAOImpl userDAO;

    public UserAccountServiceImpl() {
    }

    @Transactional
    @Override
    public UserAccountEntity addUser(UserAccountEntity o) {
        return this.userDAO.create(o);
    }

    @Transactional
    @Override
    public UserAccountEntity findUser50() {
        return this.userDAO.find(new Integer(50));
    }
}
