/**
 * Entity implementation class for Entity: ProcessingPlanDTO
 *
 * TODO Add a description to the class ProcessingPlanDTO
 */
package de.rwth.swc.oosc.carcass.processing.domain;

import java.util.List;

public interface ProcessingPlanDTO {
	// Identification
	public String getPlanIdentification();

	// Result after Processing
	public String getProcessingResult();
	public boolean getWasProcessed();

	// Children List
	public List<MaterialProcessingDTO> getToProcessMaterial();
}
