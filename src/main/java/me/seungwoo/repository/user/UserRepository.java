package me.seungwoo.repository.user;

import me.seungwoo.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(String id);

    // ✅ 아이디 중복체크용
    boolean existsById(String id);
}