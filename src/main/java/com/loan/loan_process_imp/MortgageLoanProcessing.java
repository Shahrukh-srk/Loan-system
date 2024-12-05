package com.loan.loan_process_imp;

import org.springframework.stereotype.Component;

import com.loan.dto.MortgageLoanDTO;
import com.loan.loan_process.LoanProcessing;

@Component("MortgageLoan")
public class MortgageLoanProcessing implements LoanProcessing {

	@Override
	public void processLoan(Object loanDTO) {

		MortgageLoanDTO mortgageLoan = (MortgageLoanDTO) loanDTO;
		System.out.println("Processing Mortgage Loan for " + mortgageLoan.getApplicantName());
	}

}
