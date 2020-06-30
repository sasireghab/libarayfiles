def call(Map pipelineParams) {
    pipeline
    {
        agent any 
        stages
        {
            stage('from jenkinsfile')
            {
                steps
                {
                    echo "from jenkinsfile..."
                    echo "Hoooooooo"
                }
            }
        }
    }
}
