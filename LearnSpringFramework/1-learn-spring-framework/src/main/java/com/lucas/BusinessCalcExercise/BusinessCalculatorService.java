package com.lucas.BusinessCalcExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculatorService {
    private DataService dataService;

    @Autowired
    public BusinessCalculatorService(DataService ds) {
        this.dataService = ds;
    }
    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
