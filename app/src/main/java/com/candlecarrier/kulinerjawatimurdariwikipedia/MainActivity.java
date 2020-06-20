package com.candlecarrier.kulinerjawatimurdariwikipedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout layout_rawon = findViewById(R.id.listRawon);
        layout_rawon.setOnClickListener(this);

        RelativeLayout layout_pecel = findViewById(R.id.listPecel);
        layout_pecel.setOnClickListener(this);

        RelativeLayout layout_sateponorogo = findViewById(R.id.listSateponorogo);
        layout_sateponorogo.setOnClickListener(this);

        RelativeLayout layout_Tahucampur = findViewById(R.id.listTahucampur);
        layout_Tahucampur.setOnClickListener(this);

        RelativeLayout layout_Rujakcingur = findViewById(R.id.listRujakcingur);
        layout_Rujakcingur.setOnClickListener(this);

        RelativeLayout layout_Sotokediri = findViewById(R.id.listSotokediri);
        layout_Sotokediri.setOnClickListener(this);

        RelativeLayout layout_Sotoambengan = findViewById(R.id.listSotoambengan);
        layout_Sotoambengan.setOnClickListener(this);

        RelativeLayout layout_Rambakpetis = findViewById(R.id.listRambakpetis);
        layout_Rambakpetis.setOnClickListener(this);

        RelativeLayout layout_Ondeonde = findViewById(R.id.listOndeonde);
        layout_Ondeonde.setOnClickListener(this);

        RelativeLayout layout_Baksomalang = findViewById(R.id.listbaksomalang);
        layout_Baksomalang.setOnClickListener(this);

        RelativeLayout layout_Nasibebek = findViewById(R.id.listNasibebek);
        layout_Nasibebek.setOnClickListener(this);

        TextView tv_about_tentang = findViewById(R.id.about_tentang);
        tv_about_tentang.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.listRawon):
                Intent rawonIntent = new Intent(MainActivity.this,Rawon.class);
                startActivity(rawonIntent);
                break;
            case (R.id.listPecel):
                Intent pecelIntent = new Intent(MainActivity.this,Pecel.class);
                startActivity(pecelIntent);
                break;
            case (R.id.listSateponorogo):
                Intent sateponorogoIntent = new Intent(MainActivity.this,Sateponorogo.class);
                startActivity(sateponorogoIntent);
                break;
            case (R.id.listTahucampur):
                Intent tahucampurIntent = new Intent(MainActivity.this,Tahucampur.class);
                startActivity(tahucampurIntent);
                break;
            case (R.id.listRujakcingur):
                Intent rujakcingurIntent = new Intent(MainActivity.this,Rujakcingur.class);
                startActivity(rujakcingurIntent);
                break;
            case (R.id.listSotokediri):
                Intent sotokediriIntent = new Intent(MainActivity.this,Sotokediri.class);
                startActivity(sotokediriIntent);
                break;
            case (R.id.listSotoambengan):
                Intent sotoambenganIntent = new Intent(MainActivity.this,Sotoambengan.class);
                startActivity(sotoambenganIntent);
                break;
            case (R.id.listRambakpetis):
                Intent rambakpetisIntent = new Intent(MainActivity.this,Rambakpetis.class);
                startActivity(rambakpetisIntent);
                break;
            case (R.id.listOndeonde):
                Intent ondeondeIntent = new Intent(MainActivity.this,Ondeonde.class);
                startActivity(ondeondeIntent);
                break;
            case (R.id.listbaksomalang):
                Intent baksomalangIntent = new Intent(MainActivity.this,Baksomalang.class);
                startActivity(baksomalangIntent);
                break;
            case (R.id.listNasibebek):
                Intent nasibebekIntent = new Intent(MainActivity.this,Nasibebek.class);
                startActivity(nasibebekIntent);
                break;
            case (R.id.about_tentang):
                Intent about_tentang_Intent = new Intent(MainActivity.this,About_tentang.class);
                startActivity(about_tentang_Intent);
                break;
        }
    }
}
