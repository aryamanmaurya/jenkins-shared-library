def call(String imageName, String imageTag = "latest" , String dockerFile = "Dockerfile"){
  echo "Building the Docker image: ${imageName}:${imageTag}"
  sh "docker build -t ${imageName}:${imageTag} -f ${dockerfile} ."
  echo "Docker image ${imageName}:${imageTag} built successfully."
}
