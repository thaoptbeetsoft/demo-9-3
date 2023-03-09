package com.example.democrud.Repository;

import com.example.democrud.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    @Query(value = "select * from CRM.user u where u.name=:name",nativeQuery = true)
    List<User> findByNameContaining(String name);
//    List<User> findByNameContaining(String name);

}
