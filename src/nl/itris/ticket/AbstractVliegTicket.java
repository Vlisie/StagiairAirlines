package nl.itris.ticket;

import nl.itris.*;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 5-3-19.
 */
public abstract class AbstractVliegTicket implements IVliegticket {
	public abstract int getTicketNr();

	public abstract Passagier getPassagier();

	public abstract Klasse getKlasse();
}
