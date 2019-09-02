package com.billy.cc.demo.component.kt

/**
 * @author 朱峰 2019/8/14
 */
class Lambda {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
//            println(methodd(5,5)(20))
//            method3({ b ->
//                println(b)
//            },"hhahaha")

//            val a = arrayOf(1, 2, 3)
//            val b = arrayOf(2, 3, 4)
//            val result = a.compare(b) { x, y ->
//                y == x + 1
//            }
//            val result1 = a.compare(b) { x, y ->
//                y == x - 1
//            }
//            println(result)
//            println(result1)
//            printIndexAndValue()
            mapBook()
        }

        val methoda: (x: Int, y: Int) -> Int = { x: Int, y: Int -> x + y }
        val methodb = { x: Int, y: Int -> x + y }
        val methodc: (x: Int, y: Int) -> Int = { x, y -> x + y }
        fun methodd(x: Int, y: Int) = { z: Int -> x + y + z }
        fun methode(method: (Int, Int) -> Int) {
            println(method(5, 5))
        }

        fun method1(a: (String) -> Unit) {
            println(a("aaaaaaa"))
        }

        fun method2(a: String, b: (String) -> Unit) {
            b(a)
        }

        fun method3(b: (String) -> Unit, a: String) {
            b(a)
        }

        fun <A, B> Array<B>.compare(a: Array<A>, compare: (A, B) -> Boolean): Boolean {
            val i = a.iterator()
            val j = this.iterator()
            if (i.hasNext() && j.hasNext()) {
                if (compare(i.next(), j.next())) {
                    return true
                }
            }
            return false;
        }

        fun printIndexAndValue() {
            val arrayListOf = arrayListOf<Int>(1, 2, 3, 4, 5, 6)
            for ((index, value) in arrayListOf.withIndex()) {
                println("index=${index},value=${value}")
            }
        }

        fun mapBook() {
            val map = listOf(
                Book("1111"),
                Book("22222")
            ).map { Book::name }
            println(map)
        }
    }
}