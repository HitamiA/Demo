package fr.cesi.reservationdevoyage.demo;

public class Main {



	public static void main(String[] args) {

		// Création d'un client

        Client client = new Client("Dupont", "Jean", "jean.dupont@example.com", "0123456789");



        // Création d'un hôtel

        Hotel hotel = new Hotel("Etoile du Matin", "Paris", 5);



        // Composition : Initialisation des chambres pour l'hôtel

        hotel.initialiserChambres(10); // par exemple, crée 10 chambres

 



        // Agrégation : Création d'une réservation pour le client

        Service wifi = new Service("Wifi", 5.5);

        Service petitDejeuner = new Service("Petit Dejeuner", 12.0);

        Reservation reservation = new Reservation(client, hotel, "2023-08-15 au 2023-08-20");

     



        reservation.ajouterService(wifi);

        reservation.ajouterService(petitDejeuner);

        

        System.out.println("Réservation client : ");

        System.out.println(reservation.afficherInformations());

        

        Service serviceChambre = new ServiceDeChambre("Nettoyage de la chambre", 20.0, "Nettoyage quotidien de la chambre");

        

        serviceChambre.afficherDetails();

       

        Service servicePremium = new ServicePremium("Massage", 30.0, "Avec huile essentielle");

        servicePremium.afficherDetails();

        

    }

}

