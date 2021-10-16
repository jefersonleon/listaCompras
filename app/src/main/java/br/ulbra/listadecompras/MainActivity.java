package br.ulbra.listadecompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private CheckBox chkarroz, chkfeijao, chkcarne, chkleite;
    private Button btcalcular,btarroz,btfeijao,btcarne,btleite;
    private TextView txtresultado;
    private ImageView imagens;
    double totalFinal;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentes();

        btcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total = 0;
                if (chkarroz.isChecked()) {
                    total += 2.69;
                }
                if (chkleite.isChecked()) {
                    total += 5;
                }
                if (chkcarne.isChecked()) {
                    total += 30;
                }
                if (chkfeijao.isChecked()) {
                    total += 7;
                }
                DecimalFormat f = new DecimalFormat("0.00");
                txtresultado.setText("Valor total a pagar é R$ " + f.format(total));
            }
        });
      btarroz.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              imagens.setImageResource(R.drawable.arroz);
          }
      });
        btfeijao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagens.setImageResource(R.drawable.feijao);
            }
        });
        btcarne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagens.setImageResource(R.drawable.carne);
            }
        });
        btleite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagens.setImageResource(R.drawable.leite);
            }
        });
    }

    private void inicializarComponentes() {
        chkarroz = (CheckBox) findViewById(R.id.chkarroz);
        chkfeijao = findViewById(R.id.chkfeijao);
        chkcarne = findViewById(R.id.chkcarne);
        chkleite = findViewById(R.id.chkleite);
        btcalcular = findViewById(R.id.btcalcular);
        txtresultado = findViewById(R.id.txtResultado);
        btarroz = findViewById(R.id.btarroz);
        btcarne = findViewById(R.id.btcarne);
        btfeijao = findViewById(R.id.btfeijao);
        btleite = findViewById(R.id.btleite);
        imagens = findViewById(R.id.imgfotos);

    }
}