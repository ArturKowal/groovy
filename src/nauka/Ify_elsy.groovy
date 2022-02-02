package nauka

class Ify_elsy {
    static void main(String[] args) {
        for(int i in 0..20){
            if(i%2==0) {
                println("Parzysta: " + i)
            }
            /*else if (i%2!=0){
                println("Nieparzysta: "+ i)
            }*/
            else if (i%5==0 && i!=0){
                println("Podzielna przez 5: " + i)
            }
            else {
                println("Liczba: " + i)
            }
        }
    }
}
