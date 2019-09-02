package com.billy.cc.demo.component.kt.expand

/**
 * @author 朱峰 2019/8/28
 */
class Test {

    companion object{
        val student = Student(10)
        var age = 16

        fun dealStu(){
            student.also { student ->
                println(this.age)
                println(student.age)
            }
            student.apply {
                println(this.age)
            }
        }
    }

}