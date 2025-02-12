import java.util.Scanner;

class SecondWeeklyExam {
    private String name;
    private int age;
    private int studentId;
    private double grade;

    public SecondWeeklyExam(String name, int age, int studentId, double grade) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId=" + studentId +
                ", grade=" + grade +
                '}';
    }
}

class Data {
    private int counter = 0;
    private final int countStudent;
    private SecondWeeklyExam[] allStudents;

    public Data(int countStudent) {
        this.countStudent = countStudent;
        this.allStudents = new SecondWeeklyExam[countStudent];
    }

    public void addStudent(SecondWeeklyExam student) {
        if (counter < countStudent) {
            allStudents[counter] = student;
            counter++;
        } else {
            System.out.println("Too many students");
        }
    }

    public void displayAllStudents() {
        for (int i = 0; i < counter; i++) {
            System.out.println(allStudents[i]);
        }
    }

    public void searchByID(int studentID) {
        boolean found = false;
        for (int i = 0; i < counter; i++) {
            if (allStudents[i].getStudentId() == studentID) {
                System.out.println(allStudents[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + studentID + " not found");
        }
    }

    public void averageGrade() {
        if (counter == 0) {
            System.out.println("No students to calculate average");
            return;
        }
        double sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += allStudents[i].getGrade();
        }
        double average = sum / counter;
        System.out.println("Average grade: " + average);
    }
}

class Finish {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Data studentData = new Data(50);


        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a Student");
            System.out.println("2. Display all students");
            System.out.println("3. Search by ID");
            System.out.println("4. Average grade");
            System.out.println("5. Exit");
            System.out.println("Choose an option (1-5):");

            int opt = scan.nextInt();
            scan.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("Enter student name:");
                    String name = scan.nextLine();
                    System.out.println("Enter age:");
                    int age = scan.nextInt();
                    System.out.println("Enter student ID:");
                    int studentId = scan.nextInt();
                    System.out.println("Enter grade:");
                    double grade = scan.nextDouble();
                    scan.nextLine();
                    studentData.addStudent(new SecondWeeklyExam(name, age, studentId, grade));
                    System.out.println("Успешно добавлено");
                    break;
                case 2:
                    studentData.displayAllStudents();
                    break;
                case 3:
                    System.out.println("Enter student ID to search:");
                    int searchId = scan.nextInt();
                    scan.nextLine();
                    studentData.searchByID(searchId);
                    break;
                case 4:
                    studentData.averageGrade();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}

