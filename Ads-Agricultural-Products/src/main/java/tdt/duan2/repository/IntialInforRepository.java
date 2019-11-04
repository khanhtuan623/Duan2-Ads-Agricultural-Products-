package tdt.duan2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import tdt.duan2.entity.BaseEntity;

@NoRepositoryBean
public interface IntialInforRepository<T extends BaseEntity> extends CrudRepository<T, Long> {
}
