pipeline {
    agent any

    tools {
        maven 'Maven3' // This tells Jenkins to load the tool we configured
    }

    stages {
        stage('Checkout Source') {
            steps {
                checkout scm
            }
        }

        stage('Compile Project') {
            steps {
                bat 'mvn clean compile'
            }
        }
    }
}
