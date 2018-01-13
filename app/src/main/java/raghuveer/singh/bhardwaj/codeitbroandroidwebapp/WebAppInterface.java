package raghuveer.singh.bhardwaj.codeitbroandroidwebapp;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    Context mContext;


    WebAppInterface(Context c) {
        mContext = c;
    }


    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }

}
