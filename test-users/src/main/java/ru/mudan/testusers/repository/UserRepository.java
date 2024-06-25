package ru.mudan.testusers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mudan.testentity.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
