package com.Invoice.details.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Invoice_details_system")
public class Invoice_details {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long invoice_id;
	
	@Column(name="invoice_date")
	private  String invoice_date;
	
	@Column(name="booking_id")
	private long booking_id;
	
	
	@Column(name="travelreqno")
	private String travelreqno;
	
	
	@Column(name="guest_name")
	private String guest_name;
	
	@Column(name="room_type")
	private String room_type;
	
	
	@Column(name="stay_duration")
	private String stay_duration;
	
	
	@Column(name="tcs_cost")
	private String tcs_cost;
	
	
	@Column(name="invoice_status")
	private String invoice_status;


	public Invoice_details() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Invoice_details(long invoice_id, String invoice_date, long booking_id, String travelreqno, String guest_name,
			String room_type, String stay_duration, String tcs_cost, String invoice_status) {
		super();
		this.invoice_id = invoice_id;
		this.invoice_date = invoice_date;
		this.booking_id = booking_id;
		this.travelreqno = travelreqno;
		this.guest_name = guest_name;
		this.room_type = room_type;
		this.stay_duration = stay_duration;
		this.tcs_cost = tcs_cost;
		this.invoice_status = invoice_status;
	}


	public long getInvoice_id() {
		return invoice_id;
	}


	public void setInvoice_id(long invoice_id) {
		this.invoice_id = invoice_id;
	}


	public String getInvoice_date() {
		return invoice_date;
	}


	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
	}


	public long getBooking_id() {
		return booking_id;
	}


	public void setBooking_id(long booking_id) {
		this.booking_id = booking_id;
	}


	public String getTravelreqno() {
		return travelreqno;
	}


	public void setTravelreqno(String travelreqno) {
		this.travelreqno = travelreqno;
	}


	public String getGuest_name() {
		return guest_name;
	}


	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}


	public String getRoom_type() {
		return room_type;
	}


	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}


	public String getStay_duration() {
		return stay_duration;
	}


	public void setStay_duration(String stay_duration) {
		this.stay_duration = stay_duration;
	}


	public String getTcs_cost() {
		return tcs_cost;
	}


	public void setTcs_cost(String tcs_cost) {
		this.tcs_cost = tcs_cost;
	}


	public String getInvoice_status() {
		return invoice_status;
	}


	public void setInvoice_status(String invoice_status) {
		this.invoice_status = invoice_status;
	}
	
	
	
	
	
	
	
	
	

}
