package com.cice.gestionequipo.service.impl;

import com.cice.gestionequipo.dao.DataSource;
import com.cice.gestionequipo.entidades.Personal;
import com.cice.gestionequipo.service.UtilleroService;

public class UtilleroServiceImpl implements UtilleroService{
	
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarSalario(double nuevoSalario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificacionEstadoCapacidadDeViajar(int idUtillero, boolean nuevoEstado) {
		// TODO Auto-generated method stub
		
	}

}
