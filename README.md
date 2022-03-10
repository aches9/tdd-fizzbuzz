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

### Tasking

1. 打印数字本身
	- Given 一个数字
	- When 该数字不是3、5、7的倍数，且不包含3、5、7
	- then 打印数字本身
2. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字只是3的倍数，且不包含3、5、7
	- then 打印`"Fizz"`
3. 打印`"Buzz"`
	- Given 一个数字
	- When 该数字只是5的倍数，且不包含3、5、7
	- then 打印`"Buzz"`
4. 打印`"Whizz"`
	- Given 一个数字
	- When 该数字只是7的倍数，且不包含3、5、7
	- then 打印`"Whizz"`
5. 打印`"FizzBuzz"`
	- Given 一个数字
	- When 该数字是3和5的倍数，且不包含3、5、7
	- then 打印`"FizzBuzz"`
6. 打印`"FizzWhizz"`
	- Given 一个数字
	- When 该数字是3和7的倍数，且不包含3、5、7
	- then 打印`"FizzWhizz"`
7. 打印`"BuzzWhizz"`
	- Given 一个数字
	- When 该数字是5和7的倍数，且不包含3、5、7
	- then 打印`"BuzzWhizz"`
8. 打印`"FizzBuzzWhizz"`
	- Given 一个数字
	- When 该数字是3、5、7的倍数，且不包含3、5、7
	- then 打印`"FizzBuzzWhizz"`

9. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字不是3、5、7的倍数，且只包含3
	- then 打印`"Fizz"`
10. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字只是3的倍数，且只包含3
	- then 打印`"Fizz"`
11. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字只是5的倍数，且只包含3
	- then 打印`"Fizz"`
12. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字只是7的倍数，且只包含3
	- then 打印`"Fizz"`
13. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字是3和5的倍数，且只包含3
	- then 打印`"Fizz"`
14. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字是3和7的倍数，且只包含3
	- then 打印`"Fizz"`
15. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字是5和7的倍数，且只包含3
	- then 打印`"Fizz"`
16. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字是3、5、7的倍数，且只包含3
	- then 打印`"Fizz"`

17. 打印数字本身
	- Given 一个数字
	- When 该数字不是3、5、7的倍数，且只包含5
	- then 打印数字本身
18. 打印数字本身
	- Given 一个数字
	- When 该数字只是3的倍数，且只包含5
	- then 打印数字本身
19. 打印`"Buzz"`
	- Given 一个数字
	- When 该数字只是5的倍数，且只包含5
	- then 打印`"Buzz"`
20. 打印`"Whizz"`
	- Given 一个数字
	- When 该数字只是7的倍数，且只包含5
	- then 打印`"Whizz"`
21. 打印`"Buzz"`
	- Given 一个数字
	- When 该数字是3和5的倍数，且只包含5
	- then 打印`"Buzz"`
22. 打印`"Whizz"`
	- Given 一个数字
	- When 该数字是3和7的倍数，且只包含5
	- then 打印`"Whizz"`
23. 打印`"BuzzWhizz"`
	- Given 一个数字
	- When 该数字是5和7的倍数，且只包含5
	- then 打印`"BuzzWhizz"`
24. 打印`"BuzzWhizz"`
	- Given 一个数字
	- When 该数字是3、5、7的倍数，且只包含5
	- then 打印`"BuzzWhizz"`

25. 打印数字本身
	- Given 一个数字
	- When 该数字不是3、5、7的倍数，且只包含7
	- then 打印数字本身
26. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字只是3的倍数，且只包含7
	- then 打印`"Fizz"`
27. 打印数字本身
	- Given 一个数字
	- When 该数字只是5的倍数，且只包含7
	- then 打印数字本身
28. 打印`"Whizz"`
	- Given 一个数字
	- When 该数字只是7的倍数，且只包含7
	- then 打印`"Whizz"`
29. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字是3和5的倍数，且只包含7
	- then 打印`"Fizz"`
30. 打印`"FizzWhizz"`
	- Given 一个数字
	- When 该数字是3和7的倍数，且只包含7
	- then 打印`"FizzWhizz"`
31. 打印`"Whizz"`
	- Given 一个数字
	- When 该数字是5和7的倍数，且只包含7
	- then 打印`"Whizz"`
32. 打印`"FizzWhizz"`
	- Given 一个数字
	- When 该数字是3、5、7的倍数，且只包含7
	- then 打印`"FizzWhizz"`

33. 打印数字本身
	- Given 一个数字
	- When 该数字不是3、5、7的倍数，且包含3和5
	- then 打印数字本身
