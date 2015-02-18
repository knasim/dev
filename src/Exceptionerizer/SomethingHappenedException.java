package Exceptionerizer;

public class SomethingHappenedException extends Exception
 {
		
	private static final long serialVersionUID = 1L;
	private String sysCode;
	private String sysMessage;
	
	public SomethingHappenedException(String message, Exception e) {
		this.sysCode=message;
		this.sysMessage=e.getMessage();
	}
	
	public SomethingHappenedException(String code, String message) {
		this.sysCode=code;
		this.sysMessage=message;
	}
	
	public String getSysCode() {
		return sysCode;
	}
	
	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}
	
	public String getSysMessage() {
		return sysMessage;
	}
	
	public void setSysMessage(String sysMessage) {
		this.sysMessage = sysMessage;
	}

}
