package nl.itris.observer;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 5-3-19.
 */
public interface IObservable {
	void registerObserver(IObserver observer);

	void unregisterObserver(IObserver observer);

	void notifyObservers();
}
