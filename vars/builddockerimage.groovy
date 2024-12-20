def call(Map params = [: ]){
        def projectkey = params.containsKey('projectkey') ? params.projectkey : null
        def reponame = params.containsKey('reponame') ? params.reponame : null
        def branch = params.containsKey('branch') ? params.branch : null
        def pathtodocker = params.containsKey('pathtodocker') ? params.pathtodocker : null
        def harborregistry = params.containsKey('harborregistry') ? params.harborregistry : null
        def harborrepo = params.containsKey('harborrepo') ? params.harborrepo : null
        def imagename = params.containsKey('imagename') ? params.imagename : null
        def imagetag = params.containsKey('imagetag') ? params.imagetag : null

echo "docker build -t ${harborregistry}/${harborrepo}/${imagename}:${imagetag}"

}
