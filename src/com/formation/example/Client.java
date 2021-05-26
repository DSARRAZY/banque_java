package com.formation.example;

public class Client {

    public Compte[] comptes = new Compte[100];
    private int nbComptes = 0;
    private String nom;
    private int numéroCompteClient;

    // créer un nouveau client
    public Client (String nouveauClient) {
        nom = nouveauClient;
    }

    // ajouter un compte
    public void ajouterCompte(int n) {
        for (int i = 0; i < n; i++) {
            comptes[nbComptes] = new Compte();
            nbComptes ++;
            comptes[i].depot(50);
        }

    }

    // pour obtenir le nom du client
    public String getNom() { return nom; }

    // pour obtenir le solde total du client
    public double soldeTotal() {
        double somme = 0;
        for (int i = 0; i < nbComptes; i++)
            somme += comptes[i].getSolde();
        return somme;
    }

    // affiche solde du client
    public void afficherSolde() {
        System.out.println("Le solde de " + this.nom + " est de " + soldeTotal());
    }


}
