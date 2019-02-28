package com.eec.entity;

public class Business {
	
	private int busId;
	private String busName;
	private String busPwd;
	private String busValue;
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	 */
	public Business() {
		super();
	}
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p> 
	 * @param busId
	 * @param busName
	 * @param busPwd
	 * @param busValue 
	 */
	public Business(int busId, String busName, String busPwd, String busValue) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.busPwd = busPwd;
		this.busValue = busValue;
	}
	/** (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Business [busId=" + busId + ", busName=" + busName + ", busPwd=" + busPwd + ", busValue=" + busValue
				+ "]";
	}
	/**
	 * @return the busId
	 */
	public int getBusId() {
		return busId;
	}
	/**
	 * @param busId the busId to set
	 */
	public void setBusId(int busId) {
		this.busId = busId;
	}
	/**
	 * @return the busName
	 */
	public String getBusName() {
		return busName;
	}
	/**
	 * @param busName the busName to set
	 */
	public void setBusName(String busName) {
		this.busName = busName;
	}
	/**
	 * @return the busPwd
	 */
	public String getBusPwd() {
		return busPwd;
	}
	/**
	 * @param busPwd the busPwd to set
	 */
	public void setBusPwd(String busPwd) {
		this.busPwd = busPwd;
	}
	/**
	 * @return the busValue
	 */
	public String getBusValue() {
		return busValue;
	}
	/**
	 * @param busValue the busValue to set
	 */
	public void setBusValue(String busValue) {
		this.busValue = busValue;
	}
	
	

}
