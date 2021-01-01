/** 
 * Program berikut untuk mencoba operator relasional
*/ 
public class prak3Lat3 {

   public static void main(String args[]) {
      int a = 10;
      int b = 20;

      System.out.println("a == b = " + (a == b) );	//10=20(false)
      System.out.println("a != b = " + (a != b) );	//10≠20(true)
      System.out.println("a > b = " + (a > b) );	//10>20(false)
      System.out.println("a < b = " + (a < b) );	//10<20(true)
      System.out.println("b >= a = " + (b >= a) );	//20≥10(true)
      System.out.println("b <= a = " + (b <= a) );	//20≤10(false)
   }
}
