package by.jrr.learn.lecture7Methods.repository;

import by.jrr.learn.lecture7Methods.model.Staff;

import java.util.List;

public interface StaffRepository {

     void create(String name, Double salary);

    void update(Staff staff, String name, Double salary);

    Staff findStaffByName(String name);

    List<Staff> findAll();

    List<Staff> findAllStaffBySalary(Double salary);

    void delete(Staff staff);
}
