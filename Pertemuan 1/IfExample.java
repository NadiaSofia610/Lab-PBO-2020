/** 
 * Program berikut untuk mencoba seleksi if
*/
import java.util.Scanner;

public class IfExample {  
	public static void main(String[] args) {  
	
	int age=0;   
	Scanner sc = new Scanner(System.in);  
	
	System.out.println("Masukkan umur anda:"); 
	age = sc.nextInt(); 

	if(age>=17) 
		System.out.print("Anda sudah boleh buat KTP");   
    }    
}  

/*
pertama anda akan diminta memasukkan umur anda
jika umur yang anda masukkan 17 tahun atau lebih dari 17 tahun
maka akan tercetak "Anda sudah boleh buat KTP"
jika umur anda kurang dari 17 maka tidak akan menampilkan apa-apa dilayar
*/