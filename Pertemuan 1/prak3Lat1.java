/**  
 * Program berikut untuk mencoba operator aritmetika 	
*/
public class prak3Lat1 {

   public static void main(String args[]) {
      int a = 10;
      int b = 20;
      int c = 25;
      int d = 25;
	  System.out.println("a + b = " + (a + b) );	   // 10+20   = 30
      System.out.println("a - b = " + (a - b) );	// 10-20   = -10
      System.out.println("a * b = " + (a * b) );	// 10x20   = 200
      System.out.println("b / a = " + (b / a) );	// 20:10   = 2
      System.out.println("b % a = " + (b % a) );	// 20mod10 = 0
      System.out.println("c % a = " + (c % a) ); 	// 25mod10 = 5
      System.out.println("a++   = " +  (a++) ); 	// yang diprint a=10 yang disimpan a=> 10+1=11
      System.out.println("b--   = " +  (a--) );		// yang diprint a=11 yang disimpan a=> 11-1=10

      // Check the difference in d++ and ++d	
      System.out.println("d++   = " +  (d++) );		// yang diprint d=25 yang disimpan d=> 25+1=26
      System.out.println("++d   = " +  (++d) );		// yang dprint d=> 26+1=27
   }
}
 