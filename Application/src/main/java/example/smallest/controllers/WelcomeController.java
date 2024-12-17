package example.smallest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
	public @ResponseBody String helloWorld() {
		
		//Flux
		
		
		
		
		return "Automating a CICD project using Jenkins pipeline, Automating provisioning of AWS resources using Terraform, Deploying them using Ansible in  Kubernetes Cluster"; //"application/json" mean this is a text not a redirect
	}
}
