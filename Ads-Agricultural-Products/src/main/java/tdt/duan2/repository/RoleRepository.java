package tdt.duan2.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tdt.duan2.entity.RoleEntity;

@Repository
@Transactional
public interface RoleRepository extends IntialInforRepository<RoleEntity>,JpaRepository<RoleEntity, Long> {

}
