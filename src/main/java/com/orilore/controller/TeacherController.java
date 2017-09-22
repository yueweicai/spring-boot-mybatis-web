package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.model.Teacher;
import com.orilore.service.ITeacherBiz;

@RestController
public class TeacherController {
	@Resource
	private ITeacherBiz service;
	@RequestMapping("/teacher/query")
	public List<Teacher> query(){
		return service.findTeacher();
	}
}
