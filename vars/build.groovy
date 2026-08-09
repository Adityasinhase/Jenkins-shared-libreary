def call(string app_name, string version){
  sh "docker build -t "${app_name}":"${version}" ."
}
