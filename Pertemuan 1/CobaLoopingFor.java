/** 
 * Program berikut untuk mencoba looping for
*/
public class CobaLoopingFor {  
	public static void main(String arg[]) { 
 
	for (int i=0; i<10; i++) 
	{ 
		for (int j=0; j<i+1; j++) 
			System.out.print('*'); 
		
		System.out.println();  
		} 	 
	}  
}

/*
kode di atas adalah contoh program nested loop

for (outer) digunakan untuk menghitung jumlah baris pada program, 
setiap for (inner) selesai di eksekusi, maka akan membuat baris baru.

program diatas mirip dengan program pada materi_15

untuk i=0, karena 0<10, cetak * karena 0<i, simpan j=0+1, simpan i=0+1
untuk i=1, karena 1<10, cetak ** karena 1<i+1, simpan j=1+1, simpan i=1+1
untuk i=2, karena 2<10, cetak *** karena 2<i+1, simpan j=2+1, simpan i=2+1		
untuk i=3, karena 3<10, cetak **** karena 3<i+1, simpan j=4+1, simpan i=3+1
untuk i=4, karena 4<10, cetak ***** karena 4<i+1, simpan j=5+1, simpan i=4+1
untuk i=5, karena 5<10, cetak ****** karena 5<i+1, simpan j=6+1, simpan i=5+1
untuk i=6, karena 6<10, cetak ******* karena 6<i+1, simpan j=7+1, simpan i=6+1
untuk i=7, karena 7<10, cetak ******** karena 7<i+1, simpan j=8+1, simpan i=7+1
untuk i=8, karena 8<10, cetak ********* karena 8<i+1, simpan j=9+1, simpan i=8+1
untuk i=9, karena 9<10, cetak ********** karena 9<i+1, simpan j=10+1, simpan i=9+1
karena i=10 jadi tidak akan mencetak lagi karena batasnya adalah ketika i<10
*