#!/usr/bin/env groovy

def call() {
    withSonarQubeEnv('sonarqube') {
        sh 'mvn clean package sonar:sonar'
    	}
}