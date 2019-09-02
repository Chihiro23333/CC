package com.billy.cc.demo.component.kt.adt

/**
 * @author 朱峰 2019/8/22
 */
sealed class Shape {
    class Circel(val radius: String) : Shape()
    class Rectangle(val width:Double, val height: Double): Shape()
    class Triangle(val base: Double, val height:Double):Shape()
}