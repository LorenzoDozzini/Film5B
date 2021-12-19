package ml.lukegotbored.items;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnStart;
    ListView lvfilm;
    String film[] = {"Spiderman: Far From Home", "Free Guy", "Joker"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        lvfilm=(ListView)findViewById(R.id.lvfilm);
        btnStart=(Button)findViewById(R.id.btnStart);
        ArrayAdapter<String> adapterFilm=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, film);
        listaFilm.setAdapter(adapterFilm);
        bottoneEsci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Stai per uscire", Toast.LENGTH_LONG).show();
                Intent i=new Intent(getApplicationContext(), Start.class);
                startActivity(i);
            }
        });


    public void changeScreen(View view){
        Intent i = new Intent(getApplicationContext(), itemsList.class);
        startActivity(i);
    }
}