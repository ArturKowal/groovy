package nauka
import java.lang.Math
class Numbers {
    static void main(String[] args) {
        int a = 10
        double b = 20.76
        double bb = 20.500
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
        println(Math.ceil(b))
        println(Math.floor(b).intValue())
        println(Math.rint(b))
        println(Math.rint(bb))  // rint - zaokrąglenie do najbliższej wartosci 1.500 zaokragli do 1 w przeciwienstwie do round
        println(Math.rint(c).intValue())
        println(Math.round(bb).intValue()) // round zaogragli 1.500 do 2.0

        // konwersja na inny system liczbowy
        println(Integer.toBinaryString(42445231))
        println(Integer.toHexString(125))
        println(Integer.parseInt("1010101110",2))
        println(Integer.parseInt("356",8))
        def out = (1>0) ? "Yes" : "No"
        println(out)
    }
}
