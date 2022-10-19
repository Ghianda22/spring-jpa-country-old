package com.country.jpa.repository;

import com.country.jpa.model.Continent;
import com.sun.source.tree.ContinueTree;
import org.springframework.data.repository.CrudRepository;

public interface ContinentRepository extends CrudRepository<Continent, Integer> {
}
