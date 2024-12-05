package com.loan.loan_process_imp;

import org.springframework.stereotype.Component;

import com.loan.dto.VehicleLoanDTO;
import com.loan.loan_process.LoanProcessing;

@Component("VehicleLoan")
public class VehicleLoanProcessing implements LoanProcessing {

	@Override
	public void processLoan(Object loanDTO) {
		VehicleLoanDTO vehicleLoan = (VehicleLoanDTO) loanDTO;
        System.out.println("Processing Vehicle Loan for " + vehicleLoan.getApplicantName());		
	}

}
