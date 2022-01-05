# TDD @FizzBuzz

## 开发环境
 - JDK11+
 
## 业务目标

### FizzBuzz
设计一个程序，该程序能打印1到100之间的数字，包含1，100。

1. 打印字符串`"Fizz"`
	- Given 一个数字
	- When 该数字为3的倍数
	- then 打印 `"Fizz"`
2. 打印字符串`"Buzz"`
	- Given 一个数字
	- When 该数字为5的倍数
	- then 打印 `"Buzz"`
3. 打印字符串`"FizzBuzz"`
	- Given 一个数字
	- When 该数字为15的倍数
	- then 打印 `"FizzBuzz"`
4. 打印数字字符串
	- Given 一个数字
	- When 该数字不是3、5、15的倍数
	- then 打印数字本身
5. 异常处理
	- Given 一个数字
	- When 不在1~100之间
	- then 抛出异常

## Tasking

| Task | Input | Output |
|:---|:---|:---|
| 1 | 15, 30, 45, 60, 75, 90 |  `"FizzBuzz"` |
| 2 | 3, 6, 12, 18, 21, 99 |  `"Fizz"` |
| 3 | 5, 10, 20, 85, 95, 100 |  `"Buzz"` |
| 4 | 1, 2, 4, 94, 97, 98 |  `"1"`, `"2"`, `"4"`, `"94"`, `"97"`, `"98"` |
| 5 | 0, 101 |  `IllegalArgumentException` |


## 编码路线
`master`分支一共有5个tag（`Task1`，`Task2`，`Task3`，`Task4`，`Task5`），它们分别对应5个Task。Clone下代码库之后，`checkout`到最开始的提交，一步一步往后面`checkout`即可查看所有步骤，`Task4`与`Task5`之间有1次Refactor的`commit`。


## 参考资料
- [JUnit 5用户指南](https://gitee.com/liushide/junit5_cn_doc/blob/master/junit5UserGuide_zh_cn.md#https://gitee.com/link?target=https%3A%2F%2Fgithub.com%2Fjunit-team%2Fjunit5-samples%2Ftree%2Fr5.0.2%2Fjunit5-gradle-consumer)
- [Gradle 用户指南](https://docs.gradle.org/current/userguide/userguide.html)