package com.immo.immo.service;

import java.util.List;

import com.immo.immo.model.Owner;

public interface OwnerService {
 public List<Owner> getAll();
 public void add(Owner owner);
 public void update(Owner owner);
 public void delete(Long id);
 public Owner findById(Long id);
}
