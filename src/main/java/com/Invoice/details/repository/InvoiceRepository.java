package com.Invoice.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Invoice.details.model.Invoice_details;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice_details, Long>{

}
