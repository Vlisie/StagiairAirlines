package nl.itris.ticket;

import nl.itris.*;

import java.math.*;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 5-3-19.
 */
public class KlmEconomyClassTicket extends AbstractVliegTicket {
	private Passagier m_passagier;

	public KlmEconomyClassTicket(Passagier passagier) {
		m_passagier = passagier;
	}

	@Override public int getTicketNr() {
		return 0;
	}

	@Override public BigDecimal getPrijs() {
		return BigDecimal.valueOf(20);
	}

	@Override public Klasse getKlasse() {
		return Klasse.Economy;
	}

	@Override public Passagier getPassagier() {
		return m_passagier;
	}
}
