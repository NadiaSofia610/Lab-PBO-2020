/*  
 * Program berikut untuk mencoba operator assignment
*/ 
public class prak3Lat2 {

   public static void main(String args[]) {
      int a = 10;
      int b = 20;
      int c = 0; 

	  c = a + b;		// 10+20 = 30
      System.out.println("c = a + b = " + c );

      c += a ;			// 30+10 = 40
      System.out.println("c += a  = " + c );

      c -= a ;			// 40-10 = 30
      System.out.println("c -= a = " + c );

      c *= a ;			// 30x10 = 300
      System.out.println("c *= a = " + c );

      a = 10;
      c = 15;
      c /= a ; 			// 15:10 = 1 karena tipe data int, makanya tidak berkoma
      System.out.println("c /= a = " + c ); 

      a = 10;
      c = 15;
      c %= a ;			// 15mod10 = 5
      System.out.println("c %= a  = " + c );

      c <<= 2 ;			// 00000101 => 00010100=20
      System.out.println("c <<= 2 = " + c );

      c >>= 2 ;			// 00010100 => 00000101=5
      System.out.println("c >>= 2 = " + c );

      c >>= 2 ;			// 00000101 => 00000001=1
      System.out.println("c >>= 2 = " + c );

      c &= a ; 			// 00000001  => 00000000=0
						// 00001010
      System.out.println("c &= a  = " + c );

      c ^= a ;			// 00000000	 => 00001010=10
						// 00001010
      System.out.println("c ^= a   = " + c );

      c |= a ;			// 00001010	 => 00001010=10
						// 00001010
      System.out.println("c |= a   = " + c );
   }
}