package com.enzo.kotlindemo.test

import java.util.*

/**
 * 文 件 名: `02List和Map`
 * 创 建 人: xiaofangyin
 * 创建日期: 2019-11-18
 * 邮   箱: xiaofangyin@360.cn
 */
fun main() {

    var list = listOf("1", "2", "3")
    for ((i, e) in list.withIndex()) {
        println("$i  $e")
    }

    var map = TreeMap<String,String>()
    map["零"] = "zero"
    map["一"] = "one"
    map["二"] = "two"
    println(map["零"])
}