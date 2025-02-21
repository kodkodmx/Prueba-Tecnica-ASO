package com.bbva.uuaa.helloWorld.facade.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateDataIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.CreateDataOut;

public interface ISrvHelloWorld {

	ServiceResponseCreated<CreateDataOut> ejecuta (CreateDataIn CreateDataIn, String nuip);

}
