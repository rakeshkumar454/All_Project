package com.globallogic.springjdbc.dao;

import com.globallogic.springjdbc.entity.Product;
import com.globallogic.springjdbc.mapper.ProductMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class ProductDao {
    JdbcTemplate jdbcTemplate;

    public ProductDao(DataSource dataSource) {
        super();
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public int addProduct() {
        String insertQuery = "insert into product values(1,'Laptop','Its Laptop', 23456.0, 5)";
        System.out.println("Inserted");
        return jdbcTemplate.update(insertQuery);
    }

    public List<Product> getAllProducts(){
        String query = "select * from product";
        List <Product> productList = jdbcTemplate.query(query, new ProductMapper());
        return productList;
    }
    public void purchaseProduct(int productId, int productQuantity) {
        String updateQuery = "update product set productQuantity = productQuantity - "+productQuantity+" where productId = "+productId;
        if(this.getProductById(productId) .getProductQuantity() >0)
            if(this.getProductById(productId).getProductQuantity() >productQuantity) {
                System.out.println("Product is purchased succesfully ");
                jdbcTemplate.update(updateQuery);
                System.out.println(this.getProductById(productId));
            }
        else {
                System.out.println("Product quantity is higher than available");
        }
        else
            System.out.println("Product Id is not available");
    }
    public Product getProductById(Integer id)  {
        String query = "select * from product where productId = ?";
        Product product = jdbcTemplate.queryForObject(
                query, new Object[]{id}, new ProductMapper()
        );
        return product;
    }
}
