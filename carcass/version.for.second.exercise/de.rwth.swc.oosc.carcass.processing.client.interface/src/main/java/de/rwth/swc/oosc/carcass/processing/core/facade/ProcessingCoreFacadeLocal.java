package de.rwth.swc.oosc.carcass.processing.core.facade;

import java.util.Set;

import javax.ejb.Local;

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

@Local
public interface ProcessingCoreFacadeLocal {

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#getAllProcessingPlanDTO()
	 */
	public abstract Set<ProcessingPlanDTO> getAllProcessingPlanDTO()
			throws NotFoundException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#getAllProcessingPlantDTO()
	 */
	public abstract Set<ProcessingPlantDTO> getAllProcessingPlantDTO()
			throws NotFoundException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#deleteMaterialProcessingDTO(java.lang.String, java.lang.String)
	 */
	public abstract void deleteMaterialProcessingDTO(
			String materialIdentification, String planIdentification)
			throws NotFoundException, UnassignException, NotNullableException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#updateMaterialProcessingDTO(java.lang.String, java.lang.String, java.lang.String, de.rwth.swc.oosc.carcass.processing.client.dtos.enums.ProcessingType)
	 */
	public abstract void updateMaterialProcessingDTO(
			String newMaterialIdentification, String oldMaterialIdentification,
			String planIdentification, ProcessingType processingType)
			throws NotFoundException, AlreadyInDBException,
			NotNullableException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#createMaterialProcessingDTO(java.lang.String, java.lang.String, de.rwth.swc.oosc.carcass.processing.client.dtos.enums.ProcessingType)
	 */
	public abstract void createMaterialProcessingDTO(
			String materialIdentification, String planIdentification,
			ProcessingType processingType) throws AlreadyInDBException,
			NotNullableException, AssignException, NotFoundException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#getMaterialProcessingDTOByMaterialIdentificationAndPlanIdentification(java.lang.String, java.lang.String)
	 */
	public abstract MaterialProcessingDTO getMaterialProcessingDTOByMaterialIdentificationAndPlanIdentification(
			String materialIdentification, String planIdentification)
			throws NotFoundException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#deleteProcessingPlanDTO(java.lang.String)
	 */
	public abstract void deleteProcessingPlanDTO(String planIdentification)
			throws NotFoundException, UnassignException, NotNullableException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#updateProcessingPlanDTO(java.lang.String, java.lang.String, java.lang.String, boolean)
	 */
	public abstract void updateProcessingPlanDTO(String newPlanIdentification,
			String oldPlanIdentification, String processingResult,
			boolean wasProcessed) throws NotFoundException,
			AlreadyInDBException, NotNullableException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#createProcessingPlanDTO(java.lang.String, java.lang.String, boolean)
	 */
	public abstract void createProcessingPlanDTO(String planIdentification,
			String processingResult, boolean wasProcessed)
			throws AlreadyInDBException, NotNullableException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#getProcessingPlanDTOByPlanIdentification(java.lang.String)
	 */
	public abstract ProcessingPlanDTO getProcessingPlanDTOByPlanIdentification(
			String planIdentification) throws NotFoundException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#deleteProcessingPlantDTO(java.lang.String)
	 */
	public abstract void deleteProcessingPlantDTO(String plantIdentification)
			throws NotFoundException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#updateProcessingPlantDTO(java.lang.String, java.lang.String, de.rwth.swc.oosc.carcass.processing.client.dtos.enums.PlantType)
	 */
	public abstract void updateProcessingPlantDTO(
			String newPlantIdentification, String oldPlantIdentification,
			PlantType plantType) throws NotFoundException,
			AlreadyInDBException, NotNullableException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#createProcessingPlantDTO(java.lang.String, de.rwth.swc.oosc.carcass.processing.client.dtos.enums.PlantType)
	 */
	public abstract void createProcessingPlantDTO(String plantIdentification,
			PlantType plantType) throws AlreadyInDBException,
			NotNullableException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#getProcessingPlantDTOByPlantIdentification(java.lang.String)
	 */
	public abstract ProcessingPlantDTO getProcessingPlantDTOByPlantIdentification(
			String plantIdentification) throws NotFoundException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#unassignMaterialProcessingDTOFromProcessingPlanDTOToProcessMaterial(java.lang.String, java.lang.String)
	 */
	public abstract void unassignMaterialProcessingDTOFromProcessingPlanDTOToProcessMaterial(
			String planIdentification, String materialIdentification)
			throws NotFoundException, NotNullableException, UnassignException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#unassignProcessingPlanDTOFromMaterialProcessingDTOProcessingPlan(java.lang.String, java.lang.String)
	 */
	public abstract void unassignProcessingPlanDTOFromMaterialProcessingDTOProcessingPlan(
			String materialIdentification, String planIdentification)
			throws NotFoundException, NotNullableException, UnassignException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#checkProcessingForPlan(java.lang.String)
	 */
	public abstract void checkProcessingForPlan(String planIdentification)
			throws NotFoundException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#processMaterialFromPlan(java.lang.String)
	 */
	public abstract void processMaterialFromPlan(String planIdentification, String plantIdentification)
			throws NotFoundException;

	/* (non-Javadoc)
	 * @see de.rwth.swc.oosc.carcass.processing.core.facade.ProcessingCoreFacadeLocal#getAllMaterials()
	 */
	public abstract Set<MaterialDTO> getAllMaterials();
	
	public abstract Set<MaterialDTO> getProcessedMaterial();

	public abstract Set<MaterialDTO> getUnprocessedMaterial();

	public abstract Set<ProcessingPlanDTO> getAllUnprocessedProcessingPlanDTO();

}