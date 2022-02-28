package com.quicktutorialz.learnmicroservices.CouponMicroservices.daos;

import com.quicktutorialz.learnmicroservices.CouponMicroservices.entities.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CouponDao extends JpaRepository<Coupon, Integer> {

    Optional<Coupon> findByAccount(String Account);

}
