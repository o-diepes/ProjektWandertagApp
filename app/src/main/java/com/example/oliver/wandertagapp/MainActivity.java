package com.example.oliver.wandertagapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button btnAnmeldenClick;
    private boolean loginSuccessful;
    private int benutzer_type;              //1 = Admin; 2 = Veranstalter; 3 = Benutzer
    private Intent intent;

    public static ArrayList<Veranstaltung> al_Veranstaltungen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initVariables();
        //initButtonClick();
        initArrayListVeranstaltungen();
        setContentView(R.layout.activity_main);
        Intent i = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(i);
    }

    private void initArrayListVeranstaltungen() {
        al_Veranstaltungen = new ArrayList<>();

        al_Veranstaltungen.add(new Veranstaltung("Neujahrs Ausflug", "Teststraße 10", "Grieskirchen", "Österreich", "069912556485", "stefan@gmail.com"));
        al_Veranstaltungen.add(new Veranstaltung("Oster Ausflug", "Teststraße 14", "Walding", "Österreich", "069912556485", "stefan@gmail.com"));
        al_Veranstaltungen.add(new Veranstaltung("Sommer Ausflug", "Wildstraße 8", "München", "Deutschland", "069912556485", "stefan@gmail.com"));
        al_Veranstaltungen.add(new Veranstaltung("Winter Ausflug", "Wildstraße 8", "München", "Deutschland", "069912556485", "stefan@gmail.com"));
        al_Veranstaltungen.add(new Veranstaltung("Senioren Ausflug", "Wildstraße 8", "München", "Deutschland", "069912556485", "stefan@gmail.com"));
        al_Veranstaltungen.add(new Veranstaltung("Abend Ausflug", "Wildstraße 8", "München", "Österreich", "069912556485", "stefan@gmail.com"));
        al_Veranstaltungen.add(new Veranstaltung("Frühlings Ausflug", "Wildstraße 8", "Wien", "Österreich", "069912556485", "stefan@gmail.com"));
        al_Veranstaltungen.add(new Veranstaltung("Herbst Ausflug", "Wildstraße 8", "München", "Deutschland", "069912556485", "stefan@gmail.com"));

    }
    /*
    private void initVariables() {
        editTextEmail = (EditText) findViewById(R.id.email);
        editTextPassword = (EditText) findViewById(R.id.password);
        btnAnmeldenClick = (Button) findViewById(R.id.email_sign_in_button);

    }

    private void initButtonClick() {
        btnAnmeldenClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkLoginData();
            }
        });
    }

    private void checkLoginData() {
        if (loginSuccessful && benutzer_type == 1){
            intent = new Intent(getApplicationContext(), AdminPage.class);
            startActivity(intent);
        }
        if (loginSuccessful && benutzer_type == 2){
            intent = new Intent(getApplicationContext(), VerwaltungPage.class);
            startActivity(intent);
        }
        if (loginSuccessful && benutzer_type == 3){
            intent = new Intent(getApplicationContext(), BenutzerPage.class);
            startActivity(intent);
        }
    }
*/




}
