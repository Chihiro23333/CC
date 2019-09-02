package com.billy.cc.demo.component.kt.adt

/**
 * @author 朱峰 2019/8/22
 */
class Sealed {
    sealed class Day{
        class MON : Day()

        fun haha(){
            println("hahah")
        }
    }

    fun haha(){
        Day.MON().haha()
    }
}