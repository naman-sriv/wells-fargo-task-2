package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long security_id;

    @ManyToOne
    @JoinColumn(name="portfolio_id", nullable = true)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date purchase_date;

    @Column(nullable = false)
    private double purchase_price;

    @Column(nullable = false)
    private int quantity;

    protected Security() {}

    public Security(Portfolio portfolio, String name, String category, Date purchase_date, double purchase_price, int quantity ) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchase_date = purchase_date;
        this.purchase_price = purchase_price;
        this.quantity = quantity;
    }

    public long getSecurity_id() { return security_id; }

    public Portfolio getPortfolio() { return portfolio; }

    public String getName() { return name; }

    public String getCategory() { return category; }

    public Date getPurchase_date() { return purchase_date; }

    public double getPurchase_price() { return purchase_price; }

    public int getQuantity() { return quantity; }

    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }

    public void setName(String name) { this.name = name; }

    public void setCategory(String category) { this.category = category; }

    public void setPurchase_price(double purchase_price) { this.purchase_price = purchase_price; }

    public void setPurchase_date(Date purchase_date) { this.purchase_date = purchase_date; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
}
