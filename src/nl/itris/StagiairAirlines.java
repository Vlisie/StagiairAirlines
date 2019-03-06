package nl.itris;

import nl.itris.ticket.*;

import java.time.*;

public class StagiairAirlines {

    public static void main(String[] args) {
	StagiairAirlines stagiairAirlines = new StagiairAirlines();
	stagiairAirlines.run();
    }

    private void run() {
        Vlucht kl123 = new Vlucht("KL123", LocalDateTime.of(2019, Month.MARCH, 6, 20, 20));
		System.out.println("kl123 = " + kl123);
		Passagier ben = new Passagier("Ben");
		IVliegticket vliegticket = kl123.boekTicket(ben, Klasse.First);
		printTicket(vliegticket);

		Vlucht af456 = new Vlucht("AF456", LocalDateTime.of(2019, Month.MARCH, 6, 20, 30));
		Passagier tes = new Passagier("Tes");
		IVliegticket ticketTes = af456.boekTicket(tes, Klasse.Business);
		printTicket(ticketTes);

		Passagier dominic = new Passagier("Dominic");
		IVliegticket ticketDom = af456.boekTicket(dominic, Klasse.Economy);
		printTicket(ticketDom);

		af456.setVertrekTijd(LocalDateTime.of(2019, Month.MARCH, 6, 11, 20));
		kl123.setVertrekTijd(LocalDateTime.of(2019, Month.MARCH, 6, 11, 20));
	}

	private void printTicket(AbstractVliegTicket vliegticket) {
		System.out.println("Ticket geboekt voor " + vliegticket.getPassagier() + " de klasse en prijs: " + vliegticket.getKlasse() + " en " + vliegticket.getPrijs());
	}
}
