/** 
 * Program berikut untuk mendapatkan nilai argumen pada method main
*/ 
public class GetArguments {
 	public static void main(String args[]) { 
 
 	System.out.println("Tanggal : " + args[0]); 
	System.out.println("Bulan : " + args[1]); 
	System.out.println("Tahun : " + args[2]); 
 
	} 
}

/*
Method main memiliki parameter berupa array bertipe String. 
Berapapun argumen yang diketik saat running, akan disimpan dalam 
array tersebut dan diakses dengan menggunakan indeks. 

jadi untuk menjalankan aplikasi dengan memasukkan argumen tanggal, 
bulan dan tahun. caranya adalah ketik : java GetArguments "argument yang akan dimasukkan"
misalnya : java GetArguments 23 maret 2017

maka, 23 akan disimpan pada args[0] (tanggal)
maret akan disimpan pada args[0] (bulan)
2020 akan disimpan pada args[0] (tahun)
*/