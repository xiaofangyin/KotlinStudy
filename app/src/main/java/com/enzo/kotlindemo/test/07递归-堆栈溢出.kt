package com.enzo.kotlindemo.test

/**
 * 文 件 名: `07递归`
 * 创 建 人: xiaofangyin
 * 创建日期: 2019-11-18
 * 邮   箱: xiaofangyin@360.cn
 */
fun main() {
    //计算5的阶乘
    println(add(100000))
}

fun add(num: Int): Int {
    println("第${num}次运算")
    if (num == 1) {
        return 1;
    } else {
        return num + add(num - 1);
    }
}