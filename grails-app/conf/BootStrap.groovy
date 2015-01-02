import org.joda.time.LocalDate

import twitter.bootstrap.scaffolding.Address
import twitter.bootstrap.scaffolding.Person

class BootStrap {

    def init = { servletContext ->
		def address = new Address(address1: "123 Any St.", address2: "Apt. 101", city: "Anytown", postCode: "12345")
		new Person(
			firstName: "John", 
			lastName: "Doe", 
			email: "a@b.com", 
			dateOfBirth: new LocalDate(1923, 10, 01), 
			address: address).save(failOnError: true)
    }
	
    def destroy = {
    }
}
