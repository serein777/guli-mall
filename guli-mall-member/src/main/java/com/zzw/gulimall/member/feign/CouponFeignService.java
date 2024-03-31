package com.zzw.gulimall.member.feign;


import com.zzw.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
@Service
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/coupons")
    public R memberCoupon();
}
