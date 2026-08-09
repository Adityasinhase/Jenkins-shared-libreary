def call(String dockerhubcreds, String imagename, String version){
   withCredentials([usernamePassword(credentialsId:"${dockerhubcreds}",
                    passwordVariable: "$dockerHubPassword",
                    usernameVariable: "$dockerHubUsername")])
                {
                sh "docker login -u ${env.dockerHubUsername} -p ${env.dockerHubPassword}"
                sh "docker image tag ${imagename} ${env.dockerHubUsername}/${imagename}:${version}"
                sh "docker push ${env.dockerHubUsername}/${imagename}:${version}"
                }
}
