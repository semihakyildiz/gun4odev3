package product;

import campaign.Campaign;

public interface IProductService {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	void addMulti(Product[] products);
	void updateCampaing(Product product, Campaign campaign);
	
}
