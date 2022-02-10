package nauka

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

class JsonTut {
    static void main(String[] args) {
        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText('{ "name": "John", "ID" : "1"}')
        def obj = jsonSlurper.parseText ''' {"a": 12, "b": 12.55, "c": 12e13}'''
        Object lst = jsonSlurper.parseText('{ "List": [2, 3, 4, 5] }')
        def output = JsonOutput.toJson([name: 'John', ID: 1])

        println(output);
//        lst.each { println it }
//        def aa = obj.a
//        println(aa.getClass().getSimpleName());
//        println(obj.b.getClass().getSimpleName());
//        println(obj.c);


        //println(object.name);
        //println(object.ID);
    }
}
