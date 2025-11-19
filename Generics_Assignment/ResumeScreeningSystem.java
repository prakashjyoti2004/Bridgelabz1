import java.util.List;
abstract class JobRole {}
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}
class Resume<T extends JobRole> {
    private final String candidate; private final T role;
    public Resume(String candidate, T role){this.candidate=candidate;this.role=role;}
    public String toString(){ return candidate + " -> " + role.getClass().getSimpleName(); }
}
public class ResumeScreeningSystem {
    public static void screen(List<? extends JobRole> roles){
        roles.forEach(r -> System.out.println("Role: " + r.getClass().getSimpleName()));
    }
    public static void main(String[] args){
        Resume<SoftwareEngineer> r1 = new Resume<>("Aisha", new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>("Ravi", new DataScientist());
        System.out.println(r1);
        System.out.println(r2);
        screen(java.util.Arrays.asList(new SoftwareEngineer(), new ProductManager()));
    }
}
