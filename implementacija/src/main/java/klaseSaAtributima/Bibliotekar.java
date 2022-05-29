package klaseSaAtributima;

public class Bibliotekar {
	private String ime, prezime, username, password;

	public Bibliotekar(String ime, String prezime, String username, String password) throws IllegalArgumentException {
		super();
		this.setIme(ime);
		this.setPrezime(prezime);
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setIme(String ime) {
		if (ime == null || "".equals(ime))
			throw new IllegalArgumentException("Ime ne sme biti prazno!");

		this.ime = ime;
	}

	public void setPrezime(String prezime) {
		if (prezime == null || "".equals(prezime))
			throw new IllegalArgumentException("Prezime ne sme biti prazno!");

		this.prezime = prezime;
	}

	public void setUsername(String username) {
		if (username == null || "".equals(username))
			throw new IllegalArgumentException("Username ne sme biti prazan!");

		this.username = username;
	}

	public void setPassword(String password) {
		if (password == null || "".equals(password))
			throw new IllegalArgumentException("Password ne sme biti prazan!");

		this.password = password;
	}
}
