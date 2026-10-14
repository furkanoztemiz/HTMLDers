
public class Bird {

    static {
        System.out.println("Bird's Static Init Block #1");
    }

    public Bird() {
        System.out.println("I'm a bird");
    }

    {
        System.out.println("Bird's Instance Init Block #1");
    }

    public void fly() {
        System.out.println("I'm flying");
    }

    {
        System.out.println("Bird's Instance Init Block #2");
    }

    static {
        System.out.println("Bird's Static Init Block #2");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        
    }

}



