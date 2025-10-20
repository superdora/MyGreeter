package com.example.greeterapplication

import android.util.Log
import java.time.LocalDateTime

class MyGreeter {
    /**
     * 根据指定时间返回问候语
     * @param currentTime 要判断的时间点，默认获取当前时间
     * @return 对应的问候语
     */
    fun greeting(currentTime: LocalDateTime = LocalDateTime.now()): String {
        // 获取time的小时值
        val hour = currentTime.hour
        // 根据要求判断符合哪个运行时间
        return when (hour) {
            in 6..12 -> "Good morning"
            in 12..18 -> "Good afternoon"
            else -> "Good evening"
        }
    }
}