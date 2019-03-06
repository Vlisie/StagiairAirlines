package nl.itris.factory;

import nl.itris.*;
import nl.itris.ticket.*;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 5-3-19.
 */
public class AirFranceTicketFactory implements nl.itris.ITicketFactory {
	@Override public IVliegticket maakTicket(Passagier passagier, Klasse klasse) {
		switch(klasse){
			case First:
				return new AirFranceFirstClassTicket(passagier);
			case Economy:
				return new AirFranceEconomyClassTicket(passagier);
			case Business:
				return new AirFranceBusinessClassTicket(passagier);
			default:
				throw new IllegalArgumentException("kan niet");

		}
	}
}
