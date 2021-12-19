package com.bigzkoop.cboapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Society {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long societyID;
    private String name;
    private String address;
    private String description;

    private Long createdDate;
}
