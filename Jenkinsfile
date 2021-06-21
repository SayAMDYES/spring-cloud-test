node{
    def mvnHome
    stage('pull'){
        echo 'pull'
        checkout([$class: 'GitSCM'
                , branches: [[name: '*/${branch}']]
                , extensions: []
                , userRemoteConfigs: [[url: 'https://github.com/SayAMDYES/spring-cloud-test']]])
    }
    stage('build'){
        sh 'mvn -f ${subProjectName} clean package dockerfile:build'
    }
     stage('upload'){
        sh 'docker -u admin -p 1042389894 http://192.168.50.168:43999'
        sh 'docker push ${harborUrl}/${projectName}/${subProjectName}:${version}'
    }
}