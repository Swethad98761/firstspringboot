package springboot.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService empl;
    @RequestMapping("/getAllEmployees")
    public List<Employee> details(){
        return empl.getall();}
    @RequestMapping("/getEmployee/{id}")
    public Employee get(@PathVariable int id)
        {
            return empl.getdetailsofid(id);
        }

}
