package com.globallogic.springjdbc.mapper;

import com.globallogic.springjdbc.entity.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setProductId(rs.getInt("productId"));
        product.setProductName(rs.getString("productName"));
        product.setProductDescription(rs.getString("productDescription"));
        product.setProductPrice(rs.getDouble("productPrice"));
        product.setProductQuantity(rs.getInt("productQuantity"));
        return product;
    }
}
