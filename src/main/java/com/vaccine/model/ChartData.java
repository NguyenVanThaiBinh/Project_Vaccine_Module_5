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

    int injecterNumber;

}
