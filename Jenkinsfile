node{
    def mvnHome
    stage('pull'){
        echo 'pull'
        checkout([$class: 'GitSCM'
                , branches: [[name: '*/${branch}']]
                , extensions: []
                , userRemoteConfigs: [[url: 'https://github.com/SayAMDYES/spring-cloud-test']]])
    }
    stage('install'){
        sh 'mvn install'
    }
}