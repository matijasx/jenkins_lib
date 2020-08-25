#!/usr/bin/env groovy

def call(String buildUsing = 'docker', image = ''){
	echo "Building using ${buildUsing} and image ${image}"
	if (buildUsing == 'docker' && image) {
		echo "Building using ${buildUsing} and image ${image}"
		return 0
	} else {
		echo "buildApp method missing either buildUsing or image arguments"
		return 1
	}
}