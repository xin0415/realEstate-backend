package com.realEstate.realEstate.bean;

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
    @Column
    private int agent_id;
    @Column
    private int offer_id;
    @Column
    private Date begindate;
    @Column
    private Date completeddate;

    public Transaction() {
    }

    public Transaction(int id, String status, int agent_id, int offer_id, Date begindate, Date completedate) {
        this.id = id;
        this.status = status;
        this.agent_id = agent_id;
        this.offer_id = offer_id;
        this.begindate = begindate;
        this.completeddate = completedate;
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

    public int getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(int agent_id) {
        this.agent_id = agent_id;
    }

    public int getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(int offer_id) {
        this.offer_id = offer_id;
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

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", agent_id=" + agent_id +
                ", offer_id=" + offer_id +
                ", begindate=" + begindate +
                ", completeddate=" + completeddate +
                '}';
    }
}
