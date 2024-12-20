def call (image_name){
  if (image_name.contains('dev') || image_name.contains('lab'))  {
    environment = "DEV"
  }  else if (image_name.contains('cde')){
  environment = "PROD"
  } else {
  error ""
  }
  
  echo "environment is ${environment}
def proFileContent = libraryResource 'config.properties'
def props = readProperties text: propFileContent
echo "${props}"
  
}
