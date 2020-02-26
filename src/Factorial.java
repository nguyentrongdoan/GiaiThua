public class Factorial {
   public static int factorial(int number) {
       if (number >= 0) {
           if (number == 0) {
               return 1;
           } else {
               return (number * factorial(number - 1));
           }
       }else {
           return -1;
       }
   }
}
