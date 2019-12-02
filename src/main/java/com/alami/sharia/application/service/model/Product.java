package com.alami.sharia.application.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product_tbl")
public class Product extends Audit {

    @Column(name = "seller_id")
    private String sellerId;

    @Column(name = "name")
    private String name;

    @Column(name = "uom")
    private String uom;

    @Column(name = "price")
    private int price;

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
