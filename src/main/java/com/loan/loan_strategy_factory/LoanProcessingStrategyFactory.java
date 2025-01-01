package com.loan.loan_strategy_factory;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.loan.loan_process.LoanProcessing;

@Component
public class LoanProcessingStrategyFactory {

	    private final Map<String, LoanProcessing> strategyMap;

	    public LoanProcessingStrategyFactory(Map<String, LoanProcessing> strategyMap) {
	        this.strategyMap = strategyMap;
	    }

	    public LoanProcessing getStrategy(String loanType) {
	        return strategyMap.get(loanType);
	    }

		// Husain branch code commit
}
