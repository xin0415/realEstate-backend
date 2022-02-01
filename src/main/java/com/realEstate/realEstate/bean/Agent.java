package com.realEstate.realEstate.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Agent {
    @Id
    @SequenceGenerator(name="agent_id_seq_gen", sequenceName = "agent_id_seq",allocationSize=1)
    @GeneratedValue(generator="agent_id_seq_gen", strategy=GenerationType.AUTO)
    private int id;

    @Column
    private String email;
    @Column
    private String password;

    @Column
    private String name;

    @ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.DETACH)
    @JoinTable(
            name = "agent_profile",
            joinColumns = {
                    @JoinColumn(name = "agent_id",referencedColumnName = "ID")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "profile_id",referencedColumnName = "ID")
            }
    )
    private List<Profile> profiles;

    public Agent() {
    }

    public Agent(int id, String email, String password, String name, List<Profile> profiles) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.profiles=profiles;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
