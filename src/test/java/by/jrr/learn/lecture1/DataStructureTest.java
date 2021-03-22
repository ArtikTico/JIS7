package by.jrr.learn.lecture1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataStructureTest {
    DataStructure dataStructure;
    @BeforeEach
    public void init() {
        dataStructure = new DataStructure();
    }

    @Test
    void result() {
        Assertions.assertEquals(31, dataStructure.result(),"good");
    }


    @AfterAll
    public static void done () {
        System.out.println("End");
    }
}