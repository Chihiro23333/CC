package com.billy.cc.demo.component.kt

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * @author 朱峰 2019/7/17
 */
class KtTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
//            val maxOf = maxOf(1, 2)
//            val maxOf1 = maxOf1(1, 2)
//            println("maxOf=" + maxOf)
//            println("maxOf1=" + maxOf1)
//
//            printOrProduct("abc", "")
//            printOrProduct("1", "3")
//
//            getStringLength("abc")
//            getStringLength(1)
//
//            foreach()
//            foreachByIndex()
//
//            whilefor()
//            println(whenDemo(1))
//            println(whenDemo("hello"))
//            println(whenDemo(1L))
//            println(whenDemo(2f))
//
//            range()
//            rangeExampler()
//            rangStep()
//            wheneg1()
//            sort()
//            formap()
//            "a".toCamelCase()
//            1 sh1 2
//            println(a1(10,{name:Int,anothername:String -> name.toString()+"hahhahaahahaha"+ anothername}))
            block()
        }

        fun maxOf(a: Int, b: Int): Int {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }

        fun maxOf1(a: Int, b: Int): Int = if (a > b) a else b;

        fun parseInt(a: String): Int? {
            return a.toIntOrNull()
        }

        fun printOrProduct(a: String, b: String): Unit {
            val parseInt = parseInt(a)
            val parseInt1 = parseInt(b)
            if (parseInt != null && parseInt1 != null) {
                println(parseInt * parseInt1)
            } else {
                println("has null parseInt= $parseInt parseInt1=$parseInt1")
            }
        }

        fun getStringLength(obj: Any): Int? {
            if (obj is String) {
                println("obj.length ${obj.length}")
                return obj.length
            }
            println("obj not a string")
            return null
        }

        fun foreach() {
            val items = listOf("1", "2", "3", "4")
            for (item in items) {
                println(item)
            }
        }

        fun foreachByIndex() {
            val items = listOf("1", "2", "3", "4")
            for (index in items.indices) {
                println("item is ${items[index]}")
            }
        }

        fun whilefor() {
            val items = listOf("1", "2", "3", "4")
            var index = 0
            while (index < items.size) {
                println(items[index])
                index++
            }
        }

        fun whenDemo(obj: Any): String =
                when (obj) {
                    1 -> "integer"
                    "hello" -> "string"
                    is Long -> "Long"
                    else -> "UnKnow"
                }

        fun range() {
            val x = 10
            val y = 11
            if (x in 1..y + 1) {
                println("fits in the range")
            }
        }

        fun rangeExampler() {
            val items = listOf("1", "2");
            if (-1 !in 0..items.lastIndex) {
                println("-1 not in lastIndex range")
            }
        }

        fun rangStep() {
            for (x in 0..100 step 2) {
                println(x)
            }
            for (x in 9 downTo 0 step 2) {
                println(x)
            }
        }

        fun wheneg1() {
            val items = listOf("1", "5")
            when {
                "1" in items -> println("1")
                "5" in items -> println("5")
            }
        }

        fun sort() {
            val items = listOf("1", "a", "a3", "a5")
            items
                    .filter { x -> x.startsWith("a") }
                    .sortedBy { it }
                    .map { it.toUpperCase() }
                    .forEach { println(it) }
        }

        fun default(a: Int = 0, b: String = "1"): String {
            return b
        }

        fun formap() {
            val map = mapOf("1" to 1, "b" to 2);
            for ((x, y) in map) {
                println("x=$x,y=$y")
                println("y=" + map[x] + "y=" + y)
            }
        }

        //拓展函数
        fun String.toCamelCase() {
            println("String.toCamelCase")
        }

        infix fun Int.sh1(x: Int): Int{
            println("x+1="+x+1)
            return x+1;
        }

        fun a1(a: Int, b:(Int, String) -> String) : String{
            return a.toString() + b(1,"222222")
        }

        fun block(){
            runBlocking {
                val job = launch {
                    repeat(10){
                        i ->
                        println("挂起重===i="+i)
                        delay(1000)
                    }
                }

                val job2 = async {
                    delay(5000)
                    return@async "我是async返回的内容"
                }

                println("等待job2=${job2.await()}")
                println("主线程开始等待")
                delay(3000)
                println("主线程等待结束")
                println("开始取消job")
                job.cancel()
            }
        }
    }
}
