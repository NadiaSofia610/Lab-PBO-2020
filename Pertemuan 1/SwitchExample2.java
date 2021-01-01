/** 
 * Program berikut untuk mencoba jika break tertinggal pada pernyataan
 * case
 * Break berfungsi sebagai statement peloncatan atau untuk mengakhiri 
 * statement. Apabila tidak ada break, komputer akan mengeksekusi intruksi 
 * yang berada di bawahnya walaupun berada di case yang berbeda
*/
public class SwitchExample2 {  
	public static void main(String[] args) {   
		int number=20;   
		switch(number){   
		case 10: System.out.println("10");   
		case 20: System.out.println("20");   
		case 30: System.out.println("30");   
		default:System.out.println("Not in 10, 20 or 30");    
		}    
	}   
}

/*
number adalah 20
jadi yang dicetak adalah case 20 dan karena tidak ada break,
maka komputer juga akan mengeksekusi case 30 dan defaultnya
*/