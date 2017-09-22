package com.orilore.service;
import com.orilore.model.*;
import java.util.List;
public interface ITeacherBiz{
	public boolean addTeacher(Teacher teacher);
	public boolean removeTeacher(int id);
	public boolean modifyTeacher(Teacher teacher);
	public Teacher getTeacher(int id);
	public List<Teacher> findTeacher();
}