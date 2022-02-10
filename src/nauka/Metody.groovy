package nauka

class Metody {
    def x = 15
    public int getX(){
        this.x = 10
        return x
    }
    protected int setX(newX){
        x=newX
    }
    protected int range(int a, int b){
        def c = a..b
        println(c.step(10))
    }

    static void main(String[] args) {
        Metody met = new Metody()
        println(met.getX())
        met.setX(20)
        println(met.getX())
//        met.range(5,93)
    }
}
