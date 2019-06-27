package com.gaalaxy.api.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    @Query(value = "select * from users where dsUser = ? and dsPass = ?", nativeQuery = true)
    UserEntity getUserEntityByDsUserAndDsPass(String dsUser, String dsPass);

}
