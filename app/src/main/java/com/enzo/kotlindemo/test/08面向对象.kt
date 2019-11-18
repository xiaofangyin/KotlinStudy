package com.enzo.kotlindemo.test

/**
 * 文 件 名: `08面向对象`
 * 创 建 人: xiaofangyin
 * 创建日期: 2019-11-18
 * 邮   箱: xiaofangyin@360.cn
 */
class Rect(var width: Int, var height: Int){
    fun smile(){
        println("11111111111")
    }

}

fun main() {
    var rect = Rect(4, 6);
    println("宽度: ${rect.width}" + "...高度: ${rect.height}")
    rect.smile()

    var son = Son()
    son.action()
}