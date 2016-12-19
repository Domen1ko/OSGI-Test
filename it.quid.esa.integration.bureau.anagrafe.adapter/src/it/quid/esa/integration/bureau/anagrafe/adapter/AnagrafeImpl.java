package it.quid.esa.integration.bureau.anagrafe.adapter;

import it.quid.esa.integration.bureau.anagrafe.adapter.outcome.Outcome;
import it.quid.esa.integration.bureau.anagrafe.api.Anagrafe;
import it.quid.esa.integration.bureau.anagrafe.api.models.InputModel;
import it.quid.esa.integration.bureau.anagrafe.api.models.OutputModel;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * 
 */
@Component(name = "it.quid.esa.integration.bureau.anagrafe", scope = ServiceScope.PROTOTYPE, service = Anagrafe.class)
public class AnagrafeImpl implements Anagrafe{
	 
	private static final long version = 3L;

	@Override
	public OutputModel call(InputModel input) {
		OutputModel model = new OutputModel();
		model.setOutcome(Outcome.OK);
		model.setVersion(version);
		model.setPayLoad(" POC example data for: "+input.getNdg());
		return model;
	}

}
