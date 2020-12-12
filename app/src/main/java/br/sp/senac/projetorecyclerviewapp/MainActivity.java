package br.sp.senac.projetorecyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Times> lstTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inserindo os livros no arrayList vazio
        lstTimes = new ArrayList<>();
        lstTimes.add(new Times("PSG","O Paris Saint-Germain Football Club, também conhecido como Paris Saint-Germain ou pela sua sigla PSG, é um clube de futebol profissional da França, com sede em Paris.","1",R.drawable.psg));
        lstTimes.add(new Times("Lille","OO Lille Olympique Sporting Club Métropole é um clube de futebol francês da cidade de Lille","2",R.drawable.lille));
        lstTimes.add(new Times("Lyonnais", "O Olympique Lyonnais, conhecido como Lyon, é um clube de futebol francês da cidade de Lyon. O clube faz parte da primeira divisão francesa, a Ligue 1", "3", R.drawable.lyon));
        lstTimes.add(new Times("Olympique", "O Olympique de Marseille, mais conhecido no Brasil como Olympique de Marselha ou apenas Olympique e em Portugal como Marselha, é um clube de futebol da França, da cidade de Marselha, uma das três maiores do país, estando localizada no sul da França.", "4", R.drawable.olympique));
        lstTimes.add(new Times("Mônaco", "A Association Sportive de Monaco Football Club, conhecido em português como Mónaco ou Mônaco, é um clube de futebol do principado de Mônaco", "5", R.drawable.monaco));
        lstTimes.add(new Times("Montpellier", "O Montpellier Hérault Sport Club é um clube de futebol francês, fundado em 1919 e sediado em Montpellier.", "6", R.drawable.montpellier));
        lstTimes.add(new Times("Angers", "O Angers Sporting Club de l'Ouest é um clube de futebol francês. Sua sede fica na cidade de Angers. Suas cores são branco e preto.", "7", R.drawable.angers));
        lstTimes.add(new Times("Lens", "O Racing Club de Lens é um clube de futebol da França, sediado na cidade de mesmo nome, Lens. Suas cores são a vermelha e a dourada, por isso foi-lhe dado o apelido Sang et Or", "8", R.drawable.lens));
        lstTimes.add(new Times("Rennes","O Stade Rennais Football Club, ou simplesmente Rennes, é um clube de futebol francês, sediado em Rennes.","9",R.drawable.rennes));
        lstTimes.add(new Times("Bordeaux","Futebol Clube dos Girondinos de Bordéus ou simplesmente Bordeaux, é um clube de futebol francês, da cidade de Bordeaux, fundado em 1881 como um clube polidesportivo, tendo criado seu time de futebol a partir de 1919.","10",R.drawable.bordeaux));
        lstTimes.add(new Times("Nice", "Olympique Gymnaste Club de Nice Côte d'Azur é um clube de futebol francês, da cidade de Nice. Suas cores são vermelho e preto.", "11", R.drawable.nice));
        lstTimes.add(new Times("Stade Brestois", "O Stade Brestois 29 é um clube de futebol francês da cidade de Brest, fundado em 1950, da fusão de cinco outros clubes, incluindo o Armoricaine de Brest fundado em 1903", "12", R.drawable.brestois));
        lstTimes.add(new Times("Metz", "O Football Club de Metz é um clube de futebol francês com sede na cidade de Metz. Atualmente disputa a Ligue 1. Fundado em 1919 como CA Messin, foi rebatizado com o atual nome em 1936.", "13", R.drawable.metz));
        lstTimes.add(new Times("Nantes", "O Football Club de Nantes é um clube de futebol francês sediado em Nantes. Fundado em 1943, é um dos clubes mais tradicionais do país e atualmente disputa a Ligue 1.", "14", R.drawable.nantes));
        lstTimes.add(new Times("Saint-Étienne", "A Association Sportive de Saint-Étienne Loire, Saint-Étienne ou simplesmente ASSE, é um clube de futebol francês da cidade de Saint-Étienne em Ródano-Alpes, fundado no dia 19 de junho de 1919.", "15", R.drawable.saint_etienne));
        lstTimes.add(new Times("Nîmes", "O Nîmes Olympique é um clube de futebol francês. Sua sede fica na cidade de Nîmes.", "16", R.drawable.nimes));
        lstTimes.add(new Times("Reims", "O Stade de Reims é um clube de futebol francês com sede na cidade de Reims. Fundado em 18 de junho de 1931.", "17", R.drawable.reims));
        lstTimes.add(new Times("RC Strasbourg", "Racing Club de Estrasburgo é um clube de futebol francês, com sede cidade de Estrasburgo. Na Ligue 2 2016/17 ascendeu à Ligue 1, primeira divisão do futebol francês.", "18", R.drawable.rc_strasbourg));
        lstTimes.add(new Times("Lorient-Bretagne", "O Football Club Lorient-Bretagne Sud é um clube de futebol francês fundado em 1926 em Lorient, na França.", "19", R.drawable.lorient_bretagne));
        lstTimes.add(new Times("Dijon", "O Dijon FCO é um clube de futebol francês. Sua sede fica na cidade de Dijon. Suas cores são vermelho e branco.", "20", R.drawable.dijon));
        //declarando a variavel xml enviando para o java
        RecyclerView mRecyclerView = findViewById(R.id.id_recyclerView);

        //Instânciando o adaptador com os valores necessários
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(getApplicationContext(), lstTimes);
        //Criando o layout para inserção dos valores

        //LayoutManager não é necessário inserção de colunas - pode ser utilizado na vertical ou horizontal
       // mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL,true));

        //GriLayoutManager necessário a inserção de colunas
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        //Para melhorar a performance do RecyclerView na listagem
        mRecyclerView.setHasFixedSize(true);

        //Inserindo os valores na lista do RecyclerView
        mRecyclerView.setAdapter(mAdapter);
    }
}
