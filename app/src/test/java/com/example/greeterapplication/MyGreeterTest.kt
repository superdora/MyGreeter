package com.example.greeterapplication

import com.example.greeterapplication.MyGreeter
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before
import java.time.LocalDateTime

class MyGreeterTest {
    private lateinit var _my_greeter: MyGreeter

    @Before
    fun setUpClass() {
        _my_greeter = MyGreeter()
    }

    // 测试初始化是否成功
    @Test
    fun testInit() {
        assertTrue(_my_greeter is MyGreeter)
        assertNotNull(_my_greeter)
    }

    // 测试 greeting 方法是否返回非空字符串
    @Test
    fun testGreeting() {
        val message = _my_greeter.greeting()
        assertTrue(message.length > 0)
    }
}