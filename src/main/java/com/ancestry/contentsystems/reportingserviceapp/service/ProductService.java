package com.ancestry.contentsystems.reportingserviceapp.service;

import java.util.Collection;
import com.ancestry.contentsystems.reportingserviceapp.model.Product;

public interface ProductService {
    public abstract void createProduct(Product product);
    public abstract void updateProduct(String id, Product product);
    public abstract void deleteProduct(String id);
    public abstract Collection<Product> getProducts();
}
