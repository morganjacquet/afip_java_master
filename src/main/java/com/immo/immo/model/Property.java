package com.immo.immo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Data
@Table(name = "property")
public class Property {
    @Id
    @Column(name = "property_id")
    private String propertyId;

    @Column(name = "address")
    private String address;

    @Column(name = "sale_date")
    private Date saleDate;

    @Column(name = "sale_price")
    private BigDecimal salePrice;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PropertyType propertyType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
}
