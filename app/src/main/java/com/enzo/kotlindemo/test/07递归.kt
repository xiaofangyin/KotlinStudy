package com.enzo.kotlindemo.test

/**
 * 文 件 名: `07递归`
 * 创 建 人: xiaofangyin
 * 创建日期: 2019-11-18
 * 邮   箱: xiaofangyin@360.cn
 */
fun main() {
    //计算5的阶乘
    println(calculate(4))
}

fun calculate(num: Int): Int {
    if (num == 1) {
        return 1;
    } else {
        return num * calculate(num - 1);
    }
}