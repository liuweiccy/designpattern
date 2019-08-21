package com.liuwei.designpattern.responsibilitychain.example1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PurchaseRequest {
    private int amount;
    private int number;
    private String purpose;
}
