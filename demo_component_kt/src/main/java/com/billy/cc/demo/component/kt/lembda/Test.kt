package com.billy.cc.demo.component.kt.lembda

/**
 * @author 朱峰 2019/8/27
 */
class Test {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
//            println(1.sum(2))
//            val with = with(1) {
//                this + 3
//            }
//            println(with)
//            testMapFilter()
//            foo {
//                return@foo
//            }
//            foo1 { return }
            val plus = Area(10.0) plus Area(20.0)
            println(plus.value)
        }

        fun foo(block: () -> Unit) {
            println("before block")
            block()
            println("after block")
        }

        inline fun foo1(block: () -> Unit) {
            println("before block")
            block()
            println("after block")
        }

        val sum: Int.(Int) -> Int = { other -> this + other }

        fun html(init: HTML.() -> Unit): HTML {
            val html = HTML()
            html.init()
            return html
        }

        fun testMapFilter() {
            val list = mutableListOf(1, 2, 3, 4, 5, 6)
            val toList = list
                .asSequence()
                .filter { it > 2 }
                .map { it * 2 }
                .toList()
            println(list)
            println(toList)
        }

        data class Area(val value: Double)

        infix fun Area.plus(that: Area): Area {
            return Area(this.value + that.value)
        }
    }

    class HTML {
        fun body() {}
    }
}