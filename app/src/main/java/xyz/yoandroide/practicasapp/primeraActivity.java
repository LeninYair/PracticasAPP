package xyz.yoandroide.practicasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class primeraActivity extends AppCompatActivity {
    Button btnSalir;
    Button btnSigue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera);


        btnSalir=findViewById(R.id.btnSalir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnSigue=findViewById(R.id.btnSigue);
        btnSigue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(primeraActivity.this,borrarActivity.class);
                startActivity(intent);
            }
        });

    }
}