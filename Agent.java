package com.java.agent;

public class Agent {
	private String name;
	private String city;
	private Gender gender;
	private int maritalstatus;
	private double premium;
	private int agentid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(int maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public int getAgentid() {
		return agentid;
	}
	public void setAgentid(int agentid) {
		this.agentid = agentid;
	}
	@Override
	public String toString() {
		return "Agent [name=" + name + ", city=" + city + ", gender=" + gender + ", maritalstatus=" + maritalstatus
				+ ", premium=" + premium + ", agentid=" + agentid + "]";
	}
	
	
	

}
