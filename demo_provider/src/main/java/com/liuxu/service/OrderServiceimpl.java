package com.liuxu.service;

import com.liuxu.dao.DetailMapper;
import com.liuxu.dao.OrderMapper;
import com.liuxu.entity.Detail;
import com.liuxu.entity.Order;
import com.liuxu.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceimpl implements OrderService{
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private DetailMapper detailMapper;
    @Override
    public Page<Order> list(Pageable pageable, OrderVo orderVo) {
        Specification  spec=new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder cd) {
                List<Predicate> list=new ArrayList<>();
                if(orderVo.getWuliu()!=null)
                {
                    Predicate p1=cd.like(root.get("wid"),"%"+orderVo.getWuliu()+"%");
                    list.add(p1);
                }
                if(orderVo.getSname()!=null)
                {
                    Predicate p2=cd.like(root.get("name"),"%"+orderVo.getSname()+"%");
                    list.add(p2);
                }
                if(orderVo.getSphone()!=null)
                {
                    Predicate p3=cd.equal(root.get("phone"),orderVo.getSphone());
                    list.add(p3);
                }
                if(orderVo.getSStartDate()!=null)
                {
                    Predicate p4=cd.greaterThanOrEqualTo(root.get("shouDate"),orderVo.getSStartDate());
                    list.add(p4);
                }
                if(orderVo.getSendDate()!=null)
                {
                    Predicate p5=cd.lessThanOrEqualTo(root.get("shouDate"),orderVo.getSendDate());
                    list.add(p5);
                }
                if(orderVo.getFStartDate()!=null)
                {
                    Predicate p6=cd.greaterThanOrEqualTo(root.get("faDate"),orderVo.getFStartDate());
                    list.add(p6);
                }
                if(orderVo.getFendDate()!=null)
                {
                    Predicate p7=cd.lessThanOrEqualTo(root.get("faDate"),orderVo.getFendDate());
                    list.add(p7);
                }
                Predicate ps = cd.and(list.toArray(new Predicate[list.size()]));
                return ps;
            }
        };
        return orderMapper.findAll(spec,pageable);
    }

    @Override
    public Order insert(Order order) {
        if(order.getId()==null) {
            return orderMapper.save(order);
        }
        return orderMapper.save(order);
    }

    @Override
    public Optional<Order> selectid(Integer id) {
        return orderMapper.findById(id);
    }

    @Override
    public void delete(Integer id) {
        orderMapper.deleteById(id);
        detailMapper.deleteById(id);
    }

    @Override
    public void deletes(List<Order> ids) {
        orderMapper.deleteAll(ids);
   }

    @Override
    public void deletess(List<Detail> ids) {
        detailMapper.deleteAll(ids);
    }
}
