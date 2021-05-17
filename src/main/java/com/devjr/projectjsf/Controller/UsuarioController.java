package com.devjr.projectjsf.Controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.devjr.projectjsf.dto.UsuarioDTO;

@ManagedBean
@SessionScoped
public class UsuarioController {

	private UsuarioDTO usuarioDTO;
	
	@PostConstruct
	public void init() {
		System.out.print("cargando info");
	}

	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	
	
}
