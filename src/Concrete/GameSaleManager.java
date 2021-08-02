package Concrete;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameSaleManager implements GameSaleService {

	@Override
	public void gameSales(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " game " +" was sold to "+ gamer.getFirstName() ) ;
		
	}

}
