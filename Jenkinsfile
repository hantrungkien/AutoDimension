pipeline {
    agent any
            stages {
                stage('Prepartion') {
                    agent any
                            steps {
                                echo 'Prepartion => ...'
                                sh './gradlew clean'
                            }
                }
//                stage('Lint') {
//                    agent any
//                            steps {
//                                echo 'Lint => ...'
//                                sh './gradlew ktlintCheck'
//                            }
//                }
                stage('Build') {
                    agent any
                            steps {
                                echo 'Build => ...'
                                sh './gradlew assembleDebug'
                            }
                }
                stage('Deploy') {
                    agent any
                            steps {
                                echo 'Deploy => ...'
                                sh './gradlew uploadDeployGateRelease'
                            }
                }
            }
    post {
        success {
            echo 'Passed => ...'
            mail to : 'kienhantrung@gmail.com',
            from: 'mr_ti3mchich@yahoo.com',
            subject: "Jenkins",
            body: "Kien oi duoc roiii"
        }
        failure {
            echo 'Failed => ...'
            mail to : 'kienhantrung@gmail.com',
            from: 'mr_ti3mchich@yahoo.com',
            subject: "Jenkins",
            body: "Kien oi khong duoc roiii"
        }
    }
}