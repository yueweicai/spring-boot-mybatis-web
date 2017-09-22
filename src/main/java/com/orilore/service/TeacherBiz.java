package com.orilore.service;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service
public class TeacherBiz implements ITeacherBiz{
	@Resource
	private TeacherMapper mapper;
	@Override
	public boolean addTeacher(Teacher bean) {
		try{
			mapper.insert(bean);
			return true;
		}catch(Exception ex){
			return false;
		}
	}
	@Override
	public boolean removeTeacher(int id) {
		try{
			mapper.delete(id);
			return true;
		}catch(Exception ex){
			return false;
		}
	}
	@Override
	public boolean modifyTeacher(Teacher bean) {
		try{
			mapper.update(bean);
			return true;
		}catch(Exception ex){
			return false;
		}
	}
	@Override
	public Teacher getTeacher(int id) {
		return mapper.selectOne(id);
	}
	@Override
	public List<Teacher> findTeacher() {
		return mapper.select();
	}
}
