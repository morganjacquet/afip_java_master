package com.immo.immo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.immo.immo.model.PropertyType;

public interface PropertyTypeRepository  extends JpaRepository<PropertyType, Long> {
    
}
