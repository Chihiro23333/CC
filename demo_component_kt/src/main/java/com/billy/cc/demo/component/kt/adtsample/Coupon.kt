package com.billy.cc.demo.component.kt.adtsample

/**
 * @author 朱峰 2019/8/22
 */
sealed class Coupon {
    companion object {
        val CashType = "CASH"
        val DisCountType = "DISCOUNT"
        val GiftType = "GIFT"
    }

    fun fetched(c: Coupon, user: User): Boolean {
        return false
    }

    fun used(c: Coupon, user: User): Boolean {
        return false
    }

    fun isExpire(c: Coupon): Boolean {
        return false
    }

    fun isUnAvilable(c: Coupon): Boolean {
        return false
    }


//    fun getCouponStatus(coupon: Coupon, user: User): Int = when {
//        fetched(coupon, user) -> Status.Fetched
//        used(coupon, user) -> Status.Used
//        isExpire(coupon) -> Status.Expired
//        isUnAvilable(coupon) -> Status.UnAvilable
//        else -> Status.NotFetchrd
//    }
//
//    fun showStatus(coupon: Coupon, user: User) = when (getCouponStatus(coupon, user)) {
//        Status.Fetched -> println("Fetched")
//        else -> println("else")
//    }

    fun getCouponStatus(coupon: Coupon, user: User): CouponStatus = when {
        fetched(coupon, user) -> CouponStatus.StatusFetched(coupon, user)
        used(coupon, user) -> CouponStatus.StatusUsed(coupon)
        isExpire(coupon) -> CouponStatus.StatusExpired(coupon, user)
        isUnAvilable(coupon) -> CouponStatus.StatusUnAvilable(coupon, user)
        else -> CouponStatus.StatusNotFerched(coupon)
    }

    fun showStatus(couponStatus: CouponStatus) = when (couponStatus) {
        is CouponStatus.StatusFetched -> println("is StatusFetched")
        is CouponStatus.StatusNotFerched -> println("is StatusNotFerched")
        is CouponStatus.StatusUsed -> println("is StatusUsed")
        is CouponStatus.StatusExpired -> println("is StatusExpired")
        is CouponStatus.StatusUnAvilable -> println("is StatusUnAvilable")
    }

    class CashCoupon(val id: Long, val type: String, val leastCost: Long) : Coupon()
    class DiscountCoupon(val id: Long, val type: String, val discount: Int) : Coupon()
    class GiftCoupon(val id: Long, val type: String, val gift: String) : Coupon()
}