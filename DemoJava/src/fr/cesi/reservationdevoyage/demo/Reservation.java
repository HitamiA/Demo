package fr.cesi.reservationdevoyage.demo;

import java.util.ArrayList;

import java.util.List;



public class Reservation {



    private Client client; // Association avec Client

    private Hotel hotel;   // Association avec Hotel

    private String dates;  // Dates de réservation

    private List<Service> servicesReservations;



    // Constructeur

    

    public Reservation(Client client, Hotel hotel, String dates) {

        this.client = client;

        this.hotel = hotel;

        this.dates = dates;

        this.servicesReservations = new ArrayList<>(); 

    }

    

    

 // Ajoute cette réservation à la liste du client



    // Méthodes pour afficher les informations de réservation

    

    public List<Service> getServicesReservations() {

		return servicesReservations;

	}





	public void setServicesReservations(List<Service> servicesReservations) {

		this.servicesReservations = servicesReservations;

	}





	public String afficherInformations() {

        String info =  "Réservation de " + client.afficherInformations() +

               " à l'hôtel " + hotel.name +

               " situé à " + hotel.location +

               " pour les dates suivantes : " + dates + ".";

        

        if(!servicesReservations.isEmpty()) {

        	info += "\nServices Reservés : ";

        	for(Service service : servicesReservations) {

        		info += service.getNom() + "(Prix :" + service.getPrix() + "euros";

        	}

        }else {

        	info += "\nAucun service supplémentaire réservé. ";

        }

		return info;

    }

    

    public void ajouterService(Service service) {

    	servicesReservations.add(service);

    }









}