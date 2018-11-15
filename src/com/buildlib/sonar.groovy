package com.buildlib
@Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.6')
@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')
import org.apache.commons.lang3.StringUtils
import static groovyx.net.http.ContentType.TEXT
/**
*
*
**/

def hasService(String name) {
    /// TODO: implement URL check
    return true
}

class SonarQube implements Serializable {
    def script
    def steps
    protected Map config
    String taskURL = "http://<SONAR_URL>/api/ce/task?id=TASK_ID"
    String projectStatusURL = "http://<SONAR_URL>/api/qualitygates/project_status?analysisId="
    SonarQube(steps) {this.steps = steps}


    /* -Dsonar.login= -Dsonar.projectKey=myproject -Dsonar.projectName= -Dsonar.host.url=http://localhost:9000*/
}