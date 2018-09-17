package com.example.aluno.alunoslistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


public class ListView extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {

    List<String> nomess = new ArrayList<String>();
    ListView listView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao = findViewById(R.id.botao1);
        botao.setOnClickListener(this);

        listView = (ListView) findViewById(R.id.nomes);
        adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,nomes);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onClick(View v) {
        EditText editText1 = findViewById(R.id.editText1);
        String nomes = editText1.getText().toString();

        nomess.add(nomes);
        adapter.notifyDataSetChanged();

    }
}
