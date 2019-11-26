package com.liuxu.dao;

import com.liuxu.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderMapper extends JpaRepository<Order,Integer>, JpaSpecificationExecutor<Order> {
}
