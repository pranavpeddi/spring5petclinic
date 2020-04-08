package com.pranavSpringFramework.Spring.Pet.Clinic.services.map;

import com.pranavSpringFramework.Spring.Pet.Clinic.services.CrudService;
import com.pranavSpringFramework.Spring.Pet.Clinic.models.vet;

import java.util.Set;

public class vetMapService extends AbstractMapService<vet,Long> implements CrudService<vet,Long>
{
    @Override
    public Set<vet> findAll() {
        return super.findAll();
    }

    @Override
    public vet findById(Long id) {
        return  super.findById(id);
    }

    @Override
    public vet save(vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
       super.deleteById(id);
    }
}
