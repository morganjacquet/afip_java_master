package com.immo.immo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.immo.immo.model.Agent;

public interface AgentRepository  extends JpaRepository<Agent, Long> {
    
}
