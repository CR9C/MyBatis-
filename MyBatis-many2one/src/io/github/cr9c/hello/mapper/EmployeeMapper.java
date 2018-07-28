package io.github.cr9c.hello.mapper;

import java.util.List;

import io.github.cr9c.hello.domain.Employee;

public interface EmployeeMapper {
	void save(Employee e);

	Employee get(Long id);

	List<Employee> listAll();
}
