package com.realEstate.realEstate.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Transaction {
    @Id
    @SequenceGenerator(name="transaction_id_seq_gen",sequenceName = "transaction_id_seq",allocationSize = 1)
    @GeneratedValue(generator = "transaction_id_seq_gen",strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String status;
//    @Column
//    private int agent_id;
//    @Column
//    private int offer_id;
    @Column
    private Date begindate;
    @Column
    private Date completeddate;

    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.DETACH)
    Agent agent;
//    @OneToOne
//    @JoinColumn(name = "offer_id")
//    @JsonIgnore
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.DETACH)
    Offer offer;


    public Transaction() {
    }

    public Transaction(int id, String status, Date begindate, Date completeddate, Agent agent, Offer offer) {
        this.id = id;
        this.status = status;
        this.begindate = begindate;
        this.completeddate = completeddate;
        this.agent = agent;
        this.offer = offer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getCompleteddate() {
        return completeddate;
    }

    public void setCompleteddate(Date completedate) {
        this.completeddate = completedate;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", begindate=" + begindate +
                ", completeddate=" + completeddate +
                ", agent=" + agent +
                ", offer=" + offer +
                '}';
    }
}
