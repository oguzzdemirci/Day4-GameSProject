  
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
            System.out.println("Baþarýlý Doðrulama !!!");

        }else {
            System.out.println("Baþarýsýz Doðrulama !!!");
        }
		return results;
	}
	

	
}