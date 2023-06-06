pipeline{
    agent any
    stages{
        stage("CHCECK OUT"){
            steps{
                git branch: 'main', changelog: false, poll: false, url: 'https://github.com/uglk/spring-boot-devops.git'
            }
        }
    }
}