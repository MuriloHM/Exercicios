package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String jogador = "X";

    String [][] matrizVerificacao = new String[3][3];

    int jogadas = 0;
    public void trocaJogador(){
        if(jogador.equals("X")){
            jogador = "O";

        }
        else{
            jogador = "X";
        }
        jogadas = jogadas + 1;

    }

    public void inicializarMatrizVerificacao()
    {
        for(int linha = 0; linha < 3; linha++)
        {
            for(int coluna = 0; coluna < 3; coluna++)
            {
                matrizVerificacao[linha][coluna] = String.valueOf(linha)+String.valueOf(coluna);
            }
        }

    }

    public boolean verificarGanhador()
    {
        boolean ganhador = false;

        //horizontal
        if(matrizVerificacao[0][0].equals(matrizVerificacao[0][1])  && matrizVerificacao[0][0].equals(matrizVerificacao[0][2]))
        {
            ganhador = true;
        }
        if(matrizVerificacao[1][0].equals(matrizVerificacao[1][1])  && matrizVerificacao[1][0].equals(matrizVerificacao[1][2]))
        {
            ganhador = true;
        }
        if(matrizVerificacao[2][0].equals(matrizVerificacao[2][1])  && matrizVerificacao[2][0].equals(matrizVerificacao[2][2]))
        {
            ganhador = true;
        }

        //vertical
        if(matrizVerificacao[0][0].equals(matrizVerificacao[1][0])  && matrizVerificacao[0][0].equals(matrizVerificacao[2][0]))
        {
            ganhador = true;
        }
        if(matrizVerificacao[0][1].equals(matrizVerificacao[1][1])  && matrizVerificacao[0][1].equals(matrizVerificacao[2][1]))
        {
            ganhador = true;
        }
        if(matrizVerificacao[0][2].equals(matrizVerificacao[1][2])  && matrizVerificacao[0][2].equals(matrizVerificacao[2][2]))
        {
            ganhador = true;
        }

        //diagonal
        //horizontal
        if(matrizVerificacao[0][0].equals(matrizVerificacao[1][1])  && matrizVerificacao[0][0].equals(matrizVerificacao[2][2]))
        {
            ganhador = true;
        }
        if(matrizVerificacao[0][2].equals(matrizVerificacao[1][1])  && matrizVerificacao[0][2].equals(matrizVerificacao[2][0]))
        {
            ganhador = true;
        }
        return ganhador;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        final Button btn00Prog = (Button) findViewById(R.id.btn00);
        final Button btn01Prog = (Button) findViewById(R.id.btn01);
        final Button btn02Prog = (Button) findViewById(R.id.btn02);
        final Button btn10Prog = (Button) findViewById(R.id.btn10);
        final Button btn11Prog = (Button) findViewById(R.id.btn11);
        final Button btn12Prog = (Button) findViewById(R.id.btn12);
        final Button btn20Prog = (Button) findViewById(R.id.btn20);
        final Button btn21Prog = (Button) findViewById(R.id.btn21);
        final Button btn22Prog = (Button) findViewById(R.id.btn22);
        final TextView txtJogadorProg = (TextView) findViewById(R.id.txtJogador);

        final Button btnResetProg = (Button) findViewById(R.id.btnReset);

        inicializarMatrizVerificacao();

        btn00Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn00Prog.setText(jogador);
                btn00Prog.setClickable(false);
                matrizVerificacao[0][0] = jogador;

                if(verificarGanhador())
                {
                    txtJogadorProg.setText("Ganhador: " +jogador);
                    btn00Prog.setClickable(false);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn10Prog.setClickable(false);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn20Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                }
                else{
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador );
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate!");
                    }
                    }
            }
        });

        btn01Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn01Prog.setText(jogador);
                btn01Prog.setClickable(false);
                matrizVerificacao[0][1] = jogador;

                if(verificarGanhador())
                {
                    txtJogadorProg.setText("Ganhador: " +jogador);
                    btn00Prog.setClickable(false);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn10Prog.setClickable(false);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn20Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                }
                else{
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador );
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });

        btn02Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn02Prog.setText(jogador);
                btn02Prog.setClickable(false);
                matrizVerificacao[0][2] = jogador;

                if(verificarGanhador())
                {
                    txtJogadorProg.setText("Ganhador: " +jogador);
                    btn00Prog.setClickable(false);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn10Prog.setClickable(false);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn20Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                }
                else{
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador );
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });

        btn10Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn10Prog.setText(jogador);
                btn10Prog.setClickable(false);
                matrizVerificacao[1][0] = jogador;

                if(verificarGanhador())
                {
                    txtJogadorProg.setText("Ganhador: " +jogador);
                    btn00Prog.setClickable(false);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn10Prog.setClickable(false);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn20Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                }
                else{
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador );
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });

        btn11Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn11Prog.setText(jogador);
                btn11Prog.setClickable(false);
                matrizVerificacao[1][1] = jogador;

                if(verificarGanhador())
                {
                    txtJogadorProg.setText("Ganhador: " +jogador);
                    btn00Prog.setClickable(false);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn10Prog.setClickable(false);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn20Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                }
                else{
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador );
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });

        btn12Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn12Prog.setText(jogador);
                btn12Prog.setClickable(false);
                matrizVerificacao[1][2] = jogador;

                if(verificarGanhador())
                {
                    txtJogadorProg.setText("Ganhador: " +jogador);
                    btn00Prog.setClickable(false);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn10Prog.setClickable(false);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn20Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                }
                else{
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador );
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });

        btn20Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn20Prog.setText(jogador);
                btn20Prog.setClickable(false);
                matrizVerificacao[2][0] = jogador;

                if(verificarGanhador())
                {
                    txtJogadorProg.setText("Ganhador: " +jogador);
                    btn00Prog.setClickable(false);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn10Prog.setClickable(false);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn20Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                }
                else{
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador );
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });

        btn21Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn21Prog.setText(jogador);
                btn21Prog.setClickable(false);
                matrizVerificacao[2][1] = jogador;

                if(verificarGanhador())
                {
                    txtJogadorProg.setText("Ganhador: " +jogador);
                    btn00Prog.setClickable(false);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn10Prog.setClickable(false);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn20Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                }
                else{
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador );
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });

        btn22Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn22Prog.setText(jogador);
                btn22Prog.setClickable(false);
                matrizVerificacao[2][2] = jogador;

                if(verificarGanhador())
                {
                    txtJogadorProg.setText("Ganhador: " +jogador);
                    btn00Prog.setClickable(false);
                    btn01Prog.setClickable(false);
                    btn02Prog.setClickable(false);
                    btn10Prog.setClickable(false);
                    btn11Prog.setClickable(false);
                    btn12Prog.setClickable(false);
                    btn20Prog.setClickable(false);
                    btn21Prog.setClickable(false);
                    btn22Prog.setClickable(false);
                }
                else{
                    trocaJogador();
                    txtJogadorProg.setText("Jogador: "+jogador );
                    if(jogadas == 9)
                    {
                        txtJogadorProg.setText("Empate!");
                    }
                }
            }
        });


        btnResetProg.setOnClickListener((v)->{
            btn00Prog.setClickable(true);
            btn00Prog.setText("");

            btn01Prog.setClickable(true);
            btn01Prog.setText("");

            btn02Prog.setClickable(true);
            btn02Prog.setText("");

            btn10Prog.setClickable(true);
            btn10Prog.setText("");

            btn11Prog.setClickable(true);
            btn11Prog.setText("");

            btn12Prog.setClickable(true);
            btn12Prog.setText("");

            btn20Prog.setClickable(true);
            btn20Prog.setText("");

            btn21Prog.setClickable(true);
            btn21Prog.setText("");

            btn22Prog.setClickable(true);
            btn22Prog.setText("");

            inicializarMatrizVerificacao();
            jogadas = 0;
            txtJogadorProg.setText("Jogador: "+jogador);

        });

    }
}