34. 打印数字本身
	- Given 一个数字
	- When 该数字只是3的倍数，且包含3和5
	- then 打印数字本身
35. 打印`"Buzz"`
	- Given 一个数字
	- When 该数字只是5的倍数，且包含3和5
	- then 打印`"Buzz"`
36. 打印`"Whizz"`
	- Given 一个数字
	- When 该数字只是7的倍数，且包含3和5
	- then 打印`"Whizz"`
37. 打印`"Buzz"`
	- Given 一个数字
	- When 该数字是3和5的倍数，且包含3和5
	- then 打印`"Buzz"`
38. 打印`"Whizz"`
	- Given 一个数字
	- When 该数字是3和7的倍数，且包含3和5
	- then 打印`"Whizz"`
39. 打印`"BuzzWhizz"`
	- Given 一个数字
	- When 该数字是5和7的倍数，且包含3和5
	- then 打印`"BuzzWhizz"`
40. 打印`"BuzzWhizz"`
	- Given 一个数字
	- When 该数字是3、5、7的倍数，且包含3和5
	- then 打印`"BuzzWhizz"`

41. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字不是3、5、7的倍数，且包含3和7
	- then 打印`"Fizz"`
42. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字只是3的倍数，且包含3和7
	- then 打打印`"Fizz"`
43. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字只是5的倍数，且包含3和7
	- then 打印`"Fizz"`
44. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字只是7的倍数，且包含3和7
	- then 打印`"Fizz"`
45. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字是3和5的倍数，且包含3和7
	- then 打印`"Fizz"`
46. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字是3和7的倍数，且包含3和7
	- then 打印`"Fizz"`
47. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字是5和7的倍数，且包含3和7
	- then 打印`"Fizz"`
48. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字是3、5、7的倍数，且包含3和7
	- then 打印`"Fizz"`

49. 打印数字本身
	- Given 一个数字
	- When 该数字不是3、5、7的倍数，且包含5和7
	- then 打印数字本身
50. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字只是3的倍数，且包含5和7
	- then 打打印`"Fizz"`
51. 打印数字本身
	- Given 一个数字
	- When 该数字只是5的倍数，且包含5和7
	- then 打印数字本身
52. 打印`"Whizz"`
	- Given 一个数字
	- When 该数字只是7的倍数，且包含5和7
	- then 打印`"Whizz"`
53. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字是3和5的倍数，且包含5和7
	- then 打印`"Fizz"`
54. 打印`"FizzWhizz"`
	- Given 一个数字
	- When 该数字是3和7的倍数，且包含5和7
	- then 打印`"FizzWhizz"`
55. 打印`"Whizz"`
	- Given 一个数字
	- When 该数字是5和7的倍数，且包含5和7
	- then 打印`"Whizz"`
56. 打印`"FizzWhizz"`
	- Given 一个数字
	- When 该数字是3、5、7的倍数，且包含5和7
	- then 打印`"FizzWHizz"`

57. 打印数字本身
	- Given 一个数字
	- When 该数字不是3、5、7的倍数，且包含3、5、7
	- then 打印数字本身
58. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字只是3的倍数，且包含3、5、7
	- then 打打印`"Fizz"`
59. 打印数字本身
	- Given 一个数字
	- When 该数字只是5的倍数，且包含3、5、7
	- then 打印数字本身
60. 打印`"Whizz"`
	- Given 一个数字
	- When 该数字只是7的倍数，且包含3、5、7
	- then 打印`"Whizz"`
61. 打印`"Fizz"`
	- Given 一个数字
	- When 该数字是3和5的倍数，且包含3、5、7
	- then 打印`"Fizz"`
62. 打印`"FizzWhizz"`
	- Given 一个数字
	- When 该数字是3和7的倍数，且包含3、5、7
	- then 打印`"FizzWhizz"`
63. 打印`"Whizz"`
	- Given 一个数字
	- When 该数字是5和7的倍数，且包含3、5、7
	- then 打印`"Whizz"`
64. 打印`"FizzWhizz"`
	- Given 一个数字
	- When 该数字是3、5、7的倍数，且包含3、5、7
	- then 打印`"FizzWHizz"`

## 

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


## 参考资料
- [JUnit 5用户指南](https://gitee.com/liushide/junit5_cn_doc/blob/master/junit5UserGuide_zh_cn.md#https://gitee.com/link?target=https%3A%2F%2Fgithub.com%2Fjunit-team%2Fjunit5-samples%2Ftree%2Fr5.0.2%2Fjunit5-gradle-consumer)
- [Gradle 用户指南](https://docs.gradle.org/current/userguide/userguide.html)