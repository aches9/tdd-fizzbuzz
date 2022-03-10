# TDD @FizzBuzz

## 开发环境
- JDK11+

## 课后作业题目背景
你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有 N 名学
生在上 课。游戏的规则是:
1. 让所有学生排成一队，然后按顺序报数。
2. 学生报数时，如果所报数字是 3 的倍数，那么不能说该数字，而要说 Fizz;如果所
   报数字是 5 的倍数，那么要说 Buzz;如果所报数字是第 7 的倍数，那么要说
   Whizz。
3. 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如
   3 和 5 的 倍数，那么不能说该数字，而是要说 FizzBuzz, 以此类推。如果同时是
   三个特殊数的倍数， 那么要说 FizzBuzzWhizz。
4. 学生报数时，如果所报数字包含了 3，那么也不能说该数字，而是要说相应的单
   词，比如要 报 13 的同学应该说 Fizz。
5. 如果数字中包含了 3，那么忽略规则 2 和规则 3，比如要报 30 的同学只报 Fizz，
   不报 FizzBuzz 。
6. 如果数字中包含了 5，那么忽略规则 4 和规则 5，并且忽略被 3 整除的判定，比如
   要报 35 的同 学不报 Fizz，报 BuzzWhizz，其他 case 自己补齐。
7. 如果数字中包含了 7，则忽略被 5 整除的判定，若同时还包含 5，就忽略规则 6 中
   忽略被 3 整 除的判定，比如要报 75 的同学只报 Fizz，其他 case 自己补齐。

### FizzBuzz

1. 打印字符串`"Fizz"`
	- Given 一个数字
	- When 该数字为3的倍数，且不包含5
	- then 打印 `"Fizz"`
2. 打印字符串`"Fizz"`
	- Given 一个数字
	- When 该数字为3的倍数，且包含7
	- then 打印 `"Fizz"`
3. 打印字符串`"Fizz"`
	- Given 一个数字
	- When 该数字包含3，且不包含5
	- then 打印 `"Fizz"`
4. 打印字符串`"Buzz"`
	- Given 一个数字
	- When 该数字为5的倍数，且不包含7
	- then 打印 `"Buzz"`
5. 打印字符串`"Whizz"`
	- Given 一个数字
	- When 该数字为7的倍数
	- then 打印 `"Whizz"`
6. 打印字符串`"FizzBuzz"`
	- Given 一个数字
	- When 该数字为3和5的倍数，且不包含5和7
	- then 打印 `"FizzBuzz"`
7. 打印字符串`"FizzBuzz"`
	- Given 一个数字
	- When 该数字为5的倍数，且包含3不包含5
	- then 打印 `"FizzBuzz"`
8. 打印字符串`"FizzWhizz"`
	- Given 一个数字
	- When 该数字为3和7的倍数，且不包含5
	- then 打印 `"FizzWhizz"`'
9. 打印字符串`"FizzWhizz"`
	- Given 一个数字
	- When 该数字为3和7的倍数，且包含7
	- then 打印 `"FizzWhizz"`
10. 打印字符串`"FizzWhizz"`
	- Given 一个数字
	- When 该数字为7的倍数，且包含3不包含5
	- then 打印 `"FizzWhizz"`
11. 打印字符串`"BuzzWhizz"`
	- Given 一个数字
	- When 该数字为5和7的倍数，且不包含7
	- then 打印 `"FizzWhizz"`
12. 打印字符串`"FizzBuzzWhizz"`
	- Given 一个数字
	- When 该数字为3、5、7的倍数，且不包含5和7
	- then 打印 `"FizzBuzzWhizz"`
13. 打印字符串`"FizzBuzzWhizz"`
	- Given 一个数字
	- When 该数字为5、7的倍数，且包含3不包含5和7
	- then 打印 `"FizzBuzzWhizz"`
14. 打印数字字符串
	- Given 一个数字
	- When 该数字不是3、5、7的倍数，且不包含3
	- then 打印数字本身

## Tasking

| Task | Input | Output |
|:---|:---|:---|
| 1 | 3, 6, 13, 27, 30, 37, 57, 63, 73, 75, 99, 130, 133, 237, 270, 370, 371, 375, 378, 537, 630, 1330, 2370, 3710 |  `"Fizz"` |
| 2 | 5, 10, 15, 135, 235 |  `"Buzz"` |
| 3 | 7, 14, 56, 70 , 175, 252, 532, 574, 1533, 3157, 3745 |  `"Whizz"` |
| 4 | 60 |  `"FizzBuzz"` |
| 5 | 21, 147, 357, 576, 735, 1470, 1575 |  `"FizzWhizz"` |
| 6 | 35, 105, 140, 245, 315  |  `"BuzzWhizz"` |
| 7 | 210  |  `"FizzBuzzWhizz"` |
| 8 | 1, 4, 17, 51, 52, 53, 153, 157, 170, 275, 1357, 1375 |  `"1"`, `"4"`, `"17"`, `"51"`, `"52"`, `"53"`, `"153"`, `"157"`, `"170"`, `"275"`, `"1357"`, `"1375"` |


## 编码路线
`master`分支一共有5个tag（`Task1`，`Task2`，`Task3`，`Task4`，`Task5`），它们分别对应5个Task。Clone下代码库之后，`checkout`到最开始的提交，一步一步往后面`checkout`即可查看所有步骤，`Task4`与`Task5`之间有1次Refactor的`commit`。


## 参考资料
- [JUnit 5用户指南](https://gitee.com/liushide/junit5_cn_doc/blob/master/junit5UserGuide_zh_cn.md#https://gitee.com/link?target=https%3A%2F%2Fgithub.com%2Fjunit-team%2Fjunit5-samples%2Ftree%2Fr5.0.2%2Fjunit5-gradle-consumer)
- [Gradle 用户指南](https://docs.gradle.org/current/userguide/userguide.html)