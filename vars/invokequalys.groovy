def call (image_name,harborregistry){
  if (image_name.contains('dev') || image_name.contains('lab'))  {
    environment = "DEV"
    echo "${environment}"
  }  else if (image_name.contains('cde')){
  environment = "PROD"
    echo "${environment}"
  } else {
  error "No registry found"
  }
  
  echo "environment is ${environment}"
def proFileContent = libraryResource 'config.properties'
def props = readProperties text: propFileContent
echo "${props}"
  
}
