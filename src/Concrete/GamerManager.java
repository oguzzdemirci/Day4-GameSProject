package Concrete;

import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Gamer added ! : " + gamer.getFirstName()+" " + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer updated ! : " + gamer.getFirstName()+" " + gamer.getLastName());
	
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Gamer deleted ! : " + gamer.getFirstName()+" "+ gamer.getLastName());
	}

	
}
