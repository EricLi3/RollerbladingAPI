package com.rollerblading.demo.repo;

import com.rollerblading.demo.model.Rollerblades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RollerbladesRepo extends JpaRepository{
}
