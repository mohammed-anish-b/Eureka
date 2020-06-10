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
				docker.build('mhmdanish/eureka', '-f Dockerfile .')
			}
		}
		stage('run') {
			steps {
				docker.run('mhmdanish/eureka').run('-p 8083:8083')
			}
		}
	}
}
