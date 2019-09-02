package com.billy.cc.demo.component.kt.adt

/**
 * @author 朱峰 2019/8/22
 */
class Test {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val shape = Shape.Circel("120")
            shape(shape)
        }


        fun shape(shape: Shape){
            when(shape){
                is Shape.Circel -> println(shape.radius)
                is Shape.Rectangle -> println("Shape.Rectangle")
                is Shape.Triangle -> println("Shape.Triangle")
            }
        }
    }
}