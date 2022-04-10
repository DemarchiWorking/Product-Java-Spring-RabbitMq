package br.com.java.productapi.modules.product.service;

import br.com.java.productapi.config.exception.ValidationException;
import br.com.java.productapi.modules.category.service.CategoryService;
import br.com.java.productapi.modules.product.dto.ProductRequest;
import br.com.java.productapi.modules.product.dto.ProductResponse;
import br.com.java.productapi.modules.product.model.Product;
import br.com.java.productapi.modules.product.repository.ProductRepository;
import br.com.java.productapi.modules.supplier.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.springframework.util.ObjectUtils.isEmpty;

@Service
public class ProductService {

    private static final Integer ZERO = 0;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private CategoryService categoryService;



    public ProductResponse save(ProductRequest request){
        validateProductDataInformed(request);
        validateCategoryAndSupplierIdInformed(request);
        var category  = categoryService.findById(request.getCategoryId());
        var supplier  = supplierService.findById(request.getCategoryId());
        var product = productRepository.save(Product.of(request, supplier,category));
        return ProductResponse.of(product);

    }

    private void validateProductDataInformed(ProductRequest request){
        if(isEmpty(request.getName())){
            throw new ValidationException("The product name was not informed.");
        }
        if(isEmpty(request.getQuantityAvailable())) {
            throw new ValidationException("The product quantity was not informed.");
        }
        if(request.getQuantityAvailable() <= ZERO) {
            throw new ValidationException("The quantity should not be less or equal to zero.");
        }

    }
    private void validateCategoryAndSupplierIdInformed(ProductRequest request){
        if(isEmpty(request.getCategoryId())){
            throw new ValidationException("The category ID was not informed.");
        }
        if(isEmpty(request.getSupplierId())){
            throw new ValidationException("The category ID was not informed.");
        }
    }

}

