pipeline {
    agent any
    stages {
    stage('Build') {
        steps {
                echo "Building"
            }
    }

    stage('Deploy') {
      steps {
        echo "Deploying"
      }
    }

    stage("Test") {
     steps {
      bat 'mvn clean test'
     }
     post {
        success {
            cucumber buildStatus: 'null',
            customCssFiles: '',
            customJsFiles: '',
            failedFeaturesNumber: -1,
            failedScenariosNumber: -1,
            failedStepsNumber: -1,
            fileIncludePattern: '**/*.json',
            reportTitle: 'Cucumber Automation Tests',
            pendingStepsNumber: -1,
            skippedStepsNumber: -1,
            sortingMethod: 'ALPHABETICAL',
            undefinedStepsNumber: -1
        }
     }
    }
    }
}