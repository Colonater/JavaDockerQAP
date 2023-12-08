package org.example.aircraft;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "aircraft",collectionResourceRel = "aircraft")
public interface aircraftapi extends JpaRepository<Aircraft,Long> {

}