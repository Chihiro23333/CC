package com.billy.cc.demo.component.kt

class KtLearn {

    companion object {

        val a: Int = 1
        val b = 2

        var x = 5

        var s1 = "a is $a"
        val s2 = "${s1.replace("is", "was")},s1 is ${s1}"

        @JvmStatic
        fun main(args: Array<String>) {
            print(sum(a,b))
        }


        fun xPlus() {
            x += 1
        }

        fun abPlus(a: Int, b: Int): Int {
            return a + b;
        }

        fun sum(a: Int, b: Int) = a + b
    }

}