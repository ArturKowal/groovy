package nauka

class TryCatch {
    static void main(String[] args) {
        try {
            def a = 5/0
            /*def arr = new int[3]
            arr[5] = 5*/

        } catch(ArrayIndexOutOfBoundsException ex) {
            println("Catching the Array out of Bounds exception")
        }/*catch(Exception ex) {
            println("Catching the exception")
            println(ex.toString())
            println(ex.getMessage())
            println(ex.getStackTrace())
        }*/catch(ArithmeticException ex){
            println("Nie dziel przez zero Ty!!!")
        } finally {
            println("The final block")
        }

        println("Let's move on after the exception");
    }
}
