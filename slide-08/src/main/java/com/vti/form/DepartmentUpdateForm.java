package com.vti.form;

import com.vti.entity.Department;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentUpdateForm {
    private Integer id;
    private String name;
    private Integer totalmembers;
    private Department.Type type;
}
