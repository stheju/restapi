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
        shell('echo Hello World!')
    }
}