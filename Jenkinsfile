pipeline {
	agent none
	stages{
		stage('Checkout') {
            git url: 'https://github.com/mohammed-anish-b/Eureka.git', branch: 'master'
        }
		stage('build') {
			bat 'mvn clean install -DskipTests'
		}
	}
}