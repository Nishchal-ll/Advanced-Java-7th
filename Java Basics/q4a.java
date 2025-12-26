package javaq;
class Calculator{
 int add(int a, int b) {
        return a + b;
    }

    // add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Main {
    public static void main(String[] args) {
  Calculator calc = new Calculator();

        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));
        System.out.println("Sum of 1, 2, 3: " + calc.add(1, 2, 3));
     
        System.out.println("Nishchal Acharya");
    }
}
