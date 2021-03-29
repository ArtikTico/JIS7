package by.jrr.learn.lecture2;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DataStructureAndArraysTest {

    static Logger logger = LoggerFactory.getLogger(DataStructureAndArraysTest.class);

    @Test
    public void maxAndMin() {
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Short.SIZE = " + Short.SIZE);
        System.out.println("Short.BYTES = " + Short.BYTES);
    }


}