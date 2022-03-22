package com.freshvotes.repositories;

import com.freshvotes.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Emma_Lyy
 * @create 2022-03-22 16:39
 */
public interface UserRepository extends JpaRepository<User,Long> {


    User findByUsername(String username);

}
