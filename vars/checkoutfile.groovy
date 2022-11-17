#!/usr/bin/env groovy

def call(String name) {

 checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '0b5f0b84-3107-4c5d-a4eb-e8b5cb7ea9bc', url:"${name}"]]])
}

