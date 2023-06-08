pipeline{
    agent any
    tools{
      jdk "jdk17"
      maven 'maven3'
    }
    stages{
        stage("CHCECK OUT"){
            steps{
                git branch: 'main', changelog: false, poll: false, url: 'https://github.com/uglk/spring-boot-devops.git'
            }
        }
        stage("MAVEN COMPILE"){
            steps{
                sh 'mvn clean compile'
            }
        }
    }
}