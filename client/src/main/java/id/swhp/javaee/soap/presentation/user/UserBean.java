package id.swhp.javaee.soap.presentation.user;

import id.swhp.javaee.soap.business.account.boundary.UserManagement;
import id.swhp.javaee.soap.business.account.entity.User;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Sukma Wardana
 * @since 1.0.0
 */
@Model
public class UserBean {
    
    private User user;
    
    @Inject
    UserManagement userManagement;
    
    @PostConstruct
    public void init() {
        this.user = new User();
    }
    
    public void submit() {
        if(this.userManagement.validateUser(user)) {
            FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Your Account is Valid"));
        } else {
            FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Failed", "Your Account is Not Valid"));
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
