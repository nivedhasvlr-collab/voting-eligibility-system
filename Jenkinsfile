pipeline {
    agent any

    stages {
        stage('Checkout Source') {
            steps {
                checkout scm
            }
        }

        stage('Compile Project') {
            steps {
                // Using standard maven command syntax directly
                sh 'mvn clean compile'
            }
        }
    }
}
