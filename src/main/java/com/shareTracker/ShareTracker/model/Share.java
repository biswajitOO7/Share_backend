package com.shareTracker.ShareTracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Share {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String share_name;
    private String buy_price;
    private String buy_quantity;
    private String sell_price;
    private String sell_quantity;
    private String total;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShare_name() {
        return share_name;
    }

    public void setShare_name(String share_name) {
        this.share_name = share_name;
    }

    public String getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(String buy_price) {
        this.buy_price = buy_price;
    }

    public String getBuy_quantity() {
        return buy_quantity;
    }

    public void setBuy_quantity(String buy_quantity) {
        this.buy_quantity = buy_quantity;
    }

    public String getSell_price() {
        return sell_price;
    }

    public void setSell_price(String sell_price) {
        this.sell_price = sell_price;
    }

    public String getSell_quantity() {
        return sell_quantity;
    }

    public void setSell_quantity(String sell_quantity) {
        this.sell_quantity = sell_quantity;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }




}
