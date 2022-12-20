package com.example.finaltests2;

import org.junit.Test;

public class TestService {


    @Test
    public void testPasVraimentUnTest() {
        // exemple d'utilisation du code, .
        Service service = new Service();
        int poignees = service.nombrePoigneesDeMainPour(350);
        System.out.println(poignees);
        // TODO pour qu'un test soit valide, il faut qu'il puisse échouer
    }
}
