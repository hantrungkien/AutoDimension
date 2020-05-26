pipeline {
    agent any
            stages {
                stage('Build Assets') {
                    agent any
                            steps {
                                step {
                                    echo 'Building Assets...'
                                }
                                step {
                                    sh './gradlew assembleDebug'
                                }
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