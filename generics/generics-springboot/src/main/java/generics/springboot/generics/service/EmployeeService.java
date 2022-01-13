package generics.springboot.generics.service;

import generics.springboot.generics.dto.EmployeeDTO;
import generics.springboot.generics.model.Employee;
import generics.springboot.generics.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements GenericService<Employee, EmployeeDTO, Long> {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public JpaRepository<Employee, Long> getRepository() {
        return employeeRepository;
    }

//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    public EmployeeDTO findById(Long id) {
//        Optional<Employee> result = employeeRepository.findById(id);
//        return new EmployeeDTO(result.get());
//    }
//
//    public List<EmployeeDTO> findAll() {
//        List<Employee> list = employeeRepository.findAll();
//        return list.stream()
//                .map(dto -> new EmployeeDTO(dto))
//                .collect(Collectors.toList());
//    }

}
