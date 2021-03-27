package by.jrr.learn.lecture2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WrapperClasses {

    static Logger log = LoggerFactory.getLogger(WrapperClasses.class);

    //TODO: ЦЕЛОЧИСЛЕННЫЕ классы обертки
    static Byte byteA = 10;
    static Short shortA = 20;
    static Integer intA = 30;
    static Long longA = 40L;

    static Integer intNew = new Integer(30);

    //TODO: Вещественные числа или числа с плавающей точкой
    static Float floatA = 45.0f;
    static Double doubleA = 50.0;

    //TODO: Логический тип
    static Boolean isActive = true;
    static Boolean isNew = new Boolean(true);
    static Boolean isNewConst = Boolean.TRUE;

    //TODO: Символьный тип
    static Character character = 'A';


























    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        long maxValueL = Long.MAX_VALUE;
//        log.info(maxValueL.toString()); //TODO: у примитивов нету метода toString потому что не обьект а примитив!

        Integer a = new Integer(0);
        Integer b = new Integer(0);

        b = a;
        a = 1;
        System.out.println(b);
    }
}
