package com.zirix.android.busaorj.app;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.zirix.android.busaorj.app.content.PontoContent;
import com.zirix.android.busaorj.app.content.VeiculoContent;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.Marshal;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import java.io.IOException;


/**
 * An activity representing a list of Linhas. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link LinhaDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 * <p>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link LinhaListFragment} and the item details
 * (if present) is a {@link LinhaDetailFragment}.
 * <p>
 * This activity also implements the required
 * {@link LinhaListFragment.Callbacks} interface
 * to listen for item selections.
 */
public class LinhaListActivity extends FragmentActivity
        implements LinhaListFragment.Callbacks {



    //the CHOSE_ID
    public static String CHOSE_ID = "0";


    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linha_list);

        if (findViewById(R.id.linha_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-large and
            // res/values-sw600dp). If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;

            // In two-pane mode, list items should be given the
            // 'activated' state when touched.
            ((LinhaListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.linha_list))
                    .setActivateOnItemClick(true);
        }

        // TODO: If exposing deep links into your app, handle intents here.
    }

    /**
     * Callback method from {@link LinhaListFragment.Callbacks}
     * indicating that the item with the given ID was selected.
     */
    @Override
    public void onItemSelected(String id) {


        CHOSE_ID = id;

        if (mTwoPane) {

            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(LinhaDetailFragment.ARG_ITEM_ID, id);
            LinhaDetailFragment fragment = new LinhaDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.linha_detail_container, fragment)
                    .commit();

        } else {

            new SystemSatTask(this).execute("RUN IT !");
        }
    }

    public class SystemSatTask extends AsyncTask<String, Void, String> {

        private final String NAMESPACE = "http://tempuri.org/";
        private final String URL = "http://200.152.54.164:90/wservice.asmx?WSDL";
        private final String SOAP_ACTION = "http://tempuri.org/ListaVeiculosTrajeto";
        private final String METHOD_NAME = "ListaVeiculosTrajeto";


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
            PropertyInfo idConfig = new PropertyInfo();
            //Set Name
            idConfig.setName("Id_Config");
            //Set Value
            idConfig.setValue(3);
            //Set dataType
            idConfig.setType(int.class);
            //Add the property to request object
            request.addProperty(idConfig);

            PropertyInfo idLinha = new PropertyInfo();
            //Set Name
            idLinha.setName("Id_Linha");
            //Set Value
            idLinha.setValue(2);
            //Set dataType
            idLinha.setType(int.class);
            //Add the property to request object
            request.addProperty(idLinha);


            PropertyInfo idRota = new PropertyInfo();
            //Set Name
            idRota.setName("Id_Rota");
            //Set Value
            idRota.setValue(3);
            //Set dataType
            idRota.setType(int.class);
            //Add the property to request object
            request.addProperty(idRota);


            PropertyInfo latitude = new PropertyInfo();
            //Set Name
            latitude.setName("Latitude");
            //Set Value
            latitude.setValue(-22.86655);
            //Set dataType
            latitude.setType(double.class);
            //Add the property to request object
            request.addProperty(latitude);

            PropertyInfo longitude = new PropertyInfo();
            //Set Name
            longitude.setName("Longitude");
            //Set Value
            longitude.setValue(-43.256755);
            //Set dataType
            longitude.setType(double.class);
            //Add the property to request object
            request.addProperty(longitude);



            PropertyInfo quantVeic = new PropertyInfo();
            //Set Name
            quantVeic.setName("QuantidadeVeiculos");
            //Set Value
            quantVeic.setValue(3);
            //Set dataType
            quantVeic.setType(int.class);
            //Add the property to request object
            request.addProperty(quantVeic);


            PropertyInfo quantPontos = new PropertyInfo();
            //Set Name
            quantPontos.setName("QuantidadePontos");
            //Set Value
            quantPontos.setValue(1);
            //Set dataType
            quantPontos.setType(int.class);
            //Add the property to request object
            request.addProperty(quantPontos);



            //Create envelope
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                    SoapEnvelope.VER11);

            envelope.dotNet = true;
            envelope.implicitTypes = true;
            envelope.encodingStyle = SoapSerializationEnvelope.XSD;
            MarshalDouble md = new MarshalDouble();
            md.register(envelope);

            //Set output SOAP object
            envelope.setOutputSoapObject(request);
            //Create HTTP call object
            HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

            try {
                //Invoke web service
                androidHttpTransport.call(SOAP_ACTION, envelope);
                //Get the response
                SoapObject response = (SoapObject)envelope.getResponse();


                // WS Results
                SoapObject WSResult1 = (SoapObject)response.getProperty(0);

                // lista de pontos mais proximos
                SoapObject WSResult4 = (SoapObject) WSResult1.getProperty(4);
                // lista de veiculos mais proximos
                SoapObject WSResult6 = (SoapObject) WSResult1.getProperty(6);



                int pontoCount = WSResult4.getPropertyCount();
                int veicCount = WSResult6.getPropertyCount();


                for (int i=0;i < pontoCount;i++) {

                    SoapObject ponto = (SoapObject)WSResult4.getProperty(i);

                    SoapPrimitive idPrim = (SoapPrimitive)ponto.getProperty(0);
                    String id_ponto = idPrim.toString();

                    PontoContent.getInstance().addItem(new PontoContent.PontoItem(new Integer(i + 1).toString(),id_ponto));
                }

                // this will be used later...
                for (int i=0;i < veicCount;i++) {

                    SoapObject veic = (SoapObject)WSResult6.getProperty(i);

                    SoapPrimitive distTempPrim = (SoapPrimitive)veic.getProperty(6);
                    String distTemp = distTempPrim.toString();

                    VeiculoContent.getInstance().addItem(new VeiculoContent.VeiculoItem(new Integer(i + 1).toString(),distTemp));
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

            Intent detailIntent = new Intent(parentActivity, PontoListListActivity.class);
            startActivity(detailIntent);
        }
    }

    public class MarshalDouble implements Marshal {
        public Object readInstance(XmlPullParser parser, String namespace,
                                   String name, PropertyInfo expected) throws IOException,
                XmlPullParserException {

            return Double.parseDouble(parser.nextText());
        }

        public void register(SoapSerializationEnvelope cm) {
            cm.addMapping(cm.xsd, "double", Double.class, this);

        }

        public void writeInstance(XmlSerializer writer, Object obj)
                throws IOException {
            writer.text(obj.toString());
        }
    }


}
