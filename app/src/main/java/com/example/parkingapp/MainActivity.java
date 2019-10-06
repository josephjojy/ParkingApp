package com.example.parkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button entry,exit;
    TextView vp1,vp2,vp3,vp4,vp5,gd1,gd2;
    int[] tot={20,20,20,20,20,20,20};
    int i;
    String s,st;
    Spinner pgsel;
    String[] park = { "VP-1", "VP-2", "VP-3", "VP-4", "VP-5" ,"GD-1" ,"GD-2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entry=findViewById(R.id.entry);
        exit=findViewById(R.id.exit);
        vp1=findViewById(R.id.vp1);
        vp2=findViewById(R.id.vp2);
        vp3=findViewById(R.id.vp3);
        vp4=findViewById(R.id.vp4);
        vp5=findViewById(R.id.vp5);
        gd1=findViewById(R.id.gd1);
        gd2=findViewById(R.id.gd2);
        pgsel=findViewById(R.id.pgsel);
        /*
        Selecting from the spinner which parking lot
        */
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, park);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        pgsel.setAdapter(adapter);
        pgsel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                st=String.valueOf(pgsel.getSelectedItem());
                i=pgsel.getSelectedItemPosition();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        /*
        Modifying the parking space available accordingly
         */
        entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tot[i]!=0) {
                    tot[i] -= 1;
                    s = park[i]+"\n" + tot[i];
                    switch(i) {
                        case 0: {
                            vp1.setText(s);
                            if (tot[i] == 0)
                                vp1.setBackgroundColor(0xffcc0000);
                            break;
                        }
                        case 1: {
                            vp2.setText(s);
                            if (tot[i] == 0)
                                vp2.setBackgroundColor(0xffcc0000);
                            break;
                        }
                        case 2: {
                            vp3.setText(s);
                            if (tot[i] == 0)
                                vp3.setBackgroundColor(0xffcc0000);
                            break;
                        }
                        case 3: {
                            vp4.setText(s);
                            if (tot[i] == 0)
                                vp4.setBackgroundColor(0xffcc0000);
                            break;
                        }
                        case 4: {
                            vp5.setText(s);
                            if (tot[i] == 0)
                                vp5.setBackgroundColor(0xffcc0000);
                            break;
                        }
                        case 5: {
                            gd1.setText(s);
                            if (tot[i] == 0)
                                gd1.setBackgroundColor(0xffcc0000);
                            break;
                        }
                        case 6: {
                            gd2.setText(s);
                            if (tot[i] == 0)
                                gd2.setBackgroundColor(0xffcc0000);
                            break;
                        }
                    }
                }
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tot[i]!=20) {

                    tot[i]+= 1;

                    s = park[i]+"\n" + tot[i];
                    switch(i) {
                        case 0: {
                            vp1.setText(s);
                            if (tot[i] > 0)
                                vp1.setBackgroundColor(0xff00cc00);
                            break;
                        }
                        case 1: {
                            vp2.setText(s);
                            if (tot[i] > 0)
                                vp2.setBackgroundColor(0xff00cc00);
                            break;
                        }
                        case 2: {
                            vp3.setText(s);
                            if (tot[i] > 0)
                                vp3.setBackgroundColor(0xff00cc00);
                            break;
                        }
                        case 3: {
                            vp4.setText(s);
                            if (tot[i] > 0)
                                vp4.setBackgroundColor(0xff00cc00);
                            break;
                        }
                        case 4: {
                            vp5.setText(s);
                            if (tot[i] > 0)
                                vp5.setBackgroundColor(0xff00cc00);
                            break;
                        }
                        case 5: {
                            gd1.setText(s);
                            if (tot[i] > 0)
                                gd1.setBackgroundColor(0xff00cc00);
                            break;
                        }
                        case 6: {
                            gd2.setText(s);
                            if (tot[i] > 0)
                                gd2.setBackgroundColor(0xff00cc00);
                            break;
                        }
                    }
                }

            }
        });


    }
}
