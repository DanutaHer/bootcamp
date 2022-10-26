package pl.dana.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.dana.bootcamp.model.Rolee;

@Repository
public interface RoleeRepository extends JpaRepository<Rolee, Long> {

	Rolee findByRoleeName(String roleeName);
}
