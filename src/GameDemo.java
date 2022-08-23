public class GameDemo {
   public String divideByNumber(int firstNumber, int secondNumber)
   {
       int c;
       try
       {
           c=firstNumber/secondNumber;
           System.out.println("Quotient : "+c);
       }
       catch(ArithmeticException e)
       {
           //throw e
           System.out.println(e);
       }
       return "";
   }
   }

