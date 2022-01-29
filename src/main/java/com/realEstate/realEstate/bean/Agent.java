package com.realEstate.realEstate.bean;

import javax.persistence.*;

@Entity
@Table
public class Agent {
    @Id
//    @SequenceGenerator(name="agent_id_seq_gen", sequenceName = "agent_id_seq",allocationSize=1);
//    @GeneratedValue(generator="agent_id_seq_gen", strategy=GenerationType.AUTO);
    private int id;

    @Column
    private String email;
    @Column
    private String password;
    @Column
    private int role_id;
    @Column
    private String name;

    public Agent() {
    }

    public Agent(int id, String email, String password, int role_id, String name) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role_id = role_id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role_id=" + role_id +
                ", name='" + name + '\'' +
                '}';
    }
}
