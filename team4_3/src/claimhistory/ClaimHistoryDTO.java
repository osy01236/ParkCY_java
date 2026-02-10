package claimhistory;

import java.sql.Timestamp;

public class ClaimHistoryDTO {

	private long id;
	private	long lostItemId;
	private long ownerClaimId;
	private Timestamp date;
	
	
	public ClaimHistoryDTO(long id, long lostItemId, long ownerClaimId, Timestamp date) {
		
		this.id = id;
		this.lostItemId = lostItemId;
		this.ownerClaimId = ownerClaimId;
		this.date = date;
	}


	


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}


	
	public long getLostItemId() {
		return lostItemId;
	}
	public void setLostItemId(long lostItemId) {
		this.lostItemId = lostItemId;
	}
	
	
	
	public long getOwnerClaimId() {
		return ownerClaimId;
	}
	public void setOwnerClaimId(long ownerClaimId) {
		this.ownerClaimId = ownerClaimId;
	}


	
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}


	



}


