package com.onlineApplyCourses;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String user_name;
    private final String password;
    private List<Course> enrolledCourse;

    public User(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
        this.enrolledCourse=new ArrayList<>();
    }

    public void setEnrolledCourse(List<Course> enrolledCourse) {
        this.enrolledCourse = enrolledCourse;
    }
    public void enrolledCourse(Course course)
    {
        enrolledCourse.add(course);
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public List<Course> getEnrolledCourse() {
        return enrolledCourse;
    }
}
