grails.servlet.version = "2.5"
grails.project.work.dir = "target"
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.source.level = 1.6
grails.project.target.level = 1.6

grails.project.dependency.resolution = {
    inherits "global"
    log "warn"
    checksums true

    repositories {
        inherits true
		
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenLocal()
        mavenCentral()
		
		mavenRepo "http://snapshots.repository.codehaus.org"
		mavenRepo "http://repository.codehaus.org"
		mavenRepo "http://download.java.net/maven/2/"
		mavenRepo "http://repository.jboss.com/maven2/"
		mavenRepo "http://maven.springframework.org/milestone/"
		
    }

    dependencies {
		compile "org.jadira.usertype:usertype.jodatime:2.0.1"
    }

    plugins {
        compile ":hibernate4:4.3.5.5"
		compile ":joda-time:1.5"
        compile ":asset-pipeline:2.0.19"
		compile ":scaffolding:2.1.2"
		
		runtime ":twitter-bootstrap:3.3.1"
		runtime ":fields:1.4"
        runtime ":jquery:1.11.1"

        build ":tomcat:7.0.55"
    }
}
