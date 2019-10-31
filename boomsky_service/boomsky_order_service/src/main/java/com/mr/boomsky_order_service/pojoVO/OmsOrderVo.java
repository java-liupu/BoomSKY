package com.mr.boomsky_order_service.pojoVO;

import com.mr.boomsky_order_service.util.PageUtil;

/**
 * 订单查询参数
 * Created by macro on 2018/10/11.
 */
public class OmsOrderVo extends PageUtil {
    // 订单编号
    private String orderSn;

    // 收货人姓名/号码
    private String receiverKeyword;

    // 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
    private Integer status;

    // 订单类型：0->正常订单；1->秒杀订单
    private Integer orderType;

    // 订单来源：0->PC订单；1->app订单
    private Integer sourceType;

    // 订单提交时间
    private String createTime;

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getReceiverKeyword() {
        return receiverKeyword;
    }

    public void setReceiverKeyword(String receiverKeyword) {
        this.receiverKeyword = receiverKeyword;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "OmsOrderVo{" +
                "orderSn='" + orderSn + '\'' +
                ", receiverKeyword='" + receiverKeyword + '\'' +
                ", status=" + status +
                ", orderType=" + orderType +
                ", sourceType=" + sourceType +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
