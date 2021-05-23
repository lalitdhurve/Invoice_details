package com.Invoice.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Invoice.details.model.Invoice_details;
import com.Invoice.details.repository.InvoiceRepository;

@RestController
@RequestMapping("/api/v1")
public class InvoiceController {
	
	@Autowired
	private InvoiceRepository invoicerepo;

	@GetMapping("/invoices")
	public List<Invoice_details> getInvoiceDetails()
	{
		return invoicerepo.findAll();
				
	}
}
