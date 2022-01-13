package generics.springboot.generics.model;

import generics.springboot.generics.dto.EmployeeDTO;
import generics.springboot.generics.util.Convertible;

import javax.persistence.*;

@Entity
@Table(name = "tb_employee")
public class Employee implements Convertible<EmployeeDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;

    public Employee() {
    }

    public Employee(Long id, String name) {
        Id = id;
        this.name = name;
    }

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public EmployeeDTO convert() {
        return new EmployeeDTO(this);
    }

}
