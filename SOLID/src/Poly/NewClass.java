package Poly;

public class NewClass {

   public int a;
   public String name ;

    public NewClass(int a, String name) {
        this.a = a;
        this.name = name;
    }

    
   
    
    public int getA() {
        return a;
    }

    public String getName() {
        return name;
    }
    
    
    
    

    public static void main(String[] args) {
        NewClass sayi = new NewClass(5, "Furkan");
        
        
        System.out.println(sayi.a +" "+ sayi.name);
    }

}
