pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'gitpract', url: 'https://github.com/Charmiss/Project.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the application...'
                bat 'build.bat'   // Use your Windows batch build script here
                // Or run Windows commands directly, e.g. bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'run-tests.bat'  // Your Windows batch test script
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
