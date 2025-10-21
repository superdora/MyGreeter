# 动手
- MyGreeter位于app/src/main/java/com/example/greeterapplication/MyGreeter.kt
- MyGreeterTest位于app/src/test/java/com/example/greeterapplication/MyGreeterTest.kt
- 使用Android Studio打开即可运行单元测试
#  思考
1. 存在问题
2. 测试用例不全面，仅测试结果长度，没有验证返回内容是否正确。 
   应该测试6AM至12AM之间运行时是否返回"Good morning"，以及其他两个时间运行是否返回正确。
   边界时间（如 6:00、12:00、18:00）是否处理正确。