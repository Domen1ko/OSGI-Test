package it.quid.esa.business.bureau.application;

import it.quid.esa.integration.bureau.anagrafe.api.Anagrafe;
import it.quid.esa.integration.bureau.anagrafe.api.models.InputModel;
import it.quid.esa.integration.bureau.anagrafe.api.models.OutputModel;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

import osgi.enroute.configurer.api.RequireConfigurerExtender;
import osgi.enroute.google.angular.capabilities.RequireAngularWebResource;
import osgi.enroute.rest.api.REST;
import osgi.enroute.twitter.bootstrap.capabilities.RequireBootstrapWebResource;
import osgi.enroute.webserver.capabilities.RequireWebServerExtender;

@RequireAngularWebResource(resource={"angular.js","angular-resource.js", "angular-route.js"}, priority=1000)
@RequireBootstrapWebResource(resource="css/bootstrap.css")
@RequireWebServerExtender
@RequireConfigurerExtender
@Component(name="it.quid.esa.business.bureau")
public class BureauApplication implements REST {

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	Anagrafe anagrafe;
	
	public String getUpper(String string) {
		InputModel input = new InputModel();
		input.setNdg(string);
		OutputModel output = anagrafe.call(input);
		return "Result: "+output.getOutcome()+" Data: "+output.getPayLoad()+" @ version:"+output.getVersion();
	}

}
