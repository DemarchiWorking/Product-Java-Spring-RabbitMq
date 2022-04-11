package br.com.java.productapi.modules.supplier.repository;

import br.com.java.productapi.modules.category.model.Category;
import br.com.java.productapi.modules.supplier.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

    List<Supplier> findByNameIgnoreCase(String name);
}
