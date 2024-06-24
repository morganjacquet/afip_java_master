package com.immo.immo.service;

import java.util.List;

import com.immo.immo.model.PropertyType;

public interface PropertyTypeService {
 public List<PropertyType> getAll();
 public void add(PropertyType propertyType);
 public void update(PropertyType propertyType);
 public void delete(Long id);
 public PropertyType findById(Long id);
}
