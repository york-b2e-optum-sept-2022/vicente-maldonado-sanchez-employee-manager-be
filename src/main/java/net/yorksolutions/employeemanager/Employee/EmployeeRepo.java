package net.yorksolutions.employeemanager.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  EmployeeRepo extends CrudRepository<Employee, Integer> {
}
