package id.swhp.javaee.soap.business.account.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sukma Wardana
 * @since 1.0.0
 */
@XmlRootElement(name = "AccountWs", namespace = "http://account.swhp.id")
@XmlAccessorType(XmlAccessType.FIELD)
public class Account {

    private Long id;
    private String username;
    private String password;

    public Account() {
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" 
                + "id=" + id 
                + ", username=" + username 
                + ", password=" + password + '}';
    }
}
