package com.immo.immo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immo.immo.model.Agent;
import com.immo.immo.repository.AgentRepository;

@Service
public class AgentServiceImpl implements AgentService {

   @Autowired
   AgentRepository agentRepository;

    @Override
    public List<Agent> getAll() {
       return agentRepository.findAll();
   }

    @Override
    public void add(Agent agent) {
        agentRepository.save(agent);
    }

    @Override
    public void update(Agent agent) {
        if (findById(agent.getId()) != null) {
            agentRepository.save(agent);
        }
    }

    @Override
    public void delete(Long id) {
        agentRepository.deleteById(id);
    }

    @Override
    public Agent findById(Long id) {
        Optional<Agent> optionalagent = agentRepository.findById(id);
        if (optionalagent.isPresent()) {
            return optionalagent.get();
        }
        return null;
    }
    
}
