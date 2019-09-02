package com.billy.cc.demo.component.kt.typesystem

/**
 * @author 朱峰 2019/8/26
 */
class Test {
    companion object{

        @JvmStatic
        fun main(args: Array<String>) {
            val cast = cast<String>(100000L)
            println(cast.toString())
        }

        inline fun <reified T> cast(any: Any): T? = any as? T
    }
}