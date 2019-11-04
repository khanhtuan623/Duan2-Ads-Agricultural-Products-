package tdt.duan2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import tdt.duan2.entity.IntialInforEntity;

@NoRepositoryBean
public interface IntialInforRepository<T extends IntialInforEntity> extends JpaRepository<T, Long> {
}
