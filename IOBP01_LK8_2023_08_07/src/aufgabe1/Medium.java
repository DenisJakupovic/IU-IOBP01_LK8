package aufgabe1;
import java.util.Scanner;

public abstract class Medium {
	private String titel;
	private int anzahlExemplare;
	private String unterTitel;
	
	public Medium(String titel, int anzahlExemplare)
	{
		this(titel, "", anzahlExemplare);

	}

	public Medium(String titel, String unterTitel, int anzahlExemplare)
	{
		this.titel = titel;
		this.unterTitel = unterTitel;
		this.anzahlExemplare = anzahlExemplare;
	}
	
	public Medium(Scanner scan) {
		System.out.print("Bitte gib den Titel ein: ");
		titel = scan.nextLine();
		System.out.print("Bitte gib den Untertitel ein: ");
		unterTitel = scan.nextLine();
		System.out.print("Bitte gib die Anzahl Exemplare ein: ");
		anzahlExemplare = scan.nextInt();
		scan.nextLine(); //Zeilenumbruch weglesen
	}
	
	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getAnzahlExemplare() {
		return anzahlExemplare;
	}

	public void setAnzahlExemplare(int anzahlExemplare) {
		this.anzahlExemplare = anzahlExemplare;
	}
	
	public String getBeschreibung ()
	{
		return "Titel: " + titel
				+ ", Untertitel; " + unterTitel
				+ ", Bestand: " + anzahlExemplare;
	}
}
