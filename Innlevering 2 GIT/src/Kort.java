import java.util.GregorianCalendar;

public abstract class Kort {
	private GregorianCalendar dateCreated;
	private String fornavn;
	private String etternavn;
	protected int pin;
	private int kortnummer;
	private int aksesskode;
	private boolean sperretKort;
	private static int antallkort = 100000;

	public Kort(String fornavn, String etternavn, int pin) {
		super();
		this.dateCreated = new GregorianCalendar();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.pin = pin;
		this.kortnummer = ++antallkort;
		this.aksesskode = aksesskode; 
		this.sperretKort = false;
	}
}