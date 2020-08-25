#!/usr/bin/env groovy

def call(String buildUsing = 'docker', image = ''){
	echo "Building using ${buildUsing} and image ${image}"
	if (buildUsing == 'docker') {
		sh 'Building using ${buildUsing} and image ${image}'
	} else {
		sh 'echo  "buildApp method missing either buildUsing or image arguments"'
	}
}