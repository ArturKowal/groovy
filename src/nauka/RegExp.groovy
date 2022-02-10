package nauka

class RegExp {
    static void main(String[] args) {
        def match = "this is my home" =~ "/(?:[^is]*)/";
        println(match)
    }
}
