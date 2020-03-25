timestamps {
    node () {
        stage ('Checkout') {
          checkout([$class: 'GitSCM', branches: [[name: '**']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '', url: 'https://github.com/TalaatHarb/project-euler-100']]]) 
        } // stage ('Checkout')

        stage ('go-test') {
            // Install the desired Go version
            def goRoot = tool name: 'Go 1.14.1', type: 'go'

            // Export environment variables pointing to the directory where Go was installed
            withEnv(["GOROOT=${goRoot}", "PATH+GO=${goRoot}/bin"]) {            
                 sh """
                 cd go-project-euler-100
                 go test 
                """ 
            } // withEnv
        } // stage ('go-test')

        stage ('python-test') {
            withPythonEnv('python3') {
                // Uses python environment python3
                sh """
                cd python-project-euler-100
                python3 -m unittest AllSolutionsTest.py
                """
            } // withPythonEnv
        } // stage ('python-test')

        stage('typescript-setup'){
            env.NODEJS_HOME = "${tool 'NodeJS 13.11.0'}"
    	    // on linux / mac
    	    env.PATH="${env.NODEJS_HOME}/bin:${env.PATH}"
            sh 'npm --version'
        } // stage('typescript-setup')

        stage ('typescript-test') {
        
        sh """ 
         cd typescript-project-euler-100
         npm install
         npm run build:test 
        """ 
        } // stage('typescript-test')

        stage('java-test'){
            withMaven(maven : 'Maven 3.6.3', ) {
                // Run the maven build
                sh """
                cd java-project-euler-100
                mvn clean test verify
                """
                step( [ $class: 'JacocoPublisher' ] )
            } // withMaven
        } // stage('java-test')
    } // node
} // timestamps
