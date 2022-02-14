package com.realEstate.realEstate.bean;

import javax.persistence.*;

@Entity
@Table
public class Customer {
    @Id
    @SequenceGenerator(name = "customer_id_seq_gen",sequenceName = "customer_id_seq",allocationSize = 1)
    @GeneratedValue(generator = "customer_id_seq_gen", strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private String required;
    @Column
    private int bedroom;
    @Column
    private int bathroom;
    @Column
    private int agent_id;
    @Column
    private String status;

    public Customer() {
    }

    public Customer(int id, String name, String phone, String email, String required, int bedroom, int bathroom, int agent_id, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.required = required;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.agent_id = agent_id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(int agent_id) {
        this.agent_id = agent_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", required='" + required + '\'' +
                ", bedroom=" + bedroom +
                ", bathroom=" + bathroom +
                ", agent_id=" + agent_id +
                ", status=" + status +
                '}';
    }
}
