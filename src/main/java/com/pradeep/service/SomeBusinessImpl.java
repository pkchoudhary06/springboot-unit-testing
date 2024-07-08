package com.pradeep.service;

import java.util.Arrays;

import com.pradeep.repository.SomeDataService;

public class SomeBusinessImpl {

    private SomeDataService someDataService;

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    public int calculateSum(int[] data) {
        //Functional Style
        return Arrays.stream(data).reduce(Integer::sum).orElse(0);

		/*
		int sum = 0;
		for(int value:data) {
			sum += value;
		}
		return sum;
		*/
    }

    public int calculateSumUsingDataService() {
        int sum = 0;
        int[] data = someDataService.retrieveAllData();
        for(int value:data) {
            sum += value;
        }

        //someDataService.storeSum(sum);
        return sum;
        //Functional Style
        //return Arrays.stream(data).reduce(Integer::sum).orElse(0);
    }

}

