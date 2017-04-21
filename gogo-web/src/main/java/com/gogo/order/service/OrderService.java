package com.gogo.order.service;

import java.util.List;

import com.gogo.order.cmd.CreateOrderCmd;
import com.gogo.order.cmd.ListOrderByCdCmd;
import com.gogo.order.cmd.ListOrderCmd;
import com.gogo.order.dto.OrderDetailDTO;
import com.gogo.order.resp.OrderResp;

public interface OrderService {
	void createOrder(CreateOrderCmd cmd);
	List<OrderDetailDTO> listOrder(ListOrderCmd cmd);
	void clearListOrder(ListOrderCmd cmd);
	
	List<OrderResp> listByCd(ListOrderByCdCmd cmd);
}
