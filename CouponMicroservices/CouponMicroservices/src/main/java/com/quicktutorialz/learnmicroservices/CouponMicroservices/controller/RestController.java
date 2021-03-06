package com.quicktutorialz.learnmicroservices.CouponMicroservices.controller;

import com.quicktutorialz.learnmicroservices.CouponMicroservices.entities.JsonResponseBody;
import com.quicktutorialz.learnmicroservices.CouponMicroservices.services.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    //hhdhdhd

    @Autowired
    CouponService couponService;

    @RequestMapping("/findCoupon")
    public ResponseEntity<JsonResponseBody> findCoupons(@RequestParam(value = "jwt") String jwt) {
        try {
            String coupons = couponService.getAvailableCoupons(jwt);
            return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(), coupons));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new JsonResponseBody(HttpStatus.BAD_REQUEST.value(), "Error: " + e.toString()));
        }
    }


}
