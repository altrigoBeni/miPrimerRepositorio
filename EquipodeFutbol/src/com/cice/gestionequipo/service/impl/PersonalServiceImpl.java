package com.cice.gestionequipo.service.impl;

import com.cice.gestionequipo.dao.DataSource;
import com.cice.gestionequipo.entidades.Personal;
import com.cice.gestionequipo.service.PersonalService;

public class PersonalServiceImpl implements PersonalService{

	DataSource dataSource = new DataSource();	
	
	@Override
	public void contratar(Integer fechaInicio, int id, String name, String surname) {
		Personal personal = DataSource.plantilla.get(id);
		if (name.equalsIgnoreCase(personal.getNombre()) && surname.equalsIgnoreCase(personal.getApellido())) {
			System.out.println("El nombre de " + personal.getNombre() + " coincide");
			System.out.println("El apellido de " + personal.getApellido() + " coincide");
			
			personal.setFechaIncorporacion(fechaInicio);
			dataSource.plantilla.put(id, personal);
			System.out.println(personal.toString() + " ha sido contratado.");
		}else {
		System.out.println(personal.toString() + " no ha sido contratado.");
		}
		System.out.println("Verificando la fecha de entrada " + dataSource.plantilla.get(id).getFechaIncorporacion());		
	}

	@Override
	public void despedir(Integer fechaFin, int id) {		
		Personal personal = DataSource.plantilla.get(id);
		if(personal.getFechaIncorporacion() != null) {
			personal.setFechaDespido(fechaFin);
			dataSource.plantilla.put(id, personal);
			System.out.println("El empleado: " + personal.getNombre() +" "+ personal.getApellido() + " ha sido despedido.");
		}else {
			System.out.println("El empleado no existe.");
		}
		System.out.println("Verificación de la fecha de salida: " + dataSource.plantilla.get(id).getFechaDespido());
				
	}

	@Override
	public void modificarSalario(int id,double nuevoSalario) {		
		Personal personal = DataSource.plantilla.get(id);		
		System.out.println("El salario antiguo es: " + personal.getSalario());		
		personal.setSalario(nuevoSalario);		
		System.out.println("El nuevo salario de " + personal.getNombre() + " "+ personal.getApellido() + " es: " + personal.getSalario());
		
		
		
	}

}
