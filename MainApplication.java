package com.onlineApplyCourses;

import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Course_Catalog courseCatalog = new Course_Catalog();
        AuthenticationService authenticationService = new AuthenticationService();
        PurchaseService purchaseService = new PurchaseService(courseCatalog, authenticationService);
        courseCatalog.addCourse(new Course(1, "Java Programming", 3800.0, "Comprehensive guide to Java programming.", 40));
        courseCatalog.addCourse(new Course(2, "Advanced Java", 3800.0, "In-depth exploration of advanced Java concepts.", 50));
        courseCatalog.addCourse(new Course(3, "Database Management Systems", 3800.0, "Introduction to database design and management.", 35));
        courseCatalog.addCourse(new Course(4, "Web Technologies", 3800.0, "Learn HTML, CSS, and JavaScript for web development.", 30));
        courseCatalog.addCourse(new Course(5, "Python Programming", 3800.0, "Introduction to Python programming language.", 25));

        Scanner sc = new Scanner(System.in);
        User currentUser = null;
        try {
            while (true) {
                System.out.println("\nWelcome to the Online Course System");
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Enter user name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter your password");
                        String password = sc.nextLine();
                        authenticationService = new AuthenticationService();
                        boolean registered = authenticationService.registerUser(name, password);
                        if (registered) {
                            System.out.println("Registration Successful");
                        } else {
                            System.out.println("Registration Failed");
                        }
                        break;

                    case 2:
                        System.out.println("Enter user name: ");
                        name = sc.nextLine();
                        System.out.println("Enter your password");
                        password = sc.nextLine();
                        currentUser = authenticationService.loginUser(name, password);
                        if (currentUser != null) {
                            System.out.println("Log in successful.");
                            try {
                                while (true) {
                                    System.out.println("\n1. Show Courses");
                                    System.out.println("2. Purchase Course");
                                    System.out.println("3. Logout");
                                    System.out.print("Choose an option: ");
                                    int option = sc.nextInt();
                                    sc.nextLine();
                                    switch (option) {
                                        case 1:
                                            System.out.println("List of Courses: ");
                                            List<Course> courseList = courseCatalog.getCourseList();
                                            if (courseList.isEmpty()) {
                                                System.out.println("No course available");
                                            } else {
                                                for (Course course : courseList) {
                                                    System.out.println(course.getCourseId() + ": " + course.getCourse_name() + " - " + course.getCourse_description() + " (" + course.getCourse_duration() + " days) - " + course.getPrice());
                                                }
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Enter course ID to buy: ");
                                            int courseID = sc.nextInt();
                                            boolean purchaseCourse = purchaseService.purchase(currentUser, courseID);
                                            if (purchaseCourse) {
                                                System.out.println("Course Purchased successfully");
                                            } else {
                                                System.out.println("Course not found or purchase failed.");
                                            }
                                            break;
                                        case 3:
                                            currentUser = null;
                                            System.out.println("User logged out successfully");
                                            break;
                                        default:
                                            System.out.println("Invalid choice.");
                                            break;
                                    }
                                }

                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        } else {
                            System.out.println("Invalid username or password");
                        }
                        break;
                    case 3:
                        System.out.println("Exiting....");
                        return;

                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
