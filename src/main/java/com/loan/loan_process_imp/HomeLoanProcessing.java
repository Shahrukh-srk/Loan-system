package com.loan.loan_process_imp;

import org.springframework.stereotype.Component;

import com.loan.dto.HomeLoanDTO;
import com.loan.loan_process.LoanProcessing;

@Component("HomeLoan")
public class HomeLoanProcessing implements LoanProcessing	{

	@Override
	public void processLoan(Object loanDTO) {
		
		 HomeLoanDTO homeLoan = (HomeLoanDTO) loanDTO;
	     System.out.println("Processing Home Loan for " + homeLoan.getApplicantName());		
	}

}
