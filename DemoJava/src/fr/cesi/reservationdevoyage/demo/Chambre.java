package fr.cesi.reservationdevoyage.demo;

import java.util.ArrayList;

import java.util.List;



public class Chambre {

	

	private int numero;

    private String type;

    private List<Service> services;



    public Chambre(int numero, String type) {

        this.numero = numero;

        this.type = type;

        this.services = new ArrayList<>();

    }



	public int getNumero() {

		return numero;

	}



	public void setNumero(int numero) {

		this.numero = numero;

	}



	public String getType() {

		return type;

	}



	public void setType(String type) {

		this.type = type;

	}

	

	public void choisirService(Service service) {

		services.add(service);

	}



}