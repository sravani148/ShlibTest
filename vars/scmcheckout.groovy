def call(def projectkey, def reponame, def branch)
def errorMessage = ''
{
  //def gitID='xyz123'
  baseurl='https://github.com/'
  giturl="${baseurl}/${projectkey}/${reponame}.git"
  echo "url : ${giturl}"
  echo "Branch: "+branch;  

/*  def branchExists = script.sh(script:"git ls-remote --heads ${giturl} ${branch} | wc -l", returnStdout: true) as Integer
  if (branchExists == 0 || params.branch?.trim().isEmpty()) {
    errorMessage = "Branch not found"
  } */
}
