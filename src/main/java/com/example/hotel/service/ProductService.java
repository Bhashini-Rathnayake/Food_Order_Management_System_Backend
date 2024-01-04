package com.example.hotel.service;

import com.example.hotel.dao.ProductDao;
import com.example.hotel.model.Product;
import com.example.hotel.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    // get all product
    public List<ProductDTO> getAllProduct(){
        List<Product> products = this.productDao.findAll();

        List<ProductDTO> productDTOS = new ArrayList<>();
        for (Product product: products){
            ProductDTO productDTO =new ProductDTO(product);

            productDTOS.add(productDTO);
        }
        return productDTOS;
    }

//    get productById
//    public void getProductByID (Integer pId){
//        Product product1 = productDao.findByProductId(pId);
//        System.out.println(product1);
//    }

    public ProductDTO getProductById(Integer productId){
        Product product = this.productDao.getProductByProductId(productId);
        return new ProductDTO(product);
    }


    public ProductDTO saveAndUpdateProduct (ProductDTO productDTO){

        Product existingProduct = null;

        if (productDTO.getProductId()!= null){
            existingProduct = productDao.findByProductId(productDTO.getProductId());
        } else {
            existingProduct = new Product();
        }

        existingProduct.setProductName(productDTO.getProductName());
        existingProduct.setPrice(productDTO.getPrice());
        existingProduct.setProductCode(productDTO.getProductCode());

        productDao.saveAndFlush(existingProduct);

        ProductDTO productDTO1 = new ProductDTO(existingProduct);
        return productDTO1;
    }
}
