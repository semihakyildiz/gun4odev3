package product;

import campaign.Campaign;

public class BaseProductManager implements IProductService{

	@Override
	public void add(Product product) {
		System.out.println(product.getCategory()+" turunde " +"Urun Eklendi: "+ product.getName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("Urun Guncellendi: "+ product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Urun Silindi: "+ product.getName());
		
	}

	@Override
	public void updateCampaing(Product product, Campaign campaign) {
		System.out.println(product.getName()+"Adli Urunun Kampanya Bilgisi Guncellendi: "+ campaign.getTitle());
		
	}

	@Override
	public void addMulti(Product[] products) {
		
			for (Product product : products) {
				this.add(product);
			}
		
		
	}

}
