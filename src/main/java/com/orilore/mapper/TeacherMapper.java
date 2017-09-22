package com.orilore.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.orilore.model.*;

@Mapper
public interface TeacherMapper{
	public void insert(Teacher bean);
	public Teacher selectOne(int id);
	public void delete(int id);
	public List<Teacher> select();
	public void update(Teacher bean);
}