package campaign;

public class Campaign {
	int id;
	String title;
	String content;
	double discount;

	public Campaign() {
	}

	public Campaign(int id, String title, String content, double discount) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
}
