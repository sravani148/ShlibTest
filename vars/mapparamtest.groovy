 def call(Map params = [: ]){
        def projectkey = params.containsKey('projectkey') ? params.projectkey : null
        def reponame = params.containsKey('reponame') ? params.reponame : null
        def branch = params.containsKey('branch') ? params.branch : null
        def pathtodocker = params.containsKey('pathtodocker') ? params.pathtodocker : null
  
  echo "Reading params through map functionality: ${projectkey}/${reponame}/${branch}"

  baseurl='https://github.com/'
  giturl="${baseurl}/${projectkey}/${reponame}.git"
  echo "url : ${giturl}"
  echo "Branch: "+branch;
 }
