package com.alami.sharia.application.service.impl;

import com.alami.sharia.application.handler.exception.NotFoundException;
import com.alami.sharia.application.service.interfaces.SellerService;
import com.alami.sharia.application.service.model.Seller;
import com.alami.sharia.application.service.repository.SellerRepository;
import com.alami.sharia.application.util.GetterSetterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service(value = "sellerService")
public class SellerImpl implements SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    private Seller seller;

    @Override
    public List<?> GetAll() {
        return sellerRepository.findAll();
    }

    @Override
    public Object Get(String id) throws NotFoundException {
        Optional<Seller> sellerOptional = sellerRepository.findById(id);
        return sellerOptional.orElseThrow(NotFoundException::new);
    }

    @Override
    public Object Post(Object object) {
        ((Seller) object).setCreatedDate(new Date());
        ((Seller) object).setModifiedDate(new Date());
        return sellerRepository.save((Seller) object);
    }

    @Override
    public Object Put(String id, Object object) throws NotFoundException {
        Seller newSeller = (Seller) object;
        seller = (Seller) GetterSetterUtil.invoke(this.Get(id), newSeller, Seller.class);
        return sellerRepository.save(seller);
    }

    @Override
    public Object Delete(String id) throws NotFoundException {
        seller = (Seller) this.Get(id);
        sellerRepository.delete(seller);
        return seller;
    }
}
