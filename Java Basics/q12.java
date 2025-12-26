package javaq;

// (f) Custom exception
class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class Main {

    // (e) throws keyword
    static void divide() throws ArithmeticException {
        int a = 10 / 0;
    }

    // method using custom exception
    static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0) {
            throw new InvalidMarksException("Marks cannot be negative");
        }
        System.out.println("Valid marks");
    }

    public static void main(String[] args) {

        // (a) try, catch, finally + (b) multiple catch
        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        }
        catch (Exception e) {
            System.out.println("General Exception caught");
        }
        finally {
            System.out.println("Finally block executed");
        }

        // (c) Nested try blocks + (d) throw keyword
        try {
            try {
                int arr[] = new int[3];
                arr[5] = 10;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index error");
                throw new ArithmeticException("Thrown manually");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Outer catch: " + e.getMessage());
        }

        // (e) throws keyword
        try {
            divide();
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled using throws");
        }

        // (f) Custom exception
        try {
            checkMarks(-5);
        }
        catch (InvalidMarksException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}
