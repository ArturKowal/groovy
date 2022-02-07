package nauka

class Listy {
    static void main(String[] args) {
        def lista = [1,2,3,4,5,6,7,8]
        lista.add(0)
        println(lista)

        lista.add(2,10)
        println(lista)

        println(lista.contains(5))  // czy zawiera?
        println(lista.get(2)) // czyta element na indeksie 2
        println(lista.isEmpty()) // true jesli jest pusta
        println(lista.pop())  // usuwa ostatni element na liście
        lista.remove(2) // usuwa element na konkretnej pozycji
        lista.reverse()  // odwraca liste
        println(lista.size()) // zwraca rozmiar listy
        lista.sort()
        println(lista.toString())

    }
}
