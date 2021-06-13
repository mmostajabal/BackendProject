/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammad
 */
public class OrderClass {
    private Integer _OrderId;
    private Integer _ProductId;
    private Integer _QTY;
    private Integer _UserId;
    private Integer _Status;
    private String _orderNo;

    public Integer getOrderId() {
        return _OrderId;
    }

    public void setOrderId(Integer _OrderId) {
        this._OrderId = _OrderId;
    }

    public Integer getProductId() {
        return _ProductId;
    }

    public void setProductId(Integer _ProductId) {
        this._ProductId = _ProductId;
    }

    public Integer getQTY() {
        return _QTY;
    }

    public void setQTY(Integer _QTY) {
        this._QTY = _QTY;
    }

    public Integer getUserId() {
        return _UserId;
    }

    public void setUserId(Integer _UserId) {
        this._UserId = _UserId;
    }

    public Integer getStatus() {
        return _Status;
    }

    public void setStatus(Integer _Status) {
        this._Status = _Status;
    }

    public String getOrderNo() {
        return _orderNo;
    }

    public void setOrderNo(String _orderNo) {
        this._orderNo = _orderNo;
    }
    
    
}
