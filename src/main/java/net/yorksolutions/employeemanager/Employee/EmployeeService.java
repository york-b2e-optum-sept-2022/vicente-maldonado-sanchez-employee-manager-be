package net.yorksolutions.employeemanager.Employee;


import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Iterable<Employee> getEmployeeList() {
        return this.employeeRepo.findAll();
    }

    public void addEmployee(Employee employee) {
        this.employeeRepo.save(employee);
    }

    public void deleteEmployee(Integer id) {

        this.employeeRepo.deleteById(id);
    }
}
