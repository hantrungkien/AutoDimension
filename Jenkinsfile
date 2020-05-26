pipeline {
    agent any
            stages {
                stage('Prepartion') {
                    agent any
                            steps {
                                sh './gradlew clean'
                            }
                }
                stage('Lint') {
                    agent any
                            steps {
                                sh './gradlew ktlintCheck'
                            }
                }
                stage('Deploy') {
                    agent any
                            steps {
                                sh './gradlew uploadDeployGateRelease'
                            }
                }
            }
    post {
        success {
            mail to : 'kienhantrung@gmail.com',
            from: 'mr_ti3mchich@yahoo.com',
            subject: "Jenkins",
            body: "Kien oi duoc roiii"
        }
        failure {
            mail to : 'kienhantrung@gmail.com',
            from: 'mr_ti3mchich@yahoo.com',
            subject: "Jenkins",
            body: "Kien oi khong duoc roiii"
        }
    }
}