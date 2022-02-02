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

    }
}


