package jp.ac.titech.itpro.sdl.startservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class Service3 extends IntentService {
    private final static String TAG = Service3.class.getSimpleName();
    public final static String EXTRA_MYARG = "MYARG";
    public final static String ACTION_ANSWER = "Null Pointer Exception";
    public final static String EXTRA_ANSWER = "Stack Overflow";


    public Service3() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent in " + Thread.currentThread());
        Log.d(TAG, "myarg = " + intent.getStringExtra(EXTRA_MYARG));
        try {
            Thread.sleep(5); // 5 milisec
            intent = new Intent();
            intent.setAction(ACTION_ANSWER);
            intent.putExtra(EXTRA_ANSWER,"\n" +
                    "　　　＿＿＿_\n" +
                    "   　 ／　　　　＼\n" +
                    " 　 ／　 　⌒　⌒ ＼\n" +
                    "　／（ ●）（●） ＼\n" +
                    " |､\"　ﾞ)（__人__）\"　.）\n" +
                    "　＼　  　 ｡｀||||＝＝(⌒)ー、\n" +
                    "／ 　 　 　 　 ||||　　　 ＼　　〉\n" +
                    "/ 　　 ,　　|￣￣￣￣￣￣| . ￣\n" +
                    "/　　 /　　 ヽ回回回回回/　　\n" +
                    "|　⌒ ーnｎｎ.ヽ＿＿＿/　　　\n" +
                    "_､(\"二└─┘￣￣￣￣￣￣");
            sendBroadcast(intent);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate in " + Thread.currentThread());
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy in " + Thread.currentThread());
        super.onDestroy();
    }
}
