//import grails.core.GrailsApplication

class TestJob {

//	GrailsApplication grailsApplication

    static triggers = {
		  cron name: 'testCron', cronExpression: "0 0/1 * 1/1 * ? *"
    }

    def execute() {
    	println grailsApplication.config
    }
}