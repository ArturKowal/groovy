package nauka

class Stringi {
    static void main(String[] args) {
        def napis = "Hello world"
        def slowo = "HEllO WORLD"
        def wyraz = "Hello worl"
        def s = napis.concat(", it's a nice day")

        println(napis[-1..0]) // od konca do poczatku
        println(napis[0..2]) // indeksy 0,1,2 włącznie
        println((napis[4..6]+" ")*5+napis[2..3])
        println(napis.length()) //dlugosc napisu

        println(napis.compareToIgnoreCase(slowo))
        println(napis.compareToIgnoreCase(wyraz))
        println(s.toUpperCase())
        println(s.reverse())
        println(s.padRight(50,"*-_-*"))
        println(s.split(' '))
        println((5..50000).step(2345).contains(2350))
        println((5..50000).step(2345).get(8))
        println((5..50000).step(2345))

        println(napis.indexOf("w"))  // jaki ma indeks litera w w napis
        println(napis-("world"))
        println(napis.replace("world","girl"))
        println(napis.toList())
    }
}
/*
https://www.tutorialspoint.com/groovy/groovy_strings.html
*/