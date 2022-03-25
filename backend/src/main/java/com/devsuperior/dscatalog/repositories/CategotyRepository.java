package com.devsuperior.dscatalog.repositories;

import com.devsuperior.dscatalog.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategotyRepository extends JpaRepository<Category,Long> {

}
