package product;

import campaign.Campaign;

public class Product {
	private int id;
	private String name;
	private String category;
	private double price;
	private double discount;
	private Campaign[] campaigns = null;

	public Product() {
	}

	public Product(int id, String name, String category, double price, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterCampaigns() {
        double unitPriceAfterCampaigns = price;
        for (Campaign campaign: campaigns){
            unitPriceAfterCampaigns = price - (price * campaign.getDiscount() / 100);
        }
        return unitPriceAfterCampaigns;
    }
}
