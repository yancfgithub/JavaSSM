package com.chaofan.dao;

import com.chaofan.pojo.Goods;
import org.springframework.stereotype.Repository;

/**
 * @author yan
 * @create 2021 - 05 - 30 18:40
 */
@Repository
public interface GoodsDao {

    //更新商品库存
    public Integer updateGoods(Goods goods);

    //查询商品库存
    public Goods selectGoodsById(Integer id);
}
