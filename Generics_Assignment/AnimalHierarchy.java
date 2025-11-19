import java.util.List;
class Animal { String name; Animal(String n){name=n;} public String toString(){return name;} }
class Dog extends Animal { Dog(String n){super(n);} }
class Cat extends Animal { Cat(String n){super(n);} }
public class AnimalHierarchy {
    public static void printAnimals(List<? extends Animal> animals){
        for(Animal a : animals) System.out.println(a);
    }
    public static void main(String[] args){
        java.util.List<Dog> dogs = java.util.Arrays.asList(new Dog("Rex"), new Dog("Bolt"));
        java.util.List<Cat> cats = java.util.Arrays.asList(new Cat("Mia"), new Cat("Luna"));
        printAnimals(dogs);
        printAnimals(cats);
    }
}
