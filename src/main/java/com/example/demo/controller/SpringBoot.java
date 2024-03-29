//201802104058潘英祖
package com.example.demo.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.Service.*;
import com.example.demo.domain.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class SpringBoot {
    @RequestMapping(value = "/degree.ctl" , method = RequestMethod.GET)
    public Object getDegree(
            @RequestParam(value = "id" ,required = false)String id
            ) throws Exception{
            if(id==null){
                return DegreeService.getInstance().findAll();
            }else {
                return DegreeService.getInstance().find(Integer.parseInt(id));
            }
    }

    @RequestMapping(value = "/degree.ctl" , method = RequestMethod.PUT)
    public Object updateDegree(
            @RequestBody String degreeToUpdate
    ) throws Exception{
        Degree degreeToUpdateRequest = JSON.parseObject(degreeToUpdate, Degree.class);
        JSONObject message = new JSONObject();
        if(DegreeService.getInstance().update(degreeToUpdateRequest)){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }

    @RequestMapping(value = "/degree.ctl" , method = RequestMethod.POST)
    public Object addDegree(
            @RequestBody String degreeToAdd
    ) throws Exception{
        Degree degreeToAddRequest = JSON.parseObject(degreeToAdd, Degree.class);
        JSONObject message = new JSONObject();
        if(DegreeService.getInstance().add(degreeToAddRequest)){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }

    @RequestMapping(value = "/degree.ctl" , method = RequestMethod.DELETE)
    public Object deleteDegree(
            @RequestParam(value = "id")String id
    ) throws Exception{
        JSONObject message = new JSONObject();
        if(DegreeService.getInstance().delete(Integer.parseInt(id))){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }
    @RequestMapping(value = "/profTitle.ctl" , method = RequestMethod.GET)
    public Object getProfTitle(
            @RequestParam(value = "id" ,required = false)String id
    ) throws Exception{
        if(id==null){
            return ProfTitleService.getInstance().findAll();
        }else {
            return ProfTitleService.getInstance().find(Integer.parseInt(id));
        }
    }

    @RequestMapping(value = "/profTitle.ctl" , method = RequestMethod.PUT)
    public Object updateProfTitle(
            @RequestBody String profTitleToUpdate
    ) throws Exception{
        ProfTitle profTitleToUpdateRequest = JSON.parseObject(profTitleToUpdate, ProfTitle.class);
        JSONObject message = new JSONObject();
        if(ProfTitleService.getInstance().update(profTitleToUpdateRequest)){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }

    @RequestMapping(value = "/profTitle.ctl" , method = RequestMethod.POST)
    public Object addProfTitle(
            @RequestBody String profTitleToAdd
    ) throws Exception{
        ProfTitle profTitleToAddRequest = JSON.parseObject(profTitleToAdd, ProfTitle.class);
        JSONObject message = new JSONObject();
        if(ProfTitleService.getInstance().add(profTitleToAddRequest)){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }

    @RequestMapping(value = "/profTitle.ctl" , method = RequestMethod.DELETE)
    public Object deleteProfTitle(
            @RequestParam(value = "id")String id
    ) throws Exception{
        JSONObject message = new JSONObject();
        if(ProfTitleService.getInstance().delete(Integer.parseInt(id))){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }
    @RequestMapping(value = "/school.ctl" , method = RequestMethod.GET)
    public Object getSchool(
            @RequestParam(value = "id" ,required = false)String id
    ) throws Exception{
        if(id==null){
            return SchoolService.getInstance().findAll();
        }else {
            return SchoolService.getInstance().find(Integer.parseInt(id));
        }
    }

    @RequestMapping(value = "/school.ctl" , method = RequestMethod.PUT)
    public Object updateSchool(
            @RequestBody String schoolToUpdate
    ) throws Exception{
        School schoolToUpdateRequest = JSON.parseObject(schoolToUpdate, School.class);
        JSONObject message = new JSONObject();
        if(SchoolService.getInstance().update(schoolToUpdateRequest)){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }

    @RequestMapping(value = "/school.ctl" , method = RequestMethod.POST)
    public Object addSchool(
            @RequestBody String schoolToAdd
    ) throws Exception{
        School schoolToAddRequest = JSON.parseObject(schoolToAdd, School.class);
        JSONObject message = new JSONObject();
        if(SchoolService.getInstance().add(schoolToAddRequest)){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }

    @RequestMapping(value = "/school.ctl" , method = RequestMethod.DELETE)
    public Object deleteSchool(
            @RequestParam(value = "id")String id
    ) throws Exception{
        JSONObject message = new JSONObject();
        if(SchoolService.getInstance().delete(Integer.parseInt(id))){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }
    @RequestMapping(value = "/department.ctl" , method = RequestMethod.GET)
    public Object getDepartment(
            @RequestParam(value = "id" ,required = false)String id
    ) throws Exception{
        if(id==null){
            return DepartmentService.getInstance().findAll();
        }else {
            return DepartmentService.getInstance().find(Integer.parseInt(id));
        }
    }

    @RequestMapping(value = "/department.ctl" , method = RequestMethod.PUT)
    public Object updateDepartment(
            @RequestBody String departmentToUpdate
    ) throws Exception{
        Department departmentToUpdateRequest = JSON.parseObject(departmentToUpdate, Department.class);
        JSONObject message = new JSONObject();
        if(DepartmentService.getInstance().update(departmentToUpdateRequest)){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }

    @RequestMapping(value = "/department.ctl" , method = RequestMethod.POST)
    public Object addDepartment(
            @RequestBody String departmentToAdd
    ) throws Exception{
        Department departmentToAddRequest = JSON.parseObject(departmentToAdd, Department.class);
        JSONObject message = new JSONObject();
        if(DepartmentService.getInstance().add(departmentToAddRequest)){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }

    @RequestMapping(value = "/department.ctl" , method = RequestMethod.DELETE)
    public Object deleteDepartment(
            @RequestParam(value = "id")String id
    ) throws Exception{
        JSONObject message = new JSONObject();
        if(DepartmentService.getInstance().delete(Integer.parseInt(id))){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }
    @RequestMapping(value = "/teacher.ctl" , method = RequestMethod.GET)
    public Object getTeacher(
            @RequestParam(value = "id" ,required = false)String id
    ) throws Exception{
        if(id==null){
            return TeacherService.getInstance().findAll();
        }else {
            return TeacherService.getInstance().find(Integer.parseInt(id));
        }
    }

    @RequestMapping(value = "/teacher.ctl" , method = RequestMethod.PUT)
    public Object updateTeacher(
            @RequestBody String teacherToUpdate
    ) throws Exception{
        Teacher teacherToUpdateRequest = JSON.parseObject(teacherToUpdate, Teacher.class);
        JSONObject message = new JSONObject();
        if(TeacherService.getInstance().update(teacherToUpdateRequest)){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }

    @RequestMapping(value = "/teacher.ctl" , method = RequestMethod.POST)
    public Object addTeacher(
            @RequestBody String teacherToAdd
    ) throws Exception{
        Teacher teacherToAddRequest = JSON.parseObject(teacherToAdd, Teacher.class);
        JSONObject message = new JSONObject();
        if(TeacherService.getInstance().add(teacherToAddRequest)){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }

    @RequestMapping(value = "/teacher.ctl" , method = RequestMethod.DELETE)
    public Object deleteTeacher(
            @RequestParam(value = "id")String id
    ) throws Exception{
        JSONObject message = new JSONObject();
        if(TeacherService.getInstance().delete(Integer.parseInt(id))){
            message.put("message","OK");
            return message;
        }else {
            message.put("message","The database has not changed");
            return message;
        }
    }
    @RequestMapping(value = "/login.ctl" , method = RequestMethod.POST)
    public Object login(
            HttpServletRequest request, @RequestParam(value = "username" ,required = false)String username, @RequestParam(value = "password" ,required = false)String password
    ) throws Exception{
        JSONObject message = new JSONObject();
        User loggedUser = UserService.getInstance().login(username,password);
        if (loggedUser != null){
            message.put("message","logged in successfully");
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(10 * 60);
            session.setAttribute("currentUser",loggedUser);
            return message;
        } else{
            message.put("message","logged in failly");
            return message;
        }
    }
    @RequestMapping(value = "/logout.ctl" , method = RequestMethod.GET)
    public Object logout(
            HttpServletRequest request
    ) throws Exception{
        HttpSession session = request.getSession();
        JSONObject message = new JSONObject();
        session.invalidate();
        message.put("message","log out successfully!");
        return message;
    }
}
