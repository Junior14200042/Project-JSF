package com.devjr.projectjsf.Controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devjr.projectjsf.entities.Empleado;
import com.devjr.projectjsf.services.EmpleadoService;

@ManagedBean
@ViewScoped
public class PrincipalController {
	
	
	private List<Empleado> empleados;
	
	private List<Empleado> empleadosFilter;
	
	private EmpleadoService es= new EmpleadoService();
	
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
		
	}
	public void consultarEmpleados() {
		this.empleados=this.es.consultarEmpleado();
	}
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	public List<Empleado> getEmpleadosFilter() {
		return empleadosFilter;
	}
	public void setEmpleadosFilter(List<Empleado> empleadosFilter) {
		this.empleadosFilter = empleadosFilter;
	}
	
	

}
