package com.realEstate.realEstate.bean;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_role")
public class Profile implements GrantedAuthority {
    @Id
    private int id;

    @Column
    private String type;

    public Profile() {
    }
    public Profile(int id){
        this.id=id;
    }

    public Profile(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    public String getAuthority(){
        return type;
    }
}
