package com.devjr.projectjsf.services;

import java.util.ArrayList;
import java.util.List;


import com.devjr.projectjsf.entities.Empleado;

public class EmpleadoService {

	public List<Empleado> consultarEmpleado(){
		List<Empleado> empleado=new ArrayList<Empleado>();
		Empleado em=new Empleado("junior","cañari","corpus","programador",true);
		em.setStatus(true);
		Empleado em1=new Empleado("carlos","cañari","corpus","Soldador",true);
		Empleado em2=new Empleado("kevin","cañari","corpus","Mecanico",false);
		
		empleado.add(em);
		empleado.add(em1);
		empleado.add(em2);
		
		return empleado;
	}
}
