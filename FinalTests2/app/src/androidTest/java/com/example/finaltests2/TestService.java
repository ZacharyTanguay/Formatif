package com.example.finaltests2;

import org.junit.Assert;
import org.junit.Test;

import exceptions.MauvaisNombre;

public class TestService {


    @Test
    public void testPasVraimentUnTest() {
        // exemple d'utilisation du code, .
        Service service = new Service();
        int poignees = service.nombrePoigneesDeMainPour(350);
        System.out.println(poignees);
        // TODO pour qu'un test soit valide, il faut qu'il puisse échouer

    }

    @Test
    public void poignesDeMain_isCorrect() {
        Service service = new Service();

        int zeroPoignees = service.nombrePoigneesDeMainPour(0);
        System.out.println(zeroPoignees);
        Assert.assertEquals(0, zeroPoignees);

        int unePoignees = service.nombrePoigneesDeMainPour(2);
        System.out.println(unePoignees);
        Assert.assertEquals(1, unePoignees);

        int sixPoignees = service.nombrePoigneesDeMainPour( 4);
        System.out.println(sixPoignees);
        Assert.assertEquals(6, sixPoignees);
    }

    @Test
    public void poignesDeMain_isIncorrect() {
        Service service = new Service();

        int zeroPoignees = service.nombrePoigneesDeMainPour(0);
        System.out.println(zeroPoignees);
        Assert.assertNotEquals(1, zeroPoignees);

        int unePoignees = service.nombrePoigneesDeMainPour(2);
        System.out.println(unePoignees);
        Assert.assertNotEquals(2, unePoignees);

        int sixPoignees = service.nombrePoigneesDeMainPour( 4);
        System.out.println(sixPoignees);
        Assert.assertNotEquals(3, sixPoignees);
    }

    @Test(expected = MauvaisNombre.class)
    public void personnesNegatif() throws MauvaisNombre{
        try {
            Service service = new Service();
            int nombre = -1;
            service.nombrePoigneesDeMainPour(nombre);

            Assert.fail("Le nombre de personne ne peuut pas être négatif ");
        } catch (Exception e) {
            System.out.println("exception");
        }
    }
}

