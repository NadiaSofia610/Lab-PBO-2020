public class materi_15_2 {
	public static void main (String[] args) {
	
	for (int i=1; i<=7; i++) {   	//loop for ke-1 
		if(i == 3 )
			break;
		for (int j=0; j<i; j++)  	//loop for ke-2 
		{   
			System.out.print(j); 	 
		}  
		System.out.println(); 
	}
}}

/*
kode di atas adalah contoh program nested loop

for (outer) digunakan untuk menghitung jumlah baris pada program, 
setiap for (inner) selesai di eksekusi, maka akan membuat baris baru.

untuk i=1, karena 1<7, cetak j=0 karena 0<i, simpan j=0+1, simpan i=1+1
untuk i=2, karena 2<7, cetak j=0, j=1 karena 1<i, simpan j=1+1, simpan i=2+1			->karena i=3, maka looping i berhenti
*/