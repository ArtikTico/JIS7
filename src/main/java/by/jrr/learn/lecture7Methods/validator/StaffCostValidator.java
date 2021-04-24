package by.jrr.learn.lecture7Methods.validator;


import by.jrr.learn.lecture7Methods.exception.CalculateCostException;
import by.jrr.learn.lecture7Methods.exception.StaffSalaryException;
import by.jrr.learn.lecture7Methods.model.Staff;


public class StaffCostValidator {

    public void validateSalaryStaffPositive(Staff staff) {
        if (staff.getSalary().compareTo(0.0) < 0) {
            throw new StaffSalaryException("Salary staff cannot be less than zero");
        }
    }

    public void validateSalaryStaffPositive(Double salary) {
        if (salary.compareTo(0.0) < 0) {
            throw new StaffSalaryException("Salary staff cannot be less than zero");
        }
    }

    public void validateSalarySumAllStaff(Double sum) {
        if (sum.compareTo(0.0) == 0) {
            throw new CalculateCostException("Summ all salary staff cannot be zero");
        }
    }

}
