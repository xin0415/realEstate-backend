package com.realEstate.realEstate.bean;

import javax.persistence.*;

@Entity
@Table
public class Offer {
    @Id
    @SequenceGenerator(name="offer_id_seq_gen",sequenceName = "offer_id_seq",allocationSize = 1)
    @GeneratedValue(generator = "offer_id_seq_gen",strategy = GenerationType.AUTO)
    private int id;

//    @Column
//    private int agent_id;
//    @Column
//    private int customer_id;
    @Column
    private int price;
    @Column
    private int house_id;
    @Column
    private String status;

    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.DETACH)
    Agent agent;

    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.DETACH)
    Customer customer;

    public Offer() {
    }

    public Offer(int id, int price, int house_id, String status, Agent agent, Customer customer) {
        this.id = id;
        this.price = price;
        this.house_id = house_id;
        this.status = status;
        this.agent = agent;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", price=" + price +
                ", house_id=" + house_id +
                ", status='" + status + '\'' +
                ", agent=" + agent +
                ", customer=" + customer +
                '}';
    }
}
