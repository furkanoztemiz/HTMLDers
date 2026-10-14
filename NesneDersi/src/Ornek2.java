
class ClassA {

    public void topla(){
        
        int a= 6;
        int b=5;
        
        System.out.println(a+b);
        
    }
    
    public void topla(int dizi[], int a){
        int c = dizi[2] + a;
        System.out.println(c);
    }
    
    public void topla(int a, int b){
        System.out.println(a+b);
    }

}

class ClassB extends ClassA{
    
    
    @Override
    public void topla(int a, int b){
        
        float c= (a/2)+b;
    };

    void Carp(int a,int b){
        
    }
    public static void main(String[] args) {
      
    }
}
