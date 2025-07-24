def call(String ProjectName, String imageTag, String Dockerhubuser){
  sh 'whoami'
  sh "docker build -t ${Dockerhubuser}/${ProjectName}:${imageTag} ."
}
