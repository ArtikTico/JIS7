package by.jrr.learn.lecture5Exceptions.exeptions.operationservicehandler;

public class OperationServiceException extends RuntimeException {

    public String errorCode;
    OperationServiceException(String message) {
        super(message);
    }
    OperationServiceException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
