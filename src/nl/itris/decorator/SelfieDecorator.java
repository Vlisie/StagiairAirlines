package nl.itris.decorator;

import nl.itris.*;

import java.math.*;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 5-3-19.
 */
public class SelfieDecorator extends TicketDecorator {

	protected SelfieDecorator(IVliegticket vliegticket) {
		super(vliegticket);
	}

	@Override public BigDecimal getPrijs() {
		return null;
	}
}
