package nl.itris;

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 5-3-19.
 */
public interface ITicketFactory {
	IVliegticket maakTicket(Passagier passagier, Klasse klasse);
}
