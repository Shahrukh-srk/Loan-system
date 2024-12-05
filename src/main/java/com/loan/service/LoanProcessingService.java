package com.loan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loan_process.LoanProcessing;
import com.loan.loan_strategy_factory.LoanProcessingStrategyFactory;

@Service
public class LoanProcessingService {

	@Autowired
	private LoanProcessingStrategyFactory strategyFactory;

	public void processLoan(String loanType, Object loanDTO) {
		LoanProcessing strategy = strategyFactory.getStrategy(loanType);
		if (strategy != null) {
			strategy.processLoan(loanDTO);
		} else {
			throw new IllegalArgumentException("Invalid loan type: " + loanType);
		}
	}
}
