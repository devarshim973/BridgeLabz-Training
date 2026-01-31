package com.StreamAPI.StreamAPI.InsuranceClaimAnalysis;

import java.util.*;
import java.util.stream.*;

public class InsuranceClaimAnalysis {

    public static void main(String[] args) {

        List<InsuranceClaim> claims = Arrays.asList(
            new InsuranceClaim("CL001", "Health", 50000),
            new InsuranceClaim("CL002", "Vehicle", 30000),
            new InsuranceClaim("CL003", "Health", 70000),
            new InsuranceClaim("CL004", "Life", 100000),
            new InsuranceClaim("CL005", "Vehicle", 40000)
        );

        Map<String, Double> averageClaimByType =
                claims.stream()
                      .collect(Collectors.groupingBy(
                          InsuranceClaim::getClaimType,
                          Collectors.averagingDouble(InsuranceClaim::getClaimAmount)
                      ));

        averageClaimByType.forEach((type, avg) ->
            System.out.println(type + " → Average Claim Amount: " + avg)
        );
    }
}
