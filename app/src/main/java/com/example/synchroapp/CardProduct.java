package com.example.synchroapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

        // Boton Comprar
        Button btnComprar = findViewById(R.id.comprar);

        btnComprar.setOnClickListener(v -> {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_custom,
                    findViewById(R.id.toast_root));

            TextView text = layout.findViewById(R.id.toast_text);
            text.setText("Producto agregado al carrito");

            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 150); // arriba centrado
            toast.show();
            v.postDelayed(this::finish, 500);
        });
    }
}