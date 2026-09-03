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
                // Changed from 'sh' to 'bat' for Windows environment compatibility
                bat 'mvn clean compile'
            }
        }
    }
}
