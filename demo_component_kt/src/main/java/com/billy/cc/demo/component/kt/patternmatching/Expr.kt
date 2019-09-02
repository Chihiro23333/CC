package com.billy.cc.demo.component.kt.patternmatching

/**
 * @author 朱峰 2019/8/22
 */
sealed class Expr {
    class Num(val value: Int) : Expr()
    class Operation(val opertaion: String, val left: Expr, val right: Expr) : Expr()
}