package com.billy.cc.demo.component.kt.adtsample

/**
 * @author 朱峰 2019/8/23
 */
sealed class CouponStatus {

    data class StatusFetched(val coupon: Coupon, val user: User) : CouponStatus()
    data class StatusNotFerched(val coupon: Coupon) : CouponStatus()
    data class StatusUsed(val coupon: Coupon) : CouponStatus()
    data class StatusExpired(val coupon: Coupon, val user: User) : CouponStatus()
    data class StatusUnAvilable(val coupon: Coupon, val user: User) : CouponStatus()

}