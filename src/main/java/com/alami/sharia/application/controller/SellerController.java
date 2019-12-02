package com.alami.sharia.application.controller;

import com.alami.sharia.application.constants.ControllerConstants;
import com.alami.sharia.application.handler.exception.InternalServerErrorException;
import com.alami.sharia.application.handler.exception.NotFoundException;
import com.alami.sharia.application.handler.response.ResponseHandler;
import com.alami.sharia.application.service.interfaces.SellerService;
import com.alami.sharia.application.service.model.Seller;
import com.alami.sharia.application.util.ParseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping(ControllerConstants.BASE_URL)
public class SellerController extends BaseController {

    private static final String BASE_URL = "/seller";
    private static final String BASE_URL_WITH_ID = BASE_URL + "/id/{id}";

    @Autowired
    private SellerService sellerService;

    @Override
    @GetMapping(BASE_URL)
    public ResponseEntity<?> GetAll() {
        return ResponseHandler.returnResponse(sellerService.GetAll());
    }

    @Override
    @GetMapping(BASE_URL_WITH_ID)
    public ResponseEntity<?> Get(@PathVariable String id) throws NotFoundException {
        return ResponseHandler.returnResponse(Optional
                .of(sellerService.Get(id))
                .orElseThrow(NotFoundException::new));
    }

    @Override
    @PostMapping(BASE_URL)
    public ResponseEntity<?> Post(@Valid @RequestBody Object object) throws InternalServerErrorException {
        return ResponseHandler
                .returnResponse(Optional.of(sellerService.Post(ParseUtil.parseObject(object, Seller.class)))
                        .orElseThrow(InternalServerErrorException::new));
    }

    @Override
    @PutMapping(BASE_URL_WITH_ID)
    public ResponseEntity<?> Put(@PathVariable String id, @Valid @RequestBody Object object) throws NotFoundException {
        return ResponseHandler
                .returnResponse(Optional.of(sellerService.Put(id, ParseUtil.parseObject(object, Seller.class)))
                        .orElseThrow(NotFoundException::new));
    }

    @Override
    @DeleteMapping(BASE_URL_WITH_ID)
    public ResponseEntity<?> Delete(@PathVariable String id) throws NotFoundException {
        return ResponseHandler
                .returnResponse(Optional.of(sellerService.Delete(id))
                        .orElseThrow(NotFoundException::new));
    }
}
