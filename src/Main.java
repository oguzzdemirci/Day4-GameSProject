
import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		Gamer gamer1 = new Gamer(2, "235573431", "Oguzhan", "Demirci", 1995);
		Game game = new Game(5, "Rust", 130, "Açık Dünya-Survival");
		Campaign campaign2 = new Campaign(7, " discount for Rust", "Survival-Online", 30);

		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer1);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.update(campaign2);

		GameManager gameManager = new GameManager();
		gameManager.add(game);

		GameSaleManager gameSaleManager = new GameSaleManager();
        gameSaleManager.gameSales(gamer1, game, campaign2);

	}

}
