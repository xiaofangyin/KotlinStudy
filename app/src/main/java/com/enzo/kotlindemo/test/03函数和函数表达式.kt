package com.enzo.kotlindemo.test

/**
 * 文 件 名: `03函数和函数表达式`
 * 创 建 人: xiaofangyin
 * 创建日期: 2019-11-18
 * 邮   箱: xiaofangyin@360.cn
 */
fun main() {

    println("add1 : " + add1(4, 6))
    println("add2 : " + add2(4, 6))

    val i = { x: Int, y: Int -> x + y }
    println("add3 : " + i(4, 6))

    val j: (Int, Int) -> Int = { x, y -> x + y }
    println("add4 : " + j(4, 6))
}

fun add1(a: Int, b: Int): Int {
    return a + b
}

fun add2(a: Int, b: Int): Int = a + b