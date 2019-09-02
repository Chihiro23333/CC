package com.billy.cc.demo.component.kt.adtsample

/**
 * @author 朱峰 2019/8/23
 */
class Test {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
//            testSmape()
            testSample2()
        }

        private fun testSmaple1() {
//            val coupon = Coupon.CashCoupon(1, Coupon.CashType, 100)
//            val status = Coupon.Status()
//            val user = User()
//            status.showStatus(coupon, user)
        }

        private fun testSample2(){
            val coupon = Coupon.CashCoupon(1, Coupon.CashType, 100)
            val user = User()
            val couponStatus = coupon.getCouponStatus(coupon, user)

            coupon.showStatus(couponStatus)
        }
    }
}