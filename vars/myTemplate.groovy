def call(Map pipelineParams) {
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
}