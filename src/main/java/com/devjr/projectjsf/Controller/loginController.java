package com.devjr.projectjsf.Controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.devjr.projectjsf.dto.UsuarioDTO;

@ManagedBean
public class loginController {
	
	private String usuario;
	private String password;
	
	@ManagedProperty("#{usuarioController}")
	private UsuarioController usuarioController;
	
	
	public void mostrar() {
		if(usuario.equals("junior") && password.equals("devjr")) {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUser", new FacesMessage(FacesMessage.SEVERITY_INFO,"Usuario correcto",""));
			try {
				UsuarioDTO usuariodto=new UsuarioDTO();
				usuariodto.setUsuario(usuario);
				usuariodto.setPassword(password);
				usuarioController.setUsuarioDTO(usuariodto);
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUser", new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario Incorrecto",""));
		}
	}
	
	public UsuarioController getUsuarioController() {
		return usuarioController;
	}

	public void setUsuarioController(UsuarioController usuarioController) {
		this.usuarioController = usuarioController;
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
