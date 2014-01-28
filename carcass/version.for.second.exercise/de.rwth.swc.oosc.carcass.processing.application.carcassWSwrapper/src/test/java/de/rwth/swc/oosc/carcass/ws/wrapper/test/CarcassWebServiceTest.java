package de.rwth.swc.oosc.carcass.ws.wrapper.test;

import junit.framework.Assert;

import org.junit.Test;

import de.rwth.swc.oosc.carcass.simple.application.wsWrapper.CarcassCoreWebServiceWrapperBean;

public class CarcassWebServiceTest {

	@Test
	public void testWebService() {
		CarcassCoreWebServiceWrapperBean wrapperBean = new CarcassCoreWebServiceWrapperBean();
		wrapperBean.init();
		
		Assert.assertNotNull("WebService needs to provide a list of Material.", wrapperBean.getAllMaterials());
	}
}
