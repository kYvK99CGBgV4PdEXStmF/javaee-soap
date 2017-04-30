
package id.swhp.account;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the id.swhp.account package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AccountWs_QNAME = new QName("http://account.swhp.id", "AccountWs");
    private final static QName _InqAccount_QNAME = new QName("http://account.swhp.id", "inqAccount");
    private final static QName _InqAccountResponse_QNAME = new QName("http://account.swhp.id", "inqAccountResponse");
    private final static QName _MessageWs_QNAME = new QName("http://account.swhp.id", "messageWs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: id.swhp.account
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link InqAccount }
     * 
     */
    public InqAccount createInqAccount() {
        return new InqAccount();
    }

    /**
     * Create an instance of {@link InqAccountResponse }
     * 
     */
    public InqAccountResponse createInqAccountResponse() {
        return new InqAccountResponse();
    }

    /**
     * Create an instance of {@link MessageWs }
     * 
     */
    public MessageWs createMessageWs() {
        return new MessageWs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://account.swhp.id", name = "AccountWs")
    public JAXBElement<Account> createAccountWs(Account value) {
        return new JAXBElement<Account>(_AccountWs_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InqAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://account.swhp.id", name = "inqAccount")
    public JAXBElement<InqAccount> createInqAccount(InqAccount value) {
        return new JAXBElement<InqAccount>(_InqAccount_QNAME, InqAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InqAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://account.swhp.id", name = "inqAccountResponse")
    public JAXBElement<InqAccountResponse> createInqAccountResponse(InqAccountResponse value) {
        return new JAXBElement<InqAccountResponse>(_InqAccountResponse_QNAME, InqAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://account.swhp.id", name = "messageWs")
    public JAXBElement<Message> createMessageWs(Message value) {
        return new JAXBElement<Message>(_MessageWs_QNAME, Message.class, null, value);
    }

}
