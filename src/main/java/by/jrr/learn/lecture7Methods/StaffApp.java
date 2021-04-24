package by.jrr.learn.lecture7Methods;
import by.jrr.learn.lecture7Methods.service.StaffService;

import static by.jrr.learn.lecture7Methods.repository.StaffDatabase.*;


public class StaffApp {
    public static StaffService staffService = new StaffService();

    public static void main(String[] args) {

        staffService.create("Katya Bylavskaya", 10000.0);
        staffService.create("Alex Mackevich", 3000.0);
        staffService.create("Sasha Sashev", 3000.0);
        staffService.create("Roma Romov", 100.0);

        System.out.println(staffList);

        staffService.update(staffList.get(0), "katerina", 1000.0);
        System.out.println(staffList.get(0));
        var staff = staffService.findStaffByName("Alex Mackevich");
        System.out.println(staff);

        System.out.println(staffService.findAll());
        System.out.println(staffService.findAllStaffBySalary(3000.0));

        staffService.delete(staffList.get(2));

        System.out.println(staffService.findAll());

    }
}
