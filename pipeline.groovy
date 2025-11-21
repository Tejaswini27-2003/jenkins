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
                sh '/opt/maven/bin/mvn sonar:sonar -Dsonar.projectKey=studentapp -Dsonar.host.url=http:// 16.176.209.19:9000  -Dsonar.login=967deab55bf3de34de63964aa4d663dab1341750'
            }
        }
        stage('deploy') {
            steps {
                echo "deploy sucess"
            }
        }
    }
}