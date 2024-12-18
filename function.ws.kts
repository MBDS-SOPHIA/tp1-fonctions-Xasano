//Fonction qui affiche les x premiers nombres pairs ou impairs
fun function1(x : Int, pair : Boolean){
    for (i in 1..x){
        if (pair){
            println(i*2)
        } else {
            println(i*2-1)
        }
    }
}
function1(5, true)
function1(5, false)

fun function2(x : Int){
    var a = 0
    var b = 1
    var c = 0
    println(a)
    println(b)
    for (i in 2..x){
        c = a + b
        println(c)
        a = b
        b = c
    }
}

function2(15)

fun function3(x : Int = 10){
    var a = 1
    for (x in 1..x){
        a = a*x
    }
    println(a)
}

function3(5)

fun function4(x : Int){
    var count = 0
    var num = 2
    while (count < x) {
        if (isPrime(num)) {
            println(num)
            count++
        }
        num++
    }
}
fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

function4(5)