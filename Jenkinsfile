pipeline {
    agent any

    tools {
        maven 'maven-3.5.4'
    }
    stages {
        stage('Build') {
            steps {
                sh "mvn clean package spring-boot:repackage"
                sh "printenv" // 将环境变量打印到console中
            }
        }
    }
}