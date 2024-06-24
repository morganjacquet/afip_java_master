package com.immo.immo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immo.immo.model.Owner;
import com.immo.immo.repository.OwnerRepository;

@Service
public class OwnerServiceImpl implements OwnerService {

   @Autowired
   OwnerRepository ownerRepository;

    @Override
    public List<Owner> getAll() {
       return ownerRepository.findAll();
   }

    @Override
    public void add(Owner owner) {
        ownerRepository.save(owner);
    }

    @Override
    public void update(Owner owner) {
        if (findById(owner.getId()) != null) {
            ownerRepository.save(owner);
        }
    }

    @Override
    public void delete(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        Optional<Owner> optionalowner = ownerRepository.findById(id);
        if (optionalowner.isPresent()) {
            return optionalowner.get();
        }
        return null;
    }
    
}
