package com.hty.gulimall.member.feign;

import com.hty.common.utils.R;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hty
 * @date 2023-05-24 21:49
 * @email 1156388927@qq.com
 * @description
 * @other 更多请看www.autunomy.top
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
