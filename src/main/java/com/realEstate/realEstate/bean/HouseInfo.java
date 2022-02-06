package com.realEstate.realEstate.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "house_info")
public class HouseInfo {
    @Id
    @SequenceGenerator(name="house_info_id_seq_gen",sequenceName = "house_info_id_seq",allocationSize = 1)
    @GeneratedValue(generator = "house_info_id_seq_gen",strategy = GenerationType.AUTO)
    private int id;
    @Column
    private Date postdate;
    @Column
    private int owner_id;
    @Column
    private String address1;
    @Column
    private String address2;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String zip;
    @Column
    private int agent_id;
    @Column
    private String image;
    @Column
    private String status;
    @Column
    private String type;
    @Column
    private int price;

    public HouseInfo() {
    }

    public HouseInfo(int id, Date postdate, int owner_id, String address1, String address2, String city, String state, String zip, int agent_id, String image, String status, String type, int price) {
        this.id = id;
        this.postdate = postdate;
        this.owner_id = owner_id;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.agent_id = agent_id;
        this.image = image;
        this.status = status;
        this.type = type;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPostdate() {
        return postdate;
    }

    public void setPostdate(Date postdate) {
        this.postdate = postdate;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(int agent_id) {
        this.agent_id = agent_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HouseInfo{" +
                "id=" + id +
                ", postdate=" + postdate +
                ", owner_id=" + owner_id +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", agent_id=" + agent_id +
                ", image='" + image + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
