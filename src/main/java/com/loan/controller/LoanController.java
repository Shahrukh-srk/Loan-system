package com.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.dto.GoldLoanDTO;
import com.loan.dto.HomeLoanDTO;
import com.loan.dto.MortgageLoanDTO;
import com.loan.dto.VehicleLoanDTO;
import com.loan.service.LoanProcessingService;

@RestController
@RequestMapping("/loans")
public class LoanController {

	@Autowired
	private LoanProcessingService loanProcessingService;

	@PostMapping("/GoldLoan")
	public String processGoldLoan(@RequestBody GoldLoanDTO goldLoanDTO) {
		loanProcessingService.processLoan("GoldLoan", goldLoanDTO);
		return "Gold Loan processed successfully!";
	}
	
	@PostMapping("/HomeLoan")
	public String processHomeLoan(@RequestBody HomeLoanDTO homeLoanDTO) {
		loanProcessingService.processLoan("HomeLoan", homeLoanDTO);
		return "Home Loan processed successfully!";
	}
	
	@PostMapping("/MortgageLoan")
	public String processMortgageLoan(@RequestBody MortgageLoanDTO mortgageLoanDTO) {
		loanProcessingService.processLoan("MortgageLoan", mortgageLoanDTO);
		return "Mortgage Loan processed successfully!";
	}
	
	@PostMapping("/VehicleLoan")
	public String processVehicleLoan(@RequestBody VehicleLoanDTO VehicleLoanDTO) {
		loanProcessingService.processLoan("VehicleLoan", VehicleLoanDTO);
		return "Vehicle Loan processed successfully!";
	}
	// shahrukh husain
}
