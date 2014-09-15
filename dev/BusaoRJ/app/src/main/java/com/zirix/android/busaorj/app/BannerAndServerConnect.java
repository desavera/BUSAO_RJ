package com.zirix.android.busaorj.app;

import com.zirix.android.busaorj.app.content.LinhaContent;
import com.zirix.android.busaorj.app.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class BannerAndServerConnect extends Activity {
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * If set, will toggle the system UI visibility upon interaction. Otherwise,
     * will show the system UI visibility upon interaction.
     */
    private static final boolean TOGGLE_ON_CLICK = true;

    /**
     * The flags to pass to {@link SystemUiHider#getInstance}.
     */
    private static final int HIDER_FLAGS = SystemUiHider.FLAG_HIDE_NAVIGATION;

    /**
     * The instance of the {@link SystemUiHider} for this activity.
     */
    private SystemUiHider mSystemUiHider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_banner_and_server_connect);

        final View controlsView = findViewById(R.id.fullscreen_content_controls);
        final View contentView = findViewById(R.id.fullscreen_content);

        // Set up an instance of SystemUiHider to control the system UI for
        // this activity.
        mSystemUiHider = SystemUiHider.getInstance(this, contentView, HIDER_FLAGS);
        mSystemUiHider.setup();
        mSystemUiHider.setOnVisibilityChangeListener(new SystemUiHider.OnVisibilityChangeListener() {

            // Cached values.
            int mControlsHeight;
            int mShortAnimTime;

            @Override
            @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
            public void onVisibilityChange(boolean visible) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
                    // If the ViewPropertyAnimator API is available
                    // (Honeycomb MR2 and later), use it to animate the
                    // in-layout UI controls at the bottom of the
                    // screen.
                    if (mControlsHeight == 0) {
                        mControlsHeight = controlsView.getHeight();
                    }
                    if (mShortAnimTime == 0) {
                        mShortAnimTime = getResources().getInteger(
                                android.R.integer.config_shortAnimTime);
                    }
                    controlsView.animate()
                            .translationY(visible ? 0 : mControlsHeight)
                            .setDuration(mShortAnimTime);
                } else {
                    // If the ViewPropertyAnimator APIs aren't
                    // available, simply show or hide the in-layout UI
                    // controls.
                    controlsView.setVisibility(visible ? View.VISIBLE : View.GONE);
                }

                if (visible && AUTO_HIDE) {
                    // Schedule a hide().
                    delayedHide(AUTO_HIDE_DELAY_MILLIS);
                }
            }
        });

        // Set up the user interaction to manually show or hide the system UI.
        contentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TOGGLE_ON_CLICK) {
                    mSystemUiHider.toggle();
                } else {
                    mSystemUiHider.show();
                }
            }
        });

        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.
        // findViewById(R.id.dummy_button).setOnTouchListener(mDelayHideTouchListener);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        new SystemSatTask(this).execute("RUN IT !");


        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
        delayedHide(100);
    }


    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */
    View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (AUTO_HIDE) {
                delayedHide(AUTO_HIDE_DELAY_MILLIS);
            }
            return false;
        }
    };

    Handler mHideHandler = new Handler();
    Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
            mSystemUiHider.hide();
        }
    };

    /**
     * Schedules a call to hide() in [delay] milliseconds, canceling any
     * previously scheduled calls.
     */
    private void delayedHide(int delayMillis) {
        mHideHandler.removeCallbacks(mHideRunnable);
        mHideHandler.postDelayed(mHideRunnable, delayMillis);
    }


    public class SystemSatTask extends AsyncTask<String, Void, String> {

        private final String NAMESPACE = "http://tempuri.org/";
        private final String URL = "http://200.152.54.164:90/wservice.asmx?WSDL";
        private final String SOAP_ACTION = "http://tempuri.org/ListaLinhasCliente";
        private final String METHOD_NAME = "ListaLinhasCliente";

        private Activity parentActivity = null;

        public SystemSatTask(Activity parentActivity_) {

            parentActivity = parentActivity_;
        }

        @Override
        protected String doInBackground(String... urls) {


            String execResult = new String();

            // params comes from the execute() call: params[0] is the url.

            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
            //Property which holds input parameters
            PropertyInfo configCliente1 = new PropertyInfo();
            //Set Name
            configCliente1.setName("Id_Config");
            //Set Value
            configCliente1.setValue(3);
            //Set dataType
            configCliente1.setType(int.class);
            //Add the property to request object
            request.addProperty(configCliente1);

            PropertyInfo configCliente2 = new PropertyInfo();
            //Set Name
            configCliente2.setName("Cliente");
            //Set Value
            configCliente2.setValue(1);
            //Set dataType
            configCliente2.setType(int.class);
            //Add the property to request object
            request.addProperty(configCliente2);

            //Create envelope
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                    SoapEnvelope.VER11);

            envelope.dotNet = true;
            //Set output SOAP object
            envelope.setOutputSoapObject(request);
            //Create HTTP call object
            HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

            try {
                //Invoke web service
                androidHttpTransport.call(SOAP_ACTION, envelope);
                //Get the response
                SoapObject response = (SoapObject) envelope.getResponse();

                int countLinha = response.getPropertyCount();


                for (int i=0;i < countLinha;i++) {


                    SoapObject linha = (SoapObject)response.getProperty(i);
                    SoapPrimitive nomePrim = (SoapPrimitive)linha.getProperty(5);
                    String nome = nomePrim.toString();
                    LinhaContent.getInstance().addItem(new LinhaContent.DummyItem(new Integer(i + 1).toString(),nome));


                    //String nome = (String)linha.getAttribute("Nome");
                    //LinhaContent.getInstance().addItem(new LinhaContent.DummyItem(new Integer(i + 1).toString(),(String)linha.getProperty("Nome")));

                }


            } catch (Exception e) {

                e.printStackTrace();

            } finally {

                return execResult;

            }
        }
        // onPostExecute displays the results of the AsyncTask.
        @Override
        protected void onPostExecute(String result) {

            Intent detailIntent = new Intent(parentActivity, LinhaListActivity.class);
            startActivity(detailIntent);
        }
    }




}

