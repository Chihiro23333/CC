package com.billy.cc.demo.component.kt.delegate

/**
 * @author 朱峰 2019/8/21
 */
class Bird(animail: CanEat, flyer: CanFly) : Animail by animail,Flyer by flyer {

}