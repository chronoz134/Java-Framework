package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 *
 *
 *
 */
public class EnufPartsValidator implements ConstraintValidator<ValidEnufParts, Product> {
    @Autowired
    private ApplicationContext context;
    public static  ApplicationContext myContext;
    @Override
    public void initialize(ValidEnufParts constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Product product, ConstraintValidatorContext constraintValidatorContext) {
        if (context == null) return true;
        if (context != null) myContext = context;

        ProductService repo = myContext.getBean(ProductServiceImpl.class);

        if (product.getId() != 0) {
            Product myProduct = repo.findById((int) product.getId());

            for (Part p : myProduct.getParts()) {
                int newPartInventory = p.getInv() - (product.getInv() - myProduct.getInv());

                if (newPartInventory < p.getMinInv()) {
                    // Add specific error message for the part causing the issue
                    constraintValidatorContext.disableDefaultConstraintViolation();
                    constraintValidatorContext.buildConstraintViolationWithTemplate(
                            "Part '" + p.getName() + "' would fall below its minimum inventory (" + p.getMinInv() + ") if this product is updated."
                    ).addConstraintViolation();
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }
}
