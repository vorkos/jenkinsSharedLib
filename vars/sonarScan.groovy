#!/usr/bin/env groovy

def call() {
    

env.sonarHome= tool name: 'SonarQubeScanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'

    withSonarQubeEnv('sonarqube') { // from SonarQube servers > name
    sh "${sonarHome}/bin/sonar-runner -Dsonar.host.url=${SONAR_HOST_URL}  -Dsonar.login=${SONAR_AUTH_TOKEN} -Dsonar.projectName=test -Dsonar.projectVersion=1 -Dsonar.projectKey=my -Dsonar.sources=."
}


/*    withSonarQubeEnv('sonarqube') {
        sh 'mvn sonar:sonar'
    	}*/
}