package by.jrr.learn.lecture3And4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


class OperatorsTest {

    static Logger log = LoggerFactory.getLogger(OperatorsTest.class);
    static int age = -1;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    @Test
    public void mathOperators() {
        //TODO: +, -, *, %
    }

    @BeforeEach
    public void init() {
        b = 3;
        s = 3;
        i = 3;
        l = 3;
        f = 3F;
        d = 3;
    }

    @Test
    public void devisionByZero() {
        double one = 0.0;
        double two = 0.0;
        double result = one / two;
        System.out.println(result);
    }

    @Test
    public void additionsOfDifferentTypesReturnsInt() {
        int result = b + s;
        assertEquals(result, 6);
    }

    @Test
    public void divCastingInt() {
        int a = 5;
        int b = 2;
        int divResult = a / b;
        assertEquals(2, divResult);
        System.out.println("divResult = " + divResult);
    }

    @Test
    public void divDouble() {
        d = 5;
        int b = 3;
        double divResult = d / b;
        assertNotEquals(2, divResult);
        BigDecimal bigDecimal;
        System.out.println("divResult = " + divResult);
    }

    @Test
    public void divCastingDoubleForce() {
        int a = 5;
        int b = 2;
        double divResult = (double) a / b;
        assertEquals(2.5, divResult, 1);// a cast to double, => b cast to double, result 2.5
        System.out.println("divResult1= " + divResult);
    }

    @Test
    public void divDoubleWith() {
        int a = 5;
        int b = 2;
        double divResult = a % b;
        assertEquals(1, divResult, 1);

        d = 5;
        f = 2;
        double divResult2 =  d % f;
        assertNotEquals(2.5, divResult, 1);
        System.out.println("divResult1= " + divResult);
        System.out.println("divResult2= " + divResult2);
    }
}