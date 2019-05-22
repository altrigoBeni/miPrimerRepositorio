package com.cice.gestionequipo;

import com.cice.gestionequipo.service.UtilleroService;
import com.cice.gestionequipo.service.impl.UtilleroServiceImpl;

public class Main {

	public static void main(String[] args) {
		UtilleroService utilleroService = new UtilleroServiceImpl();
		
		utilleroService.contratar(1551731969, 1, "pep", "guardiola");

	}

}
