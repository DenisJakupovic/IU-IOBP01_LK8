package aufgabe5;

public class Login {
	private String user = "user";
	private String passwort = "pass";
	private boolean angemeldet = false;
	
	public void anmelden(String user, String passwort) throws ZugriffUngueltigException{
		if(user.equals(this.user)&&passwort.equals(this.passwort)) {
			this.angemeldet = true;
		}
		else {
			throw new ZugriffUngueltigException("Ungueltige Zugangsdaten");
		}
	}
	
	public void abmelden() {
		this.angemeldet = false;
	}
	
	public void bearbeiten() throws KeineBerechtigungException{
		if(angemeldet==false) {
			throw new KeineBerechtigungException ("Keine Berechtigung");
		}
		System.out.println("Bearbeitung erfolgreich");
	}
	
}
