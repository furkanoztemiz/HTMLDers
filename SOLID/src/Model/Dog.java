package Model;

public class Dog {
    
    String name;

    public Dog(String name) {
        this.name = name;
    }
    
    
    
    public static void main(String[] args) {
        Dog dg = new Dog("Furkan");
        System.out.println(dg.name);
    }
    
}
