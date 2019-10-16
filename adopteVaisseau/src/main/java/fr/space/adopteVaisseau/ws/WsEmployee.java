package fr.space.adopteVaisseau.ws;


import fr.space.adopteVaisseau.entity.Employee;
import fr.space.adopteVaisseau.manager.EmployeeManager.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/api")
public class WsEmployee {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("employee")
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }

    @PostMapping
    public void addEmployee(@Valid @RequestBody Employee employee){employeeService.create(employee);}

    @DeleteMapping
    public void deleteEmployee(@Valid @RequestBody Employee employee){employeeService.delete(employee);}

    @PutMapping
    public void updateEmployee(){}
}
