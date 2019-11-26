package com.liuxu.service;

import com.liuxu.entity.Detail;
import com.liuxu.entity.Order;
import com.liuxu.vo.OrderVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface OrderService {
        Page<Order> list(Pageable pageable, OrderVo orderVo);
        Order insert(Order order);
        Optional<Order> selectid(Integer id);
        void delete(Integer id);
        void deletes(List<Order> ids);
        void  deletess(List<Detail> ids);
}
