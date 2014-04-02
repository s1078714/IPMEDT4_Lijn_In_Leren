package ipmedt4.Lijn.In.Leren;

public class Resultaat 
{
	private String leerlijn;
	private String vak;
	private String onderdeel;
	private String kerndoel;
	private String bouw;
	private String informatie;

	public String getLeerlijn() {
		return leerlijn;
	}

	public String getVak() {
		return vak;
	}

	public String getOnderdeel() {
		return onderdeel;
	}

	public String getKerndoel() {
		return kerndoel;
	}

	public String getBouw() {
		return bouw;
	}

	public String getInformatie() {
		return informatie;
	}

	// Will be used by the ArrayAdapter in the ListView
	@Override
	public String toString() {
		return informatie;
	}
}