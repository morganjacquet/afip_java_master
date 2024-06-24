package com.immo.immo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.immo.immo.model.Owner;

public interface OwnerRepository  extends JpaRepository<Owner, Long> {
    
}
