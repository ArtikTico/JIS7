package by.jrr.learn.lecture5Exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Exceptions {
    static Logger log = LoggerFactory.getLogger(Exceptions.class);

    public static final String SUCCESS = "SUCCESS";
    public static final String FAIL = "FAIL";
    String riskName;

    public void cathException() {
        if (riskName.equals(SUCCESS)) {
            log.info("Operation has been successfully");
        }
        else if (riskName.equals(FAIL)) {
            throw new IllegalArgumentException("Operation fail");
        }
    }

    public String riskOperation(String name) {
        if (Objects.isNull(name)) {
            throw new NullPointerException("Your name is null!");
        } else if (name.equals(FAIL)) {
            cathException();
        }
        log.info(name + " is");
        return name + "good job!";
    }

    public static void main(String[] args) {
        Exceptions exceptions = new Exceptions();
//        exceptions.riskOperation(exceptions.riskName);
        exceptions.riskName = FAIL;
        exceptions.riskOperation(exceptions.riskName);
    }
}
