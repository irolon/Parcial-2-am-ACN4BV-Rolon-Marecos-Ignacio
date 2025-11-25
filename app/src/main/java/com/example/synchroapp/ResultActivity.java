package com.example.synchroapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);

        TextView textoInicio = findViewById(R.id.usuario);
        String usuario = getIntent().getStringExtra("Extra_User");
        textoInicio.setText(usuario);

        CardView cardReloj1 = findViewById(R.id.card_reloj_1);
        CardView cardReloj2 = findViewById(R.id.card_reloj_2);
        CardView cardReloj3 = findViewById(R.id.card_reloj_3);
        CardView cardReloj4 = findViewById(R.id.card_reloj_4);
        CardView cardReloj5 = findViewById(R.id.card_reloj_5);
        CardView cardReloj6 = findViewById(R.id.card_reloj_6);

        cardReloj1.setOnClickListener(v->abrirDetalle(
                "KOROS Active Pro",
                "Domina tu rutina con el KOROS Active Pro. Su diseño robusto y deportivo" +
                        " te acompaña en cada entrenamiento. Sincronización perfecta con Android" +
                        " para notificaciones al instante.",
                "u$s 150",
                        R.drawable.img_reloj_1
        ));
        cardReloj2.setOnClickListener(v->abrirDetalle(
                "NEOX Titan Ultra",
                "\"¡Destaca entre la multitud! El NEOX Titan Ultra combina" +
                        " una vibrante correa naranja con una pantalla de alta definición." +
                        " Resistente, audaz y lleno de funciones inteligentes.",
                "u$s 100",
                R.drawable.img_reloj_2
        ));
        cardReloj3.setOnClickListener(v->abrirDetalle(
                "AUREX Blue Chrono",
                "\"Eleva tu estilo con el AUREX Blue Chrono." +
                        " Un acabado premium en azul profundo que fusiona la elegancia" +
                        " clásica con funciones inteligentes avanzadas. Sofisticación" +
                        " total en tu muñeca.",
                "u$s 200",
                R.drawable.img_reloj_3
        ));
        cardReloj4.setOnClickListener(v->abrirDetalle(
                "VION Smart Fit Band",
                "\"Ligera, moderna y esencial. La VION Smart Fit Band en blanco" +
                        " puro monitorea tu salud sin que sientas que la llevas puesta." +
                        " Comodidad total para tu día a día y entrenamientos.",
                "u$s 70",
                R.drawable.img_reloj_4
        ));
        cardReloj5.setOnClickListener(v->abrirDetalle(
                "Aureon Chronos S9",
                "\"Distinción en cada detalle. El Aureon Chronos S9 fusiona la" +
                        " elegancia clásica del acero plateado con tecnología inteligente" +
                        " de punta. Perfecto para destacar en reuniones o eventos.",
                "u$s 190",
                R.drawable.img_reloj_5
        ));
        cardReloj6.setOnClickListener(v->abrirDetalle(
                "Aureon Pulse X7",
                "\"El equilibrio perfecto entre funcionalidad y diseño." +
                        " El Aureon Pulse X7 en negro mate es tu asistente personal" +
                        " definitivo. Controla tu música, mensajes y actividad física" +
                        " con un estilo sobrio y potente.",
                "u$s 110",
                R.drawable.img_reloj_6
        ));


    }
    private void abrirDetalle(String marca, String detalle, String precio, int imagenResId) {
        Intent intent = new Intent(this, CardProduct.class);
        intent.putExtra("marca", marca);
        intent.putExtra("detalle", detalle);
        intent.putExtra("precio", precio);
        intent.putExtra("imagen", imagenResId);
        startActivity(intent);
    }


}