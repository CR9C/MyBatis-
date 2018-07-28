package io.github.cr9c.hello.mapper;

import org.apache.ibatis.annotations.Param;

import io.github.cr9c.hello.domain.Student;

public interface StudentMapper {
	void save(Student s);

	void insertRelationWithTeacher(@Param("studentId") Long studentId, @Param("teacherId") Long teacherId);

	void delete(Long id);

	void deleteRelationWithTeacher(Long studentId);
	
	
	Student get(Long id);
}
