public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student("Maicol", 37738, (byte) 2);
        students[1] = new Student("Luca", 57674, (byte) 1);
        students[2] = new Student("Francesco", 67485, (byte) 3);

        for (Student student : students) {
            student.printSeniorStudents(students);
            System.out.println("Name: " + student.getName());
        }

    }
}