package com.kkwli.order.entity;

import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;

@Data
public class Product {
    @Id
    private Long id;
    private String product_name;
    private Integer status;
    private BigDecimal price;
    private String product_desc;
    private String caption;
    private Integer inventory;


}
