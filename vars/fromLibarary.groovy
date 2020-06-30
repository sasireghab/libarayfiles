
def call(Map pipelineParams) {

    pipeline {
        agent any
        stages {
            stage('checkout git') {
                steps {
                    echo "Hello Vishaal"
                }
            }
        }
    }
}
