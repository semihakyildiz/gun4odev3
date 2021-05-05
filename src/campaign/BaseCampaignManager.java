package campaign;

public class BaseCampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Yeni bir kampanya eklendi: "+ campaign.getTitle());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya bilgisi guncellendi: "+ campaign.getTitle());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi: "+ campaign.getTitle());
		
	}

}
