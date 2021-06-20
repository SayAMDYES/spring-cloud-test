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
        sh 'echo ${projectName}'
        sh "if [[ ${projectName} == '*' ]];then mvn clean package dockerfile:build else mvn -f ${projectName} clean package dockerfile:build fi"
    }
}