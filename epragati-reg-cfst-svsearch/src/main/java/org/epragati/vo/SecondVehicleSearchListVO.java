package org.epragati.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NewDataSet")
public class SecondVehicleSearchListVO {

	private List<SecondVehicleSearchVO> secondVehicleSearchVO;

	public List<SecondVehicleSearchVO> getSecondVehicleSearchVO() {
		return secondVehicleSearchVO;
	}
	 @XmlElement(name = "Table1")
	public void setSecondVehicleSearchVO(List<SecondVehicleSearchVO> secondVehicleSearchVO) {
		this.secondVehicleSearchVO = secondVehicleSearchVO;
	}

	protected SecondVehicleSearchListVO() {
	}

}
