public class Main {
    public static void main(String[] args) {
    int temp = 42;
   if(temp > 30) {
       System.out.println("Its Hot Day");
       System.out.println("Drink Water");
   } else if(temp > 20 && temp <= 30){
            System.out.println("Beautiful Day");
        } else {
            System.out.println("Cold Day");
        }
    }
}