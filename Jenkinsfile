pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M2"
    }

    stages {
        stage('Preparation') {
            steps {
                // Get some code from a GitHub repository
               git branch: 'master', url: 'https://github.com/nicks204/WebDriverJun22.git'

            }
        }
        stage('Build') {
            steps {
                
                // To run Maven on a Windows agent, use
                 bat "mvn clean test"
            }
        
        }
    }
}
