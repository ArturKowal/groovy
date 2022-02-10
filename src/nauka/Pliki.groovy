package nauka
import java.io.File
class Pliki {
    static void main(String[] args) {
        new File("src/example.txt").eachLine {linia -> println("line: $linia")} // wydrukuj linia po lini
        new File('src/test_w.txt').withWriter('utf-8') {writer -> writer.writeLine 'Hello amazing World'} // nowy plik txt ze stringiem
        def file = new File("src/testDir")
        file.mkdir()
        println(file.directorySize())
        file.delete()
        def fileA = new File("src/example.txt")
        def fileB = new File("src/copytxt.txt")
        fileB << fileA.text
        fileB.delete()

        def filePath = "src/example.txt"
        File myFile = new File(filePath)
        //println(myFile.text)
        def list = myFile.collect {it}
//        println(list)

    }
}


//  https://www.youtube.com/watch?v=Q8Xt98NoTo4&list=PLhW3qG5bs-L8T6v6DgsZo93DgYDmOF9u4&index=21