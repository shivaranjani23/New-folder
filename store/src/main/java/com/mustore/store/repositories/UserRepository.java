package com.mustore.store.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mustore.store.model.User;
public interface UserRepository extends JpaRepository< User, Long> {
    User findByEmail(String email);
}
