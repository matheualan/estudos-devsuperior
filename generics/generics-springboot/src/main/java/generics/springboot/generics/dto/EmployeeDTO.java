package generics.springboot.generics.dto;

import generics.springboot.generics.model.Employee;

public class EmployeeDTO {

    private Long id;
    private String name;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public EmployeeDTO(Employee entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
