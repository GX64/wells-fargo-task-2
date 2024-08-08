package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private long quantity;

    protected Security() {

    }

    public Security(long portfolioId, String name, String category,
                    long purchasePrice, String purchaseDate, long quantity) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public long getPortfolioId(){
        return portfolioId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getQuantity() {
        return quantity;
    }
}
