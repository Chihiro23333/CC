package com.billy.cc.demo.component.kt.metadata

/**
 * @author 朱峰 2019/8/28
 */
object User {
    data class User(val name: String, val age: Int)

    fun a(user: User) = {
        println(hashMapOf("name" to user.name))
    }
}