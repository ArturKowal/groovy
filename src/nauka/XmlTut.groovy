package nauka
import groovy.xml.MarkupBuilder
class XmlTut {
    static void main(String[] args) {
        def mb = new MarkupBuilder()

        mb.collection(shelf : 'New Arrivals') {
            movie(title : 'Enemy Behind')
            type('War, Thriller')
            format('DVD')
            year('2003')
            rating('PG')
            stars(10)
            description('Talk about a US-Japan war')
        }
    }
}
