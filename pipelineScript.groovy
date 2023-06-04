pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                sh 'echo checkout'
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/TimonSchneider/DevOpsDemo.git']]])
            } 
        }
stage('Test') { steps {
                sh 'echo test'
            }
        }
        stage('Deploy') {
steps {
sh 'echo deploy'
} 
            
        }
} 
    
}