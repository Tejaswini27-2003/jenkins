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
                sh '/opt/maven/bin/mvn sonar:sonar -Dsonar.projectKey=studentapp -Dsonar.host.url=http:// 3.26.54.234:9000  -Dsonar.login=51590797e14e0536d584661cedf809f92367e2e1'
            }
        }
        stage('deploy') {
            steps {
                echo "deploy sucess"
            }
        }
    }
}
