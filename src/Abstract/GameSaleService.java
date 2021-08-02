package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameSaleService {
	void gameSales(Gamer gamer,Game game,Campaign campaign);

}