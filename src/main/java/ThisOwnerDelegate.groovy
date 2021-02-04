/**
 * @Author fandayong
 * @Date 2021/2/3 8:45 PM
 * @description
 */
def examiningClsure(closure) {
    closure();
}

examiningClsure() {
    println 'class is ' + getClass().name
    println this
    println this.getClass().superclass.name
    println owner
    println owner.getClass().superclass.name
    println delegate
    println delegate.getClass().superclass.name

    examiningClsure() {
        println 'class is ' + getClass().name
        println this
        println this.getClass().superclass.name
        println owner
        println owner.getClass().superclass.name
        println delegate
        println delegate.getClass().superclass.name
    }

}
