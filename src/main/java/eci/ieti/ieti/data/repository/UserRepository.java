package eci.ieti.ieti.data.repository;

import eci.ieti.ieti.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}