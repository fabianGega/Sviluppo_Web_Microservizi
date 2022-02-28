package com.quicktutorialz.learnmicroservices.CouponMicroservices.services;

public interface CouponService {

    String getAvailableCoupons(String jwt);
}
