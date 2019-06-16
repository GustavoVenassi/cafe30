package com.example.cafe30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int quant = 0;
    double valor = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendEmail = new Intent(Intent.ACTION_SEND);
                sendEmail.setType("/");
                sendEmail.putExtra(Intent.EXTRA_EMAIL, "cafe.do.ifc.concordia@gmail.com");
                if (quant == 1) {
                    sendEmail.putExtra(Intent.EXTRA_TEXT, "Eu gostaria de pedir " +quant+ " café. O valor total será de R$" +valor);
                }else{
                    sendEmail.putExtra(Intent.EXTRA_TEXT, "Eu gostaria de pedir " +quant+ " cafés. O valor total será de R$" +valor);
                }
                sendEmail.putExtra(Intent.EXTRA_SUBJECT, "BATATA");

                if (sendEmail.resolveActivity(getPackageManager()) != null) {
                    startActivity(sendEmail);
                }
            }
        });
    }
    }}
    
