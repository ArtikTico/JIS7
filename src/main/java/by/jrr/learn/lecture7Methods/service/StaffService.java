package by.jrr.learn.lecture7Methods.service;

import by.jrr.learn.lecture7Methods.model.Staff;
import by.jrr.learn.lecture7Methods.repository.StaffRepository;
import by.jrr.learn.lecture7Methods.util.CostCalculator;
import by.jrr.learn.lecture7Methods.validator.StaffCostValidator;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static by.jrr.learn.lecture7Methods.repository.StaffDatabase.staffList;

public class StaffService implements CostCalculator, StaffRepository {
    private StaffCostValidator staffCostValidator = new StaffCostValidator();

    @Override
    public Double calculateAllSalary(List<Staff> staffList) {
        Double allValuesStaff = 0.0;
        for (Staff staff:staffList
             ) {
            staffCostValidator.validateSalaryStaffPositive(staff);
            staffCostValidator.validateSalaryStaffPositive(staff.getSalary());
            allValuesStaff += staff.getSalary();
        }
        staffCostValidator.validateSalarySumAllStaff(allValuesStaff);
        return allValuesStaff;
    }

    @Override
    public void create(String name, Double salary) {
        Staff staff = new Staff();
        staff.setName(name);
        staffCostValidator.validateSalaryStaffPositive(salary);
        staff.setSalary(salary);
        staffList.add(staff);
        System.out.println("Staff created successfully");
    }

    @Override
    public void update(Staff staff, String name, Double salary) {
        staff.setName(name);
        staffCostValidator.validateSalaryStaffPositive(salary);
        staff.setSalary(salary);
        System.out.println("Staff successfully updated");
    }

    @Override
    public Staff findStaffByName(String name) {
        for (Staff staff : staffList
                ) {
            if (staff.getName().equals(name)) {
                return staff;
            }
        }
        return null;
    }

    @Override
    public List<Staff> findAll() {
        return staffList;
    }

    @Override
    public List<Staff> findAllStaffBySalary(Double salary) {
        return Collections.EMPTY_LIST;
    }

    @Override
    public void delete(Staff staff) {
        staffList.remove(staff);
    }
}
