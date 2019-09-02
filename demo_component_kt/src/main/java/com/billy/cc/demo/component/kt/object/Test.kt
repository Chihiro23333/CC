package com.billy.cc.demo.component.kt.`object`

/**
 * @author 朱峰 2019/8/21
 */
class Test {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            println(Pizza.getType())

            println(DatabaseConfig.host)
            DatabaseConfig.host = "192.16.1.1"
            println(DatabaseConfig.host)
        }
    }

}