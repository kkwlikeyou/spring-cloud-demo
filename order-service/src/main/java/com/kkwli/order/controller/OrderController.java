package com.kkwli.order.controller;

import com.kkwli.order.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    /*@Autowired
    private DiscoveryClient discoveryClient;*/

    @GetMapping(value = "/buy/{id}")
    public Product findById(@PathVariable Long id) {
        /*List<ServiceInstance> instances = discoveryClient.getInstances("service-product");
        ServiceInstance instance = instances.get(0);*/
        Product product;
        product = restTemplate.getForObject("http://service-product/product/" + id, Product.class);
        return product;

    }
}
