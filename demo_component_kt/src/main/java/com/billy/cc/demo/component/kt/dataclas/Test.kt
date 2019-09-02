package com.billy.cc.demo.component.kt.dataclas

/**
 * @author 朱峰 2019/8/21
 */
class Test {
    companion object {
        //解构
        @JvmStatic
        fun main(args: Array<String>) {
            val info = "hahaha,10"
            val (name1, age1) = info.split(",")
            println("name=${name1},age=${age1}")

            val (name2, age2) = Pair("hahahh2", 10)
            val (name3, age3, time3) = Triple("hahahah3", 100, "2012-8-9")
            println("name2=${name2},age2=${age2}")
            println("name3=${name3},age3=${age3},time3=${time3}")
        }
    }
}