package com.mapper;

import java.util.List;

import com.po.Student;

public interface IStudentMapper {
 public int save(Student st);
 public int update(Student st);
 public int delById(Integer sid);
 public Student findById(Integer sid);
 public List<Student> findAll();
 public int findMaxRows();
 
}
