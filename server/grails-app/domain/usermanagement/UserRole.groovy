package usermanagement


import groovy.transform.ToString
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
@ToString(cache=true, includeNames=true, includePackage=false)
class UserRole implements Serializable {

	private static final long serialVersionUID = 1

	User user
	Role role


	static mapping = {
		id composite: ['user', 'role']
		version false
	}
}
