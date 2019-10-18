package fr.space.adopteVaisseau.ws;


import fr.space.adopteVaisseau.entity.Employee;
import fr.space.adopteVaisseau.manager.EmployeeManager.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class WsEmployee {

    @Autowired
    private EmployeeService employeeService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("employee")
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("find-employee/{id}")
    public Employee getEmployees(@PathVariable("id") Long id) {
        logger.info(id.toString());
        return employeeService.findById(id).get();
    }

    @PostMapping("add-employee")
    public void addEmployee(@Valid @RequestBody Employee employee){employeeService.create(employee);}

    @DeleteMapping("delete-employee/{id}")
    public void deleteEmployee(@PathVariable Long id){employeeService.deleteById(id);}

    @PutMapping("update-employee")
    public void updateEmployee(@Valid @RequestBody Employee employee){employeeService.create(employee);}
}
