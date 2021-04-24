package by.jrr.learn.lecture5Exceptions.exeptions.operationservicehandler;

public class OperationValidator {

    public void validateDivisionOnZeroValues(Double number) {
        if (number.compareTo(0.0) == 0) {
            throw new DivisionDoubleByZero("Cannot be zero",ErrorCodes.DOUBLE_VALUE_CANNOT_BE_ZERO);
        }
    }
}
