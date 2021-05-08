package com.devjr.projectjsf.Controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
public class loginController {
	
	private String usuario;
	private String password;
	
	public void mostrar() {
		if(usuario.equals("junior") && password.equals("devjr")) {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUser", new FacesMessage(FacesMessage.SEVERITY_INFO,"Usuario correcto",""));
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUser", new FacesMessage(FacesMessage.SEVERITY_ERROR,"Campo vacio",""));
		}
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec=FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	

}
