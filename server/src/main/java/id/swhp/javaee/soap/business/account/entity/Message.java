package id.swhp.javaee.soap.business.account.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sukma Wardana
 * @since 1.0.0
 */
@XmlRootElement(name = "messageWs", namespace = "http://account.swhp.id")
@XmlAccessorType(XmlAccessType.FIELD)
public class Message {

    @XmlElement(name = "request_number")
    private Long requestNumber;
    @XmlElement(name = "status")
    private Status status;

    public Message() {
    }

    public Message(Long requestNumber, Status status) {
        this.requestNumber = requestNumber;
        this.status = status;
    }
}
