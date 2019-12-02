package com.alami.sharia.application.controller;

import com.alami.sharia.application.constants.ControllerConstants;
import com.alami.sharia.application.handler.exception.InternalServerErrorException;
import com.alami.sharia.application.handler.exception.NotFoundException;
import com.alami.sharia.application.handler.response.ResponseHandler;
import com.alami.sharia.application.service.interfaces.ProductService;
import com.alami.sharia.application.service.model.Product;
import com.alami.sharia.application.util.ParseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping(ControllerConstants.BASE_URL)
public class ProductController extends BaseController{

    private static final String BASE_URL = "/product";
    private static final String BASE_URL_WITH_ID = BASE_URL + "/id/{id}";

    @Autowired
    private ProductService productService;

    @GetMapping(BASE_URL + "/seller/{sellerId}")
    public ResponseEntity<?> GetListProductBySellerId(@PathVariable String sellerId){
        return ResponseHandler.returnResponse(productService.listProductBySellerId(sellerId));
    }

    @GetMapping(BASE_URL + "/search/{keyword}")
    public ResponseEntity<?> SearchProductByKeyword(@PathVariable String keyword){
        return ResponseHandler.returnResponse(productService.searchProductByKeyword(keyword));
    }

    @Override
    @GetMapping(BASE_URL)
    public ResponseEntity<?> GetAll() {
        return ResponseHandler.returnResponse(productService.GetAll());
    }

    @Override
    @GetMapping(BASE_URL_WITH_ID)
    public ResponseEntity<?> Get(@PathVariable String id) throws NotFoundException {
        return ResponseHandler.returnResponse(Optional
                .of(productService.Get(id))
                .orElseThrow(NotFoundException::new));
    }

    @Override
    @PostMapping(BASE_URL)
    public ResponseEntity<?> Post(@Valid @RequestBody Object object) throws InternalServerErrorException {
        return ResponseHandler
                .returnResponse(Optional.of(productService.Post(ParseUtil.parseObject(object, Product.class)))
                .orElseThrow(InternalServerErrorException::new));
    }

    @Override
    @PutMapping(BASE_URL_WITH_ID)
    public ResponseEntity<?> Put(@PathVariable String id, @Valid @RequestBody Object object) throws NotFoundException {
        return ResponseHandler
                .returnResponse(Optional.of(productService.Put(id, ParseUtil.parseObject(object, Product.class)))
                .orElseThrow(NotFoundException::new));
    }

    @Override
    @DeleteMapping(BASE_URL_WITH_ID)
    public ResponseEntity<?> Delete(@PathVariable String id) throws NotFoundException {
        return ResponseHandler
                .returnResponse(Optional.of(productService.Delete(id))
                .orElseThrow(NotFoundException::new));
    }
}
