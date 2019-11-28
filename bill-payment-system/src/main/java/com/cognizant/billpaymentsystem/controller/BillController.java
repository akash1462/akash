//package com.cognizant.billpaymentsystem.controller;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cognizant.billpaymentsystem.exception.VendorAlreadyExistsException;
//import com.cognizant.billpaymentsystem.model.BillDetails;
//import com.cognizant.billpaymentsystem.model.Vendor;
//import com.cognizant.billpaymentsystem.repository.BillRepository;
//import com.cognizant.billpaymentsystem.service.appBillDetailsService;
//
//@RestController
//@RequestMapping("/bill")
//public class BillController {
//
//	@Autowired
//	BillRepository billRepository;
//	
//	@PostMapping()
//	public void addBill(@RequestBody @Valid BillDetails newBillDetails) throws VendorAlreadyExistsException {
//		appBillDetailsService.addBill(newBillDetails);
//	}
//	
//}
