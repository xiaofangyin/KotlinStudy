package com.enzo.kotlindemo.test

/**
 * 文 件 名: `04默认参数和具名参数`
 * 创 建 人: xiaofangyin
 * 创建日期: 2019-11-18
 * 邮   箱: xiaofangyin@360.cn
 */

val Pi = 3.1415926f

/**
 * pi: Float = Pi   默认参数
 * radius = 4f      具名参数
 */
fun main() {
    var cir = getCircleCircumference(radius = 4f)
    println("cir: $cir")
}


fun getCircleCircumference(pi: Float = Pi, radius: Float): Float {
    return pi * radius * radius
}