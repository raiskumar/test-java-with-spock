
import spock.lang.*

class AdderSpec extends spock.lang.Specification{
	def "Adding two numbers to return the sum"() {  //a Groovy with a human redable name that contains a test scenerio
		when: "a new Adder class is created"  //when block sets the scene
		def adder = new Adder()  //semicolons are optional

		then: "1 plus 1 is 2"   //then block will hold verification code
		adder.add(1, 1) == 2    // Groovy assert statement; get awway with verbose assert*
	}
	
	def "Order of numbers does not matter"() {  //another test scenerio; with optional typing using def
		when: "a new Adder class is created"
		Adder adder = new Adder() // you can use type if you know

		then: "2 plus 3 is 5"
		int sum = adder.add(2, 3)
		println "sum is "+sum    //all Groovy objects inherit println method
		sum  == 5
		
		and: "3 plus 2 is also 5"
		adder.add(3, 2) == 5
	}
}
