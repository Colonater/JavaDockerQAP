package org.example.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "city", collectionResourceRel = "city")
public interface cityapi extends JpaRepository<City, Long> {

}
