node{
    def mvnHome
    stage('Pull code from github'){
        echo 'pull'
        checkout([$class: 'GitSCM'
                , branches: [[name: '*/${branch}']]
                , extensions: []
                , userRemoteConfigs: [[url: 'https://github.com/SayAMDYES/spring-cloud-test']]])
    }
    stage('Package and create docker-image from target project'){
        sh 'mvn -f ${projectName} clean package dockerfile:build'
    }
}