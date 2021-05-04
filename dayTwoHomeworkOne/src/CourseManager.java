public class CourseManager {
    public void addCourses(Course course) {
        System.out.println("Course added! " +course.getCourseName());
    }

    public void showAllCourses(Course[] courses) {
        System.out.print("Your courses: ");
        for (Course course:courses) {
            System.out.print(course.getCourseName()+ ", ");
        }
    }
}
