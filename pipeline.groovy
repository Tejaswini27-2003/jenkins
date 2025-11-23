pipeline {
    agent {label 'slave'}
    stages {
        stage('pull-stage') {
            steps {
                git branch: 'main', url: 'https://github.com/Anilbamnote/student-ui-app.git'
            }
        }
        stage('Build') {
            steps {
                echo "build stage"
            }
        }
        stage('test') {
            steps {
                echo "test stage"
            }
        }
        stage('deploy') {
            steps {
                echo "deploy sucess"
            }
        }
    }
}