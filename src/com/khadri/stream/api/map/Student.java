package com.khadri.stream.api.map;

public class Student {

	private int stdId;

	private String stdName;

	private String stdAddress;

	public Student(int stdId, String stdName, String stdAddress) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAddress = stdAddress;
	}

	public int getStdId() {
		return stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public String getStdAddress() {
		return stdAddress;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAddress=" + stdAddress + "]";
	}

}
