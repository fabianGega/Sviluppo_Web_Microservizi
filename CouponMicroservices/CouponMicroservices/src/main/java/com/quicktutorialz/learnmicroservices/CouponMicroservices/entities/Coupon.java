package com.quicktutorialz.learnmicroservices.CouponMicroservices.entities;

import lombok.*;

import javax.persistence.*;

@Table(name="coupon")
@Entity
@AllArgsConstructor @NoArgsConstructor
public class Coupon     {

    @Id
    @Column(name="couponid")
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="couponcode")
    @Getter @Setter
    private String code;

    @Column(name="account")
    @Getter @Setter
    private String account;
}
