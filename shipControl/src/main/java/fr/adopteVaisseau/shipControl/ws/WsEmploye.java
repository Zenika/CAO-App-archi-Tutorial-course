package fr.adopteVaisseau.shipControl.ws;

import fr.adopteVaisseau.shipControl.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.List;

@RestController()
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class WsEmploye {

    private final String urlEmployee = "http://localhost:8080/api/";
    private RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @GetMapping("employee")
    public List<EmployeeDto> getEmployee(){
        return (List<EmployeeDto>) getRestTemplate().getForObject(urlEmployee.concat("employee"), Collection.class);
    }

    @PostMapping("add-employee")
    public void addEmployee(@RequestBody EmployeeDto employee){
        getRestTemplate().postForEntity(urlEmployee.concat("add-employee"),employee,EmployeeDto.class);
    }


}
