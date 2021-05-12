/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;//librerias

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

//clase principal
public class MainActivity extends AppCompatActivity {

    @Override//metodo para inicializar
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Establezca el contenido de la actividad para utilizar el archivo de diseño activity_main.xml
        setContentView(R.layout.activity_main);

       TextView numbers = (TextView) findViewById(R.id.numbers);
       numbers.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view) {
               Intent numbersIntent = new Intent(MainActivity.this, numbers.class);
               startActivity(numbersIntent);
           }
       });

        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, colors.class);
                startActivity(colorsIntent);
            }
        });

        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, family.class);
                startActivity(familyIntent);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, phrases.class);
                startActivity(phrasesIntent);
            }
        });

}

    }