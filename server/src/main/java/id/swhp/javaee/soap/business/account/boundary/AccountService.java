package id.swhp.javaee.soap.business.account.boundary;

import id.swhp.javaee.soap.business.account.entity.Account;
import id.swhp.javaee.soap.business.account.entity.Message;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author Sukma Wardana
 * @since 1.0.0
 */
@WebService(name = "AccountService", serviceName = "AccountService", 
        portName = "AccountServicePort", 
        targetNamespace = "http://account.swhp.id")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public class AccountService {
    
    @Inject
    AccountManagement accountManagement;

    @WebMethod(operationName = "inqAccount", action = "tns:inqAccount")
    @WebResult(name = "return")
    public Message checkAccount(@WebParam(name = "inqAccount") Account account) {
        return this.accountManagement.validateAccount(account);
    }
}
