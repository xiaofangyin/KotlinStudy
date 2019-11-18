package com.enzo.kotlindemo.test

/**
 * 文 件 名: `01数组`
 * 创 建 人: xiaofangyin
 * 创建日期: 2019-11-18
 * 邮   箱: xiaofangyin@360.cn
 */

fun main() {

    // 1 - 16
    var nums = 1..16
    for (num in nums) {
        print("${num} ,")
    }
    println()
    var nums2 = 1 until 8
    for (num in nums2) {
        print("${num} ,")
    }
}