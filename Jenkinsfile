pipeline{
    agent any
    tools{
      jdk "jdk17"
      maven 'maven3'
    }
    options {
    buildDiscarder(logRotator(numToKeepStr: '1', artifactNumToKeepStr: '1'))
    }
    stages{
        stage("Check-Out"){
            steps{
                git branch: 'main', changelog: false, poll: false, url: 'https://github.com/uglk/spring-boot-devops.git'
            }
        }
        stage("Maven-Compile"){
            steps{
                sh 'mvn clean compile'
            }
        }
        stage("Maven-Build"){
            steps{
                sh 'mvn clean package'
            }
        }
    }
}