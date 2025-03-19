package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long portfolio_id;

    @ManyToOne
    @JoinColumn(name="client_id", nullable = false)
    private Client client;

    protected Portfolio() {}

    public Portfolio(Client client){
        this.client =  client;
    }

    public long getPortfolio_id() { return portfolio_id; }

    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }
}
