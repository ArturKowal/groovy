package nauka

class Generyki {
    static void main(String[] args) {
        // zamknięcia
        def clos = {println "Hello World";
            println("Pretty girl")};
        clos.call();
        def zam = {param->println "Artur ${param}"};
        zam.call("Kkkkk")
        def cos = {println("hello my dear ${it}")}
        cos.call("friend !")
        zam.call("Nowak")

        def lst = [11, 12, 13, 14];
        lst.each {println it}
        lst.each{num -> if(num % 2 == 0) println num}

        def value
        value = lst.find {element -> element > 9}
        println("value    : --> "+value)


        def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
        mp.each {println it}
        mp.each {println "${it.key} maps to: ${it.value}"}

        def isOdd = {int param -> param%2!=0}
        println(isOdd(5))
        def closureWithOneArg = { str -> str.toUpperCase() }
        println(closureWithOneArg('groovy'))

        def multiConcat = { int n, String... argss -> argss.join('')*n}
        println(multiConcat(6, 'OUI ','LIV '))

        ListType<String> lststr = new ListType<>()
        lststr.set("First step")
        //println(lststr.get())
        ListType<Integer> lstint = new ListType<>()
        lststr.set()
//        lststr.set(3)
//        lststr.set(5)
        //println(lstint.get())\
        def a = 2
        def b = ++a *3
        assert b == 9  // assert do kontrolowania czy wynik z lewej strony jest równy temu z prawej

        def myList = [1,2,3,4,5,6]
        println(myList.find( {item -> item == 3}))
        println(myList.findAll( {item -> item > 3}))
        println(myList.any( {item -> item > 5 }))
        println(myList.every( {item -> item > 4}))
        println(myList.collect( {item -> item *3 }))
    }
}

public class ListType<T>{
    private T localt;

    public T get(){
        return this.localt
    }
    public T set(T plocal){
        this.localt = plocal
    }
}
