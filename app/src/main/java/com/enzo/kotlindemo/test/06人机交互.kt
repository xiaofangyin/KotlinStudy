package com.enzo.kotlindemo.test

import java.lang.Exception

/**
 * 文 件 名: `06人机交互`
 * 创 建 人: xiaofangyin
 * 创建日期: 2019-11-18
 * 邮   箱: xiaofangyin@360.cn
 */
fun main() {
    println("请输入第一个数:")
    val num1 = readLine();
    println("请输入第二个数:")
    val num2 = readLine();

    try {
        var a = num1!!.toInt();
        var b = num2!!.toInt();
        println("$a + $b = ${a + b}")
    }catch (e:Exception){
        println("只允许输入数字!")
    }

}