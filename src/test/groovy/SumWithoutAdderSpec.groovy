class SumWithoutAdder extends spock.lang.Specification {
    public void sum() {  //first scenrio
        when: "number is one"
        int number = 1

        then: "number plus number is two"
        number + number == 2 // == calls equals method; not same as == of Java
    }

    def "scenario 2"() {
        given: "An integer with value 5"
        def i = 5

        when: "This integer is added by 2"
        i = i + 2

        then: "The final value is 7"
        assert i != 5
        i == 7
    }
}