package com.kesav.AccessSpecifiers;

public class AccessSpecifiers1 {
	private int foodId;
	private String foodName;
	private double foodPrice;
	
	public AccessSpecifiers1(final int foodId, final String foodName, final double foodPrice) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}
	public AccessSpecifiers1() {
		// TODO Auto-generated constructor stub
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String toString() {
		return foodId + "#" + foodName + "#" + foodPrice + "#";
	}
}

