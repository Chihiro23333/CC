package com.billy.cc.demo.component.kt.metadata

/**
 * @author 朱峰 2019/8/28
 */
sealed class Nat {
    companion object {
        object Zero : Nat()
    }

    val Companion._0
        get() = Zero

    fun <A : Nat> Succ<A>.preceed(): A {
        return this.prev
    }
}

data class Succ<N : Nat>(val prev: N) : Nat()

fun <A: Nat> Nat.plus(other: A): Nat = when{
    other is Succ<*> -> Succ(this.plus(other.prev))
    else -> this
}