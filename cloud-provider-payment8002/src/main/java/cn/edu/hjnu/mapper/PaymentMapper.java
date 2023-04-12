package cn.edu.hjnu.mapper;

import cn.edu.hjnu.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {

    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);

}
