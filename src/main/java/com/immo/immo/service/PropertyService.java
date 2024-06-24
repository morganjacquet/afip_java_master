package com.immo.immo.service;

import java.util.List;

import com.immo.immo.model.Property;

public interface PropertyService {
 public List<Property> getAll();
 public void add(Property owner);
 public void update(Property owner);
 public void delete(String id);
 public Property findById(String id);
}
