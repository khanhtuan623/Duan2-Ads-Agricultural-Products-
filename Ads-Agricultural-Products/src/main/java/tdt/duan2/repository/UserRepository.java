package tdt.duan2.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tdt.duan2.entity.UserEntity;

@Repository
@Transactional
public interface UserRepository extends IntialInforRepository<UserEntity>,JpaRepository<UserEntity, Long> {
}
