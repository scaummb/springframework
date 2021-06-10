package com.example.framework.singleton;

/**
 * @author moubin.mo
 * @date: 2021/2/21 20:47
 */

public class Car {
	private int maxspeed;
	private String brand;
	private double prise;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrise() {
		return prise;
	}

	public void setPrise(double prise) {
		this.prise = prise;
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
}
