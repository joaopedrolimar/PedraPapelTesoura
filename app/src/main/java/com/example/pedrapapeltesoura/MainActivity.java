package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("Pedra");

    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("Papel");

    }
    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("Tesoura");

    }

    public void opcaoSelecionada(String opcaoSelecionada){

        ImageView imgDoRobo = findViewById(R.id.imgDoRobo);
        TextView textResultado = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"Pedra","Papel","Tesoura"};
        String opcaoDoApp = opcoes[ numero ];

        switch (opcaoDoApp){
            case "Pedra":
                imgDoRobo.setImageResource(R.drawable.pedra);
                break;

            case "Papel":
                imgDoRobo.setImageResource(R.drawable.papel);
                break;

            case "Tesoura":
                imgDoRobo.setImageResource(R.drawable.tesoura);
                break;
        }

       if(
               (opcaoDoApp == "Pedra"  && opcaoSelecionada == "Papel")  ||
               (opcaoDoApp == "Papel" && opcaoSelecionada == "Tesoura")||
               (opcaoDoApp == "Tesoura" && opcaoSelecionada == "Pedra")
        ){

                textResultado.setText("Você Venceu");
                 //System.out.println("Você Venceu");

        }else if(
                (opcaoSelecionada == "Pedra"&& opcaoDoApp == "Papel") ||
                (opcaoSelecionada == "Papel" && opcaoDoApp == "Tesoura") ||
                (opcaoSelecionada == "Tesoura" && opcaoDoApp == "Pedra")
        ){

           textResultado.setText("Você Perdeu");
           //System.out.println("Você Perdeu");
        }else{

           textResultado.setText("Empate");
           //System.out.println("Empate");
       }

        //System.out.println("item selecionado: " + opcaoDoApp);

    }

}
