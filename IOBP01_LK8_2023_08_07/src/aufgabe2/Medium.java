package aufgabe2;
import java.util.Scanner;
import java.util.InputMismatchException;

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
		while (true) {
			try {
			System.out.print("Bitte gib die Anzahl Exemplare ein: ");
			anzahlExemplare = scan.nextInt();
			break;
		}
		catch(InputMismatchException ex) {
			scan.nextLine(); //Zeilenumbruch weglesen
			System.out.println("Falsche Eigabe!");
			System.out.println("Bitte eine Zahl eingeben!");
		}finally {
			scan.nextLine(); //Zeilenumbruch weglesenn
		}
	}
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
