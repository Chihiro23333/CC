package com.billy.cc.demo.component.kt.`object`

/**
 * @author 朱峰 2019/8/21
 */
class Pizza(val name: String, val time: String) {
    companion object {
        val TYPE_ONE = 0
        val TYPE_TWO = 1

        fun getType(): Int {
            return TYPE_ONE
        }
    }
}