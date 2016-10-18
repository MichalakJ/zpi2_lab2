package callback;

/**
 * Created by Jakub on 2016-10-18.
 */
public class CallBackImpl implements CallBack{
    boolean result;
    @Override
    public void setResult(boolean result) {
        this.result = result;
    }

    @Override
    public boolean getResult() {
        return result;
    }
}
