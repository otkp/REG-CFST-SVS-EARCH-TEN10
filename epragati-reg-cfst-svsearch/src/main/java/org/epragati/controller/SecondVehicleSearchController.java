package org.epragati.controller;


import java.util.List;
import java.util.Optional;

import org.epragati.constants.MessageKeys;
import org.epragati.service.SecondVehicleService;
import org.epragati.util.AppMessages;
import org.epragati.util.DateConverters;
import org.epragati.util.GateWayResponse;
import org.epragati.vo.OwnerDetailsVO;
import org.epragati.vo.SecondVehicleSearchVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@CrossOrigin
@RestController
public class SecondVehicleSearchController {
	
	private static final Logger logger = LoggerFactory.getLogger(SecondVehicleSearchController.class);
	
	@Autowired
	private SecondVehicleService secondVehicleService;
	
	@Autowired
	private AppMessages appMessages;
	
	@PostMapping(value = "getSecondVehicleList", produces = { MediaType.APPLICATION_JSON_VALUE })
	public GateWayResponse<?> getSecondVehicleDetails(@RequestBody OwnerDetailsVO ownerDetailsVO) {
		
		try { 
			 DateConverters.validateDateFormate(ownerDetailsVO.getDob());
		} catch (Exception e) {
			logger.info(appMessages.getLogMessage(MessageKeys.LOG_INVALID_DATE_FORMAT));
			return new GateWayResponse<>(HttpStatus.BAD_REQUEST,ownerDetailsVO.getDob(),appMessages.getResponseMessage(MessageKeys.INVALID_DATE_FORMAT));	
		}
	 
		Optional<List<SecondVehicleSearchVO>> secondVehiclesList = secondVehicleService.fetchSecondVehicleDetails(ownerDetailsVO);
		if(secondVehiclesList.isPresent()){
			return new GateWayResponse<>(HttpStatus.OK,secondVehiclesList.get(),appMessages.getResponseMessage(MessageKeys.MESSAGE_SUCCESS));	
		}
		return new GateWayResponse<>(HttpStatus.NOT_FOUND,appMessages.getResponseMessage(MessageKeys.MESSAGE_NO_RECORD_FOUND));	
    }
}