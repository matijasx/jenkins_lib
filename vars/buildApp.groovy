#!/usr/bin/env groovy

def call(String buildUsing = 'docker', image = ''){
	echo "Building using ${buildUsing} and image ${image}"
	if (buildUsing == 'docker' && image) {
		echo "Building using ${buildUsing} and image ${image}"
		sh 'docker build . -t apache_app'
		sh 'docker images'
		sh 'docker ps'
	} else {
		error "buildApp method missing one or more arguments"
	}
}