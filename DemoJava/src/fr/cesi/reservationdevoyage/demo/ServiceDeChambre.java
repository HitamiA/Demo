package fr.cesi.reservationdevoyage.demo;

public class ServiceDeChambre extends Service {

	

	private String description;

	

	

	public ServiceDeChambre(String nom, double prix, String description) {

		super(nom, prix);

		this.description = description;

		

	}

	@Override

	public void afficherDetails() {

		super.afficherDetails();

		System.out.println("Description : " + description);

	}

	

	



}