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
        stage('Mobile Number') {
            steps {
                echo "Mobile = $params.Mobile"
            }
        }
        stage('Remarks') {
            steps {
                echo "Remarks = $params.Remarks"
            }
        }
    }
}
