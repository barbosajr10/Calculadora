package com.gabrielbarbosa.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Calculo c = new Calculo();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Resultado
        final TextView TResultado = findViewById(R.id.TResultado);

        // Botões das operações
        Button BotaoMais = findViewById(R.id.BotaoMais);
        Button BotaoMenos = findViewById(R.id.BotaoMenos);
        Button BotaoVezes = findViewById(R.id.BotaoVezes);
        Button BotaoDividir = findViewById(R.id.BotaoDividir);
        Button BotaoIgual = findViewById(R.id.BotaoIgual);
        Button BotaoLimpar = findViewById(R.id.BotaoLimpar);

        // Botões dos números
        Button BotaoUm = findViewById(R.id.BotaoUm);
        Button BotaoDois = findViewById(R.id.BotaoDois);
        Button BotaoTres = findViewById(R.id.BotaoTres);
        Button BotaoQuatro = findViewById(R.id.BotaoQuatro);
        Button BotaoCinco = findViewById(R.id.BotaoCinco);
        Button BotaoSeis = findViewById(R.id.BotaoSeis);
        Button BotaoSete = findViewById(R.id.BotaoSete);
        Button BotaoOito = findViewById(R.id.BotaoOito);
        Button BotaoNove = findViewById(R.id.BotaoNove);
        Button BotaoZero = findViewById(R.id.BotaoZero);


        BotaoUm.setOnClickListener(this);
        BotaoDois.setOnClickListener(this);
        BotaoTres.setOnClickListener(this);
        BotaoQuatro.setOnClickListener(this);
        BotaoCinco.setOnClickListener(this);
        BotaoSeis.setOnClickListener(this);
        BotaoSete.setOnClickListener(this);
        BotaoOito.setOnClickListener(this);
        BotaoNove.setOnClickListener(this);
        BotaoZero.setOnClickListener(this);
        BotaoMais.setOnClickListener(this);
        BotaoMenos.setOnClickListener(this);
        BotaoVezes.setOnClickListener(this);
        BotaoDividir.setOnClickListener(this);
        BotaoIgual.setOnClickListener(this);
        BotaoLimpar.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        TextView TResultado = findViewById(R.id.TResultado);
        switch (v.getId()) {

            case R.id.BotaoUm:
                TResultado.setText(TResultado.getText() + "1");
                break;

            case R.id.BotaoDois:
                TResultado.setText(TResultado.getText() + "2");
                break;

            case R.id.BotaoTres:
                TResultado.setText(TResultado.getText() + "3");
                break;

            case R.id.BotaoQuatro:
                TResultado.setText(TResultado.getText() + "4");
                break;

            case R.id.BotaoCinco:
                TResultado.setText(TResultado.getText() + "5");
                break;

            case R.id.BotaoSeis:
                TResultado.setText(TResultado.getText() + "6");
                break;

            case R.id.BotaoSete:
                TResultado.setText(TResultado.getText() + "7");
                break;

            case R.id.BotaoOito:
                TResultado.setText(TResultado.getText() + "8");
                break;

            case R.id.BotaoNove:
                TResultado.setText(TResultado.getText() + "9");
                break;

            case R.id.BotaoZero:
                TResultado.setText(TResultado.getText() + "0");
                break;

            // botão das operações
            case R.id.BotaoMais:
                c.setN1(Double.parseDouble(TResultado.getText().toString()));
                c.setOp("+");
                TResultado.setText("");
                break;

            case R.id.BotaoMenos:
                c.setN1(Double.parseDouble(TResultado.getText().toString()));
                c.setOp("-");
                TResultado.setText("");
                break;

            case R.id.BotaoVezes:
                c.setN1(Double.parseDouble(TResultado.getText().toString()));
                c.setOp("*");
                TResultado.setText("");
                break;
            case R.id.BotaoDividir:
                c.setN1(Double.parseDouble(TResultado.getText().toString()));
                c.setOp("/");
                TResultado.setText("");
                break;

            case R.id.BotaoIgual:
                c.setN2(Double.parseDouble(TResultado.getText().toString()));
                c.Calcular();
                TResultado.setText(String.valueOf(c.getResult()));
                break;

            case R.id.BotaoLimpar:
                TResultado.setText("");
                break;

            default:
                break;
        }
    }
}









