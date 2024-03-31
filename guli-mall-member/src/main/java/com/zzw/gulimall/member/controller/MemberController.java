package com.zzw.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.zzw.gulimall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zzw.gulimall.member.entity.MemberEntity;
import com.zzw.gulimall.member.service.MemberService;
import com.zzw.gulimall.common.utils.PageUtils;
import com.zzw.gulimall.common.utils.R;



/**
 * 会员
 *
 * @author zzzzw
 * @email 1351450816@qq.com
 * @date 2024-02-07 01:40:47
 */
@RestController
@RequestMapping("member/member")
@RefreshScope
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponFeignService couponFeignService;

    @Value("${member.user.age}")
    private Integer age;

    @Value("${member.user.name}")
    private String userName;


    @RequestMapping("/info")
    public R userInfoV1(){
        return  R.ok().put("name",userName).put("age",age);
    }

//    @RequestMapping("/coupons")
//    public R userInfo(){
//        MemberEntity member = new MemberEntity();
//        member.setNickname("千空");
//        R coupon = couponFeignService.memberCoupon();
//        return   R.ok().put("member",member).put("coupons",coupon.get("coupons"));
//    }

    @RequestMapping("coupons")
    public R memberCoupons(){
        MemberEntity member = new MemberEntity();
        member.setNickname("千空");
        R coupon = couponFeignService.memberCoupon();
       return   R.ok().put("member",member).put("coupons",coupon.get("coupons"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
