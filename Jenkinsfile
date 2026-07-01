pipeline {
    agent any
    tools {
        maven 'mvn3'
    }
    stages {
        stage('Checkout Code'){
            steps {
                git branch: 'main',
                    url: "https://github.com/MP-30/spring_boot_devops.git"
            }
        }
        stage('Build'){
            steps{
                dir(''){
                    sh 'mvn clean package'
                }
            }
        }
        stage('Deploy'){
            steps{
                dir(''){
                    sh 'nohup java -jar target/*.jar > app.log 2>&1 &'
                }
            }
        }

    }
         post {
        success {
            archiveArtifacts artifacts: 'target/*.jar', followSymlinks: false

            // Replaced 'emailext' with 'mail' to use your existing configuration
            mail body: 'This is for my personal testing.. Hi Hi ha ha hu hu',
                 subject: 'Testing my Jenkins',
                 to: 'learningonly092@gmail.com'
        }
        failure {
            mail body: 'Jenkins Pipeline Failed! Please check the terminal logs.',
                 subject: 'ALARM: Jenkins Build Failed',
                 to: 'learningonly092@gmail.com'
        }
    }
}