package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(long clientId, String creationDate) {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setDate(String date) {
        this.creationDate = date;
    }

    public String getDate() {
        return creationDate;
    }
}
