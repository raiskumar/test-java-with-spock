
class SumWithoutAdder extends spock.lang.Specification{
    public void sum(){
        when: "number is one"
        int number = 1

        then: "number plus number is two"
        number + number == 2 // == calls equals method; not same as == of Java
    }
}