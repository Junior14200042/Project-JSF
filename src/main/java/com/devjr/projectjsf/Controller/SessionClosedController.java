package com.devjr.projectjsf.Controller;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean()
public class SessionClosedController {
	
	@PostConstruct
	public void init() {
		System.out.print("se cierra la sesion");
	}
	
	public void cerrarSession() {
		ExternalContext ec= FacesContext.getCurrentInstance().getExternalContext();
		ec.invalidateSession();
		
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void redireccionar(String url) throws IOException {
		ExternalContext exc=FacesContext.getCurrentInstance().getExternalContext();
		exc.redirect(url);
	}
}
