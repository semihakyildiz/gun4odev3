
import java.util.Date;

import Adapters.MernisServiceAdapter;
import campaign.BaseCampaignManager;
import campaign.Campaign;
import campaign.ICampaignService;

import gamer.IUserService;
import gamer.User;
import gamer.gamerCheck.UserManager;
import product.BaseProductManager;
import product.IProductService;
import product.Product;

public class Main {

	public static void main(String[] args) {

		Product game1 = new Product(1, "Diablo 3", "RPG", 140, 0);
		Product game2 = new Product(2, "Crysis 3", "FPS", 200, 1);
		IProductService productService = new BaseProductManager();
		productService.addMulti(new Product[] {game1,game2});

		User user = new User(1, "crazyBoy_123#$@", "Ahmet", "Velioglu", "11111111111", "mail@mail.com", "cokgizli",
				new Date(1999, 1, 1));
		IUserService userService = new UserManager(new MernisServiceAdapter());
		userService.signup(user);
		
		Campaign campaign1 = new Campaign(1, "Hafta Ortasý Çýlgýnlýðý", "...", 1);
		ICampaignService campaignService = new BaseCampaignManager();
		campaignService.add(campaign1);
	}

}
