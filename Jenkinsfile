pipeline {
	agent any
	stages{
		stage('Checkout') {
            steps {
            	git url: 'https://github.com/mohammed-anish-b/Eureka.git', branch: 'master'
            }
        }
		stage('build') {
			steps {
				bat 'mvn clean install -DskipTests'
			}
		}
		stage('image'){
			steps {
				bat 'docker build -f Dockerfile -t mhmdanish/eureka .'
			}
		}
		stage('run') {
			steps {
				bat 'docker run -p 8083:8083 mhmdanish/eureka'
			}
		}
	}
}
