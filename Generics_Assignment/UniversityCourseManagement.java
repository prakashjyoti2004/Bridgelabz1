import java.util.List;
abstract class CourseType {}
class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}
class Course<T extends CourseType> {
    private final String name; private final T type;
    public Course(String name, T type){this.name=name;this.type=type;}
    public String toString(){ return name + "<" + type.getClass().getSimpleName() + ">"; }
}
public class UniversityCourseManagement {
    public static void printCourses(List<? extends CourseType> types){
        types.forEach(t -> System.out.println(t.getClass().getSimpleName()));
    }
    public static void main(String[] args){
        List<Course<ExamCourse>> examCourses = java.util.Arrays.asList(new Course<>("Math", new ExamCourse()));
        List<Course<AssignmentCourse>> assign = java.util.Arrays.asList(new Course<>("Design", new AssignmentCourse()));
        System.out.println(examCourses);
        System.out.println(assign);
        // demonstration of wildcard handling course type objects
        List<CourseType> types = new ArrayList<>();
        types.add(new ExamCourse()); types.add(new ResearchCourse());
        printCourses(types);
    }
}
