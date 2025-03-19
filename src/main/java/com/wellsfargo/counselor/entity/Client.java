package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long client_id;

    @ManyToOne
    @JoinColumn(name="advisor_id", nullable = false)
    private FinancialAdvisor advisor;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    protected Client() {}

    public Client(FinancialAdvisor advisor, String firstname, String lastname, String email, String phone){
        this.advisor = advisor;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
    }

    public FinancialAdvisor getAdvisor() { return advisor; }

    public long getClient_id() { return client_id; }

    public String getFirstname() { return firstname; }

    public String getLastname() { return lastname; }

    public String getEmail() { return email; }

    public String getPhone() { return phone; }

    public void setAdvisor(FinancialAdvisor advisor) { this.advisor = advisor; }

    public void setLastname(String lastname) { this.lastname = lastname; }

    public void setFirstname(String firstname) { this.firstname = firstname; }

    public void setEmail(String email) { this.email = email; }

    public void setPhone(String phone) { this.phone = phone; }
}
