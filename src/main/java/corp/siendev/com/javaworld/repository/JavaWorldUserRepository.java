/*
 * Copyright (c) 2020. Iurii Golubnichenko aka Ghost Rider
 */

package corp.siendev.com.javaworld.repository;

import corp.siendev.com.javaworld.model.JavaWorldUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JavaWorldUserRepository extends JpaRepository<JavaWorldUser, Long> {

    Optional<JavaWorldUser> findByUserName(String userName);
    Optional<JavaWorldUser> findByEmail(String email);
}
