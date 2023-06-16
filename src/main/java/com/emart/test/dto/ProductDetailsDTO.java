package com.emart.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailsDTO {
	private Integer productid;
    private Double cardholderprice;
    private Float discount;
    private Integer pointredm;
    private Double price;
    private String productimagpath;
    private String productshortdesc;
    private String productlongdesc;
    private String productname;
    private String configdtl;
    private Integer configid;
    private String configname;
}
