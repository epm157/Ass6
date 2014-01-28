/**
 * Entity implementation class for Entity: ProcessingPlantDTO
 *
 * TODO Add a description to the class ProcessingPlantDTO
 */
package de.rwth.swc.oosc.carcass.processing.domain;

import de.rwth.swc.oosc.carcass.processing.client.dtos.enums.PlantType;

public interface ProcessingPlantDTO {
	// Identification
	public String getPlantIdentification();

	// Attributes
	public PlantType getPlantType();
	public String getProcessingInformation(); // Should return information about the processed Material at this plant (When, What, How (, Cow ear numbers)).
}
