package com.liuxu.controller;

import com.liuxu.dao.OrderMapper;
import com.liuxu.entity.Detail;
import com.liuxu.entity.Order;
import com.liuxu.service.OrderService;
import com.liuxu.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class OrderController {
        @Autowired
        private OrderService orderService;
        @RequestMapping(value = "/list",method = RequestMethod.POST)
        private OrderVo<Order> list(@RequestParam(defaultValue = "1")Integer pageNo,@RequestBody OrderVo orderVo){
            OrderVo orderVo1=new OrderVo();
            Page<Order> list = orderService.list(PageRequest.of(pageNo - 1, 3), orderVo);
            orderVo1.setPageNo(pageNo);
            orderVo1.setTotal(list.getTotalPages());
            orderVo1.setContent(list.getContent());
            return orderVo1;
         }
         @RequestMapping(value = "/insert",method = RequestMethod.POST)
        private  Order insert(@RequestBody Order order){
             System.out.println("ssssssssssss"+order);
         return orderService.insert(order);
         }
         @RequestMapping("selectid")
        private Optional<Order> selectid(Integer id){
             return orderService.selectid(id);
         }
         @RequestMapping("delete")
        private  void delete(Integer id){
             orderService.delete(id);
         }
         @RequestMapping("deletes")
        private  void deletes(@RequestBody List<Order> ids){
             orderService.deletes(ids);
         }
}
