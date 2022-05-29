package lab5.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import lab5.items.Gamepad;


//@RepositoryRestResource(collectionResourceRel = "user1", path = "user")
public interface gamepadRepository extends JpaRepository<Gamepad, Integer> {

//  List<User> findByLastName(@Param("name") String name);

}
