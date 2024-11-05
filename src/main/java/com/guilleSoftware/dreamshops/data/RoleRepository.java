package com.guilleSoftware.dreamshops.data;

import com.guilleSoftware.dreamshops.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(String role);
}
