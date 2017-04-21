package com.gogo.order.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.gogo.order.cmd.CreateOrderCmd;
import com.gogo.order.cmd.ListOrderByCdCmd;
import com.gogo.order.cmd.ListOrderCmd;
import com.gogo.order.dto.OrderDetailDTO;
import com.gogo.order.resp.OrderResp;

@Service
public class OrderServiceImpl implements OrderService {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Override
	public void createOrder(CreateOrderCmd cmd) {
	}
	
	@Override
	@Cacheable(value = "Order-ListOrder", key="{#cmd.pageSize, #cmd.pageNo}")
	public List<OrderDetailDTO> listOrder(ListOrderCmd  cmd) {
		return null;
	}
	
	@Override
	@CacheEvict(value = "Order-ListOrder", key="{#cmd.pageSize, #cmd.pageNo}")
	public void clearListOrder(ListOrderCmd cmd) {
		System.out.println("clearListOrder");
	}
	
	@Override
	public List<OrderResp> listByCd(ListOrderByCdCmd cmd) {
		return null;
	}
}
