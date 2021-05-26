package com.formation.example;

public class BanqueInteractive {

    private int nbClients = 0;
    private Client[] client = new Client[100];

    // créer un nouveau client
    public void ajouterClient(String nom) {
        nbClients++;
        client[nbClients] = new Client(nom);
    }



}
