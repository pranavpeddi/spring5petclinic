package com.pranavSpringFramework.Spring.Pet.Clinic.services.map;

import com.pranavSpringFramework.Spring.Pet.Clinic.models.owner;
import com.pranavSpringFramework.Spring.Pet.Clinic.services.CrudService;


import java.util.Set;

public class OwnerMapService extends AbstractMapService<owner,Long> implements CrudService<owner,Long> {
    @Override
    public Set<owner> findAll() {
        return  super.findAll();
    }

    @Override
    public owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public owner save(owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(owner object) {
   super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }
}
