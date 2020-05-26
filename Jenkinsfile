pipeline {
    agent any
            stages {
                stage('Build Assets') {
                    agent any
                            steps {
                                echo 'Building Assets...'
                                sh './gradlew assembleDebug'
                            }
                }
                stage('Test') {
                    agent any
                            steps {
                                echo 'Testing stuff...'
                            }
                }
            }
}