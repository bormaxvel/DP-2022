package lab5.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import lab5.items.Gamepad;
import lab5.items.table2;


//@RepositoryRestResource(collectionResourceRel = "user1", path = "user")
@RepositoryRestResource
@CrossOrigin(origins = "*")

public interface table2Repository extends JpaRepository<table2, Integer> {

//  List<User> findByLastName(@Param("name") String name);

}
