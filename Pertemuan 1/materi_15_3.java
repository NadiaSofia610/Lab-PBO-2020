public class materi_15_3 {
	public static void main (String[] args) {
	
	Mulai :
	for (int i=1; i<=7; i++) {  //loop for ke-1 
		for (int j=0; j<i; j++) //loop for ke-2 
		{  
			if(j==3) 
				break Mulai; 
			System.out.print(j); 	 
		}  
		System.out.println(); 
	}
}}

/*
kode di atas adalah contoh program nested loop

for (outer) digunakan untuk menghitung jumlah baris pada program, 
setiap for (inner) selesai di eksekusi, maka akan membuat baris baru.

Pada contoh 3 di atas, break akan menghentikan operasi pada statemen Mulai, 
bermakna keluar dari loop for ke-1.

untuk i=1, karena 1<7, cetak j=0 karena 0<i, simpan j=0+1, simpan i=1+1
untuk i=2, karena 2<7, cetak j=0, j=1 karena 1<i, simpan j=1+1, simpan i=2+1			
untuk i=3, karena 3<7, cetak j=0, j=1, j=2 karena 2<i, simpan j=2+1, simpan i=3+1			->karena j=3, keluar dari loop for ke-1
cetak lagi output pada line 27

*/