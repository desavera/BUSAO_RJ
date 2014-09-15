package com.zirix.android.busaorj.app.content;

/**
 * Created by mvera on 04/09/14.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// import java.net.URL;

// import java.util.Iterator;


/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class VeiculoContent {


    /**
     * An array of sample (dummy) items.
     */
    public static List<VeiculoItem> ITEMS = new ArrayList<VeiculoItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, VeiculoItem> ITEM_MAP = new HashMap<String, VeiculoItem>();

    private static VeiculoContent instance = null;


    public static VeiculoContent getInstance() {

        if (instance == null) {

            instance = new VeiculoContent();
        }

        return instance;

    }

    private VeiculoContent() {


    }

    public void addItem(VeiculoItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class VeiculoItem {
        public String id;
        public String content;

        public VeiculoItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }


}
/*

    public void myClickHandler(View view) {
        ...
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            // fetch data
        } else {
            // display error
        }
        ...
    }
*/

