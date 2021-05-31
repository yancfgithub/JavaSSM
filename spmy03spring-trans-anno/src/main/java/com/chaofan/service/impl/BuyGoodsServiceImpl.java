package com.chaofan.service.impl;

import com.chaofan.dao.GoodsDao;
import com.chaofan.dao.SaleDao;
import com.chaofan.excep.NotEnoughException;
import com.chaofan.pojo.Goods;
import com.chaofan.pojo.Sale;
import com.chaofan.service.BuyGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yan
 * @create 2021 - 05 - 30 18:52
 */
@Service("buyGoodsService")
public class BuyGoodsServiceImpl implements BuyGoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Autowired
    private SaleDao saleDao;

    @Transactional(
            propagation=Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            rollbackFor = {NullPointerException.class, NotEnoughException.class}
    )
    @Override
    public void buy(Integer goodsId,Integer nums) {
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);

        //查询库存
        Goods goods = goodsDao.selectGoodsById(goodsId);
        System.out.println(goods);

        int i = saleDao.insertSale(sale);

        if(goods == null) {
            throw new NullPointerException("编号是" + goodsId + "的商品不存在");
        }else if(goods.getAmount() <= nums) {
            throw new NullPointerException("编号是" + goodsId + "的商品库存不足");
        }
        Goods buyGoods = new Goods();

        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);

        Integer integer = goodsDao.updateGoods(buyGoods);
        if(integer > 0) {
            System.out.println("商品购买成功");
        }
    }
}
