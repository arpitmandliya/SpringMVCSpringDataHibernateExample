package org.arpit.java2blog.repository;

import org.arpit.java2blog.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country,Integer> { 
    
}