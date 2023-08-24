package com.springbootweb.di.app.models.service;

import org.springframework.stereotype.Component;

@Component
public class Service implements ServiceInterface{
	
	@Override
	public String operacion() {
		return "Ejecutando proceso...";
	}

}
