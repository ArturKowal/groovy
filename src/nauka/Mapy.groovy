package nauka

class Mapy {
    static void main(String[] args) {

        Map mapa = ["Name":'Artur',"Surname":"Kowal","YearsOld":18,"Job":'junior developer']
        println(mapa.containsKey("Job"))  // case sensitive
        println(mapa.get("Name")) // zwraca wartosc klucz, jesli klucza nie ma to zwraca null
        println(mapa.keySet()) // zwraca liste kluczy
        mapa["age"] = 42 // dodawanie do maapy
        mapa.put('City','Krakaw') // dodawanie do mapy
        println(mapa)
        println(mapa.containsValue('Kowal'))
        println(mapa.size())
        println(mapa.values())
        mapa.each {key,value -> println("Nasz klucz: $key i jego wartość: $value")} // domknięcie
        mapa.eachWithIndex {key,value, i -> println("$i  ||  Nasz klucz: $key i jego wartość: $value")} // domknięcie

        mapa.clear()
    }
}
