package StudentManagementSystem;

import StudentManagementSystem.Student;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully!");
    }

    // View Students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No Students Found!");
            return;
        }

        System.out.println("\n===== Student List =====");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Search Student
    public Student searchStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    // Update Student
    public boolean updateStudent(int id,
                                 String newName,
                                 int newAge,
                                 String newCourse) {

        Student student = searchStudent(id);

        if (student != null) {
            student.setName(newName);
            student.setAge(newAge);
            student.setCourse(newCourse);
            return true;
        }

        return false;
    }

    // Delete Student
    public boolean deleteStudent(int id) {

        Student student = searchStudent(id);

        if (student != null) {
            students.remove(student);
            return true;
        }

        return false;
    }
}