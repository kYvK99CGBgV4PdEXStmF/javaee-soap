package id.swhp.javaee.soap.business.account.control;

import id.swhp.account.Account;
import id.swhp.account.AccountService;
import id.swhp.account.AccountService_Service;
import id.swhp.account.Message;
import id.swhp.javaee.soap.business.account.entity.User;
import javax.xml.ws.BindingProvider;

/**
 * Validate account using SOAP Web Service
 *
 * @author Sukma Wardana
 * @since 1.0.0
 */
public class AccountValidation {

    private static final AccountService_Service SERVICE;
    private static final AccountService ISERVICE;

    static {
        SERVICE = new AccountService_Service();
        ISERVICE = SERVICE.getAccountServicePort();
    }

    public boolean checkAccount(User user) {
        final Account account = new Account();

        account.setUsername(user.getUsername());
        account.setPassword(user.getPassword());

        Message response = validateAccount(account);

        if (response.getStatus().getStatusCode().equals("99")) {
            return true;
        } else {
            return false;
        }
    }

    private Message validateAccount(Account account) {
        BindingProvider bindingProvider = (BindingProvider) ISERVICE;       
        bindingProvider.getRequestContext().put("com.sun.xml.ws.request.timeout", 1000);
        bindingProvider.getRequestContext().put("javax.xml.ws.client.receiveTimeout.request.timeout", 1000);
     
        return ISERVICE.inqAccount(account);
    }
}
