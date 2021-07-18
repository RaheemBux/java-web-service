package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/student")
public class StudentController {
	
	
	public static List<StudentModel> students = new ArrayList<>();
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create")
	public StudentModel create(StudentModel studentModel){
		students.add(studentModel);
		return studentModel;
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/update")
	public StudentModel update(StudentModel studentModel){
		for(StudentModel sm : students){
			if(sm.getId().equals(studentModel.getId())){
				sm.setName(studentModel.getName());
				sm.setRollNum(studentModel.getRollNum());
			}
		}
		return studentModel;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAll")
	public List<StudentModel> getAll(){
		return students;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getById/{id}")
	public StudentModel getById(@PathParam("id") Integer id){
		for(StudentModel sm : students){
			if(sm.getId().equals(id)){
				return sm;
			}
		}
		return null;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/delete/{id}")
	public String delete(@PathParam("id") Integer id){
		for(StudentModel sm : students){
			if(sm.getId().equals(id)){
				students.remove(sm);
			}
		}
		return "Deleted Successfully";
	}

}
