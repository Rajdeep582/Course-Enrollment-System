package com.onlineApplyCourses;

public class PurchaseService {
    private final Course_Catalog courseCatalog;
    private final AuthenticationService authenticationService;

    public PurchaseService(Course_Catalog courseCatalog, AuthenticationService authenticationService) {
        this.courseCatalog = courseCatalog;
        this.authenticationService = authenticationService;
    }

    public boolean purchase(User user,int courseID)
    {
        Course course=courseCatalog.getCourseById(courseID);
        if(course==null)
        {
            return false;
        }
        user.enrolledCourse(course);
        return true;
    }

}
