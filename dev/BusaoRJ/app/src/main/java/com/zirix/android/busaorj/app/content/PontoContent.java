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
public class PontoContent {


    /**
     * An array of sample (dummy) items.
     */
    public static List<PontoItem> ITEMS = new ArrayList<PontoItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, PontoItem> ITEM_MAP = new HashMap<String, PontoItem>();

    private static PontoContent instance = null;


    public static PontoContent getInstance() {

        if (instance == null) {

            instance = new PontoContent();
        }

        return instance;

    }

    private PontoContent() {


    }

    public void addItem(PontoItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class PontoItem {
        public String id;
        public String content;

        public PontoItem(String id, String content) {
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

