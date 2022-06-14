package Exam.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import Exam.items.Gamepad;


//@RepositoryRestResource(collectionResourceRel = "user1", path = "user")
@RepositoryRestResource
@CrossOrigin(origins = "*")

public interface gamepadRepository extends JpaRepository<Gamepad, Integer> {

//  List<User> findByLastName(@Param("name") String name);

}
