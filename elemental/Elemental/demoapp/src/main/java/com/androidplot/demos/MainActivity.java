/*
 * Copyright 2015 AndroidPlot.com
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.androidplot.demos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.crittercism.app.Crittercism;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getName();

    // DO *NOT* CHANGE THIS LINE! (CI-MATCH-POPULATE)
    private static final String CRITTERCISM_APP_ID = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (CRITTERCISM_APP_ID != null) {
            Log.d(TAG, "Crittercism initialized.");
            Crittercism.initialize(getApplicationContext(), CRITTERCISM_APP_ID);
        }

        setContentView(R.layout.main);


        Button grafica = (Button) findViewById(R.id.fxPlotExample);
        grafica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GraphActivity.class);
                intent.putExtra("funcion","");
                startActivity(intent);
            }
        });


        Button Interpolacion = (Button) findViewById(R.id.Interpolacion);
        Interpolacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InterpolacionMetodosActivity.class));
            }
        });


        Button metodoP = (Button) findViewById(R.id.metodo1);
        metodoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ecuacionesunavariableActivity.class));
            }
        });
        Button metodoL = (Button) findViewById(R.id.button2);
        metodoL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, matrix2.class));
            }
        });

    }
}
