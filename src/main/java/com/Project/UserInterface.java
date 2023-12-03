package com.Project;

import java.util.ArrayList;
import java.util.List;

import com.Project.Models.Employee;
import com.core.Accessor.JsonFileStrategy;
import com.core.Service.Service;

/**
 * UserInterface
 */
public class UserInterface {

    public static void runApp() {
        List<Employee> list = new ArrayList<>();
        Long i = 0l;
        list.add(new Employee(++i, "bambang"));
        list.add(new Employee(++i, "mimin"));
        list.add(new Employee(++i, "mumun"));
        list.add(new Employee(++i, "maman"));
        list.add(new Employee(++i, "momon"));

        Service service = new Service();
        service.syncData(Employee.class, list, new JsonFileStrategy<Employee>());
    }
}
