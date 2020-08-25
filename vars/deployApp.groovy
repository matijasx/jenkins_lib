#!/usr/bin/env groovy

def call(String environmentVariables){
	sh 'docker-compose up --build -d'
}
