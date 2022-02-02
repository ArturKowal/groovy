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
    }
}
