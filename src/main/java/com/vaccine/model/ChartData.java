package com.vaccine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class ChartData {

    String dateVaccine;

    int registerNumber;

    int injectedNumber;

    String destination;

    public ChartData(String dateVaccine, int registerNumber, int injectedNumber) {
        this.dateVaccine = dateVaccine;
        this.registerNumber = registerNumber;
        this.injectedNumber = injectedNumber;
    }

    public ChartData(int registerNumber, int injectedNumber, String destination) {
        this.registerNumber = registerNumber;
        this.injectedNumber = injectedNumber;
        this.destination = destination;
    }
}
