
The **Course-Enrollment-System** is a simplified backend application designed to simulate the process of registering, logging in, searching for, and purchasing online courses. This system is implemented in Java, focusing on the core functionalities required for managing users, courses, and purchases without database connectivity, with plans to integrate a database at a later stage.

### **Key Features:**

1. **User Registration and Authentication:**
   - Users can register by providing a unique username and password. The system checks for existing usernames to avoid duplicates.
   - Registered users can log in using their credentials. Upon successful login, users can access additional features like searching for courses and making purchases.

2. **Course Management:**
   - The system maintains a catalog of courses, each with details such as course ID, name, description, price, and duration.
   - Users can browse the available courses, search for specific courses by name, and view detailed information about each course.

3. **Course Enrollment:**
   - Logged-in users can enroll in courses by selecting a course from the catalog. The system updates the user’s profile with the courses they have enrolled in.

4. **Purchase Handling:**
   - The system facilitates the process of purchasing courses. Although the payment functionality is not implemented, the system tracks which courses a user has purchased.

5. **Error Handling and Validation:**
   - The system includes basic error handling for operations such as user registration (e.g., preventing duplicate usernames) and course enrollment (e.g., ensuring that courses exist before enrolling).
   - User-defined exceptions and try-catch blocks are used to manage potential errors and provide feedback to users.

      
### **Future Enhancements:**

- **Database Integration:** In the future, database connectivity will be added to store user and course data persistently.
- **Payment Processing:** Integration with a payment gateway to handle real transactions for course purchases.
- **Admin Functionality:** Introducing an Admin role to manage courses, including adding, updating, and removing courses.
- **Notification System:** Implementing a notification system to inform users about course updates and reminders.

### **Use Cases:**

1. **User Registration:**
   - A new user registers by providing a username and password.
   - The system checks for duplicate usernames and registers the user if the name is unique.

2. **User Login:**
   - A registered user logs in with their credentials.
   - If the credentials are correct, the user gains access to the course catalog and purchase options.

3. **Course Search and Enrollment:**
   - A logged-in user searches for a course by name.
   - The user can view course details and enroll in the course.

4. **Purchase Course:**
   - The user selects a course to purchase.
   - The system processes the purchase and adds the course to the user’s enrolled courses list.

### **Conclusion:**

The **Online Coaching Course System** is a foundational project that provides a clear structure for managing users, courses, and purchases in an educational context. While currently a simple backend implementation, it lays the groundwork for more complex features such as database integration, payment processing, and administrative controls, making it a flexible and scalable solution for online education platforms.
