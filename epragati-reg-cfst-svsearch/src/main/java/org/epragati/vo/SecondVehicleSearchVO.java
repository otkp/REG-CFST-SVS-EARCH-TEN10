package org.epragati.vo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Table1")
public class SecondVehicleSearchVO {

	private String applicantName;

	private String fatherName;

	private String displayName;

	private String registrationNo;

	private String address1;

	private String address2;

	private String address3;

	private String flag;



	public String getApplicantName() {
		return applicantName;
	}




	public String getFatherName() {
		return fatherName;
	}




	public String getDisplayName() {
		return displayName;
	}




	public String getRegistrationNo() {
		return registrationNo;
	}




	public String getAddress1() {
		return address1;
	}




	public String getAddress2() {
		return address2;
	}




	public String getAddress3() {
		return address3;
	}

	public String getFlag() {
		return flag;
	}

	@XmlElement(name = "APPLICANT_FNAME")
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}


	@XmlElement(name = "PG_NAME")
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@XmlElement(name = "DISP_NAME")
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	@XmlElement(name = "REGN_NO")
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}


	@XmlElement(name = "ADDRESS1")
	public void setAddress1(String address1) {
		this.address1 = address1;
	}



	@XmlElement(name = "ADDRESS2")
	public void setAddress2(String address2) {
		this.address2 = address2;
	}



	@XmlElement(name = "ADDRESS3")
	public void setAddress3(String address3) {
		this.address3 = address3;
	}


	@XmlElement(name = "FLAG")
	public void setFlag(String flag) {
		this.flag = flag;
	}


}
