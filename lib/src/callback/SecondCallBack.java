package callback;

/**
 * Created by Jakub on 2016-10-25.
 */
public class SecondCallBack {
    private boolean result;
    private String fileName;
    private String validString;
    private String invalidString;
    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getValidString() {
        return validString;
    }

    public void setValidString(String validString) {
        this.validString = validString;
    }

    public String getInvalidString() {
        return invalidString;
    }

    public void setInvalidString(String invalidString) {
        this.invalidString = invalidString;
    }
}
