node('SLAVE') {
    stage('build1') {
        sh label: '', script: '''uptime 
pwd
ls
id -u'''
    }

    stage('build2') {
        echo 'build 1 is completed ..its build 2'
    }
    
    stage('build3') {
        echo 'it is created through seed job'
    }   
}    
