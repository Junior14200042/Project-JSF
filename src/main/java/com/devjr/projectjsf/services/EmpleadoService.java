package com.devjr.projectjsf.services;

import java.util.ArrayList;
import java.util.List;


import com.devjr.projectjsf.entities.Empleado;

public class EmpleadoService {

	public List<Empleado> consultarEmpleado(){
		List<Empleado> empleado=new ArrayList<Empleado>();
		Empleado em=new Empleado("junior","cañari","corpus","programador",true);
		em.setStatus(true);
		Empleado em1=new Empleado("Bryam","Moran","Otero","Ingeniero de Datos",true);
		Empleado em2=new Empleado("Dennis","Leon","Bonilla","Gerente Comercial",false);
		Empleado em3=new Empleado("Richard","Inga","Aliaga","Programador Front-end",true);
		Empleado em4=new Empleado("Robert","popi","Requis","Programador Backend",false);
		Empleado em5=new Empleado("Kevin","Chagua","Callupe","Analista DBA",true);
		Empleado em6=new Empleado("juan","Perez","Del Carpio","Ing. TI",true);
		Empleado em7=new Empleado("Daniel","Chaparro","Panduro","Product Owner",true);
		
		empleado.add(em);
		empleado.add(em1);
		empleado.add(em2);
		empleado.add(em3);
		empleado.add(em4);
		empleado.add(em5);
		empleado.add(em6);
		empleado.add(em7);
		
		return empleado;
	}
}
