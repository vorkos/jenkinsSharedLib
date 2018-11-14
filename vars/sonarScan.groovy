#!/usr/bin/env groovy

def call() {
    withSonarQubeEnv('sonarqube') {
        sh 'mvn sonar:sonar'
    	}
}