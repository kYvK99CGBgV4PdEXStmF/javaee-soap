package id.swhp.javaee.soap.business.account.boundary;

import id.swhp.javaee.soap.business.account.control.AccountValidation;
import id.swhp.javaee.soap.business.account.entity.User;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Sukma Wardana
 * @since 1.0.0
 */
@Stateless
public class UserManagement {

    @Inject
    AccountValidation accountValidation;

    public boolean validateUser(User user) {
        return this.accountValidation.checkAccount(user);
    }
}
