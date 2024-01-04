package com.example.hotel.controller;

import com.example.hotel.model.Product;
import com.example.hotel.model.dto.ProductDTO;
import com.example.hotel.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/get-all-product", method = RequestMethod.GET)
    public ResponseEntity<List<ProductDTO>> getAllProduct(){
        List<ProductDTO> products = this.productService.getAllProduct();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }


    @RequestMapping(value = "/getProductByID/{productId}", method = RequestMethod.GET)
    public ResponseEntity<ProductDTO> getProductByID(@PathVariable Integer productId){
        ProductDTO product = this.productService.getProductById(productId);

        return new ResponseEntity<>(product,HttpStatus.OK);
    }

    @RequestMapping(value = "/save-and-update-product", method = RequestMethod.POST)
    public ResponseEntity<ProductDTO> saveAndUpdateProduct(@RequestBody ProductDTO productDTO){
        ProductDTO newOrder = this.productService.saveAndUpdateProduct(productDTO);

        return new ResponseEntity<>(newOrder,HttpStatus.CREATED);
    }

}
