package by.jrr.learn.lecture7Methods.util;

import by.jrr.learn.lecture7Methods.model.Staff;

import java.util.List;

public interface CostCalculator {

    Double calculateAllSalary(List<Staff> staffList);
}
