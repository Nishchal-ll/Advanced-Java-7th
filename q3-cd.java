package javaq;


public class Main {
    public static void main(String[] args) {

         int[][] jagged = {
            {1, 2},
            {3, 4, 5},
            {6}
        };

        for (int[] row : jagged) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    
        System.out.println("Nishchal Acharya");
    }
}
