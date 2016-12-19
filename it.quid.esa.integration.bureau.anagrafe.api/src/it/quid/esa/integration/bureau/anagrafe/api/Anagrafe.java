package it.quid.esa.integration.bureau.anagrafe.api;

import org.osgi.annotation.versioning.ProviderType;

import it.quid.esa.integration.bureau.anagrafe.api.models.InputModel;
import it.quid.esa.integration.bureau.anagrafe.api.models.OutputModel;

/**
 * 
 */
@ProviderType
public interface Anagrafe {
 
	public OutputModel call(InputModel input);
}
