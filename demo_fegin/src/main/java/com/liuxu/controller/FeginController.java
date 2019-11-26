package com.liuxu.controller;

import com.liuxu.entity.Order;
import com.liuxu.fegin.Fegin;
import com.liuxu.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class FeginController {
        @Autowired
        private Fegin fegin;
        @RequestMapping("/list")
       private OrderVo<Order> list(@RequestParam(defaultValue = "1")Integer pageNo, OrderVo orderVo){
        return fegin.lists(pageNo,orderVo);
     }
}
