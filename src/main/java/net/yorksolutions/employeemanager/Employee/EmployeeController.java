package net.yorksolutions.employeemanager.Employee;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/employee")
public class EmployeeController {

    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    Iterable<Employee> getEmployeeList() {
       return this.employeeService.getEmployeeList();
    }

    @PostMapping
    void addEmployee(@RequestBody Employee employee) {
        this.employeeService.addEmployee(employee);
    }

    @DeleteMapping("/{id}")
    void deleteEmployee(@PathVariable Integer id) {
        this.employeeService.deleteEmployee(id);
    }





}
