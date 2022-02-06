package com.realEstate.realEstate.bean;

import javax.persistence.*;

@Entity
@Table(name = "houseowner_info")
public class HouseownerInfo {
    @Id
    @SequenceGenerator(name = "houseowner_info_id_seq_gen", sequenceName = "houseowner_info_id_seq",allocationSize = 1)
    @GeneratedValue(generator = "houseowner_info_id_seq_gen",strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private String email;

    public HouseownerInfo() {
    }

    public HouseownerInfo(int id, String ownername, String phone, String email) {
        this.id = id;
        this.name = ownername;
        this.phone = phone;
        this.email = email;
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

    @Override
    public String toString() {
        return "HouseownerInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
