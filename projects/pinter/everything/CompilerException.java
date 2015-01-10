public class CompilerException extends Exception {
	
	String msg;

	public CompilerException(String _msg) {
		this.msg=_msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}

}