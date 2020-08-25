#!/usr/bin/env groovy

def call(String provisioner = 'docker', serviceName = '', externalPort = '80',  internalPort = '80', image = ''){
	echo "Deploying"
	if (provisioner == 'docker' && serviceName && image){

		sh "docker run -d --name ${serviceName} --port ${externalPort}:${internalPort} ${image}"
	}
	
}
