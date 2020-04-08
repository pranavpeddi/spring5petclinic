package com.pranavSpringFramework.Spring.Pet.Clinic.services.map;
import com.pranavSpringFramework.Spring.Pet.Clinic.models.pet;
import com.pranavSpringFramework.Spring.Pet.Clinic.services.CrudService;

import java.util.Set;

public class petMapService extends AbstractMapService<pet,Long> implements CrudService<pet,Long> {
    @Override
    public Set<pet> findAll() {
        return super.findAll();
    }

    @Override
    public pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public pet save(pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(pet object) {
          super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
       super.deleteById(id);
    }
}
