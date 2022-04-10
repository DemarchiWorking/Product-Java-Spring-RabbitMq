package br.com.java.productapi.modules.category.service;

import br.com.java.productapi.config.exception.ValidationException;
import br.com.java.productapi.modules.category.dto.CategoryRequest;
import br.com.java.productapi.modules.category.dto.CategoryResponse;
import br.com.java.productapi.modules.category.model.Category;
import br.com.java.productapi.modules.category.repository.CategoryRepository;
import br.com.java.productapi.modules.supplier.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static org.springframework.util.ObjectUtils.isEmpty;
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category findById(Integer id){
        return categoryRepository
                .findById(id)
                .orElseThrow(() -> new ValidationException("There's no supplier for the given ID."));

    }
    public CategoryResponse save(CategoryRequest request){
        validateCategoryDescriptionInformed(request);
        var category = categoryRepository.save(Category.of(request));
        return CategoryResponse.of(category);

    }

    private void validateCategoryDescriptionInformed(CategoryRequest request){
        if(isEmpty(request.getDescription())){
            throw new ValidationException("The category description was not informed.");
        }
    }
}
