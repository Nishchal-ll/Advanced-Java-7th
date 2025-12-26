
package javaq;

class Money{
    int rupee;
    int paisa;

   
   void setmoney(int r,int p){
       rupee=r;
       paisa=p;
   }
   
   void displaymoney(){
       System.out.println("Rupee "+rupee+"Paisa "+paisa);
   }
 void addmoney(Money m1, Money m2) {
    int totalPaisa = m1.paisa + m2.paisa;
    int extraRupee = totalPaisa / 100;

    paisa = totalPaisa % 100;
    rupee = m1.rupee + m2.rupee + extraRupee;
}
}
public class Question2{
      public static void main(String[] args){
        Money m1 = new Money();
        Money m2 = new Money();
        Money m3 = new Money(); // Result object

        m1.setmoney(5, 75);
        m2.setmoney(7, 30);

        m3.addmoney(m1, m2);
        System.out.println("Nishchal Acharya");
        m1.displaymoney();
        m2.displaymoney();
        m3.displaymoney();
        
    }
}


