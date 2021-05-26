package com.formation.example;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Client customer= new Client ("Gaston");
        Client customer2 = new Client ("Toto");

        System.out.println("Je m'appelle " + customer.getNom());
        System.out.println("Je m'appelle " + customer2.getNom());

        customer.ajouterCompte(5);


        customer.comptes[0].depot(100);
        customer.comptes[0].depot(500);
        customer.comptes[0].retrait(50);
        customer.comptes[1].depot(500);

        customer.afficherSolde();

    }
}
