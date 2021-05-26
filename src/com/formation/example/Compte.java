package com.formation.example;

import static java.lang.System.out;

public class Compte {

    // Attributs
    private int numeroCompte = 0;
    private double solde = 0;

    // Méthodes

    // Pour faire un dépôt
    public void depot(double valeur) {
        solde += valeur;
    }

    // Pour faire un retrait
    public void retrait(double valeur) {
        solde -= valeur;
    }

    // pour obtenir valeur du solde
    public double getSolde() {
        return solde;
    }

    // pour modifier le solde
    public void setSolde(double solde) {
        this.solde = solde;
    }

    // pour faire virement entre 2 comptes
    public void virer(double valeur, Compte destinataire ) {
        retrait(valeur);
        destinataire.depot(valeur);
    }

    // afficher solde


}
