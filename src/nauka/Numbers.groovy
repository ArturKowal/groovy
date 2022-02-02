package nauka
import java.lang.Math
class Numbers {
    static void main(String[] args) {
        int a = 10
        double b = 20.76
        float c = -30.23
        float d = 10.000
        def e = 3233455345954959549
        def f = "14"
        def x = Integer.parseInt(f,8)
        println(a.floatValue())
        println(e.byteValue())
        println(e.intValue()) // konwersja na inny typ
        System.out.println(a.compareTo(10))  // compareTo() daje wynik 0 jeśli liczby są takie same, wynik 1 kiedy a=10>9 i wynik -1 kiedy a=10<11
        println(a.compareTo(9))
        println(a.equals(d.intValue()))  // equals sprawdza czy jest tego samego typu o czy ma taka sama wartosc liczbowa
        println(a.toString()) // konwersja inta na stringa
        println(x)
        println(c.abs()) // wartosc bezwzgledna
        println(b.Math.ceil())


    }
}
