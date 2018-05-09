package dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import domanin.BaseEntity;

@NoRepositoryBean
public interface GenericDao<T extends BaseEntity, PK extends Serializable>
		extends JpaRepository<T, PK>, JpaSpecificationExecutor<T> {
}
