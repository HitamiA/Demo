package fr.cesi.reservationdevoyage.demo;

public class ServicePremium extends Service{

	private String servicePremium;

	

	

	public ServicePremium(String nom, double prix, String servicePremium) {

		super(nom, prix);

		this.servicePremium = servicePremium;

	}

	@Override

	public void afficherDetails() {

		super.afficherDetails();

		System.out.println(" Service Premium : " + servicePremium);

	}

	

}