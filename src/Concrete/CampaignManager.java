package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Campaign added! :" + campaign.getCampaignName() +" Discount is: " +campaign.getDiscount());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated! :" + campaign.getCampaignName() +" ,New discount is: " +campaign.getDiscount());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted! :" + campaign.getCampaignName() +" Delete discount is: " +campaign.getDiscount());
		
	}

}
