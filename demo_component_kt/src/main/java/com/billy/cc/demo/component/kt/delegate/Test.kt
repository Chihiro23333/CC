package com.billy.cc.demo.component.kt.delegate

/**
 * @author 朱峰 2019/8/21
 */
class Test {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val flyer = CanFly()
            val animail = CanEat()
            val bird = Bird(animail, flyer)
            bird.fly()
            bird.eat()
        }
    }
}