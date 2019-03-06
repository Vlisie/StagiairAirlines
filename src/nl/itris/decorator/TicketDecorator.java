package nl.itris.decorator;

import nl.itris.*;

import java.math.*;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 5-3-19.
 */
public abstract class TicketDecorator implements IVliegticket {

	private IVliegticket m_vliegticket;

	protected TicketDecorator(IVliegticket vliegticket) {
		m_vliegticket = vliegticket;
	}

	public abstract BigDecimal getPrijs();
}

