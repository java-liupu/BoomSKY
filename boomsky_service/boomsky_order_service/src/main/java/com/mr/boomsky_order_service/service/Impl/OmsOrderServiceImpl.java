package com.mr.boomsky_order_service.service.Impl;

import com.mr.boomsky_order_service.mapper.OmsOrderMapper;
import com.mr.boomsky_order_service.pojo.OmsOrder;
import com.mr.boomsky_order_service.pojoVO.OmsOrderVo;
import com.mr.boomsky_order_service.service.OmsOrderService;
import com.mr.boomsky_order_service.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OmsOrderServiceImpl implements OmsOrderService {

    @Autowired
    private OmsOrderMapper omsOrderMapper;


    /**
     * 查询全部订单信息
     * @param omsOrderVo
     * @return
     */
    @Override
    public PageUtil list(OmsOrderVo omsOrderVo) {
        PageUtil pageDate = new PageUtil();

        // 总页数
        int num = omsOrderMapper.findNumOrderAll();

        // PageHelper.startPage(omsOrderVo.getPageSize(),omsOrderVo.getPageNum());

         omsOrderVo.calculate();

        List<OmsOrder> list = omsOrderMapper.list(omsOrderVo);

        pageDate.setTotal((long) num);

        pageDate.setList(list);

        return pageDate;
    }

    /**
     * 批量删除订单 (逻辑删除)
     * @param ids
     * @return
     */
    @Override
    public int delete(List<Long> ids) {
        int count = 0;
        for (int i=0;i<ids.size();i++){
            count = omsOrderMapper.updateByPrimaryKey(ids.get(i));
             }
        return count;
    }
}
