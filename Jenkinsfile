pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps { checkout scm }
    }
    stage('Build & Test') {
      steps {
        bat 'mvn clean test'
      }
    }
    stage('Archive') {
      steps {
        archiveArtifacts artifacts: 'target/cucumber*.*, target/screenshots/**', allowEmptyArchive: true
      }
    }
  }
}
