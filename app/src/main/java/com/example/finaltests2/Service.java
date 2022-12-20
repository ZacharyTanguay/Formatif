package com.example.finaltests2;

public class Service {

    /**
     * Renvoie le nombre de poignées de main pour nombrePersonnes.
     * Il faut compter assez de poignées de main pour que tout le monde
     * se serre la main.
     * On ne devrait pas avoir de poignées de main en double.
     * @param nombrePersonnes
     * @return
     */
    public int nombrePoigneesDeMainPour(int nombrePersonnes) {
        if (nombrePersonnes == 0) return 0;
        if (nombrePersonnes == 1) return 0;
        if (nombrePersonnes == 2) return 1;
        return nombrePoigneesDeMainPour(nombrePersonnes-1) + nombrePersonnes - 1;
    }

}
