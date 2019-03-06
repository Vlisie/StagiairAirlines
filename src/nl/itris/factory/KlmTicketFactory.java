package nl.itris.factory;

import nl.itris.*;
import nl.itris.ticket.*;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 5-3-19.
 */
public class KlmTicketFactory implements ITicketFactory {
	@Override public IVliegticket maakTicket(Passagier passagier, Klasse klasse) {
		switch(klasse){
			case First:
				return new KlmFirstClassTicket(passagier);
			case Economy:
				return new KlmEconomyClassTicket(passagier);
			case Business:
				return new KlmBusinessClassTicket(passagier);
			default:
				throw new IllegalArgumentException("kan niet");

		}
	}
}
