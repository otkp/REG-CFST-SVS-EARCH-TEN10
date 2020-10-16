package org.epragati.serviceImpl;

import java.io.StringReader;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.rpc.ServiceException;

import org.apache.commons.logging.LogFactory;
import org.epragati.constants.MessageKeys;
import org.epragati.service.SecondVehicleService;
import org.epragati.util.AppMessages;
import org.epragati.vo.OwnerDetailsVO;
import org.epragati.vo.SecondVehicleSearchListVO;
import org.epragati.vo.SecondVehicleSearchVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tempuri.Secondvehiclecheck;
import org.tempuri.SecondvehiclecheckLocator;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Service
public class SecondVehicleSearchServiceImpl implements SecondVehicleService {
	
	private static final Logger logger = LoggerFactory.getLogger(SecondVehicleSearchServiceImpl.class);
	
	@Autowired
	private AppMessages appMessages;

	@Override
	public Optional<List<SecondVehicleSearchVO>> fetchSecondVehicleDetails(OwnerDetailsVO ownerDetailsVO) {
		System.setProperty(LogFactory.FACTORY_PROPERTY, LogFactory.FACTORY_DEFAULT);
		Secondvehiclecheck secondvehicle = new SecondvehiclecheckLocator();
		String result = null;
		try {
			result = secondvehicle.getSecondvehiclecheckSoap().getsecondvehiclecheckforotsiDealer(ownerDetailsVO.getFirstName(),
					ownerDetailsVO.getFatherName(), 
					 ownerDetailsVO.getLastName(),
					ownerDetailsVO.getDob());
			
			if(result!=null){
				logger.info("second vehcile result found");
			}
		} catch (RemoteException | ServiceException e) {
			logger.debug(appMessages.getLogMessage(MessageKeys.LOG_SVS_DATA_FETCHING_EXCEPTION),e.getMessage());
			Optional.ofNullable(null);
		}

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(SecondVehicleSearchListVO.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(result);
			SecondVehicleSearchListVO employee = (SecondVehicleSearchListVO) unmarshaller.unmarshal(reader);

			List<SecondVehicleSearchVO> secondVehicleSearchVO = employee.getSecondVehicleSearchVO();
			return Optional.of(secondVehicleSearchVO);

		} catch (Exception e) {
			logger.debug(appMessages.getLogMessage(MessageKeys.LOG_SVS_DATA_UNMARSHAL_EXCEPTION),e.getMessage());
			return Optional.ofNullable(null);
		}

	}
}
