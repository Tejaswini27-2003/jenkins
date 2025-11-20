// pipeline {
//     agent {label 'slave'}
//     stages {
//         stage('pull-stage') {
//             steps {
//                 git branch: 'main', url: 'https://github.com/Anilbamnote/student-ui-app.git'
//             }
//         }
//         stage('Build') {
//             steps {
//                 sh '/opt/maven/bin/mvn clean package'
//             }
//         }
//         stage('test') {
//             steps {
//                 echo "test suecss"
//             }
//         }
//         stage('deploy') {
//             steps {
//                 echo "deploy sucess"
//             }
//         }
//     }
// }




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


