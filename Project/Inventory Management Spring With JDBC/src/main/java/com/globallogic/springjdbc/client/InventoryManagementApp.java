package com.globallogic.springjdbc.client;

import com.globallogic.springjdbc.config.AppConfig;
import com.globallogic.springjdbc.dao.ProductDao;
import com.globallogic.springjdbc.entity.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class InventoryManagementApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductDao productDao = applicationContext.getBean(ProductDao.class);
        //Adding the product in databse
        productDao.addProduct();

        //list of product
//        List<Product> productList = productDao.getAllProducts();
//        productList.forEach(System.out::println);
        applicationContext.close();

//        purchase product
            productDao.purchaseProduct(1, 1);
    }
}