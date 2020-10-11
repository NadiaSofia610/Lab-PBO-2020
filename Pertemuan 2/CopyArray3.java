/** 
 * Program berikut untuk menguji awalan atau akhir suatu string berntebet
*/ 
public class CopyArray3 {
 	public static void main(String args[]) { 
 
		String str1 = "Informatika Universitas Syiah Kuala";
		System.out.println(str1.startsWith("Inf"));
		System.out.println(str1.endsWith("kuala"));
		System.out.println(str1.startsWith("Inf",1));
		System.out.println(str1.startsWith("Inf",2));
		System.out.println(str1.startsWith("Inf",3));

	}
}

/*
line 8 mengecek apakah str1 dimulai dengan "Inf" => true
line 9 mengecek apakah str1 diakhiri dengan "kuala" => false, yang benar adalah "Kala"
line 10 mengecek apakah str1 dimulai dengan "Inf" pada indeks ke 1 => false, yang benar adalah "nfo"
line 11 mengecek apakah str1 dimulai dengan "Inf" pada indeks ke 2 => false, yang benar adalah "for"
line 12 mengecek apakah str1 dimulai dengan "Inf" pada indeks ke 3 => false, yang benar adalah "orm"
*/