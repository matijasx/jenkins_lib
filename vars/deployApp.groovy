#!/usr/bin/env groovy

def call(String serviceName = '', externalPort = '80',  internalPort = '80', image = ''){
	if (serviceName && image){

		sh "docker run -d --name ${serviceName} --port ${port} ${image}"
	}
	
}
