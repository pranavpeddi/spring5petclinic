package com.pranavSpringFramework.Spring.Pet.Clinic.services;


import com.pranavSpringFramework.Spring.Pet.Clinic.models.owner;

import java.util.Set;

public interface OwnerService extends CrudService<owner ,Long> {
    owner findByLastName(String LastName);


}
