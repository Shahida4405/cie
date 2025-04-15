class cal {
    int a = 5;
    int b = 5;

    void display() {
        System.err.println("SIMPLE ARITHMATIC MENU");
        System.out.println("Addition of a and b is: " + (a + b));
        System.out.println("Subtraction of a and b is: " + (a - b));
        System.out.println("Multiplication of a and b is: " + (a * b));
        System.out.println("Division of a and b is: " + (a / b));
        System.out.println("Modulus of a and b is: " + (a % b));
    }
}

public class Simplecal {
    public static void main(String[] args) {
        cal s1 = new cal(); 
        s1.display();       
    }
}
