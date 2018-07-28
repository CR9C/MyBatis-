package io.github.cr9c.hello;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import io.github.cr9c.hello.domain.Department;
import io.github.cr9c.hello.mapper.DepartmentMapper;
import io.github.cr9c.util.MyBatisUtil;

public class App {

	
	//查询10号部门的信息和包含的员工信息
	@Test
	void testGet() throws Exception {
		SqlSession session = MyBatisUtil.getSession();
		DepartmentMapper departmentMapper = session.getMapper(DepartmentMapper.class);
		Department d = departmentMapper.get(10L);
		System.out.println(d.getClass());
		System.out.println(d.getEmps());
	}
}
