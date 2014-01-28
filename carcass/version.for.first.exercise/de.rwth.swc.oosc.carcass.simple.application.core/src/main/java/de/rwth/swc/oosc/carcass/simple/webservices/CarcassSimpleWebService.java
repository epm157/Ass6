package de.rwth.swc.oosc.carcass.simple.webservices;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import de.rwth.swc.oosc.carcass.client.dtos.MaterialDTO;
import de.rwth.swc.oosc.carcass.client.dtos.MaterialGatheringPointDTO;
import de.rwth.swc.oosc.carcass.client.hotspot.CarcassFacadeLocal;
import de.rwth.swc.oosc.carcass.common.exceptions.NotFoundException;

@Stateless
@WebService
public class CarcassSimpleWebService {
	private @EJB CarcassFacadeLocal carcassFacade;
	
	public List<MaterialDTO> getAllMaterials() {
		List<MaterialDTO> result = new ArrayList<MaterialDTO>();
		
		try {
			for (MaterialGatheringPointDTO mgp : carcassFacade.getAllMaterialGatheringPointDTO()){
				result.addAll(mgp.getGatheredMaterial());
			}
		} catch (NotFoundException e) {
			Logger.getLogger(this.getClass().getName()).severe(e.getMessage());
		}
		
		return result;
	}
}
