package front

/**
 * @Author fandayong
 * @Date 2021/2/4 7:11 PM
 * @description
 */
// 其中delegate为5 amount为10
Integer.metaClass.percentRaise = {amount->amount*(1+delegate/100.0)}
println 5.percentRaise(10)


10.times{
    println 123
}

// 判断回文 delegate指的是当前的对象
String.metaClass.isPalindrome = {
    ->delegate ==delegate.reverse()
}

word  = '1233211'
println word.isPalindrome()


// groovy的join元素
