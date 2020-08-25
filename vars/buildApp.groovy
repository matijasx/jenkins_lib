#!/usr/bin/env groovy

def call(String buildUsing = 'docker', image = ''){
	echo "Building using ${buildUsing} and image ${image}"
	if (buildUsing == 'docker' && image) {
		echo "Building using ${buildUsing} and image ${image}"
	} else {
		error "buildApp method missing either buildUsing or image arguments"
	}
}