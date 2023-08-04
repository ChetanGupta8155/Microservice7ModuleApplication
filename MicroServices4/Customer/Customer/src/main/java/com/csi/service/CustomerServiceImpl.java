package com.csi.service;

import com.csi.model.Customer;
import com.csi.repo.CustomerRepo;
import com.csi.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl {

    @Autowired
    CustomerRepo customerRepoImpl;

    @Autowired
    CartFeignClientService cartFeignClientService;

    @Autowired
    OrdersFeignClientSevice ordersFeignClientSevice;

    @Autowired
    PaymentFeignClientService paymentFeignClientService;

    @Autowired
    ProductFeignClientService productFeignClientService;

    @Autowired
    ShipmentFeignClientService shipmentFeignClientService;

    @Autowired
    UsersFeignClientService usersFeignClientService;

    public Customer saveData(Customer customer){
        return customerRepoImpl.save(customer);
    }

    public RestTemplateVO getDataById(int custId){
        RestTemplateVO restTemplateVO = new RestTemplateVO();
        Customer customer=customerRepoImpl.findByCustId(custId);

        Cart cart=cartFeignClientService.getDataByCartId(customer.getCartId());

        Orders orders=ordersFeignClientSevice.getDataByOrderId(customer.getOrderId());

        Payment payment=paymentFeignClientService.getDataByPaymentId(customer.getPaymentId());

        Product product=productFeignClientService.getDataByProductId(customer.getProductId());

        Shipment shipment= shipmentFeignClientService.getDataByShippingId(customer.getShippingId());

        Users users=usersFeignClientService.getDataByUserId(customer.getUserId());

        restTemplateVO.setCart(cart);
        restTemplateVO.setOrders(orders);
        restTemplateVO.setPayment(payment);
        restTemplateVO.setProduct(product);
        restTemplateVO.setShipment(shipment);
        restTemplateVO.setUsers(users);
        restTemplateVO.setCustomer(customer);

        return restTemplateVO;

    }
}
