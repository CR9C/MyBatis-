package io.github.cr9c.hello.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
	private Long id;
	private String name;
	private Department dept;//员工所在部门对象
	
	//toString不要写dept,因为有延迟加载看不出打印效果
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
