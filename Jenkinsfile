pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Charmiss/Project.git', branch: 'Jenkinsfile'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the application...'
                bat 'echo Build step placeholder'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing the application...'
                // Add your test commands here
            }
        }
    }
    post {
        failure {
            echo 'Build or tests failed.'
        }
        success {
            echo 'Pipeline completed successfully!'
        }
    }
}
