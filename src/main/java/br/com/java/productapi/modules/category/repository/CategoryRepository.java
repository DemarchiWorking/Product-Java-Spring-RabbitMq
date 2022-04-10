package br.com.java.productapi.modules.category.repository;

import br.com.java.productapi.modules.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}