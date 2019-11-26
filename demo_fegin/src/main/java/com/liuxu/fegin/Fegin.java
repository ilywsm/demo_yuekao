package com.liuxu.fegin;

import com.liuxu.entity.Order;
import com.liuxu.vo.OrderVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "demo-provider")
public interface Fegin {
    @RequestMapping("/list")
    OrderVo<Order> lists(@RequestParam("pageNo")Integer pageNo, OrderVo orderVo);
}

