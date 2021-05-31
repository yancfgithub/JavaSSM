package com.chaofan.dao;

import com.chaofan.pojo.Sale;
import org.springframework.stereotype.Repository;

/**
 * @author yan
 * @create 2021 - 05 - 30 18:37
 */
@Repository
public interface SaleDao {

    public int insertSale(Sale sale);
}
