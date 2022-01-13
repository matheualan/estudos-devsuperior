package generics.springboot.generics.repositories;

import generics.springboot.generics.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
