package com.cice.gestionequipo;

import com.cice.gestionequipo.dao.DataSource;
import com.cice.gestionequipo.entidades.Personal;
import com.cice.gestionequipo.service.UtilleroService;
import com.cice.gestionequipo.service.impl.PersonalServiceImpl;
import com.cice.gestionequipo.service.impl.UtilleroServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		//Metodo viajar
		UtilleroServiceImpl viaja = new UtilleroServiceImpl();
		viaja.modificacionEstadoCapacidadDeViajar(18, true);
		
		//Metodo Despedir
		PersonalServiceImpl usuario = new PersonalServiceImpl();
		usuario.despedir(1558583180, 14);
		
		//Metodo modificar salario
		usuario.modificarSalario(10, 1234567);
		
		
	}

}
