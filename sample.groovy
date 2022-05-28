pipeline {
    agent any

    stages {
        stage('Name') {
            steps {
                echo "Name = $params.Name"
            }
        }
        stage('Year') {
            steps {
                echo "Year = $params.Year"
            }
        }
        stage('Section') {
            steps {
                echo "Section = $params.Section"
            }
        }
        stage('CGPA') {
            steps {
                echo "CGPA = $params.CGPA"
            }
        }
        stage('Remarks') {
            steps {
                echo "Remarks = $params.Remarks"
            }
        }
    }
}
