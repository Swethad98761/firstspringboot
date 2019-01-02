package springboot.employees;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> det= Arrays.asList(
                    new Employee(101,"John",917772348),
                    new Employee(102,"Henry",817568972),
                    new Employee(103,"Charles",555627182),
                    new Employee(104,"Alex",817181900),
                    new Employee(105,"Rishab",72829100));

    public List<Employee> getall() {
        return det;
    }
    public Employee getdetailsofid(int id)
    {
        return det.stream().filter(i->i.getId()==id).findFirst().get();
    }

}
