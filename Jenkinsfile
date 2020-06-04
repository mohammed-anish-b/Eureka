pipeline {
	agent none
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
	}
}