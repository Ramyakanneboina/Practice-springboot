package com.example.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.Entity.UserEntity;
@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {

}
