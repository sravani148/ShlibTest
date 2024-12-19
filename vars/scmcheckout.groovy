def call(def projectkey, def reponame, def branch)
def errorMessage = ''
{
  //def gitID='xyz123'
  baseurl='https://github.com/'
  giturl="${baseurl}/${projectkey}/${reponame}.git"
  echo "url : ${giturl}"
  echo "Branch: "+branch;  
}
