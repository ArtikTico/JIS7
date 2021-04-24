package by.jrr.learn.lecture5Exceptions.exeptions.operationservicehandler;

public class DivisionDoubleByZero extends OperationServiceException {

    DivisionDoubleByZero(String message) {
        super(message);
    }

    DivisionDoubleByZero(String message, String errorCode) {
        super(message, errorCode);
    }
}
