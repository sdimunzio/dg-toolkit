package org.devgateway.toolkit.persistence.repository.category;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author idobre
 * @since 11/20/14
 */

@NoRepositoryBean
@Transactional
public interface TextSearchableRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {
	
	@Override
	Page<T> findAll(Pageable pageable);
	
    Page<T> searchText(String code, Pageable page);
}