package Bt_Sale_V2.service;

import Bt_Sale_V2.entities.OrderDetail;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailService {
    public List<OrderDetail> findByOrderId(int orderId, List<OrderDetail> details){
        List<OrderDetail> orderDetailsFound = new ArrayList<>();
        for (OrderDetail detail: details){
            if(detail.getOrderId() == orderId){
                orderDetailsFound.add(detail);
            }
        }
        return orderDetailsFound;
    }
}
