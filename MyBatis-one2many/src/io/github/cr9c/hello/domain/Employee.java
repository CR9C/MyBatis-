package io.github.cr9c.hello.domain;

import lombok.Data;

@Data
public class Employee {
	private Long id;
	private String name;
	private Long deptId;//员工所在部门的ID
}
