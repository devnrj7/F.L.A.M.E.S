package com.devnrj7.flames;


import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;

import android.view.Menu;

import android.view.MenuItem;

import android.view.View;

import android.view.View.OnClickListener;

import android.widget.EditText;

import android.widget.ImageButton;

import android.widget.Toast;


public class FLAMES extends Activity {
    private ImageButton btnCancel;

    private ImageButton btnSubmit;

    private EditText editText1;

    private EditText editText2;

    int i;
    int j;
    int len;

    int[] result = new int[30];

    String s1;
    String s2;

    char[] str1;

    char[] str2;

    int sum;


    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_flames);

        this.btnSubmit = (ImageButton) findViewById(R.id.buttonSubmit);

        this.btnCancel = (ImageButton) findViewById(R.id.buttonCancel);

        this.editText1 = (EditText) findViewById(R.id.editText1);

        this.editText2 = (EditText) findViewById(R.id.editText2);

        this.btnSubmit.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                int[] iArr;

                flam ob = new flam();

                FLAMES.this.sum = 0;

                FLAMES.this.s1 = FLAMES.this.editText1.getText().toString();

                FLAMES.this.s2 = FLAMES.this.editText2.getText().toString();

                FLAMES.this.str1 = FLAMES.this.s1.toCharArray();

                FLAMES.this.str2 = FLAMES.this.s2.toCharArray();

                FLAMES.this.i = 0;

                while (FLAMES.this.i < FLAMES.this.s1.length()) {

                    if (FLAMES.this.str1[FLAMES.this.i] == 'A' || FLAMES.this.str1[FLAMES.this.i] == 'a') {

                        iArr = ob.a_count;

                        iArr[0] = iArr[0] + 1;
                    }

                    else if (FLAMES.this.str1[FLAMES.this.i] == 'B' || FLAMES.this.str1[FLAMES.this.i] == 'b') {

                        iArr = ob.a_count;

                        iArr[1] = iArr[1] + 1;
                    }


                    else if (FLAMES.this.str1[FLAMES.this.i] == 'C' || FLAMES.this.str1[FLAMES.this.i] == 'c') {

                        iArr = ob.a_count;

                        iArr[2] = iArr[2] + 1;
                    }

                    else if (FLAMES.this.str1[FLAMES.this.i] == 'D' || FLAMES.this.str1[FLAMES.this.i] == 'd') {


                        iArr = ob.a_count;

                        iArr[3] = iArr[3] + 1;
                    }

                    else if (FLAMES.this.str1[FLAMES.this.i] == 'E' || FLAMES.this.str1[FLAMES.this.i] == 'e') {

                        iArr = ob.a_count;

                        iArr[4] = iArr[4] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'F' || FLAMES.this.str1[FLAMES.this.i] == 'f') {

                        iArr = ob.a_count;
                        iArr[5] = iArr[5] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'G' || FLAMES.this.str1[FLAMES.this.i] == 'g') {

                        iArr = ob.a_count;
                        iArr[6] = iArr[6] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'H' || FLAMES.this.str1[FLAMES.this.i] == 'h') {

                        iArr = ob.a_count;
                        iArr[7] = iArr[7] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'I' || FLAMES.this.str1[FLAMES.this.i] == 'i') {

                        iArr = ob.a_count;
                        iArr[8] = iArr[8] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'J' || FLAMES.this.str1[FLAMES.this.i] == 'j') {

                        iArr = ob.a_count;
                        iArr[9] = iArr[9] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'K' || FLAMES.this.str1[FLAMES.this.i] == 'k') {

                        iArr = ob.a_count;
                        iArr[10] = iArr[10] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'L' || FLAMES.this.str1[FLAMES.this.i] == 'l') {

                        iArr = ob.a_count;
                        iArr[11] = iArr[11] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'M' || FLAMES.this.str1[FLAMES.this.i] == 'm') {

                        iArr = ob.a_count;
                        iArr[12] = iArr[12] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'N' || FLAMES.this.str1[FLAMES.this.i] == 'n') {

                        iArr = ob.a_count;
                        iArr[13] = iArr[13] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'O' || FLAMES.this.str1[FLAMES.this.i] == 'o') {

                        iArr = ob.a_count;
                        iArr[14] = iArr[14] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'P' || FLAMES.this.str1[FLAMES.this.i] == 'p') {

                        iArr = ob.a_count;
                        iArr[15] = iArr[15] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'Q' || FLAMES.this.str1[FLAMES.this.i] == 'q') {

                        iArr = ob.a_count;
                        iArr[16] = iArr[16] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'R' || FLAMES.this.str1[FLAMES.this.i] == 'r') {

                        iArr = ob.a_count;
                        iArr[17] = iArr[17] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'S' || FLAMES.this.str1[FLAMES.this.i] == 's') {

                        iArr = ob.a_count;
                        iArr[18] = iArr[18] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'T' || FLAMES.this.str1[FLAMES.this.i] == 't') {

                        iArr = ob.a_count;
                        iArr[19] = iArr[19] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'U' || FLAMES.this.str1[FLAMES.this.i] == 'u') {

                        iArr = ob.a_count;
                        iArr[20] = iArr[20] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'V' || FLAMES.this.str1[FLAMES.this.i] == 'v') {

                        iArr = ob.a_count;
                        iArr[21] = iArr[21] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'W' || FLAMES.this.str1[FLAMES.this.i] == 'w') {

                        iArr = ob.a_count;
                        iArr[22] = iArr[22] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'X' || FLAMES.this.str1[FLAMES.this.i] == 'x') {

                        iArr = ob.a_count;
                        iArr[23] = iArr[23] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'Y' || FLAMES.this.str1[FLAMES.this.i] == 'y') {

                        iArr = ob.a_count;
                        iArr[24] = iArr[24] + 1;
                    }
                    else if (FLAMES.this.str1[FLAMES.this.i] == 'Z' || FLAMES.this.str1[FLAMES.this.i] == 'z') {

                        iArr = ob.a_count;
                        iArr[25] = iArr[25] + 1;
                    }
                    FLAMES flames = FLAMES.this;
                    flames.i++;
                }
                FLAMES.this.i = 0;
                while (FLAMES.this.i < FLAMES.this.s2.length()) {
                    if (FLAMES.this.str2[FLAMES.this.i] == 'A' || FLAMES.this.str2[FLAMES.this.i] == 'a') {
                        iArr = ob.b_count;
                        iArr[0] = iArr[0] + 1;
                    } else if (FLAMES.this.str2[FLAMES.this.i] == 'B' || FLAMES.this.str2[FLAMES.this.i] == 'b') {
                        iArr = ob.b_count;
                        iArr[1] = iArr[1] + 1;
                    } else if (FLAMES.this.str2[FLAMES.this.i] == 'C' || FLAMES.this.str2[FLAMES.this.i] == 'c') {
                        iArr = ob.b_count;
                        iArr[2] = iArr[2] + 1;
                    } else if (FLAMES.this.str2[FLAMES.this.i] == 'D' || FLAMES.this.str2[FLAMES.this.i] == 'd') {
                        iArr = ob.b_count;
                        iArr[3] = iArr[3] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'E' || FLAMES.this.str2[FLAMES.this.i] == 'e') {

                        iArr = ob.b_count;
                        iArr[4] = iArr[4] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'F' || FLAMES.this.str2[FLAMES.this.i] == 'f') {

                        iArr = ob.b_count;
                        iArr[5] = iArr[5] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'G' || FLAMES.this.str2[FLAMES.this.i] == 'g') {

                        iArr = ob.b_count;
                        iArr[6] = iArr[6] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'H' || FLAMES.this.str2[FLAMES.this.i] == 'h') {

                        iArr = ob.b_count;
                        iArr[7] = iArr[7] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'I' || FLAMES.this.str2[FLAMES.this.i] == 'i') {

                        iArr = ob.b_count;
                        iArr[8] = iArr[8] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'J' || FLAMES.this.str2[FLAMES.this.i] == 'j') {

                        iArr = ob.b_count;
                        iArr[9] = iArr[9] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'K' || FLAMES.this.str2[FLAMES.this.i] == 'k') {

                        iArr = ob.b_count;
                        iArr[10] = iArr[10] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'L' || FLAMES.this.str2[FLAMES.this.i] == 'l') {

                        iArr = ob.b_count;
                        iArr[11] = iArr[11] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'M' || FLAMES.this.str2[FLAMES.this.i] == 'm') {

                        iArr = ob.b_count;
                        iArr[12] = iArr[12] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'N' || FLAMES.this.str2[FLAMES.this.i] == 'n') {

                        iArr = ob.b_count;
                        iArr[13] = iArr[13] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'O' || FLAMES.this.str2[FLAMES.this.i] == 'o') {

                        iArr = ob.b_count;
                        iArr[14] = iArr[14] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'P' || FLAMES.this.str2[FLAMES.this.i] == 'p') {

                        iArr = ob.b_count;
                        iArr[15] = iArr[15] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'Q' || FLAMES.this.str2[FLAMES.this.i] == 'q') {

                        iArr = ob.b_count;
                        iArr[16] = iArr[16] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'R' || FLAMES.this.str2[FLAMES.this.i] == 'r') {

                        iArr = ob.b_count;
                        iArr[17] = iArr[17] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'S' || FLAMES.this.str2[FLAMES.this.i] == 's') {

                        iArr = ob.b_count;
                        iArr[18] = iArr[18] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'T' || FLAMES.this.str2[FLAMES.this.i] == 't') {

                        iArr = ob.b_count;
                        iArr[19] = iArr[19] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'U' || FLAMES.this.str2[FLAMES.this.i] == 'u') {

                        iArr = ob.b_count;
                        iArr[20] = iArr[20] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'V' || FLAMES.this.str2[FLAMES.this.i] == 'v') {

                        iArr = ob.b_count;
                        iArr[21] = iArr[21] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'W' || FLAMES.this.str2[FLAMES.this.i] == 'w') {

                        iArr = ob.b_count;
                        iArr[22] = iArr[22] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'X' || FLAMES.this.str2[FLAMES.this.i] == 'x') {

                        iArr = ob.b_count;
                        iArr[23] = iArr[23] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'Y' || FLAMES.this.str2[FLAMES.this.i] == 'y') {

                        iArr = ob.b_count;
                        iArr[24] = iArr[24] + 1;
                    }
                    else if (FLAMES.this.str2[FLAMES.this.i] == 'Z' || FLAMES.this.str2[FLAMES.this.i] == 'z') {

                        iArr = ob.b_count;
                        iArr[25] = iArr[25] + 1;
                    }


                    flames = FLAMES.this;

                    flames.i++;
                }


                FLAMES.this.i = 0;

                while (FLAMES.this.i < 26) {

                    FLAMES.this.result[FLAMES.this.i] = Math.abs(ob.a_count[FLAMES.this.i] - ob.b_count[FLAMES.this.i]);

                    flames = FLAMES.this;
                    flames.i++;
                }


                FLAMES.this.i = 0;


                while (FLAMES.this.i < 26) {

                    flames = FLAMES.this;

                    flames.sum += FLAMES.this.result[FLAMES.this.i];

                    flames = FLAMES.this;

                    flames.i++;
                }


                if (FLAMES.this.sum == 1) {

                    Toast.makeText(FLAMES.this.getApplicationContext(), "SIBLINGS", 1).show();
                }
                else if (FLAMES.this.sum == 2 || FLAMES.this.sum == 4 || FLAMES.this.sum == 7 || FLAMES.this.sum == 9)
                {
                    Toast.makeText(FLAMES.this.getApplicationContext(), "ENEMIES", 1).show();
                }
                else if (FLAMES.this.sum == 3 || FLAMES.this.sum == 5 || FLAMES.this.sum == 14)
                {
                    Toast.makeText(FLAMES.this.getApplicationContext(), "FRIENDS", 1).show();
                }
                else if (FLAMES.this.sum == 6 || FLAMES.this.sum == 11 || FLAMES.this.sum == 15)
                {
                    Toast.makeText(FLAMES.this.getApplicationContext(), "MARRIAGE", 1).show();
                }
                else if (FLAMES.this.sum == 10) {
                    Toast.makeText(FLAMES.this.getApplicationContext(), "AFFECTION", 1).show();
                }

                else if (FLAMES.this.sum == 8 || FLAMES.this.sum == 12 || FLAMES.this.sum == 13) {

                    Toast.makeText(FLAMES.this.getApplicationContext(), "LOVE", 1).show();
                }
                else {
                    Toast.makeText(FLAMES.this.getApplicationContext(), "The Relationship is Not available", 1).show();
                }

            }
        });



        this.btnCancel.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                FLAMES.this.editText1.setText("");

                FLAMES.this.editText2.setText("");
            }
        });

    }



    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.activity_flames, menu);

        return true;
    }



    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.menu_about /*2131165193*/:


                startActivity(new Intent(getApplicationContext(), About.class));

                break;


            case R.id.menu_exit /*2131165194*/:

                break;
        }

        finish();

        System.exit(0);


        return super.onOptionsItemSelected(item);
    }
}
