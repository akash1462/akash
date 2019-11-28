package com.cognizant.billpaymentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.billpaymentsystem.model.BillDetails;
import com.cognizant.billpaymentsystem.model.Vendor;

public interface BillRepository extends JpaRepository<BillDetails, Integer>{

	

}
