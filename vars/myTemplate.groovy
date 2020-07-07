import groovy.json.JsonSlurper
/*def call(Map pipelineParams) {
  pipeline{	
    agent any	
      stages	{		
          stage('from jenkinsfile')		{			
              steps			{				
                  echo "Hiiiiiii....."	
                }		
           }		
           stage('from lib')		{	
              environment {
                    def name = "${pipelineParams.MY_NAME}" 
                }
              steps			{				
                  fromLibarary()
                  echo "MY_NAME :: $name"
               }		
            }		
         }
      }
}*/
def call(String pipelineParams) {
  
  pipeline{	
    agent any	
      stages	{		
          stage('from jenkinsfile')		{			
              steps			{		
                  git branch: 'master', credentialsId: 'Git username', url: 'https://github.com/sasireghab/invoke-jenkins-lib.git'           
                  echo "Hiiiiiii....."	
                }		
           }		
           stage('from lib')		{	
              environment {
                   // def name = "${pipelineParams.MY_NAME}" 
                }
              steps			{	
                script {
                  JsonSlurper slurper = new JsonSlurper()
                  Map parsedJson = slurper.parseText(pipelineParams)
                  println parsedJson
                }
                fromLibarary()
                  //echo "MY_NAME :: $name"
               }		
            }		
         }
      }
}
