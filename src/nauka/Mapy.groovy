package nauka

class Mapy {
    static void main(String[] args) {

        Map mapa = ["Name":'Artur',"Surname":"Kowal","YearsOld":18,"Job":'junior developer']
        println(mapa.containsKey("Job"))  // case sensitive
        println(mapa.get("Name")) // zwraca wartosc klucz, jesli klucza nie ma to zwraca null
        println(mapa.keySet())
        mapa["age"] = 42
        println(mapa)
        println(mapa.size())
        println(mapa.values())

    }
}
