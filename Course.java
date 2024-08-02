package com.onlineApplyCourses;

public class Course {
    private final int courseId;
    private final String course_name;
    private final double price;
    private final String course_description;
    private final int course_duration;

    public Course(int courseId, String course_name,double price , String course_description, int course_duration) {
        this.courseId=courseId;
        this.price = price;
        this.course_name = course_name;
        this.course_description = course_description;
        this.course_duration = course_duration;
    }

    public String getCourse_name() {
        return course_name;
    }

    public double getPrice() {
        return price;
    }

    public String getCourse_description() {
        return course_description;
    }

    public int getCourse_duration() {
        return course_duration;
    }

    public int getCourseId() {
        return courseId;
    }
}
