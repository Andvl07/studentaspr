

public class programm {
    public static void main(String[] args) {
        student[] Student = new student[4];
        Student[0] = new student("Андрей", "Химический", 2000, 100);
        Student[1] = new student("Борис", "Военный", 1999, 99);
        Student[2] = new student("Даниил", "Филологический", 1998, 50);
        Student[3] = new student("Георгий", "Инженерный", 2006, 100);
        System.out.println(Student.Show);
    }

}
