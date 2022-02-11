package com.realEstate.realEstate.bean;

import javax.persistence.*;

@Entity
@Table
public class Offer {
    @Id
    @SequenceGenerator(name="offer_id_seq_gen",sequenceName = "offer_id_seq",allocationSize = 1)
    @GeneratedValue(generator = "offer_id_seq_gen",strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int agent_id;
    @Column
    private int customer_id;
    @Column
    private int price;
    @Column
    private int house_id;
    @Column
    private String status;

    public Offer() {
    }

    public Offer(int id, int agent_id, int customer_id, int price, int house_id, String status) {
        this.id = id;
        this.agent_id = agent_id;
        this.customer_id = customer_id;
        this.price = price;
        this.house_id = house_id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(int agent_id) {
        this.agent_id = agent_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
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

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", agent_id=" + agent_id +
                ", customer_id=" + customer_id +
                ", price=" + price +
                ", house_id=" + house_id +
                ", status='" + status + '\'' +
                '}';
    }
}
