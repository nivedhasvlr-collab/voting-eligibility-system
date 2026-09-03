pipeline {
    agent any

    tools {
        maven 'Maven3' 
        jdk 'Java17'   
    }

    stages {
        stage('Checkout Source') {
            steps {
                checkout scm
            }
        }

        stage('Compile Project') {
            steps {
                sh 'mvn clean compile'
            }
        }
    }
}
