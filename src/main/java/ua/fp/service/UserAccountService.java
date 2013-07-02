package ua.fp.service;

import ua.fp.domain.UserAccountEntity;

/**
 * Created with IntelliJ IDEA.
 * User: Калько Евгений
 * Date: 7/1/13
 * Time: 12:46 AM
 * To change this template use File | Settings | File Templates.
 */
public interface UserAccountService {


    public UserAccountEntity addUser(UserAccountEntity o);

    public UserAccountEntity findUser50();

    public UserAccountEntity addUser();


}
