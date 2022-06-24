package com.example.android_notes

fun main() {
    //3. String Template
//    val name = "Lim"
//    val lastName = "Sy"
//    println("my name is ${name + lastName} I'm 23")
//    println("is this true? 2\$a")

    forAndWhile()

}
// 1. 함수
fun helloWorld() {
    println("Hello world!")
}

fun add(a: Int, b:Int): Int {
    return a + b
}

//2. val vs var
// val = value -> immutable  불변 객체
// var = variable -> mutable  가변 객체

fun hi() {
    val a: Int = 10
    var b: Int = 8

    var e: Int
    e = 152
    b = 100

    val c = 100
    var d = 100

    var name: Char = 'a'
    var asd: String = "asd"
}

// 4. 조건식
fun maxBy(a: Int, b:Int): Int {
    /*if(a > b) {
        return a
    } else if(a === b){
        return a
    } else {
        return b
    }*/

    // 위에 if문 축약
    return if(a > b) {
        a
    } else if(a === b) {
        b
    } else {
        a
    }
}

fun maxBy2(a: Int, b: Int) = if(a>b) a else b

fun checkNum(score: Int) {
    // Statement
    when(score) {
        0 -> println("this is zero")
        1 -> println("this is one")
        2 ,3 -> println("this is two or three")
        else -> println("I don't know") //else 생략 가능

    }

    //Expression
    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3 //else 생략 불가능 
    }

    println("b: ${b}")

    when(score) {
        in 90..100 -> println("You are geniuse")
        in 10..80 -> println("Not bad")
        else -> println("Okay") //생략
    }
}

// Expression VS Statement
/* Kotlin에 모든 함수는 Expression으로 사용 -> 반환값이 Unit이여도 결국에는 Unit이라는 것을 반환하기
 * - Expression -> 값을 반환하는 경우 ex) if(a > b) a else b
 * - Statement -> 명령을 지시하는 경우 ex)  when(a) {1 -> println("one")}
 */

// 5. Array and List
/*
*   - Array는 기본적으로 정해져 있는 사이즈가 있음 즉, 메모리가 이미 할당이 되서 나오기 때문에 처음에 크기를 지정해줘야함
*       - Array는 mutable
*   - List
*       - 1. ImmutableList -> 수정이 불가능한 List
*       - 2. MutableList -> 수정이 가능한 List
* */

fun array() {
    val array = arrayOf(1,2,3) //Array 초기화
    //Immutable List
    val list = listOf(1,2,3)

    val array2 = arrayOf(1, "d", 'c', 3.4f, 22.5)
    val list2 = listOf(1, "d", 'c', 3.4f, 22.5)

    array[0] = 3

    //Mutable List
    var arrayList = arrayListOf<Int>(1,23)
    arrayList.add(10)
    arrayList.add(20)

}

// 6. For / While

fun forAndWhile() {
//    val student = arrayListOf("Lim", "Kim","Hong","Park")
//
//    for(name in student) {
//        println("$name")
//    }
//
//    var sum = 0
//    // 1 ~ 10까지 2씩 뛰어서 -> 1, 3, 5, 7, 9
//    for( i in 1..10 step 2) {
//        sum += i
//    }
//    println("sum: $sum")
//
//    // 10 ~ 1 1씩 내려감
//    for(i in 10 downTo 1) {
//        println(i)
//    }
//
//    // 1 ~ 9 까지 1씩 증가 -> 10 포함 X
//    for(i in 1 until 10) {
//        println(i)
//    }

    var index = 0

    while(index < 10) {
        println("current: $index")
        index++
    }
}

