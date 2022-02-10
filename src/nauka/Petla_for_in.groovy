package nauka

class Petla_for_in {
    static void main(String[] args) {
        //def arr = [0,1,2,3,4,5,7,10,11]
        def arrs = 2..16
        for (int i in arrs.step(2)){
            if (i == 10)
                println("WOW")
            println(i)
        }
        def emp = ["kelly":13, 'John':18,"Bruce":22]
        for (e in emp){
            println(e)
        }
        println("--__--__--__--__--__--__--__--__--")
//        2.upto(4) {println("$it")} / od 2 do 4
//        5.times {println("$it")} // start od 0, + 1 wykonać 5 razy
        0.step(10,2){println("$it")} // start od zera do 9 co 2

        def rn = 'a'..'z'
        rn.each {str -> println(str)}
        println(rn[3])
        println(rn.isReverse())
        def rn2 = 'l'..'e'
        println(rn2.isReverse()) // czy jest malejąca  np. 5,4,3,2,1 lub d,c,b,a
    }

}
