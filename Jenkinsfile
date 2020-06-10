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
