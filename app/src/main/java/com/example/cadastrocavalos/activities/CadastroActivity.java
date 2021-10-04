package com.example.cadastrocavalos.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cadastrocavalos.R;
import com.example.cadastrocavalos.controller.CavaloDao;
import com.example.cadastrocavalos.model.Cavalo;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CadastroActivity extends AppCompatActivity {

    EditText nome;
    EditText raca;
    EditText dataNascimento;
    Spinner genero;
    CheckedTextView castrado;
    Button cadastrar;
    CavaloDao cavaloDao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = findViewById(R.id.etNome);
        raca = findViewById(R.id.etRaca);
        dataNascimento = findViewById(R.id.etNascimento);
        genero = findViewById(R.id.spnGenero);
        castrado = findViewById(R.id.ctvCastrado);
        castrado.setOnClickListener(view -> {
            castrado.toggle();
        });

        cadastrar = findViewById(R.id.btnCadastrar);
        cavaloDao = new CavaloDao();

//        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
//        Date data = dataFormat.parse(dataNascimento.getText().toString());

        cadastrar.setOnClickListener(view ->{
            if(nome.getText().toString().isEmpty() || raca.getText().toString().isEmpty() || dataNascimento.getText().toString().isEmpty()){
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_LONG);
            }else{
                Cavalo novoCavalo = null;
                try {
                    novoCavalo = new Cavalo(nome.getText().toString(), raca.getText().toString(), new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento.getText().toString()), genero.getSelectedItem().toString(), castrado.isChecked());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                cavaloDao.addCavalos(novoCavalo);
            }

            finish();
        });


    }
}
