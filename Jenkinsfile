pipeline {
    
    agent any
    stages{
        stage('Initialize'){
            steps {
                def dockerHome = tool 'Docker'
            env.PATH = "${dockerHome}/bin:${env.PATH}"
            }
        }
        stage('Checkout') {
            steps {
                git url: 'https://github.com/mohammed-anish-b/Eureka.git', branch: 'master'
            }
        }
        stage('build') {
            agent {
                   docker {
                    image 'maven:3-alpine' 
                    args '-v /root/.m2:/root/.m2' 
                }
            }
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }
        stage('image'){
            steps {
                sh 'docker build -f Dockerfile -t mhmdanish/eureka .'
            }
        }
        stage('run') {
            steps {
                sh 'docker run -p 8083:8083 mhmdanish/eureka'
            }
        }
    }
}
