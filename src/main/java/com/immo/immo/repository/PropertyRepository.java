
package com.immo.immo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.immo.immo.model.Property;

public interface PropertyRepository  extends JpaRepository<Property, String> {
    
}
