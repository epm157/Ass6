package de.rwth.swc.oosc.carcass.processing.core.facade;

import java.util.HashSet;
import java.util.Set;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import de.rwth.swc.oosc.carcass.client.dtos.MaterialDTO;
import de.rwth.swc.oosc.carcass.common.exceptions.AlreadyInDBException;
import de.rwth.swc.oosc.carcass.common.exceptions.AssignException;
import de.rwth.swc.oosc.carcass.common.exceptions.NotFoundException;
import de.rwth.swc.oosc.carcass.common.exceptions.NotNullableException;
import de.rwth.swc.oosc.carcass.common.exceptions.UnassignException;
import de.rwth.swc.oosc.carcass.processing.client.dtos.enums.PlantType;
import de.rwth.swc.oosc.carcass.processing.client.dtos.enums.ProcessingType;
import de.rwth.swc.oosc.carcass.processing.domain.MaterialProcessingDTO;
import de.rwth.swc.oosc.carcass.processing.domain.ProcessingPlanDTO;
import de.rwth.swc.oosc.carcass.processing.domain.ProcessingPlantDTO;
import de.rwth.swc.oosc.carcass.simple.application.wsWrapper.CarcassCoreWebServiceWrapperBean;

@Stateless
public class ProcessingCoreFacade implements ProcessingCoreFacadeLocal {
	// ------------
	// Delegation to core application via WebService
	// ------------
	private @EJB CarcassCoreWebServiceWrapperBean coreWebService;
	
	public Set<MaterialDTO> getAllMaterials() {
		return new HashSet<MaterialDTO>(coreWebService.getAllMaterials());
	}

	// ------------
	// Pre Filtered Lists:
	// ------------

	public Set<MaterialDTO> getProcessedMaterial() {
		// TODO: Needs some implementation...
		return new HashSet<MaterialDTO>(coreWebService.getAllMaterials());
	}

	public Set<MaterialDTO> getUnprocessedMaterial() {
		// TODO: Needs some implementation...
		return new HashSet<MaterialDTO>(coreWebService.getAllMaterials());
	}
	
	public Set<ProcessingPlanDTO> getAllProcessingPlanDTO()
			throws NotFoundException {
		// TODO: Needs some implementation...
		return new HashSet<ProcessingPlanDTO>();
	}

	public Set<ProcessingPlantDTO> getAllProcessingPlantDTO()
			throws NotFoundException {
		// TODO: Needs some implementation...
		return new HashSet<ProcessingPlantDTO>();
	}

	// ------------
	// CRUD
	// ------------

	// You may need this: private @EJB CarcassProcessingCoreImplFacadeLocal processingFacade;

	public void deleteMaterialProcessingDTO(String materialIdentification,
			String planIdentification) throws NotFoundException,
			UnassignException, NotNullableException {
		// TODO: Needs some implementation...
	}

	public void updateMaterialProcessingDTO(String newMaterialIdentification,
			String oldMaterialIdentification, String planIdentification,
			ProcessingType processingType) throws NotFoundException,
			AlreadyInDBException, NotNullableException {
		// TODO: Needs some implementation...
	}

	public void createMaterialProcessingDTO(String materialIdentification,
			String planIdentification, ProcessingType processingType)
			throws AlreadyInDBException, NotNullableException, AssignException,
			NotFoundException {
		// TODO: Needs some implementation...
	}

	public MaterialProcessingDTO getMaterialProcessingDTOByMaterialIdentificationAndPlanIdentification(
			String materialIdentification, String planIdentification)
			throws NotFoundException {
		return null;
		// TODO: Needs some implementation...
	}

	public void deleteProcessingPlanDTO(String planIdentification)
			throws NotFoundException, UnassignException, NotNullableException {
		// TODO: Needs some implementation...
	}

	public void updateProcessingPlanDTO(String newPlanIdentification,
			String oldPlanIdentification, String processingResult,
			boolean wasProcessed) throws NotFoundException,
			AlreadyInDBException, NotNullableException {
		// TODO: Needs some implementation...
	}

	public void createProcessingPlanDTO(String planIdentification,
			String processingResult, boolean wasProcessed)
			throws AlreadyInDBException, NotNullableException {
		// TODO: Needs some implementation...
	}

	public ProcessingPlanDTO getProcessingPlanDTOByPlanIdentification(
			String planIdentification) throws NotFoundException {

		// The result can look like this.
		// But does not need to ;-)
		// Just make sure to add the crucial information mentioned in the assignment
		StringBuilder messageBuilder = new StringBuilder();
		
		messageBuilder.append("<h4>Processing Check:</h4>");
		messageBuilder.append("<ul>");
		messageBuilder.append("<li>&lt;Material identification&gt; Material assigned correctly.</li>");
		messageBuilder.append("</ul>");

		messageBuilder.append("<h4>Material Processing Log</h4>");
		messageBuilder.append("<ul>");
		messageBuilder.append("<li>Processing Check was successfull -> All Material can be processed!</li>");
		messageBuilder.append("</ul>");

		messageBuilder.append("<h4>Material Processing Summary</h4>");
		messageBuilder.append("<p>");
		messageBuilder.append("All Material was burned.<br />");
		messageBuilder.append("Weight sum of all processed Material: some Kg");
		messageBuilder.append("<br />Material types: 0 x Cow, 0 x Pig, 1 x Goat<br />");
		messageBuilder.append("<strong>Cow ear numbers:</strong>");
		messageBuilder.append("<ul>");
		messageBuilder.append("<li>No cows where processed.</li>");
		messageBuilder.append("</ul>");
		messageBuilder.append("</p>");
		
		// TODO: Needs some implementation...
		return null;
	}

	public void deleteProcessingPlantDTO(String plantIdentification)
			throws NotFoundException {
		// TODO: Needs some implementation...
	}

	public void updateProcessingPlantDTO(String newPlantIdentification,
			String oldPlantIdentification, PlantType plantType)
			throws NotFoundException, AlreadyInDBException,
			NotNullableException {
		// TODO: Needs some implementation...
	}

	public void createProcessingPlantDTO(String plantIdentification,
			PlantType plantType) throws AlreadyInDBException,
			NotNullableException {
		// TODO: Needs some implementation...
	}

	public ProcessingPlantDTO getProcessingPlantDTOByPlantIdentification(
			String plantIdentification) throws NotFoundException {
		// TODO: Needs some implementation...
		return null;
	}

	public void unassignMaterialProcessingDTOFromProcessingPlanDTOToProcessMaterial(
			String planIdentification, String materialIdentification)
			throws NotFoundException, NotNullableException, UnassignException {
		// TODO: Needs some implementation...
	}

	public void unassignProcessingPlanDTOFromMaterialProcessingDTOProcessingPlan(
			String materialIdentification, String planIdentification)
			throws NotFoundException, NotNullableException, UnassignException {
		// TODO: Needs some implementation...
	}

	
	// ------------
	// Business Methods of Material Processing
	// ------------
	public void checkProcessingForPlan(String planIdentification) throws NotFoundException {
		// TODO: Needs some implementation...
	}
	
	public void processMaterialFromPlan(String planIdentification, String plantIdentification) throws NotFoundException {
		// TODO: Needs some implementation...
	}

	public Set<ProcessingPlanDTO> getAllUnprocessedProcessingPlanDTO() {
		// TODO: Needs some implementation...
		try {
			return this.getAllProcessingPlanDTO();
		} catch (NotFoundException e) {
			// No not Found exception can be raised here...
			return null;
		}
	}
}
