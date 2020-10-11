/** 
 * Program berikut untuk mencoba array dua dimensi
*/ 
public class Array2 { 
 	public static void main(String args[]) { 
		//Array 2 dimensi 
		int[][] arrx = new int[3][3]; 
		arrx[0][0] = 1; 
		arrx[0][1] = 2; 
		arrx[0][2] = 3; 
		arrx[1][0] = 4; 
		arrx[1][1] = 5; 
		arrx[1][2] = 6; 
		arrx[2][0] = 7; 
		arrx[2][1] = 8;   
		System.out.println("Nilai arrx[0][1] : " + arrx[0][1]); 
		System.out.println("Nilai arrx[0][2] : " + arrx[0][2]); 
		System.out.println("Nilai arrx[1][0] : " + arrx[1][0]); 
		System.out.println("Nilai arrx[1][1] : " + arrx[1][1]); 
		System.out.println("Nilai arrx[1][2] : " + arrx[1][2]); 
		System.out.println("Nilai arrx[2][0] : " + arrx[2][0]); 
		System.out.println("Nilai arrx[2][1] : " + arrx[2][1]); 
		System.out.println("Nilai arrx[2][2] : " + arrx[2][2]); 
 
	} 
}  		

/*
array arrx[3][3] 2 dimensi di atas berisi 3 baris dan 3 kolom
tetapi yang diisikan nilai hanya sampai pada [2][1]
oleh karena itu hasil cetak terakhir atau arrx[2][2] dicetak 0 karena tidak diisikan nilai sebelumnya
*/