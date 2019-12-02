package com.alami.sharia.application.service.interfaces;

import com.alami.sharia.application.service.model.Product;

import java.util.List;

public interface ProductService extends BaseService {

    List<Product> listProductBySellerId(String sellerId);
    List<Product> searchProductByKeyword(String name);

}
