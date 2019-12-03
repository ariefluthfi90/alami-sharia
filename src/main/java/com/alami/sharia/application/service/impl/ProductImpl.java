package com.alami.sharia.application.service.impl;

import com.alami.sharia.application.handler.exception.NotFoundException;
import com.alami.sharia.application.service.interfaces.ProductService;
import com.alami.sharia.application.service.model.Product;
import com.alami.sharia.application.service.repository.ProductRepository;
import com.alami.sharia.application.util.GetterSetterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service(value = "productService")
public class ProductImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    private Product product;

    @Override
    public List<Product> listProductBySellerId(String sellerId) {
        return productRepository.findBySellerId(sellerId);
    }

    @Override
    public List<Product> searchProductByKeyword(String name) {
        return productRepository.findByNameContaining(name);
    }

    @Override
    public List<?> GetAll() {
        return productRepository.findAll();
    }

    @Override
    public Object Get(String id) throws NotFoundException {
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional.orElseThrow(NotFoundException::new);
    }

    @Override
    public Object Post(Object object) {
        ((Product) object).setCreatedDate(new Date());
        ((Product) object).setModifiedDate(new Date());
        return productRepository.save((Product) object);
    }

    @Override
    public Object Put(String id, Object object) throws NotFoundException {
        Product newProduct = (Product) object;
        product = (Product) GetterSetterUtil.invoke(this.Get(id), newProduct, Product.class);
        return productRepository.save(product);
    }

    @Override
    public Object Delete(String id) throws NotFoundException {
        product = (Product) this.Get(id);
        productRepository.deleteById(id);
        return product;
    }
}
