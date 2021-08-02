  
package Adapter;

import java.rmi.RemoteException;


import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisSAdapter implements GamerCheckService {
KPSPublicSoapProxy consumer= new KPSPublicSoapProxy();
	
	

	public boolean CheckIfRealGamer(Gamer gamer) throws NumberFormatException , RemoteException{
		boolean results= consumer.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getDateOfBirth());
		if (results==true) {
            System.out.println("Ba�ar�l� Do�rulama !!!");

        }else {
            System.out.println("Ba�ar�s�z Do�rulama !!!");
        }
		return results;
	}
	

	
}