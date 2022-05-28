pipeline {
    agent any

    stages {
        stage('Name') {
            steps {
                echo "$params.Name"
            }
        }
        stage('Year') {
            steps {
                echo "$params.Year"
            }
        }
        stage('Section') {
            steps {
                echo "$params.Section"
            }
        }
        stage('CGPA') {
            steps {
                echo "$params.CGPA"
            }
        }
        stage('Remarks') {
            steps {
                echo "$params.Remarks"
            }
        }
    }
}
