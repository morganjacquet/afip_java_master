package com.immo.immo.service;

import java.util.List;

import com.immo.immo.model.Agent;

public interface AgentService {
 public List<Agent> getAll();
 public void add(Agent agent);
 public void update(Agent agent);
 public void delete(Long id);
 public Agent findById(Long id);
}
