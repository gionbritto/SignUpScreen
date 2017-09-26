package com.example.android.signupscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void acessaTela1(View view){
        Intent intent = new Intent(MenuActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

    public void acessaTela2(View view){
        Intent intent = new Intent(MenuActivity.this, PerfilActivity.class);
        startActivity(intent);
    }

public void acessaTela3(View view){
        Intent intent = new Intent(MenuActivity.this, Tela3.class);
        startActivity(intent);
        }

        public void acessaTela4(View view){
        Intent intent = new Intent(MenuActivity.this, Tela4Activity.class);
        startActivity(intent);
    }

}
