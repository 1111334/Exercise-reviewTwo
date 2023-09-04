public class Main {
    public static void main(String[] args) {

        // Alloca un array di 3 oggetti Student
        Student[] studentArray = new Student[3];
        studentArray[0] = new Student("Maicol", 1, (byte) 2);
        studentArray[1] = new Student("Giuseppe", 2, (byte) 3);
        studentArray[2] = new Student("Luca", 3, (byte) 3);

        // Chiama il metodo printSeniorStudents con l'array di studenti
        Student.printSeniorStudents(studentArray);

        // Stampa il valore dell'attributo "name" per ciascun elemento dell'array
        for (Student student : studentArray) {
            System.out.println("Nome: " + student.getName());
        }


    }
}