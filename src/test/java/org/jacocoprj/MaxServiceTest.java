package org.jacocoprj;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {

    MaxService service = new MaxService();

    @Test
    public void testFindfMax() {

        int a = 5;
        int b = 3;

        int exp = a;
        int act = service.findMax( a, b );

        Assertions.assertEquals( exp, act);

    }

    @Test
    public void testFindfMaxШаИ() {

        int a = 5;
        int b = 10;

        int exp = b;
        int act = service.findMax( a, b );

        Assertions.assertEquals( exp, act);

    }
}
