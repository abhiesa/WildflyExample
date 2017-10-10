package org.jboss.as.quickstarts.kitchensink_ear.security;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class IndexBean implements Serializable {

	private static final long serialVersionUID = 7895221971306645134L;
	private Subject subject = SecurityUtils.getSubject();

    public Subject getSubject() {
        return subject;
    }
}

