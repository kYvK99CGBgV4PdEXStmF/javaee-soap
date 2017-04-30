package id.swhp.javaee.soap.business.account.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Sukma Wardana
 * @since 1.0.0
 */
@XmlType(name = "messageWs", namespace = "http://account.swhp.id")
@XmlAccessorType(XmlAccessType.FIELD)
public class Status {
    
    @XmlElement(name = "status_code")
    private String statusCode;
    @XmlElement(name = "status_description")
    private String statusDescription;

    public Status() {
    }

    public Status(String statusCode, String statusDescription) {
        this.statusCode = statusCode;
        this.statusDescription = statusDescription;
    }
}
