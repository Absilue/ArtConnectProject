package com.multi.artConnect.reservation;

import java.sql.Time;

public class ReservationVO {
    private int reservationID;
    private int galleryID;
    private int programID;
    private String memberID;
    private String programTitle;
	private Boolean payment;
    private String reservationTime;
    private String reservationDay;
	private Time galleryOpentime;
	private Time galleryClosetime;
	private int totalPrice;
	private int adultCount;
	private int teenagerCount;
	private int childCount;
	
	public int getAdultCount() {
		return adultCount;
	}
	public void setAdultCount(int adultCount) {
		this.adultCount = adultCount;
	}
	public int getTeenagerCount() {
		return teenagerCount;
	}
	public void setTeenagerCount(int teenagerCount) {
		this.teenagerCount = teenagerCount;
	}
	public int getChildCount() {
		return childCount;
	}
	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getReservationDay() {
		return reservationDay;
	}
	public void setReservationDay(String reservationDay) {
		this.reservationDay = reservationDay;
	}
	public Time getGalleryOpentime() {
		return galleryOpentime;
	}
	public void setGalleryOpentime(Time galleryOpentime) {
		this.galleryOpentime = galleryOpentime;
	}
	public Time getGalleryClosetime() {
		return galleryClosetime;
	}
	public void setGalleryClosetime(Time galleryClosetime) {
		this.galleryClosetime = galleryClosetime;
	}
	public int getReservationID() {
		return reservationID;
	}
	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}
	public int getGalleryID() {
		return galleryID;
	}
	public void setGalleryID(int galleryID) {
		this.galleryID = galleryID;
	}
	public int getProgramID() {
		return programID;
	}
	public void setProgramID(int programID) {
		this.programID = programID;
	}
	public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	public String getProgramTitle() {
		return programTitle;
	}
	public void setProgramTitle(String programTitle) {
		this.programTitle = programTitle;
	}
	public Boolean getPayment() {
		return payment;
	}
	public void setPayment(Boolean payment) {
		this.payment = payment;
	}
	public String getReservationTime() {
		return reservationTime;
	}
	public void setReservationTime(String reservationTime) {
		this.reservationTime = reservationTime;
	}
    
}
