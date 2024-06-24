package com.immo.immo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immo.immo.model.PropertyType;
import com.immo.immo.repository.PropertyTypeRepository;

@Service
public class PropertyTypeServiceImpl implements PropertyTypeService {

   @Autowired
   PropertyTypeRepository propertyTypeRepository;

    @Override
    public List<PropertyType> getAll() {
       return propertyTypeRepository.findAll();
   }

    @Override
    public void add(PropertyType propertyType) {
        propertyTypeRepository.save(propertyType);
    }

    @Override
    public void update(PropertyType propertyType) {
        if (findById(propertyType.getId()) != null) {
            propertyTypeRepository.save(propertyType);
        }
    }

    @Override
    public void delete(Long id) {
        propertyTypeRepository.deleteById(id);
    }

    @Override
    public PropertyType findById(Long id) {
        Optional<PropertyType> optionalPropertyType = propertyTypeRepository.findById(id);
        if (optionalPropertyType.isPresent()) {
            return optionalPropertyType.get();
        }
        return null;
    }
    
}
