public class Main {
    public static void main(String[] args) {

    int income = 120_000;
  /*  String className;
     if(income > 100_000) {
       className = " First ";
      } else
       className = "Economy";

   */
        // conditional Short Method
    /* String className = "Economy ";
        if(income > 100_000)
            className = " First ";
   */
        // conditional to ternary operator for more senior
        String className = income > 100_000 ? "first" : "Economy";
        System.out.println(className);
    }
}