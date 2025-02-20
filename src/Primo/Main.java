package Primo;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Prima classe");
		
		System.out.println("Casting: " + 10 + " testo"); 
		// 10 viene convertito in stringa
		
		System.out.println("Casting: " + 10 + 20 + " testo"); 
		// Nessuna somma perchè ogni tipo viene convertito in stringa
		
		System.out.println("Casting: " + (10 + 20) + " testo"); 
		// Con la priorità avviene prima la somma 
	}
}
