//job('SampledslTest') {
	  

    //scm {
       // git('https://github.com/sathishvision2029/trainingrepo1.git') 
     //   {  node -> // is hudson.plugins.git.GitSCM
       //     node / gitConfigName('chiruvlogs')
     //       node / gitConfigEmail('saichiranjeevi.originhubs@gmail.com')
    //}
  //  }
pipelineJob('generatejob2') {
description("This is the task realted to automating creating job using dsl and then executing tasks related to shared repo");
    definition{
        cpsScm {
            scm {
              git{
                remote { url('https://github.com/sathishvision2029/trainingrepo1.git')
				credentials('cc324e07-392d-4970-bd02-142319fae0e6')
                  }
          //branches('master', '**/feature*')
          //scriptPath('chirujenkinfile1')
                    }
                }
            }
            scriptPath('chirujenkinfile1')
         }
     }
  // }
