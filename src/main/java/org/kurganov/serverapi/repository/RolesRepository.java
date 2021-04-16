package org.kurganov.serverapi.repository;


import org.kurganov.serverapi.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {

    Roles findOneByName(String roleName);

    List<Roles> findAll();

}
