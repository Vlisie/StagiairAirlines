package nl.itris;

import nl.itris.observer.*;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 5-3-19.
 */
public class Passagier implements IObserver {
	private String m_naam;



	public Passagier(String naam) {
		m_naam = naam;
	}

	private String getNaam() {
		return m_naam;
	}

	@Override public String toString() {
		return m_naam;
	}

	@Override public void update(Vlucht vlucht) {
		System.out.println("Let op, " + m_naam + ": vlucht " + vlucht + " is gewijzigd. Nieuwe tijd is: " + vlucht.getVertrekTijd());
	}
}
