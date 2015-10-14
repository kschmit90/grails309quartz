// Uncommenting this and the below declaration will let it work
//import grails.core.GrailsApplication

class TestJob {

//  Uncommenting the below will make it work
//	GrailsApplication grailsApplication

	def grailsApplication

    static triggers = {
		  cron name: 'testCron', cronExpression: "0 0/1 * 1/1 * ? *"
    }

    def execute() {
    	println grailsApplication.config
    }
}