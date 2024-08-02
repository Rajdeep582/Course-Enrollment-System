package com.onlineApplyCourses;

import java.util.ArrayList;
import java.util.List;

public class Course_Catalog {
    private List<Course> courseList=new ArrayList<>();

    Course_Catalog(){
        this.courseList=new ArrayList<>();
    }
    public void addCourse(Course course)
    {
        courseList.add(course);
    }
    public void removeCourse(int courseId)
    {
        courseList.removeIf(course -> course.getCourseId()==courseId);
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
    public Course getCourseById(int courseId)
    {
        for(Course course: courseList)
        {
            if(course.getCourseId()==courseId)
            {
                return course;
            }
        }
        return null;
    }
    public Course searchCourseByName(String courseName)
    {
        for(Course course:courseList)
        {
            if(course.getCourse_name().equalsIgnoreCase(courseName))
            {
                return course;
            }
        }
        return null;
    }
}
