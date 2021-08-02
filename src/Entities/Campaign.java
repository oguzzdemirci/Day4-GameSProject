package Entities;

public class Campaign {
	
	private int id;
	private String campaignName;
	private String type;
	private double discount;
	

	
	public Campaign(int id, String campaignName, String type, double discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.type = type;
		this.discount = discount;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCampaignName() {
		return campaignName;
	}



	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
}
