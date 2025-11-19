import java.util.ArrayList;
import java.util.List;
interface MealPlan {}
class VegetarianMeal implements MealPlan { public String toString(){return "Vegetarian";} }
class VeganMeal implements MealPlan { public String toString(){return "Vegan";} }
class KetoMeal implements MealPlan { public String toString(){return "Keto";} }
public class MealPlanGenerator<T extends MealPlan> {
    private final List<T> plans = new ArrayList<>();
    public void addPlan(T plan){ plans.add(plan); }
    public List<T> getPlans(){ return plans; }
    public static <T extends MealPlan> boolean validate(T plan){
        return plan != null; // placeholder for complex validation rules
    }
    public static void main(String[] args){
        MealPlanGenerator<VegetarianMeal> gen = new MealPlanGenerator<>();
        gen.addPlan(new VegetarianMeal());
        System.out.println("Generated plans: " + gen.getPlans());
        System.out.println("Validate Vegan: " + validate(new VeganMeal()));
    }
}
