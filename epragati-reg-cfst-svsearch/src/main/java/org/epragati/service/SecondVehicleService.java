package org.epragati.service;

import java.util.List;
import java.util.Optional;

import org.epragati.vo.OwnerDetailsVO;
import org.epragati.vo.SecondVehicleSearchVO;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

public interface SecondVehicleService {
	/**
	 * 
	 * @param ownerDetailsVO
	 * @return
	 */

	Optional<List<SecondVehicleSearchVO>> fetchSecondVehicleDetails(OwnerDetailsVO ownerDetailsVO);

}
