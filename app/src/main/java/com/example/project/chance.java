package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class chance extends AppCompatActivity {

    EditText tx1, tx2, tx3, tx4, tx5, tx6,
             tx1a, tx2a, tx3a, tx4a, tx5a, tx6a,
             tx1b, tx2b, tx3b, tx4b, tx5b, tx6b,
             tx1c, tx2c, tx3c, tx4c, tx5c, tx6c,
             tx1d, tx2d, tx3d, tx4d, tx5d, tx6d;

    Button bt1, bt2;
    int[] l1 = new int[6]; int[] l2 = new int[6]; int[] l3 = new int[6];
    int[] l4 = new int[6]; int[] l5 = new int[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chance5);

        tx1 = (EditText) findViewById(R.id.tx1); tx1c = (EditText) findViewById(R.id.tx1c);
        tx2 = (EditText) findViewById(R.id.tx2); tx2c = (EditText) findViewById(R.id.tx2c);
        tx3 = (EditText) findViewById(R.id.tx3); tx3c = (EditText) findViewById(R.id.tx3c);
        tx4 = (EditText) findViewById(R.id.tx4); tx4c = (EditText) findViewById(R.id.tx4c);
        tx5 = (EditText) findViewById(R.id.tx5); tx5c = (EditText) findViewById(R.id.tx5c);
        tx6 = (EditText) findViewById(R.id.tx6); tx6c = (EditText) findViewById(R.id.tx6c);
        tx1a = (EditText) findViewById(R.id.tx1a); tx1d = (EditText) findViewById(R.id.tx1d);
        tx2a = (EditText) findViewById(R.id.tx2a); tx2d = (EditText) findViewById(R.id.tx2d);
        tx3a = (EditText) findViewById(R.id.tx3a); tx3d = (EditText) findViewById(R.id.tx3d);
        tx4a = (EditText) findViewById(R.id.tx4a); tx4d = (EditText) findViewById(R.id.tx4d);
        tx5a = (EditText) findViewById(R.id.tx5a); tx5d = (EditText) findViewById(R.id.tx5d);
        tx6a = (EditText) findViewById(R.id.tx6a); tx6d = (EditText) findViewById(R.id.tx6d);
        tx1b = (EditText) findViewById(R.id.tx1b); tx4b = (EditText) findViewById(R.id.tx4b);
        tx2b = (EditText) findViewById(R.id.tx2b); tx5b = (EditText) findViewById(R.id.tx5b);
        tx3b = (EditText) findViewById(R.id.tx3b); tx6b = (EditText) findViewById(R.id.tx6b);

        bt1 = (Button) findViewById(R.id.bt1); bt2 = (Button) findViewById(R.id.bt2);

        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                for (int i = 0; i < l1.length; i++) {
                    l1[i] = (int) (Math.random() * 45) + 1;

                    for (int j = 0; j < i; j++) {
                        if (l1[i] == l1[j]) {
                            i--;
                            break;
                        }

                        int t;
                        if (l1[i] < l1[j]) {
                            t = l1[i];
                            l1[i] = l1[j];
                            l1[j] = t;
                        }
                    }
                }

                for (int i = 0; i < l2.length; i++) {
                    l2[i] = (int) (Math.random() * 45) + 1;

                    for (int j = 0; j < i; j++) {
                        if (l2[i] == l2[j]) {
                            i--;
                            break;
                        }

                        int t;
                        if (l2[i] < l2[j]) {
                            t = l2[i];
                            l2[i] = l2[j];
                            l2[j] = t;
                        }
                    }
                }

                for (int i = 0; i < l3.length; i++) {
                    l3[i] = (int)(Math.random() * 45) + 1;

                    for (int j = 0; j < i; j++) {
                        if (l3[i] == l3[j]) {
                            i--;
                            break;
                        }

                        int t;
                        if(l3[i] < l3[j]) {
                            t = l3[i];
                            l3[i] = l3[j];
                            l3[j] = t;
                        }
                    }
                }

                for (int i = 0; i < l4.length; i++) {
                    l4[i] = (int)(Math.random() * 45) + 1;

                    for (int j = 0; j < i; j++) {
                        if (l4[i] == l4[j]) {
                            i--;
                            break;
                        }

                        int t;
                        if(l4[i] < l4[j]) {
                            t = l4[i];
                            l4[i] = l4[j];
                            l4[j] = t;
                        }
                    }
                }

                for (int i = 0; i < l5.length; i++) {
                    l5[i] = (int)(Math.random() * 45) + 1;

                    for (int j = 0; j < i; j++) {
                        if (l5[i] == l5[j]) {
                            i--;
                            break;
                        }

                        int t;
                        if(l5[i] < l5[j]) {
                            t = l5[i];
                            l5[i] = l5[j];
                            l5[j] = t;
                        }
                    }
                }

                tx1.setText(Integer.toString(l1[0]));
                tx2.setText(Integer.toString(l1[1]));
                tx3.setText(Integer.toString(l1[2]));
                tx4.setText(Integer.toString(l1[3]));
                tx5.setText(Integer.toString(l1[4]));
                tx6.setText(Integer.toString(l1[5]));

                tx1a.setText(Integer.toString(l2[0]));
                tx2a.setText(Integer.toString(l2[1]));
                tx3a.setText(Integer.toString(l2[2]));
                tx4a.setText(Integer.toString(l2[3]));
                tx5a.setText(Integer.toString(l2[4]));
                tx6a.setText(Integer.toString(l2[5]));

                tx1b.setText(Integer.toString(l3[0]));
                tx2b.setText(Integer.toString(l3[1]));
                tx3b.setText(Integer.toString(l3[2]));
                tx4b.setText(Integer.toString(l3[3]));
                tx5b.setText(Integer.toString(l3[4]));
                tx6b.setText(Integer.toString(l3[5]));

                tx1c.setText(Integer.toString(l4[0]));
                tx2c.setText(Integer.toString(l4[1]));
                tx3c.setText(Integer.toString(l4[2]));
                tx4c.setText(Integer.toString(l4[3]));
                tx5c.setText(Integer.toString(l4[4]));
                tx6c.setText(Integer.toString(l4[5]));

                tx1d.setText(Integer.toString(l5[0]));
                tx2d.setText(Integer.toString(l5[1]));
                tx3d.setText(Integer.toString(l5[2]));
                tx4d.setText(Integer.toString(l5[3]));
                tx5d.setText(Integer.toString(l5[4]));
                tx6d.setText(Integer.toString(l5[5]));

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                finish();

            }
        });

    }
}
