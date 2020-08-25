#!/usr/bin/env groovy

def call(String buildUsing = 'docker', image = '', builtImageName = ''){
	echo "Building using ${buildUsing} and image ${image}"
	if (buildUsing == 'docker' && image && builtImageName) {
		echo "Building using ${buildUsing} and image ${image}"
		sh "docker build . -t ${builtImageName}"
		sh 'docker images'
	} else {
		error "buildApp method missing one or more arguments"
	}
}