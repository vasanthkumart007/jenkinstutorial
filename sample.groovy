pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello Mr. Vasanth'
            }
        }
    }
}
