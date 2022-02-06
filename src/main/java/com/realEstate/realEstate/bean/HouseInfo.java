package com.realEstate.realEstate.bean;

import javax.persistence.*;

@Entity
@Table(name = "house_info")
public class HouseInfo {
    @Id
    @SequenceGenerator(name="house_info_id_seq_gen",sequenceName = "house_info_id_seq",allocationSize = 1)
    @GeneratedValue(generator = "house_info_id_seq_gen",strategy = GenerationType.AUTO)
    private int id;
}
