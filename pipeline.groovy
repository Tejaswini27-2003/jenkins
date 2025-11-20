pipeline {
    agent any
    stages {
        stage('pull-stage') {
            steps {
                echo "pull stage"
            }
        }
        stage('Build') {
            steps {
                echo "build stage"
            }
        }
        stage('test') {
            steps {
                echo "test suecss"
            }
        }
        stage('deploy') {
            steps {
                echo "deploy sucess"
            }
        }
    }
}


