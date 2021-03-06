package com.androidplot.demos;

import android.os.Bundle;
import android.app.Activity;import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.androidplot.xy.PanZoom;

import java.security.KeyStore;
import java.util.ArrayList;


public class PuntoFijoTableActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto_fijo_table);
        ArrayList<String> iteraciones= getIntent().getExtras().getStringArrayList("iteraciones");
        ArrayList<String> xa= getIntent().getExtras().getStringArrayList("xaList");
        ArrayList<String> Error= getIntent().getExtras().getStringArrayList("ErrorList");
        ArrayList<String> gxList= getIntent().getExtras().getStringArrayList("gxList");
        ArrayList<String> fxList= getIntent().getExtras().getStringArrayList("fxList");
        init(iteraciones, xa, Error, gxList,fxList);
    }
    public void init(ArrayList<String> iter,ArrayList<String> xm,ArrayList<String> Error,ArrayList<String> gxm,ArrayList<String> fxm){
        TableLayout table = (TableLayout)findViewById(R.id.TablelayoutPuntofijo);
        if (table.getChildCount()>0){
            table.removeAllViews();
        }else{

            for (int i = 0; i < iter.size()+1; i++) {
                TableRow row = new TableRow(this);
                TextView view1 = new TextView(this);
                TextView view2 = new TextView(this);
                TextView view3 = new TextView(this);
                TextView view4 = new TextView(this);
                TextView view5 = new TextView(this);
                if(i==0){

                    view1.setText("    "+"Iterations");
                    view2.setText("    "+"Xa");
                    view3.setText("    "+"gx");
                    view4.setText("    "+"fx");
                    view5.setText("    "+"Error");
                    view1.setTextColor(Color.BLACK);
                    view2.setTextColor(Color.BLACK);
                    view3.setTextColor(Color.BLACK);
                    view4.setTextColor(Color.BLACK);
                    view5.setTextColor(Color.BLACK);

                    row.addView(view1);
                    row.addView(view2);
                    row.addView(view3);
                    row.addView(view4);
                    row.addView(view5);

                    table.addView(row, i);
                }else{

                    view1.setText(iter.get(i-1));
                    view1.setTextColor(Color.BLACK);
                    view2.setText("    "+xm.get(i-1));
                    view2.setTextColor(Color.BLACK);
                    view3.setText("    "+gxm.get(i-1));
                    view3.setTextColor(Color.BLACK);
                    view4.setText("    "+fxm.get(i-1));
                    view4.setTextColor(Color.BLACK);
                    view5.setText("    "+Error.get(i-1));
                    view5.setTextColor(Color.BLACK);
                    row.addView(view1);
                    row.addView(view2);
                    row.addView(view3);
                    row.addView(view4);
                    row.addView(view5);
                    table.addView(row, i);
                }

            }
        }

    }

}
