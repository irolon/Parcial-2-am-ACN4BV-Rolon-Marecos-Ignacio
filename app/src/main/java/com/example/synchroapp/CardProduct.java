package com.example.synchroapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CardProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_card_product);

        // Info para card del producto
        ImageView imageView = findViewById(R.id.imageView7);
        TextView RelMarca = findViewById(R.id.marca);
        TextView RelDetalle = findViewById(R.id.detalle);
        TextView RelPrecio = findViewById(R.id.precio);

        Intent intent = getIntent();
        String marca = intent.getStringExtra("marca");
        String detalle = intent.getStringExtra("detalle");
        String precio = intent.getStringExtra("precio");
        int imagenResId = intent.getIntExtra("imagen", 0);

        RelMarca.setText(marca);
        RelDetalle.setText(detalle);
        RelPrecio.setText(precio);

        if (imagenResId != 0) {
            imageView.setImageResource(imagenResId);
        }

        // Boton Volver
        Button btnVolver = findViewById(R.id.BtnVolver);
        btnVolver.setOnClickListener(v -> {
            finish();
        });

    }
}