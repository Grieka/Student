public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student(1, "John Doe", true, new String[] { "Java", "C#", "Networking"});
        Student s2 = new Student(2, "Tom Seth", false, new String[] { "PHP", "Networking", "Databases"});
        Student s3 = new Student(3, "Jane King", true, new String[] { "Databases", "Java", "HTML"});

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1.displayFullTimeStatus();
        s2.displayFullTimeStatus();
        s3.displayFullTimeStatus();

        s1.displayCourses();
        s2.displayCourses();
        s3.displayCourses();


        s2.updateFullTimeStatus();

        s3.updateCourse("HTML", "Project Management");
        s3.displayCourses();




    }
}