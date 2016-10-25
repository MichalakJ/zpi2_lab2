package callback;

/**
 * Created by Jakub on 2016-10-18.
 */
public class CallBackImpl implements CallBack{
    private SecondCallBack secondCallBack;
    public CallBackImpl(SecondCallBack secondCallBack){
        this.secondCallBack = secondCallBack;
    }
    boolean result;
    @Override
    public void setResult(boolean result) {
        secondCallBack.setResult(result);
    }

    @Override
    public boolean getResult() {
        return secondCallBack.getResult();
    }

    public String getFileName(){
        return secondCallBack.getFileName();
    }

    public String getValidString(){
        return secondCallBack.getValidString();
    }

    public String getInvalidString(){
        return secondCallBack.getInvalidString();
    }

    public SecondCallBack getSecondCallBack() {
        return secondCallBack;
    }

    public void setSecondCallBack(SecondCallBack secondCallBack) {
        this.secondCallBack = secondCallBack;
    }
}
