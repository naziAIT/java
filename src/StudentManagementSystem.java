import java.util.*;

class Student {
    int id;
    String name;
    int age;
    Set<String> courses = new HashSet<>();

    public Student(int id, String name, int age, Set<String> courses) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courses.addAll(courses);
    }

    @Override
    public String toString() {
        return id + " - " + name + ", Age: " + age + ", Courses: " + courses;
    }
}

class StudentManager {
    Map<Integer, Student> students = new HashMap<>();
    Map<String, Set<Integer>> courseMap = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.id, student);
        for (String course : student.courses) {
            courseMap.putIfAbsent(course, new HashSet<>());
            courseMap.get(course).add(student.id);
        }
    }

    public void removeStudent(int id) {
        if (students.containsKey(id)) {
            for (String course : students.get(id).courses) {
                courseMap.get(course).remove(id);
                if (courseMap.get(course).isEmpty()) {
                    courseMap.remove(course);
                }
            }
            students.remove(id);
        }
    }

    public void updateStudent(int id, String name, Integer age, Set<String> courses) {
        if (students.containsKey(id)) {
            Student student = students.get(id);
            if (name != null) student.name = name;
            if (age != null) student.age = age;
            if (courses != null) {
                removeStudent(id);
                student.courses.clear();
                student.courses.addAll(courses);
                addStudent(student);
            }
        }
    }

    public void displayStudents() {
        List<Student> studentList = new ArrayList<>(students.values());
        studentList.sort(Comparator.comparingInt(s -> s.id));
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public Student searchStudentById(int id) {
        return students.get(id);
    }

    public Set<Integer> getStudentsByCourse(String course) {
        if (courseMap.containsKey(course)) {
            return courseMap.get(course);
        }
        return new HashSet<>();
    }
}

class MainS {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student(111, "Alina Mamatalieva", 20, Set.of("Java", "Python")));
        manager.addStudent(new Student(222, "Nazima Dildebekova", 22, Set.of("Java", "C++")));
        manager.addStudent(new Student(333, "Nuraly Maksatovich", 19, Set.of("Python", "C#")));

        System.out.println("All Students:");
        manager.displayStudents();

        System.out.println(manager.searchStudentById(222));

        System.out.println(manager.getStudentsByCourse("Java"));

        manager.updateStudent(111, "Alina Mamatalieva", 22, Set.of("Java", "Machine Learning"));
        System.out.println(manager.searchStudentById(333));

        manager.removeStudent(222);
        manager.displayStudents();
    }
}
