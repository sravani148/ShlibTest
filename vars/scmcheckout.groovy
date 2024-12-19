def call(def projectkey, def reponame, def branch)
{
  //def gitID='xyz123'
  baseurl='https://github.com/'
  giturl="${baseurl}/${projectkey}/${reponame}.git"
  echo "Branch: "+branch;  
}
