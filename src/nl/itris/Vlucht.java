package nl.itris;

import nl.itris.factory.*;
import nl.itris.observer.*;

import java.time.*;
import java.util.*;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 5-3-19.
 */
public class Vlucht implements IObservable {
	private final String m_vluchtNr;

	private LocalDateTime m_vertrekTijd;

	private ITicketFactory m_ticketFactory;

	private List<IObserver> m_observerList = new ArrayList<>();

	public Vlucht(String vluchtNr, LocalDateTime vertrekTijd) {
		m_vluchtNr = vluchtNr;
		m_vertrekTijd = vertrekTijd;
		maakFactory(vluchtNr);
	}

	private String getVluchtNr() {
		return m_vluchtNr;
	}

	public void setVertrekTijd(LocalDateTime vertrekTijd) {
		m_vertrekTijd = vertrekTijd;
		notifyObservers();
	}

	public LocalDateTime getVertrekTijd() {
		return m_vertrekTijd;
	}

	@Override public String toString() {
		return m_vluchtNr;
	}

	IVliegticket boekTicket(Passagier passagier, Klasse klasse) {
		registerObserver(passagier);
		return m_ticketFactory.maakTicket(passagier, klasse);
	}

	void maakFactory(String vluchtNr){
		if(vluchtNr.startsWith("KL")){
			m_ticketFactory = new KlmTicketFactory();
		}else if(vluchtNr.startsWith("AF")) {
			m_ticketFactory = new AirFranceTicketFactory();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override public void registerObserver(IObserver observer) {
		m_observerList.add(observer);
	}

	@Override public void unregisterObserver(IObserver observer) {
		m_observerList.remove(observer);
	}

	@Override public void notifyObservers() {
		for(IObserver observer : m_observerList) {
			observer.update(this);
		}
	}
}
