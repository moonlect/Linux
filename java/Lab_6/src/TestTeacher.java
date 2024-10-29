import java.util.HashSet;
import java.util.Set;

/*
 * @author Tsimoshchenko M.V, Kudryavets D.E
 * @version 1.0
 */
class Person {
    private String fullName;
    private String location;

    public Person(String fullName, String location) {
        this.fullName = fullName;
        this.location = location;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Individual{fullName='" + fullName + "', location='" + location + "'}";
    }
}

class Teacher extends Person {
    private int currentCourseCount;
    private Set<String> courseIdentifiers; // Используем Set для хранения уникальных идентификаторов курсов
    private final int maximumCourses;

    public Teacher(String fullName, String location, int maximumCourses) {
        super(fullName, location);
        this.maximumCourses = maximumCourses;
        this.courseIdentifiers = new HashSet<>();
        this.currentCourseCount = 0;
    }

    public boolean addCourse(String courseIdentifier) {
        if (currentCourseCount < maximumCourses) {
            if (courseIdentifiers.add(courseIdentifier)) { // Добавляет курс, если его еще нет
                currentCourseCount++;
                return true; // Успешно добавлено
            } else {
                System.out.println("Курс " + courseIdentifier + " уже добавлен.");
                return false; // Курс уже существует
            }
        } else {
            System.out.println("Достигнуто максимальное количество курсов.");
            return false; // Превышено максимальное количество курсов
        }
    }

    public boolean removeCourse(String courseIdentifier) {
        if (courseIdentifiers.remove(courseIdentifier)) { // Удаляет курс, если он существует
            currentCourseCount--;
            return true; // Успешно удалено
        } else {
            System.out.println("Курс " + courseIdentifier + " не найден.");
            return false; // Курс не найден
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + getFullName() + '\'' +
                ", location='" + getLocation() + '\'' +
                ", currentCourseCount=" + currentCourseCount +
                ", courseIdentifiers=" + courseIdentifiers +
                ", maximumCourses=" + maximumCourses +
                '}';
    }
}

// Пример использования классов
class TestTeacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Алексей Смирнов", "Минск", 5);

        teacher.addCourse("C++");
        teacher.addCourse("Python");

        System.out.println(teacher);

        teacher.removeCourse("C++");

        System.out.println(teacher);

        teacher.addCourse("C++");
        teacher.addCourse("Java");
        teacher.addCourse("Go");
        teacher.addCourse("Rust");
        teacher.addCourse("Swift");

        System.out.println(teacher);
    }
}

