package by.jrr.learn.lecture5Exceptions;

import by.jrr.learn.lecture5Exceptions.exeptions.operationservicehandler.OperationValidator;

public class OperationService {
    OperationValidator operationValidator = new OperationValidator();

    public double doubleDivision(double a, double b) {
        operationValidator.validateDivisionOnZeroValues(b);
        return a / b;
    }
}
