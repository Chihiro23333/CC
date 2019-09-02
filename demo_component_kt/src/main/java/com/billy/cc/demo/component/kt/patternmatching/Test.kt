package com.billy.cc.demo.component.kt.patternmatching

/**
 * @author 朱峰 2019/8/22
 */
class Test {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val expr = Expr.Operation("+",Expr.Num(0),Expr.Operation("+",Expr.Num(1),Expr.Num(2)))
            println(operation(expr))
        }

        fun operation(expr: Expr): Expr = when(expr){
            is Expr.Num -> expr
            is Expr.Operation -> when(expr){
                Expr.Operation("+",Expr.Num(1),Expr.Num(2)) -> expr.right
                else -> expr.left
            }
        }
    }

}