def call(String app_name, String version){
  sh "docker build -t "${app_name}":"${version}" ."
}
