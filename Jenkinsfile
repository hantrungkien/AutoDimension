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
            echo "Passed job: ${env.JOB_NAME}\nbuild: ${env.BUILD_ID} - ${env.BUILD_URL}\nblue ocean: ${env.RUN_DISPLAY_URL}"
            mail to : 'kienhantrung@gmail.com',
            from: 'mr_ti3mchich@yahoo.com',
            subject: "Jenkins",
            body: "Kien oi duoc roiii"
        }
        failure {
            echo "Failed job: ${env.JOB_NAME}\nbuild: ${env.BUILD_ID} - ${env.BUILD_URL}\nblue ocean: ${env.RUN_DISPLAY_URL}"
            mail to : 'kienhantrung@gmail.com',
            from: 'mr_ti3mchich@yahoo.com',
            subject: "Jenkins",
            body: "Kien oi khong duoc roiii"
        }
    }
}