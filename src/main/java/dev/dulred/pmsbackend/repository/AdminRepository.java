package dev.dulred.pmsbackend.repository;

import dev.dulred.pmsbackend.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository {
    User login (User user);
}
