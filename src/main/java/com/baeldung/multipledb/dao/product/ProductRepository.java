package com.baeldung.multipledb.dao.product;

import java.util.List;

import com.baeldung.multipledb.model.product.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
    List<Product> findAllByPrice(double price, Pageable pageable);
}