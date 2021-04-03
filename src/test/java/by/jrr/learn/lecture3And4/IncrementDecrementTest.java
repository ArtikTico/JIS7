package by.jrr.learn.lecture3And4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncrementDecrementTest {
    //TODO:    = , *= , /= , %= , += , -= , // bitwise <<= , >>= , >>>= , &= , ^= , and, |=
    // = Simple assignment
    // others - Compound assignment

    @Test
    public void compoundAssignment() {
        int i = 1;
        i = i + 1;
        i++;
        ++i;

        i = 5;
        assertEquals(10, i += i);
        i = 5;
        assertEquals(0, i -= i);
        i = 5;
        assertEquals(25, i *= i);
        i = 5;
        assertEquals(1, i /= i);
        i = 5;
        assertEquals(0, i %= i);
    }
    @Test
    public void differenceBetweenPreAndPost() {
        int y = 10, x = 10;

        int a = 13 - y++;
        System.out.println(a);
        System.out.println(y);

        int b = 13 - ++x;
        System.out.println(b);
        System.out.println(x);
    }

}