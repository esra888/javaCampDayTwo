public class Main {
    public static void main(String[] args) {


        Course course1 = new Course();
        course1.setId(1);
        course1.setCourseName("Java");
        course1.setCourseDescription("This course is 8 weeks long.");
        course1.setInstructor("Engin Demirog");
        course1.setPrice("Ucretsiz");

        Course course2 = new Course(2,"C#","This course is 12 weeks long","Engin Demirog","Ucretsiz");

        //Özellik class'ı başlangıcı
        Course[] courses = {course1,course2};
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }


        //İş class'ı başlangıcı
        CourseManager courseManager = new CourseManager();
        courseManager.addCourses(course1);
        courseManager.addCourses(course2);

        courseManager.showAllCourses(courses);
    }
}
