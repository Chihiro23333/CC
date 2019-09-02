package com.billy.cc.demo.component.kt.metadata

import kotlin.reflect.KProperty1
import kotlin.reflect.KTypeProjection
import kotlin.reflect.full.*
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable

/**
 * @author 朱峰 2019/8/28
 */
object Mapper {
    fun <A: Any> toMap(a: A) = {
        a::class.memberProperties.map {
            val kProperty = it as KProperty1
            kProperty.name to kProperty.call(a)
        }.toMap()
    }
}