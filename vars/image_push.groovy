def call(String dockerhubcreds, String dockerHubPassword, String dockerHubUsername){
   withCredentials([usernamePassword(credentialsId:"${dockerhubcreds}",
                    passwordVariable: "${dockerHubPassword}",
                    usernameVariable: "${dockerHubUsername}")])
                {
                sh "docker login -u ${env.dockerHubUsername} -p ${env.dockerHubPassword}"
                sh "docker image tag flask_app_image ${env.dockerHubUsername}/flask_app_image:latest"
                sh "docker push ${env.dockerHubUsername}/flask_app_image:latest"
                }
}
