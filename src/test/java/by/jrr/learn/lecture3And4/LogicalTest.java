package by.jrr.learn.lecture3And4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicalTest {
//TODO:    &&, || Short circuiting "and" and "or". короткое логическое И and ИЛИ
//TODO:    &, |;  Non-Short circuiting "and" and "or"
//TODO:    ^ Xor
//TODO:    ! Negation
//TODO:    :?  Ternary

    @Test
    public void testInit() {
        boolean result = false;
        //То же самое, что и &, но если операнд,
        // находящийся слева от & является false,
        // данный оператор возвращает false без проверки второго операнда

        result = true && true;
        assertTrue(result);

        result = false && false;
        assertFalse(result);

        result = false && true;
        assertFalse(result);

        result = true && false;
        assertFalse(result);
    }
    @Test
    public void ternaryPlain() {

    }
}