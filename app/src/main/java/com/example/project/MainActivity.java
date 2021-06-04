package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText  tx1, tx2, tx3, tx4, tx5, tx6;

    Button bt1, bt2;
    int[] lot = new int[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1 = (EditText) findViewById(R.id.tx1);
        tx2 = (EditText) findViewById(R.id.tx2);
        tx3 = (EditText) findViewById(R.id.tx3);
        tx4 = (EditText) findViewById(R.id.tx4);
        tx5 = (EditText) findViewById(R.id.tx5);
        tx6 = (EditText) findViewById(R.id.tx6);

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);



        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                for (int i = 0; i < lot.length; i++) {         // 1~45의 랜덤변수 생성
                    lot[i] = (int)(Math.random() * 45) + 1;

                    for (int j = 0; j < i; j++) {              // 중복제거
                        if (lot[i] == lot[j]) {                // 같은 숫자가 나오면 스택을 제거함
                            i--;
                            break;
                        }

                        int t;
                        if(lot[i] < lot[j]) {                  // temp 오름차순 정렬
                            t = lot[i];
                            lot[i] = lot[j];
                            lot[j] = t;
                        }
                    }
                }

                tx1.setText(Integer.toString(lot[0]));
                tx2.setText(Integer.toString(lot[1]));
                tx3.setText(Integer.toString(lot[2]));
                tx4.setText(Integer.toString(lot[3]));
                tx5.setText(Integer.toString(lot[4]));
                tx6.setText(Integer.toString(lot[5]));

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                tx1.setText(null);
                tx2.setText(null);
                tx3.setText(null);
                tx4.setText(null);
                tx5.setText(null);
                tx6.setText(null);

                Intent i = new Intent(getApplicationContext(), chance.class);
                startActivity(i);

            }
        });
    }
}