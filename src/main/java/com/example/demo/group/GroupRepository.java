package com.example.demo.group;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//long because id is long
//Student type that we want to work upon
@Repository
public interface GroupRepository extends JpaRepository<Group, Long > {
  //  @Query( "SELECT * FROM Student WHERE email = ?1")
    Optional<Group> findById(Long groupId);

}
