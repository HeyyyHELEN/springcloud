package cn.edu.hjnu.service.impl;

import cn.edu.hjnu.entities.Payment;
import cn.edu.hjnu.mapper.PaymentMapper;
import cn.edu.hjnu.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    public int create(Payment payment){
        return paymentMapper.create(payment);
    }

    public Payment getPaymentById( Long id){

        return paymentMapper.getPaymentById(id);

    }
}
