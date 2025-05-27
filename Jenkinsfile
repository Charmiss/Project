pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Charmiss/Project.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the application...'
                sh './build.sh'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                sh './run-tests.sh'
            }
        }
    }

    post {
        success {
            echo 'Build and tests succeeded.'
        }
        failure {
            echo 'Build or tests failed.'
        }
    }
}
