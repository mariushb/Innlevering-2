import java.util.GregorianCalendar;

public class Ansatt {

private GregorianCalendar dateToday;

	private int openKontortid = 7;

	private int stengtKontortid = 17;

public Ansatt(String fornavn, String etternavn, int pin)
super(fornavn, etternavn, pin);
}

@Override

public boolean sjekkPIN(int pin) {

	this.dateToday = new GregorianCalendar();

	if (isSperret()) {

		return false;

	} else if ((dateToday.HOUR_OF_DAY >= openKontortid) && (dateToday.HOUR_OF_DAY <= stengtKontortid)

			&& (dateToday.DAY_OF_WEEK > 1) && (dateToday.DAY_OF_WEEK < 7)) {

		return true;

	} else {

		return this.pin == pin;

	}

}
