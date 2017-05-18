def gitUrl = 'https://github.com/stheju/restapi.git'

job('test job') {
scm {
    git {
      remote {
        name('origin')
        url(gitUrl)
    }
      branches('master')
      extensions {}
    }
    }
    steps {
        shell("""npm install
                npm test""")
    }
}