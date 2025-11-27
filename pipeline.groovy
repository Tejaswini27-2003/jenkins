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
                sh '/opt/maven/bin/mvn clean package'
            }
        }
        stage('test') {
            steps {
                sh '''/opt/maven/bin/mvn sonar:sonar \\
                     -Dsonar.projectKey=project \\
                     -Dsonar.host.url=http://52.64.132.144:9000 \\                                 
                     -Dsonar.login=b487469ccc8ea28212fdabd6f652a2bc8c522735'''
            }
        }
        stage('deploy') {
            steps {
                echo "deploy sucess"
            }
        }
    }
}
