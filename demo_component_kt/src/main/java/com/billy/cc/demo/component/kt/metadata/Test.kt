package com.billy.cc.demo.component.kt.metadata

/**
 * @author 朱峰 2019/8/28
 */
class Test {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
//            val user = User.User("hahaha", 10)
//            User.a(user)()
//            val toMap = Mapper.toMap(user)
//            println(toMap())

            val _1 = Succ(Nat.Companion.Zero)
            val find = _1::class.members.find { it.name == "preceed" }
            println(find?.call(_1,_1) == Nat.Companion.Zero)
        }
    }

}