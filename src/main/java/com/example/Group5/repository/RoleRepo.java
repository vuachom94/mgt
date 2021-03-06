package com.example.Group5.repository;

import com.example.Group5.entity.AppRole;
import com.example.Group5.entity.AppUser;
import com.example.Group5.entity.UserRole;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface RoleRepo extends PagingAndSortingRepository<UserRole, Long> {
    List<UserRole> findAllByAppRole(Optional<AppRole> a);
    List<UserRole> findByAppUser(AppUser b);
}
