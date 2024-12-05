package com.loan.loan_process_imp;

import org.springframework.stereotype.Component;

import com.loan.dto.GoldLoanDTO;
import com.loan.loan_process.LoanProcessing;

@Component("GoldLoan")
public class GoldLoanProcessing implements LoanProcessing  {

	@Override
	public void processLoan(Object loanDTO) {
		
		GoldLoanDTO goldLoan = (GoldLoanDTO) loanDTO;
        System.out.println("Processing Gold Loan for " + goldLoan.getApplicantName());
		
	}

	
}
