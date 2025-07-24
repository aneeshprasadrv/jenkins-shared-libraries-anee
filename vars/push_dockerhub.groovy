def call(String Project, String Tag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'Dockerhub', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]){
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
}
sh "docker push "${dockerhubuser}"/"${Project}":"${Tag}"
}
