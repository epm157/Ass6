/**
 * Entity implementation class for Entity: MaterialProcessingDTO
 *
 * TODO Add a description to the class MaterialProcessingDTO
 */
package de.rwth.swc.oosc.carcass.processing.domain;

import de.rwth.swc.oosc.carcass.processing.client.dtos.enums.ProcessingType;

public interface MaterialProcessingDTO {
	// Identification
	public String getPlanIdentification();
	public String getMaterialIdentification();
	
	// Parent
	public ProcessingPlanDTO getProcessingPlan();

	// Processing configuration
	public ProcessingType getProcessingType();
	
	// after processing
	public boolean wasProcessed();
}
